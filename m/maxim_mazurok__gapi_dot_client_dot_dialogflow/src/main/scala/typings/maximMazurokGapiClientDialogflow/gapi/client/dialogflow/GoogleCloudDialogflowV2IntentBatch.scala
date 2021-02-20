package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentBatch extends StObject {
  
  /** A collection of intents. */
  var intents: js.UndefOr[js.Array[GoogleCloudDialogflowV2Intent]] = js.native
}
object GoogleCloudDialogflowV2IntentBatch {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentBatch]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentBatchMutableBuilder[Self <: GoogleCloudDialogflowV2IntentBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntents(value: js.Array[GoogleCloudDialogflowV2Intent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: GoogleCloudDialogflowV2Intent*): Self = StObject.set(x, "intents", js.Array(value :_*))
  }
}
