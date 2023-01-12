package typings.koaCacheControl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait MaxAge extends StObject {
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var mustRevalidate: js.UndefOr[Boolean] = js.undefined
    
    var noCache: js.UndefOr[Boolean] = js.undefined
    
    var noStore: js.UndefOr[Boolean] = js.undefined
    
    var noTransform: js.UndefOr[Boolean] = js.undefined
    
    var `private`: js.UndefOr[Boolean] = js.undefined
    
    var proxyRevalidate: js.UndefOr[Boolean] = js.undefined
    
    var public: js.UndefOr[Boolean] = js.undefined
    
    var sMaxAge: js.UndefOr[Double] = js.undefined
    
    var staleIfError: js.UndefOr[Double] = js.undefined
    
    var staleWhileRevalidate: js.UndefOr[Double] = js.undefined
  }
  object MaxAge {
    
    inline def apply(): MaxAge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxAge]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxAge] (val x: Self) extends AnyVal {
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setMustRevalidate(value: Boolean): Self = StObject.set(x, "mustRevalidate", value.asInstanceOf[js.Any])
      
      inline def setMustRevalidateUndefined: Self = StObject.set(x, "mustRevalidate", js.undefined)
      
      inline def setNoCache(value: Boolean): Self = StObject.set(x, "noCache", value.asInstanceOf[js.Any])
      
      inline def setNoCacheUndefined: Self = StObject.set(x, "noCache", js.undefined)
      
      inline def setNoStore(value: Boolean): Self = StObject.set(x, "noStore", value.asInstanceOf[js.Any])
      
      inline def setNoStoreUndefined: Self = StObject.set(x, "noStore", js.undefined)
      
      inline def setNoTransform(value: Boolean): Self = StObject.set(x, "noTransform", value.asInstanceOf[js.Any])
      
      inline def setNoTransformUndefined: Self = StObject.set(x, "noTransform", js.undefined)
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      inline def setProxyRevalidate(value: Boolean): Self = StObject.set(x, "proxyRevalidate", value.asInstanceOf[js.Any])
      
      inline def setProxyRevalidateUndefined: Self = StObject.set(x, "proxyRevalidate", js.undefined)
      
      inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      inline def setSMaxAge(value: Double): Self = StObject.set(x, "sMaxAge", value.asInstanceOf[js.Any])
      
      inline def setSMaxAgeUndefined: Self = StObject.set(x, "sMaxAge", js.undefined)
      
      inline def setStaleIfError(value: Double): Self = StObject.set(x, "staleIfError", value.asInstanceOf[js.Any])
      
      inline def setStaleIfErrorUndefined: Self = StObject.set(x, "staleIfError", js.undefined)
      
      inline def setStaleWhileRevalidate(value: Double): Self = StObject.set(x, "staleWhileRevalidate", value.asInstanceOf[js.Any])
      
      inline def setStaleWhileRevalidateUndefined: Self = StObject.set(x, "staleWhileRevalidate", js.undefined)
    }
  }
}
