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
    
    var public: js.UndefOr[Boolean] = js.undefined
    
    var sMaxAge: js.UndefOr[Double] = js.undefined
    
    var staleIfError: js.UndefOr[Double] = js.undefined
    
    var staleWhileRevalidate: js.UndefOr[Double] = js.undefined
  }
  object MaxAge {
    
    @scala.inline
    def apply(): MaxAge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxAge]
    }
    
    @scala.inline
    implicit class MaxAgeMutableBuilder[Self <: MaxAge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setMustRevalidate(value: Boolean): Self = StObject.set(x, "mustRevalidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMustRevalidateUndefined: Self = StObject.set(x, "mustRevalidate", js.undefined)
      
      @scala.inline
      def setNoCache(value: Boolean): Self = StObject.set(x, "noCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCacheUndefined: Self = StObject.set(x, "noCache", js.undefined)
      
      @scala.inline
      def setNoStore(value: Boolean): Self = StObject.set(x, "noStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoStoreUndefined: Self = StObject.set(x, "noStore", js.undefined)
      
      @scala.inline
      def setNoTransform(value: Boolean): Self = StObject.set(x, "noTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoTransformUndefined: Self = StObject.set(x, "noTransform", js.undefined)
      
      @scala.inline
      def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      @scala.inline
      def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      @scala.inline
      def setSMaxAge(value: Double): Self = StObject.set(x, "sMaxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSMaxAgeUndefined: Self = StObject.set(x, "sMaxAge", js.undefined)
      
      @scala.inline
      def setStaleIfError(value: Double): Self = StObject.set(x, "staleIfError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaleIfErrorUndefined: Self = StObject.set(x, "staleIfError", js.undefined)
      
      @scala.inline
      def setStaleWhileRevalidate(value: Double): Self = StObject.set(x, "staleWhileRevalidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaleWhileRevalidateUndefined: Self = StObject.set(x, "staleWhileRevalidate", js.undefined)
    }
  }
}
