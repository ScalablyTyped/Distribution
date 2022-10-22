package typings.inferno.distCoreTypesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var alt: js.UndefOr[String | Null] = js.undefined
  
  var coords: js.UndefOr[String | Null] = js.undefined
  
  var download: js.UndefOr[Any] = js.undefined
  
  var href: js.UndefOr[String | Null] = js.undefined
  
  var hrefLang: js.UndefOr[String | Null] = js.undefined
  
  var media: js.UndefOr[String | Null] = js.undefined
  
  var referrerPolicy: js.UndefOr[HTMLAttributeReferrerPolicy | Null] = js.undefined
  
  var rel: js.UndefOr[String | Null] = js.undefined
  
  var shape: js.UndefOr[String | Null] = js.undefined
  
  var target: js.UndefOr[String | Null] = js.undefined
}
object AreaHTMLAttributes {
  
  inline def apply[T](): AreaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaHTMLAttributes[T]]
  }
  
  extension [Self <: AreaHTMLAttributes[?], T](x: Self & AreaHTMLAttributes[T]) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltNull: Self = StObject.set(x, "alt", null)
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setCoordsNull: Self = StObject.set(x, "coords", null)
    
    inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
    
    inline def setDownload(value: Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
    
    inline def setHrefLangNull: Self = StObject.set(x, "hrefLang", null)
    
    inline def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
    
    inline def setHrefNull: Self = StObject.set(x, "href", null)
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaNull: Self = StObject.set(x, "media", null)
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setReferrerPolicy(value: HTMLAttributeReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyNull: Self = StObject.set(x, "referrerPolicy", null)
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelNull: Self = StObject.set(x, "rel", null)
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeNull: Self = StObject.set(x, "shape", null)
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
