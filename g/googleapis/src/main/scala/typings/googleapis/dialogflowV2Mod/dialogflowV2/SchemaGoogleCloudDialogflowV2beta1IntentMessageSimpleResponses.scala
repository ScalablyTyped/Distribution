package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses extends StObject {
  
  /**
    * Required. The list of simple responses.
    */
  var simpleResponses: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses](x: Self) {
    
    inline def setSimpleResponses(value: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse]): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
    
    inline def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
    
    inline def setSimpleResponsesVarargs(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse*): Self = StObject.set(x, "simpleResponses", js.Array(value*))
  }
}
