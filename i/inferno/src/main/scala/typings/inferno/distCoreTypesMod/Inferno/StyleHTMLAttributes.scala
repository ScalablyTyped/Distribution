package typings.inferno.distCoreTypesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var media: js.UndefOr[String | Null] = js.undefined
  
  var nonce: js.UndefOr[String | Null] = js.undefined
  
  var scoped: js.UndefOr[Boolean | Null] = js.undefined
  
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object StyleHTMLAttributes {
  
  inline def apply[T](): StyleHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleHTMLAttributes[T]]
  }
  
  extension [Self <: StyleHTMLAttributes[?], T](x: Self & StyleHTMLAttributes[T]) {
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaNull: Self = StObject.set(x, "media", null)
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceNull: Self = StObject.set(x, "nonce", null)
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
    
    inline def setScopedNull: Self = StObject.set(x, "scoped", null)
    
    inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
