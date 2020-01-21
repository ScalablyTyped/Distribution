package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for google.datastore.admin.v1.DatastoreAdmin.ImportEntities.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1ImportEntitiesRequest extends js.Object {
  /**
    * Optionally specify which kinds/namespaces are to be imported. If
    * provided, the list must be a subset of the EntityFilter used in creating
    * the export, otherwise a FAILED_PRECONDITION error will be returned. If no
    * filter is specified then all entities from the export are imported.
    */
  var entityFilter: js.UndefOr[SchemaGoogleDatastoreAdminV1EntityFilter] = js.native
  /**
    * The full resource URL of the external storage location. Currently, only
    * Google Cloud Storage is supported. So input_url should be of the form:
    * `gs://BUCKET_NAME[/NAMESPACE_PATH]/OVERALL_EXPORT_METADATA_FILE`, where
    * `BUCKET_NAME` is the name of the Cloud Storage bucket, `NAMESPACE_PATH`
    * is an optional Cloud Storage namespace path (this is not a Cloud
    * Datastore namespace), and `OVERALL_EXPORT_METADATA_FILE` is the metadata
    * file written by the ExportEntities operation. For more information about
    * Cloud Storage namespace paths, see [Object name
    * considerations](https://cloud.google.com/storage/docs/naming#object-considerations).
    * For more information, see
    * google.datastore.admin.v1.ExportEntitiesResponse.output_url.
    */
  var inputUrl: js.UndefOr[String] = js.native
  /**
    * Client-assigned labels.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaGoogleDatastoreAdminV1ImportEntitiesRequest {
  @scala.inline
  def apply(
    entityFilter: SchemaGoogleDatastoreAdminV1EntityFilter = null,
    inputUrl: String = null,
    labels: StringDictionary[String] = null
  ): SchemaGoogleDatastoreAdminV1ImportEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (entityFilter != null) __obj.updateDynamic("entityFilter")(entityFilter.asInstanceOf[js.Any])
    if (inputUrl != null) __obj.updateDynamic("inputUrl")(inputUrl.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1ImportEntitiesRequest]
  }
}

