package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The BigQuery table where the output should be written.
  */
trait SchemaGoogleCloudHealthcareV1alpha2DicomBigQueryDestination extends StObject {
  
  /**
    * If the destination table already exists and this flag is `TRUE`, the
    * table will be overwritten by the contents of the DICOM store. If the flag
    * is not set and the destination table already exists, the export call
    * returns an error.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * BigQuery URI to a table, up to 2000 characters long, in the format
    * `bq://projectId.bqDatasetId.tableId`
    */
  var tableUri: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudHealthcareV1alpha2DicomBigQueryDestination {
  
  @scala.inline
  def apply(): SchemaGoogleCloudHealthcareV1alpha2DicomBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1alpha2DicomBigQueryDestination]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudHealthcareV1alpha2DicomBigQueryDestinationMutableBuilder[Self <: SchemaGoogleCloudHealthcareV1alpha2DicomBigQueryDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setTableUri(value: String): Self = StObject.set(x, "tableUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUriUndefined: Self = StObject.set(x, "tableUri", js.undefined)
  }
}
