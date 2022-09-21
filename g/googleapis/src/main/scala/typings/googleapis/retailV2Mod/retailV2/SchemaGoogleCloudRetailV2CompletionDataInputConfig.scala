package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2CompletionDataInputConfig extends StObject {
  
  /**
    * Required. BigQuery input source. Add the IAM permission "BigQuery Data Viewer" for cloud-retail-customer-data-access@system.gserviceaccount.com before using this feature otherwise an error is thrown.
    */
  var bigQuerySource: js.UndefOr[SchemaGoogleCloudRetailV2BigQuerySource] = js.undefined
}
object SchemaGoogleCloudRetailV2CompletionDataInputConfig {
  
  inline def apply(): SchemaGoogleCloudRetailV2CompletionDataInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2CompletionDataInputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2CompletionDataInputConfig](x: Self) {
    
    inline def setBigQuerySource(value: SchemaGoogleCloudRetailV2BigQuerySource): Self = StObject.set(x, "bigQuerySource", value.asInstanceOf[js.Any])
    
    inline def setBigQuerySourceUndefined: Self = StObject.set(x, "bigQuerySource", js.undefined)
  }
}
