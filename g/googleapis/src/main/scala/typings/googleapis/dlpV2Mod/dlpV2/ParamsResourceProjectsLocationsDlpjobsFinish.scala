package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDlpjobsFinish
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the DlpJob resource to be cancelled.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGooglePrivacyDlpV2FinishDlpJobRequest] = js.undefined
}
object ParamsResourceProjectsLocationsDlpjobsFinish {
  
  inline def apply(): ParamsResourceProjectsLocationsDlpjobsFinish = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDlpjobsFinish]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDlpjobsFinish](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGooglePrivacyDlpV2FinishDlpJobRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
