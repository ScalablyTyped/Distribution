package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1CreateDatasetRequest extends StObject {
  
  /**
    * Required. The dataset to be created.
    */
  var dataset: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1Dataset] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1CreateDatasetRequest {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1CreateDatasetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1CreateDatasetRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1CreateDatasetRequest](x: Self) {
    
    inline def setDataset(value: SchemaGoogleCloudDatalabelingV1beta1Dataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
  }
}
