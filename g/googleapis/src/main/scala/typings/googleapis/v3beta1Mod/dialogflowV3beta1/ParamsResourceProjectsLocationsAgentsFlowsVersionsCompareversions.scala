package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsFlowsVersionsCompareversions
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the base flow version to compare with the target version. Use version ID `0` to indicate the draft version of the specified flow. Format: `projects//locations//agents/ /flows//versions/`.
    */
  var baseVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1CompareVersionsRequest] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsFlowsVersionsCompareversions {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsFlowsVersionsCompareversions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsFlowsVersionsCompareversions]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsFlowsVersionsCompareversions](x: Self) {
    
    inline def setBaseVersion(value: String): Self = StObject.set(x, "baseVersion", value.asInstanceOf[js.Any])
    
    inline def setBaseVersionUndefined: Self = StObject.set(x, "baseVersion", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowCxV3beta1CompareVersionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
