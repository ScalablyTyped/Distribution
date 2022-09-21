package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2InputDataset extends StObject {
  
  /**
    * Required. ConversationDataset resource name. Format: `projects//locations//conversationDatasets/`
    */
  var dataset: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2InputDataset {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2InputDataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2InputDataset]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2InputDataset](x: Self) {
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetNull: Self = StObject.set(x, "dataset", null)
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
  }
}
