package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaHistoryLabelAdded extends js.Object {
  
  /**
    * Label IDs added to the message.
    */
  var labelIds: js.UndefOr[js.Array[String]] = js.native
  
  var message: js.UndefOr[SchemaMessage] = js.native
}
object SchemaHistoryLabelAdded {
  
  @scala.inline
  def apply(): SchemaHistoryLabelAdded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistoryLabelAdded]
  }
  
  @scala.inline
  implicit class SchemaHistoryLabelAddedOps[Self <: SchemaHistoryLabelAdded] (val x: Self) extends AnyVal {
    
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
    def setLabelIdsVarargs(value: String*): Self = this.set("labelIds", js.Array(value :_*))
    
    @scala.inline
    def setLabelIds(value: js.Array[String]): Self = this.set("labelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelIds: Self = this.set("labelIds", js.undefined)
    
    @scala.inline
    def setMessage(value: SchemaMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
