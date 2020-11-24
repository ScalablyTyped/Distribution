package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessageTableCard extends js.Object {
  
  /** Optional. List of buttons for the card. */
  var buttons: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageBasicCardButton]] = js.native
  
  /** Optional. Display properties for the columns in this table. */
  var columnProperties: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageColumnProperties]] = js.native
  
  /** Optional. Image which should be displayed on the card. */
  var image: js.UndefOr[GoogleCloudDialogflowV2IntentMessageImage] = js.native
  
  /** Optional. Rows in this table of data. */
  var rows: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageTableCardRow]] = js.native
  
  /** Optional. Subtitle to the title. */
  var subtitle: js.UndefOr[String] = js.native
  
  /** Required. Title of the card. */
  var title: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2IntentMessageTableCard {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageTableCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageTableCard]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageTableCardOps[Self <: GoogleCloudDialogflowV2IntentMessageTableCard] (val x: Self) extends AnyVal {
    
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
    def setButtonsVarargs(value: GoogleCloudDialogflowV2IntentMessageBasicCardButton*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[GoogleCloudDialogflowV2IntentMessageBasicCardButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setColumnPropertiesVarargs(value: GoogleCloudDialogflowV2IntentMessageColumnProperties*): Self = this.set("columnProperties", js.Array(value :_*))
    
    @scala.inline
    def setColumnProperties(value: js.Array[GoogleCloudDialogflowV2IntentMessageColumnProperties]): Self = this.set("columnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnProperties: Self = this.set("columnProperties", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleCloudDialogflowV2IntentMessageImage): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: GoogleCloudDialogflowV2IntentMessageTableCardRow*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[GoogleCloudDialogflowV2IntentMessageTableCardRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
