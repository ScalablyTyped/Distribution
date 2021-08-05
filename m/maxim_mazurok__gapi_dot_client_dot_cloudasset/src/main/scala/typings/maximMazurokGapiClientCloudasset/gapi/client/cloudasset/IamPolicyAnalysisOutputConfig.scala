package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IamPolicyAnalysisOutputConfig extends StObject {
  
  /** Destination on BigQuery. */
  var bigqueryDestination: js.UndefOr[GoogleCloudAssetV1BigQueryDestination] = js.undefined
  
  /** Destination on Cloud Storage. */
  var gcsDestination: js.UndefOr[GoogleCloudAssetV1GcsDestination] = js.undefined
}
object IamPolicyAnalysisOutputConfig {
  
  inline def apply(): IamPolicyAnalysisOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamPolicyAnalysisOutputConfig]
  }
  
  extension [Self <: IamPolicyAnalysisOutputConfig](x: Self) {
    
    inline def setBigqueryDestination(value: GoogleCloudAssetV1BigQueryDestination): Self = StObject.set(x, "bigqueryDestination", value.asInstanceOf[js.Any])
    
    inline def setBigqueryDestinationUndefined: Self = StObject.set(x, "bigqueryDestination", js.undefined)
    
    inline def setGcsDestination(value: GoogleCloudAssetV1GcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
