package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2IntentMessageTableCardRow extends StObject {
  
  /**
    * Optional. List of cells that make up this row.
    */
  var cells: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessageTableCardCell]] = js.undefined
  
  /**
    * Optional. Whether to add a visual divider after this row.
    */
  var dividerAfter: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessageTableCardRow {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessageTableCardRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageTableCardRow]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessageTableCardRow](x: Self) {
    
    inline def setCells(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageTableCardCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    inline def setCellsVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessageTableCardCell*): Self = StObject.set(x, "cells", js.Array(value*))
    
    inline def setDividerAfter(value: Boolean): Self = StObject.set(x, "dividerAfter", value.asInstanceOf[js.Any])
    
    inline def setDividerAfterNull: Self = StObject.set(x, "dividerAfter", null)
    
    inline def setDividerAfterUndefined: Self = StObject.set(x, "dividerAfter", js.undefined)
  }
}
