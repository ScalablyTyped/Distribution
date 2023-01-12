package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2InputDataset extends StObject {
  
  /** Required. ConversationDataset resource name. Format: `projects//locations//conversationDatasets/` */
  var dataset: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2InputDataset {
  
  inline def apply(): GoogleCloudDialogflowV2InputDataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2InputDataset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2InputDataset] (val x: Self) extends AnyVal {
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
  }
}
