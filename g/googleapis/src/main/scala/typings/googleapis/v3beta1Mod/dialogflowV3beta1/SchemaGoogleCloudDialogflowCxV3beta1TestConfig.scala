package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1TestConfig extends StObject {
  
  /**
    * Flow name to start the test case with. Format: `projects//locations//agents//flows/`. Only one of `flow` and `page` should be set to indicate the starting point of the test case. If both are set, `page` takes precedence over `flow`. If neither is set, the test case will start with start page on the default start flow.
    */
  var flow: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The page to start the test case with. Format: `projects//locations//agents//flows//pages/`. Only one of `flow` and `page` should be set to indicate the starting point of the test case. If both are set, `page` takes precedence over `flow`. If neither is set, the test case will start with start page on the default start flow.
    */
  var page: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Session parameters to be compared when calculating differences.
    */
  var trackingParameters: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1TestConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1TestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1TestConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1TestConfig](x: Self) {
    
    inline def setFlow(value: String): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowNull: Self = StObject.set(x, "flow", null)
    
    inline def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageNull: Self = StObject.set(x, "page", null)
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setTrackingParameters(value: js.Array[String]): Self = StObject.set(x, "trackingParameters", value.asInstanceOf[js.Any])
    
    inline def setTrackingParametersNull: Self = StObject.set(x, "trackingParameters", null)
    
    inline def setTrackingParametersUndefined: Self = StObject.set(x, "trackingParameters", js.undefined)
    
    inline def setTrackingParametersVarargs(value: String*): Self = StObject.set(x, "trackingParameters", js.Array(value*))
  }
}
