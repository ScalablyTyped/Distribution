package typings.ionicCore.stencilPublicRuntimeMod.JSXBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var cite: js.UndefOr[String] = js.native
  
  var dateTime: js.UndefOr[String] = js.native
  
  var datetime: js.UndefOr[String] = js.native
}
object InsHTMLAttributes {
  
  @scala.inline
  def apply[T](): InsHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class InsHTMLAttributesMutableBuilder[Self <: InsHTMLAttributes[_], T] (val x: Self with InsHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
    
    @scala.inline
    def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
  }
}
