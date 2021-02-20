package typings.ionicons.stencilPublicRuntimeMod.JSXBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnchorHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var download: js.UndefOr[js.Any] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var hrefLang: js.UndefOr[String] = js.native
  
  var hreflang: js.UndefOr[String] = js.native
  
  var media: js.UndefOr[String] = js.native
  
  var rel: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[String] = js.native
}
object AnchorHTMLAttributes {
  
  @scala.inline
  def apply[T](): AnchorHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class AnchorHTMLAttributesMutableBuilder[Self <: AnchorHTMLAttributes[_], T] (val x: Self with AnchorHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setDownload(value: js.Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
