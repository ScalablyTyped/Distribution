package typings.hapiCatboxMemory

import typings.hapiCatbox.mod.ClientApi
import typings.hapiCatbox.mod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Engine {
    
    trait Options
      extends StObject
         with ClientOptions {
      
      /**
        * by default, buffers stored in the cache with allowMixedContent set to true are copied when they are set but not when they are retrieved.
        * This means a change to the buffer returned by a get() will change the value in the cache. To prevent this,
        * set cloneBuffersOnGet to true to always return a copy of the cached buffer.
        * @default false
        */
      var cloneBuffersOnGet: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Sets an upper limit on the number of bytes that can be stored in the cache.
        * Once this limit is reached no additional items will be added to the cache until some expire.
        * The utilized memory calculation is a rough approximation and must not be relied on.
        * @default 104857600 (100MB).
        */
      var maxByteSize: js.UndefOr[Double] = js.undefined
      
      /**
        * The minimum number of milliseconds in between each cache cleanup.
        * @default 1000 (1 second)
        */
      var minCleanupIntervalMsec: js.UndefOr[Double] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setCloneBuffersOnGet(value: Boolean): Self = StObject.set(x, "cloneBuffersOnGet", value.asInstanceOf[js.Any])
        
        inline def setCloneBuffersOnGetUndefined: Self = StObject.set(x, "cloneBuffersOnGet", js.undefined)
        
        inline def setMaxByteSize(value: Double): Self = StObject.set(x, "maxByteSize", value.asInstanceOf[js.Any])
        
        inline def setMaxByteSizeUndefined: Self = StObject.set(x, "maxByteSize", js.undefined)
        
        inline def setMinCleanupIntervalMsec(value: Double): Self = StObject.set(x, "minCleanupIntervalMsec", value.asInstanceOf[js.Any])
        
        inline def setMinCleanupIntervalMsecUndefined: Self = StObject.set(x, "minCleanupIntervalMsec", js.undefined)
      }
    }
  }
  // tslint:disable-next-line:no-unnecessary-class
  type Engine[T] = ClientApi[T]
}
