package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Redacts identifying information from the specified dataset.
  */
trait SchemaDeidentifyDatasetRequest extends StObject {
  
  /**
    * Deidentify configuration.
    */
  var config: js.UndefOr[SchemaDeidentifyConfig] = js.undefined
  
  /**
    * The name of the dataset resource to create and write the redacted data to
    * (e.g.,   * The destination dataset must not exist.  * The destination
    * dataset must be in the same project as the source    dataset.
    * De-identifying data across multiple projects is not supported.
    */
  var destinationDataset: js.UndefOr[String] = js.undefined
}
object SchemaDeidentifyDatasetRequest {
  
  @scala.inline
  def apply(): SchemaDeidentifyDatasetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifyDatasetRequest]
  }
  
  @scala.inline
  implicit class SchemaDeidentifyDatasetRequestMutableBuilder[Self <: SchemaDeidentifyDatasetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: SchemaDeidentifyConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setDestinationDataset(value: String): Self = StObject.set(x, "destinationDataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationDatasetUndefined: Self = StObject.set(x, "destinationDataset", js.undefined)
  }
}
