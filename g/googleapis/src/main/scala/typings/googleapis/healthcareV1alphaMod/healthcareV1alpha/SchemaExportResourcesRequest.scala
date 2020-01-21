package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to export resources.
  */
@js.native
trait SchemaExportResourcesRequest extends js.Object {
  /**
    * The BigQuery destination location. The output will be one BigQuery table
    * per resource type.
    */
  var bigqueryDestinationLocation: js.UndefOr[SchemaBigQueryLocation] = js.native
  /**
    * The Cloud Storage destination location. Specify a path to a Cloud Storage
    * bucket or folder rather than a concrete object. The exported outputs are
    * organized by FHIR resource types. The server will create one object per
    * resource type. Each object contains newline delimited JSON, and each line
    * is a FHIR resource.
    */
  var gcsDestinationLocation: js.UndefOr[SchemaGcsDataLocation] = js.native
}

object SchemaExportResourcesRequest {
  @scala.inline
  def apply(
    bigqueryDestinationLocation: SchemaBigQueryLocation = null,
    gcsDestinationLocation: SchemaGcsDataLocation = null
  ): SchemaExportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (bigqueryDestinationLocation != null) __obj.updateDynamic("bigqueryDestinationLocation")(bigqueryDestinationLocation.asInstanceOf[js.Any])
    if (gcsDestinationLocation != null) __obj.updateDynamic("gcsDestinationLocation")(gcsDestinationLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExportResourcesRequest]
  }
}

