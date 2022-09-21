package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3IntentInput extends StObject {
  
  /**
    * Required. The unique identifier of the intent. Format: `projects//locations//agents//intents/`.
    */
  var intent: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3IntentInput {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3IntentInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3IntentInput]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3IntentInput](x: Self) {
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentNull: Self = StObject.set(x, "intent", null)
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
  }
}
