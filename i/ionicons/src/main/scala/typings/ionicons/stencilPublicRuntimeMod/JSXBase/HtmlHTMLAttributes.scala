package typings.ionicons.stencilPublicRuntimeMod.JSXBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var manifest: js.UndefOr[String] = js.native
}
object HtmlHTMLAttributes {
  
  @scala.inline
  def apply[T](): HtmlHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class HtmlHTMLAttributesMutableBuilder[Self <: HtmlHTMLAttributes[_], T] (val x: Self with HtmlHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
  }
}
