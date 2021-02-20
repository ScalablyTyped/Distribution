package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessageTableCardRow extends StObject {
  
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
  implicit class GoogleCloudDialogflowV2IntentMessageTableCardRowMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageTableCardRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCells(value: js.Array[GoogleCloudDialogflowV2IntentMessageTableCardCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    @scala.inline
    def setCellsVarargs(value: GoogleCloudDialogflowV2IntentMessageTableCardCell*): Self = StObject.set(x, "cells", js.Array(value :_*))
    
    @scala.inline
    def setDividerAfter(value: Boolean): Self = StObject.set(x, "dividerAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividerAfterUndefined: Self = StObject.set(x, "dividerAfter", js.undefined)
  }
}
