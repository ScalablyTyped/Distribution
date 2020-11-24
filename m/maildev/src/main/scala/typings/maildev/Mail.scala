package typings.maildev

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for mail.
  */
@js.native
trait Mail extends js.Object {
  
  /**
    * Client.
    */
  var envelope: js.UndefOr[js.Object] = js.native
  
  /**
    * Identifier.
    */
  var id: js.UndefOr[String] = js.native
}
object Mail {
  
  @scala.inline
  def apply(): Mail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mail]
  }
  
  @scala.inline
  implicit class MailOps[Self <: Mail] (val x: Self) extends AnyVal {
    
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
    def setEnvelope(value: js.Object): Self = this.set("envelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelope: Self = this.set("envelope", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
