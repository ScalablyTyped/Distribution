package typings.googleapis.v1p7beta1Mod.cloudassetV1p7beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssetV1p7beta1OutputConfig extends StObject {
  
  /**
    * Destination on BigQuery. The output table stores the fields in asset proto as columns in BigQuery.
    */
  var bigqueryDestination: js.UndefOr[SchemaGoogleCloudAssetV1p7beta1BigQueryDestination] = js.undefined
  
  /**
    * Destination on Cloud Storage.
    */
  var gcsDestination: js.UndefOr[SchemaGoogleCloudAssetV1p7beta1GcsDestination] = js.undefined
}
object SchemaGoogleCloudAssetV1p7beta1OutputConfig {
  
  inline def apply(): SchemaGoogleCloudAssetV1p7beta1OutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssetV1p7beta1OutputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudAssetV1p7beta1OutputConfig](x: Self) {
    
    inline def setBigqueryDestination(value: SchemaGoogleCloudAssetV1p7beta1BigQueryDestination): Self = StObject.set(x, "bigqueryDestination", value.asInstanceOf[js.Any])
    
    inline def setBigqueryDestinationUndefined: Self = StObject.set(x, "bigqueryDestination", js.undefined)
    
    inline def setGcsDestination(value: SchemaGoogleCloudAssetV1p7beta1GcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
