package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for FirestoreAdmin.ExportDocuments.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta2ExportDocumentsRequest extends StObject {
  
  /**
    * Which collection ids to export. Unspecified means all collections.
    */
  var collectionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The output URI. Currently only supports Google Cloud Storage URIs of the
    * form: `gs://BUCKET_NAME[/NAMESPACE_PATH]`, where `BUCKET_NAME` is the
    * name of the Google Cloud Storage bucket and `NAMESPACE_PATH` is an
    * optional Google Cloud Storage namespace path. When choosing a name, be
    * sure to consider Google Cloud Storage naming guidelines:
    * https://cloud.google.com/storage/docs/naming. If the URI is a bucket
    * (without a namespace path), a prefix will be generated based on the start
    * time.
    */
  var outputUriPrefix: js.UndefOr[String] = js.native
}
object SchemaGoogleFirestoreAdminV1beta2ExportDocumentsRequest {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta2ExportDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2ExportDocumentsRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta2ExportDocumentsRequestMutableBuilder[Self <: SchemaGoogleFirestoreAdminV1beta2ExportDocumentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionIds(value: js.Array[String]): Self = StObject.set(x, "collectionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionIdsUndefined: Self = StObject.set(x, "collectionIds", js.undefined)
    
    @scala.inline
    def setCollectionIdsVarargs(value: String*): Self = StObject.set(x, "collectionIds", js.Array(value :_*))
    
    @scala.inline
    def setOutputUriPrefix(value: String): Self = StObject.set(x, "outputUriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUriPrefixUndefined: Self = StObject.set(x, "outputUriPrefix", js.undefined)
  }
}
