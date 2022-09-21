package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaCompletionDataInputConfig extends StObject {
  
  /**
    * Required. BigQuery input source. Add the IAM permission "BigQuery Data Viewer" for cloud-retail-customer-data-access@system.gserviceaccount.com before using this feature otherwise an error is thrown.
    */
  var bigQuerySource: js.UndefOr[SchemaGoogleCloudRetailV2alphaBigQuerySource] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaCompletionDataInputConfig {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaCompletionDataInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaCompletionDataInputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaCompletionDataInputConfig](x: Self) {
    
    inline def setBigQuerySource(value: SchemaGoogleCloudRetailV2alphaBigQuerySource): Self = StObject.set(x, "bigQuerySource", value.asInstanceOf[js.Any])
    
    inline def setBigQuerySourceUndefined: Self = StObject.set(x, "bigQuerySource", js.undefined)
  }
}
