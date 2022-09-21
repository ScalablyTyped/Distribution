package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1p1alpha1ImportDataOperationResponse extends StObject {
  
  /**
    * Ouptut only. The name of imported dataset.
    */
  var dataset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Number of examples imported successfully.
    */
  var importCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Total number of examples requested to import
    */
  var totalCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1p1alpha1ImportDataOperationResponse {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1p1alpha1ImportDataOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1p1alpha1ImportDataOperationResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1p1alpha1ImportDataOperationResponse](x: Self) {
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetNull: Self = StObject.set(x, "dataset", null)
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setImportCount(value: Double): Self = StObject.set(x, "importCount", value.asInstanceOf[js.Any])
    
    inline def setImportCountNull: Self = StObject.set(x, "importCount", null)
    
    inline def setImportCountUndefined: Self = StObject.set(x, "importCount", js.undefined)
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountNull: Self = StObject.set(x, "totalCount", null)
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
