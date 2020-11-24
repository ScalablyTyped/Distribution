package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A draft email in the user&#39;s mailbox.
  */
@js.native
trait SchemaDraft extends js.Object {
  
  /**
    * The immutable ID of the draft.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The message content of the draft.
    */
  var message: js.UndefOr[SchemaMessage] = js.native
}
object SchemaDraft {
  
  @scala.inline
  def apply(): SchemaDraft = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDraft]
  }
  
  @scala.inline
  implicit class SchemaDraftOps[Self <: SchemaDraft] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMessage(value: SchemaMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
