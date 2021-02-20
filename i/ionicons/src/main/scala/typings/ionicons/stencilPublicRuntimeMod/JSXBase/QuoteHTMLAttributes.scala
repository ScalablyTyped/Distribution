package typings.ionicons.stencilPublicRuntimeMod.JSXBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuoteHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var cite: js.UndefOr[String] = js.native
}
object QuoteHTMLAttributes {
  
  @scala.inline
  def apply[T](): QuoteHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuoteHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class QuoteHTMLAttributesMutableBuilder[Self <: QuoteHTMLAttributes[_], T] (val x: Self with QuoteHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
  }
}
