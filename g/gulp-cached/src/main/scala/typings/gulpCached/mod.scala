package typings.gulpCached

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-cached", JSImport.Namespace)
  @js.native
  val ^ : IGulpCached = js.native
  
  type ICacheStore = StringDictionary[js.Object]
  
  @js.native
  trait IGulpCached extends StObject {
    
    /**
      * Creates a new cache hash or uses an existing one.
      */
    def apply(name: String): Any = js.native
    def apply(name: String, options: IOptions): Any = js.native
    
    /**
      * Cache store.
      */
    var caches: ICacheStore = js.native
  }
  
  trait IOptions extends StObject {
    
    /**
      * Uses md5 instead of storing the whole file contents.
      * @default false
      */
    var optimizeMemory: js.UndefOr[Boolean] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setOptimizeMemory(value: Boolean): Self = StObject.set(x, "optimizeMemory", value.asInstanceOf[js.Any])
      
      inline def setOptimizeMemoryUndefined: Self = StObject.set(x, "optimizeMemory", js.undefined)
    }
  }
  
  type _To = IGulpCached
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IGulpCached = ^
}
