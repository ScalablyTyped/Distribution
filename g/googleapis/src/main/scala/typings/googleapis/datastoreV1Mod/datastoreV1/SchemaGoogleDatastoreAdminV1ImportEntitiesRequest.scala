package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDatastoreAdminV1ImportEntitiesRequest extends StObject {
  
  /**
    * Optionally specify which kinds/namespaces are to be imported. If provided, the list must be a subset of the EntityFilter used in creating the export, otherwise a FAILED_PRECONDITION error will be returned. If no filter is specified then all entities from the export are imported.
    */
  var entityFilter: js.UndefOr[SchemaGoogleDatastoreAdminV1EntityFilter] = js.undefined
  
  /**
    * Required. The full resource URL of the external storage location. Currently, only Google Cloud Storage is supported. So input_url should be of the form: `gs://BUCKET_NAME[/NAMESPACE_PATH]/OVERALL_EXPORT_METADATA_FILE`, where `BUCKET_NAME` is the name of the Cloud Storage bucket, `NAMESPACE_PATH` is an optional Cloud Storage namespace path (this is not a Cloud Datastore namespace), and `OVERALL_EXPORT_METADATA_FILE` is the metadata file written by the ExportEntities operation. For more information about Cloud Storage namespace paths, see [Object name considerations](https://cloud.google.com/storage/docs/naming#object-considerations). For more information, see google.datastore.admin.v1.ExportEntitiesResponse.output_url.
    */
  var inputUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Client-assigned labels.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaGoogleDatastoreAdminV1ImportEntitiesRequest {
  
  inline def apply(): SchemaGoogleDatastoreAdminV1ImportEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1ImportEntitiesRequest]
  }
  
  extension [Self <: SchemaGoogleDatastoreAdminV1ImportEntitiesRequest](x: Self) {
    
    inline def setEntityFilter(value: SchemaGoogleDatastoreAdminV1EntityFilter): Self = StObject.set(x, "entityFilter", value.asInstanceOf[js.Any])
    
    inline def setEntityFilterUndefined: Self = StObject.set(x, "entityFilter", js.undefined)
    
    inline def setInputUrl(value: String): Self = StObject.set(x, "inputUrl", value.asInstanceOf[js.Any])
    
    inline def setInputUrlNull: Self = StObject.set(x, "inputUrl", null)
    
    inline def setInputUrlUndefined: Self = StObject.set(x, "inputUrl", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
