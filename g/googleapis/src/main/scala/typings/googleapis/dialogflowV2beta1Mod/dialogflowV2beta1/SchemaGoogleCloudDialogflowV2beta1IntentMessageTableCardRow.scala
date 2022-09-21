package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1IntentMessageTableCardRow extends StObject {
  
  /**
    * Optional. List of cells that make up this row.
    */
  var cells: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageTableCardCell]] = js.undefined
  
  /**
    * Optional. Whether to add a visual divider after this row.
    */
  var dividerAfter: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageTableCardRow {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageTableCardRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageTableCardRow]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageTableCardRow](x: Self) {
    
    inline def setCells(value: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageTableCardCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    inline def setCellsVarargs(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageTableCardCell*): Self = StObject.set(x, "cells", js.Array(value*))
    
    inline def setDividerAfter(value: Boolean): Self = StObject.set(x, "dividerAfter", value.asInstanceOf[js.Any])
    
    inline def setDividerAfterNull: Self = StObject.set(x, "dividerAfter", null)
    
    inline def setDividerAfterUndefined: Self = StObject.set(x, "dividerAfter", js.undefined)
  }
}
