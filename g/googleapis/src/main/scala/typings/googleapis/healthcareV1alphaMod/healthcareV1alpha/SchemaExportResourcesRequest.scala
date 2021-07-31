package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to export resources.
  */
trait SchemaExportResourcesRequest extends StObject {
  
  /**
    * The BigQuery destination location. The output will be one BigQuery table
    * per resource type.
    */
  var bigqueryDestinationLocation: js.UndefOr[SchemaBigQueryLocation] = js.undefined
  
  /**
    * The Cloud Storage destination location. Specify a path to a Cloud Storage
    * bucket or folder rather than a concrete object. The exported outputs are
    * organized by FHIR resource types. The server will create one object per
    * resource type. Each object contains newline delimited JSON, and each line
    * is a FHIR resource.
    */
  var gcsDestinationLocation: js.UndefOr[SchemaGcsDataLocation] = js.undefined
}
object SchemaExportResourcesRequest {
  
  @scala.inline
  def apply(): SchemaExportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportResourcesRequest]
  }
  
  @scala.inline
  implicit class SchemaExportResourcesRequestMutableBuilder[Self <: SchemaExportResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigqueryDestinationLocation(value: SchemaBigQueryLocation): Self = StObject.set(x, "bigqueryDestinationLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigqueryDestinationLocationUndefined: Self = StObject.set(x, "bigqueryDestinationLocation", js.undefined)
    
    @scala.inline
    def setGcsDestinationLocation(value: SchemaGcsDataLocation): Self = StObject.set(x, "gcsDestinationLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsDestinationLocationUndefined: Self = StObject.set(x, "gcsDestinationLocation", js.undefined)
  }
}
