package typings.hapiCatboxMemcached

import typings.hapiCatbox.mod.CacheKey
import typings.hapiCatbox.mod.CachedObject
import typings.hapiCatbox.mod.ClientApi
import typings.hapiCatbox.mod.ClientOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/catbox-memcached", JSImport.Namespace)
  @js.native
  class ^[T] () extends CatboxMemcached[T] {
    def this(options: Options) = this()
  }
  
  @js.native
  trait CatboxMemcached[T] extends ClientApi[T] {
    
    def generateKey(key: CacheKey): String = js.native
  }
  object CatboxMemcached {
    
    @scala.inline
    def apply[T](
      drop: CacheKey => js.Promise[Unit],
      generateKey: CacheKey => String,
      get: CacheKey => js.Promise[Null | CachedObject[T]],
      isReady: () => Boolean,
      set: (CacheKey, T, Double) => js.Promise[Unit],
      start: () => js.Promise[Unit],
      stop: () => Unit,
      validateSegmentName: String => Null | Error
    ): CatboxMemcached[T] = {
      val __obj = js.Dynamic.literal(drop = js.Any.fromFunction1(drop), generateKey = js.Any.fromFunction1(generateKey), get = js.Any.fromFunction1(get), isReady = js.Any.fromFunction0(isReady), set = js.Any.fromFunction3(set), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), validateSegmentName = js.Any.fromFunction1(validateSegmentName))
      __obj.asInstanceOf[CatboxMemcached[T]]
    }
    
    @scala.inline
    implicit class CatboxMemcachedMutableBuilder[Self <: CatboxMemcached[_], T] (val x: Self with CatboxMemcached[T]) extends AnyVal {
      
      @scala.inline
      def setGenerateKey(value: CacheKey => String): Self = StObject.set(x, "generateKey", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Options extends ClientOptions {
    
    var host: js.UndefOr[String] = js.native
    
    var idle: js.UndefOr[Double] = js.native
    
    var location: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
