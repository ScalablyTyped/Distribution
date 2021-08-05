package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response message for Intents.BatchUpdateIntents.
  */
trait SchemaGoogleCloudDialogflowV2BatchUpdateIntentsResponse extends StObject {
  
  /**
    * The collection of updated or created intents.
    */
  var intents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Intent]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2BatchUpdateIntentsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2BatchUpdateIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2BatchUpdateIntentsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2BatchUpdateIntentsResponse](x: Self) {
    
    inline def setIntents(value: js.Array[SchemaGoogleCloudDialogflowV2Intent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIntentsVarargs(value: SchemaGoogleCloudDialogflowV2Intent*): Self = StObject.set(x, "intents", js.Array(value :_*))
  }
}
