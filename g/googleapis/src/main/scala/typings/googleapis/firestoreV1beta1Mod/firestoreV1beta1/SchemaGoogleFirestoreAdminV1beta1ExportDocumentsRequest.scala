package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirestoreAdminV1beta1ExportDocumentsRequest extends StObject {
  
  /**
    * Which collection ids to export. Unspecified means all collections.
    */
  var collectionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The output URI. Currently only supports Google Cloud Storage URIs of the form: `gs://BUCKET_NAME[/NAMESPACE_PATH]`, where `BUCKET_NAME` is the name of the Google Cloud Storage bucket and `NAMESPACE_PATH` is an optional Google Cloud Storage namespace path. When choosing a name, be sure to consider Google Cloud Storage naming guidelines: https://cloud.google.com/storage/docs/naming. If the URI is a bucket (without a namespace path), a prefix will be generated based on the start time.
    */
  var outputUriPrefix: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirestoreAdminV1beta1ExportDocumentsRequest {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1beta1ExportDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta1ExportDocumentsRequest]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1beta1ExportDocumentsRequest](x: Self) {
    
    inline def setCollectionIds(value: js.Array[String]): Self = StObject.set(x, "collectionIds", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdsNull: Self = StObject.set(x, "collectionIds", null)
    
    inline def setCollectionIdsUndefined: Self = StObject.set(x, "collectionIds", js.undefined)
    
    inline def setCollectionIdsVarargs(value: String*): Self = StObject.set(x, "collectionIds", js.Array(value*))
    
    inline def setOutputUriPrefix(value: String): Self = StObject.set(x, "outputUriPrefix", value.asInstanceOf[js.Any])
    
    inline def setOutputUriPrefixNull: Self = StObject.set(x, "outputUriPrefix", null)
    
    inline def setOutputUriPrefixUndefined: Self = StObject.set(x, "outputUriPrefix", js.undefined)
  }
}
