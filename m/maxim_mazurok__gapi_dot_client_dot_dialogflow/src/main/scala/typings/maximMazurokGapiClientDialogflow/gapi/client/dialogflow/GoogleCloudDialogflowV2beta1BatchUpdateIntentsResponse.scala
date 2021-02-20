package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1BatchUpdateIntentsResponse extends StObject {
  
  /** The collection of updated or created intents. */
  var intents: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1Intent]] = js.native
}
object GoogleCloudDialogflowV2beta1BatchUpdateIntentsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1BatchUpdateIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1BatchUpdateIntentsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1BatchUpdateIntentsResponseMutableBuilder[Self <: GoogleCloudDialogflowV2beta1BatchUpdateIntentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntents(value: js.Array[GoogleCloudDialogflowV2beta1Intent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: GoogleCloudDialogflowV2beta1Intent*): Self = StObject.set(x, "intents", js.Array(value :_*))
  }
}
