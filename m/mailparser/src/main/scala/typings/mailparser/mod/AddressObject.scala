package typings.mailparser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressObject extends _HeaderValue {
  
  /**
    * A formatted address string for HTML context.
    */
  var html: String = js.native
  
  /**
    * A formatted address string for plaintext context.
    */
  var text: String = js.native
  
  /**
    * An array with address details.
    */
  var value: js.Array[EmailAddress] = js.native
}
object AddressObject {
  
  @scala.inline
  def apply(html: String, text: String, value: js.Array[EmailAddress]): AddressObject = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressObject]
  }
  
  @scala.inline
  implicit class AddressObjectOps[Self <: AddressObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: EmailAddress*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[EmailAddress]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
