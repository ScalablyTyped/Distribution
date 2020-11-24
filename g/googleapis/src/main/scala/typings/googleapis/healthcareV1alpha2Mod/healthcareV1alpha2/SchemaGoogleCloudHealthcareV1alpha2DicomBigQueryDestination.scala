package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The BigQuery table where the output should be written.
  */
@js.native
trait SchemaGoogleCloudHealthcareV1alpha2DicomBigQueryDestination extends js.Object {
  
  /**
    * If the destination table already exists and this flag is `TRUE`, the
    * table will be overwritten by the contents of the DICOM store. If the flag
    * is not set and the destination table already exists, the export call
    * returns an error.
    */
  var force: js.UndefOr[Boolean] = js.native
  
  /**
    * BigQuery URI to a table, up to 2000 characters long, in the format
    * `bq://projectId.bqDatasetId.tableId`
    */
  var tableUri: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudHealthcareV1alpha2DicomBigQueryDestination {
  
  @scala.inline
  def apply(): SchemaGoogleCloudHealthcareV1alpha2DicomBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1alpha2DicomBigQueryDestination]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudHealthcareV1alpha2DicomBigQueryDestinationOps[Self <: SchemaGoogleCloudHealthcareV1alpha2DicomBigQueryDestination] (val x: Self) extends AnyVal {
    
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
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setTableUri(value: String): Self = this.set("tableUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableUri: Self = this.set("tableUri", js.undefined)
  }
}
