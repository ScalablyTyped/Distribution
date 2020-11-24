package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessageTableCardRow extends js.Object {
  
  /** Optional. List of cells that make up this row. */
  var cells: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageTableCardCell]] = js.native
  
  /** Optional. Whether to add a visual divider after this row. */
  var dividerAfter: js.UndefOr[Boolean] = js.native
}
object GoogleCloudDialogflowV2IntentMessageTableCardRow {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageTableCardRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageTableCardRow]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageTableCardRowOps[Self <: GoogleCloudDialogflowV2IntentMessageTableCardRow] (val x: Self) extends AnyVal {
    
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
    def setCellsVarargs(value: GoogleCloudDialogflowV2IntentMessageTableCardCell*): Self = this.set("cells", js.Array(value :_*))
    
    @scala.inline
    def setCells(value: js.Array[GoogleCloudDialogflowV2IntentMessageTableCardCell]): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCells: Self = this.set("cells", js.undefined)
    
    @scala.inline
    def setDividerAfter(value: Boolean): Self = this.set("dividerAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDividerAfter: Self = this.set("dividerAfter", js.undefined)
  }
}
