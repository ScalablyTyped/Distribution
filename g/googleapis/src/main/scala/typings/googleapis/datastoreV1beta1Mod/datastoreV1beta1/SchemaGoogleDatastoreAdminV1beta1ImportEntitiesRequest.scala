package typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for
  * google.datastore.admin.v1beta1.DatastoreAdmin.ImportEntities.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1beta1ImportEntitiesRequest extends StObject {
  
  /**
    * Optionally specify which kinds/namespaces are to be imported. If
    * provided, the list must be a subset of the EntityFilter used in creating
    * the export, otherwise a FAILED_PRECONDITION error will be returned. If no
    * filter is specified then all entities from the export are imported.
    */
  var entityFilter: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1EntityFilter] = js.native
  
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
    * google.datastore.admin.v1beta1.ExportEntitiesResponse.output_url.
    */
  var inputUrl: js.UndefOr[String] = js.native
  
  /**
    * Client-assigned labels.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaGoogleDatastoreAdminV1beta1ImportEntitiesRequest {
  
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1beta1ImportEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1beta1ImportEntitiesRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1beta1ImportEntitiesRequestMutableBuilder[Self <: SchemaGoogleDatastoreAdminV1beta1ImportEntitiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityFilter(value: SchemaGoogleDatastoreAdminV1beta1EntityFilter): Self = StObject.set(x, "entityFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityFilterUndefined: Self = StObject.set(x, "entityFilter", js.undefined)
    
    @scala.inline
    def setInputUrl(value: String): Self = StObject.set(x, "inputUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUrlUndefined: Self = StObject.set(x, "inputUrl", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
