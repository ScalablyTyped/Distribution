package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Redacts identifying information from the specified dataset.
  */
trait SchemaDeidentifyDatasetRequest extends StObject {
  
  /**
    * Deidentify configuration
    */
  var config: js.UndefOr[SchemaDeidentifyConfig] = js.undefined
  
  /**
    * The name of the dataset resource to which the redacted data should be
    * written (e.g.,
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`).
    * The new dataset must not exist, or the request will fail.
    */
  var destinationDataset: js.UndefOr[String] = js.undefined
}
object SchemaDeidentifyDatasetRequest {
  
  inline def apply(): SchemaDeidentifyDatasetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifyDatasetRequest]
  }
  
  extension [Self <: SchemaDeidentifyDatasetRequest](x: Self) {
    
    inline def setConfig(value: SchemaDeidentifyConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDestinationDataset(value: String): Self = StObject.set(x, "destinationDataset", value.asInstanceOf[js.Any])
    
    inline def setDestinationDatasetUndefined: Self = StObject.set(x, "destinationDataset", js.undefined)
  }
}
