package typings.httpBasic

import typings.httpBasic.anon.PickCachedResponseheaders
import typings.httpBasic.cachedResponseMod.CachedResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryCacheMod {
  
  @JSImport("http-basic/lib/MemoryCache", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with MemoryCache {
    
    /* private */ /* CompleteClass */
    override val _cache: Any = js.native
    
    /* CompleteClass */
    override def getResponse(
      url: String,
      callback: js.Function2[/* err */ Null | js.Error, /* response */ Null | CachedResponse, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    override def invalidateResponse(
      url: String,
      callback: js.Function1[
          /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
          Unit
        ]
    ): Unit = js.native
    
    /* CompleteClass */
    override def setResponse(url: String, response: CachedResponse): Unit = js.native
    
    /* CompleteClass */
    override def updateResponseHeaders(url: String, response: PickCachedResponseheaders): Unit = js.native
  }
  
  trait MemoryCache extends StObject {
    
    /* private */ val _cache: Any
    
    def getResponse(
      url: String,
      callback: js.Function2[/* err */ Null | js.Error, /* response */ Null | CachedResponse, Unit]
    ): Unit
    
    def invalidateResponse(
      url: String,
      callback: js.Function1[
          /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
          Unit
        ]
    ): Unit
    
    def setResponse(url: String, response: CachedResponse): Unit
    
    def updateResponseHeaders(url: String, response: PickCachedResponseheaders): Unit
  }
  object MemoryCache {
    
    inline def apply(
      _cache: Any,
      getResponse: (String, js.Function2[/* err */ Null | js.Error, /* response */ Null | CachedResponse, Unit]) => Unit,
      invalidateResponse: (String, js.Function1[
          /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
          Unit
        ]) => Unit,
      setResponse: (String, CachedResponse) => Unit,
      updateResponseHeaders: (String, PickCachedResponseheaders) => Unit
    ): MemoryCache = {
      val __obj = js.Dynamic.literal(_cache = _cache.asInstanceOf[js.Any], getResponse = js.Any.fromFunction2(getResponse), invalidateResponse = js.Any.fromFunction2(invalidateResponse), setResponse = js.Any.fromFunction2(setResponse), updateResponseHeaders = js.Any.fromFunction2(updateResponseHeaders))
      __obj.asInstanceOf[MemoryCache]
    }
    
    extension [Self <: MemoryCache](x: Self) {
      
      inline def setGetResponse(
        value: (String, js.Function2[/* err */ Null | js.Error, /* response */ Null | CachedResponse, Unit]) => Unit
      ): Self = StObject.set(x, "getResponse", js.Any.fromFunction2(value))
      
      inline def setInvalidateResponse(
        value: (String, js.Function1[
              /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "invalidateResponse", js.Any.fromFunction2(value))
      
      inline def setSetResponse(value: (String, CachedResponse) => Unit): Self = StObject.set(x, "setResponse", js.Any.fromFunction2(value))
      
      inline def setUpdateResponseHeaders(value: (String, PickCachedResponseheaders) => Unit): Self = StObject.set(x, "updateResponseHeaders", js.Any.fromFunction2(value))
      
      inline def set_cache(value: Any): Self = StObject.set(x, "_cache", value.asInstanceOf[js.Any])
    }
  }
}
