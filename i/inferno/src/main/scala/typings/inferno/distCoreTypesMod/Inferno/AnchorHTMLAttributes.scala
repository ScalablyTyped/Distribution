package typings.inferno.distCoreTypesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var download: js.UndefOr[Any] = js.undefined
  
  var href: js.UndefOr[String | Null] = js.undefined
  
  var hrefLang: js.UndefOr[String | Null] = js.undefined
  
  var media: js.UndefOr[String | Null] = js.undefined
  
  var ping: js.UndefOr[String | Null] = js.undefined
  
  var referrerPolicy: js.UndefOr[HTMLAttributeReferrerPolicy | Null] = js.undefined
  
  var rel: js.UndefOr[String | Null] = js.undefined
  
  var target: js.UndefOr[HTMLAttributeAnchorTarget | Null] = js.undefined
  
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object AnchorHTMLAttributes {
  
  inline def apply[T](): AnchorHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnchorHTMLAttributes[?], T] (val x: Self & AnchorHTMLAttributes[T]) extends AnyVal {
    
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
    
    inline def setPing(value: String): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
    
    inline def setPingNull: Self = StObject.set(x, "ping", null)
    
    inline def setPingUndefined: Self = StObject.set(x, "ping", js.undefined)
    
    inline def setReferrerPolicy(value: HTMLAttributeReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyNull: Self = StObject.set(x, "referrerPolicy", null)
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelNull: Self = StObject.set(x, "rel", null)
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setTarget(value: HTMLAttributeAnchorTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
