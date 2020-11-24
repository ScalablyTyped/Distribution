package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to export resources.
  */
@js.native
trait SchemaExportResourcesRequest extends js.Object {
  
  /**
    * The BigQuery output destination.  The BigQuery location requires two IAM
    * roles: `roles/bigquery.dataEditor` and `roles/bigquery.jobUser`.  The
    * output will be one BigQuery table per resource type.
    */
  var bigqueryDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination] = js.native
  
  /**
    * The Cloud Storage output destination.  The Cloud Storage location
    * requires the `roles/storage.objectAdmin` Cloud IAM role.  The exported
    * outputs are organized by FHIR resource types. The server will create one
    * object per resource type. Each object contains newline delimited JSON,
    * and each line is a FHIR resource.
    */
  var gcsDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1beta1FhirRestGcsDestination] = js.native
}
object SchemaExportResourcesRequest {
  
  @scala.inline
  def apply(): SchemaExportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportResourcesRequest]
  }
  
  @scala.inline
  implicit class SchemaExportResourcesRequestOps[Self <: SchemaExportResourcesRequest] (val x: Self) extends AnyVal {
    
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
    def setBigqueryDestination(value: SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination): Self = this.set("bigqueryDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigqueryDestination: Self = this.set("bigqueryDestination", js.undefined)
    
    @scala.inline
    def setGcsDestination(value: SchemaGoogleCloudHealthcareV1beta1FhirRestGcsDestination): Self = this.set("gcsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsDestination: Self = this.set("gcsDestination", js.undefined)
  }
}
