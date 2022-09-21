package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest extends StObject {
  
  /**
    * Required. The collection of intents to delete. Only intent `name` must be filled in.
    */
  var intents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Intent]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest](x: Self) {
    
    inline def setIntents(value: js.Array[SchemaGoogleCloudDialogflowV2beta1Intent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIntentsVarargs(value: SchemaGoogleCloudDialogflowV2beta1Intent*): Self = StObject.set(x, "intents", js.Array(value*))
  }
}
