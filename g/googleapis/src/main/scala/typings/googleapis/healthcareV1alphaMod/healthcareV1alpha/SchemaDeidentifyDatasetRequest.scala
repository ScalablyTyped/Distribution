package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Redacts identifying information from the specified dataset.
  */
@js.native
trait SchemaDeidentifyDatasetRequest extends js.Object {
  
  /**
    * Deidentify configuration
    */
  var config: js.UndefOr[SchemaDeidentifyConfig] = js.native
  
  /**
    * The name of the dataset resource to which the redacted data should be
    * written (e.g.,
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`).
    * The new dataset must not exist, or the request will fail.
    */
  var destinationDataset: js.UndefOr[String] = js.native
}
object SchemaDeidentifyDatasetRequest {
  
  @scala.inline
  def apply(): SchemaDeidentifyDatasetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifyDatasetRequest]
  }
  
  @scala.inline
  implicit class SchemaDeidentifyDatasetRequestOps[Self <: SchemaDeidentifyDatasetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfig(value: SchemaDeidentifyConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setDestinationDataset(value: String): Self = this.set("destinationDataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationDataset: Self = this.set("destinationDataset", js.undefined)
  }
}
