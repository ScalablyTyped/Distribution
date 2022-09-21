package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaCompletionDataInputConfig extends StObject {
  
  /**
    * Required. BigQuery input source. Add the IAM permission "BigQuery Data Viewer" for cloud-retail-customer-data-access@system.gserviceaccount.com before using this feature otherwise an error is thrown.
    */
  var bigQuerySource: js.UndefOr[SchemaGoogleCloudRetailV2betaBigQuerySource] = js.undefined
}
object SchemaGoogleCloudRetailV2betaCompletionDataInputConfig {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaCompletionDataInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaCompletionDataInputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaCompletionDataInputConfig](x: Self) {
    
    inline def setBigQuerySource(value: SchemaGoogleCloudRetailV2betaBigQuerySource): Self = StObject.set(x, "bigQuerySource", value.asInstanceOf[js.Any])
    
    inline def setBigQuerySourceUndefined: Self = StObject.set(x, "bigQuerySource", js.undefined)
  }
}
