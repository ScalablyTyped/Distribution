package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1IntentCoverageIntent extends StObject {
  
  /**
    * Whether or not the intent is covered by at least one of the agent's test cases.
    */
  var covered: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The intent full resource name
    */
  var intent: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1IntentCoverageIntent {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1IntentCoverageIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1IntentCoverageIntent]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1IntentCoverageIntent](x: Self) {
    
    inline def setCovered(value: Boolean): Self = StObject.set(x, "covered", value.asInstanceOf[js.Any])
    
    inline def setCoveredNull: Self = StObject.set(x, "covered", null)
    
    inline def setCoveredUndefined: Self = StObject.set(x, "covered", js.undefined)
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentNull: Self = StObject.set(x, "intent", null)
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
  }
}
