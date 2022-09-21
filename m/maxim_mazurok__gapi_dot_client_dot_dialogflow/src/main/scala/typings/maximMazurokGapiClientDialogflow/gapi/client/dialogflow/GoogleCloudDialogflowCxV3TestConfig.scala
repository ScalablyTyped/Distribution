package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3TestConfig extends StObject {
  
  /**
    * Flow name to start the test case with. Format: `projects//locations//agents//flows/`. Only one of `flow` and `page` should be set to indicate the starting point of the test case. If
    * both are set, `page` takes precedence over `flow`. If neither is set, the test case will start with start page on the default start flow.
    */
  var flow: js.UndefOr[String] = js.undefined
  
  /**
    * The page to start the test case with. Format: `projects//locations//agents//flows//pages/`. Only one of `flow` and `page` should be set to indicate the starting point of the test
    * case. If both are set, `page` takes precedence over `flow`. If neither is set, the test case will start with start page on the default start flow.
    */
  var page: js.UndefOr[String] = js.undefined
  
  /** Session parameters to be compared when calculating differences. */
  var trackingParameters: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudDialogflowCxV3TestConfig {
  
  inline def apply(): GoogleCloudDialogflowCxV3TestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3TestConfig]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3TestConfig](x: Self) {
    
    inline def setFlow(value: String): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setTrackingParameters(value: js.Array[String]): Self = StObject.set(x, "trackingParameters", value.asInstanceOf[js.Any])
    
    inline def setTrackingParametersUndefined: Self = StObject.set(x, "trackingParameters", js.undefined)
    
    inline def setTrackingParametersVarargs(value: String*): Self = StObject.set(x, "trackingParameters", js.Array(value*))
  }
}
