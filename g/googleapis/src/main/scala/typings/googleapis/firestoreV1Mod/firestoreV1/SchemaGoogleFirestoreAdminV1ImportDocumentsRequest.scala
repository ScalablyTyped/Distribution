package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for FirestoreAdmin.ImportDocuments.
  */
trait SchemaGoogleFirestoreAdminV1ImportDocumentsRequest extends StObject {
  
  /**
    * Which collection ids to import. Unspecified means all collections
    * included in the import.
    */
  var collectionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Location of the exported files. This must match the output_uri_prefix of
    * an ExportDocumentsResponse from an export that has completed
    * successfully. See:
    * google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix.
    */
  var inputUriPrefix: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFirestoreAdminV1ImportDocumentsRequest {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1ImportDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1ImportDocumentsRequest]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1ImportDocumentsRequest](x: Self) {
    
    inline def setCollectionIds(value: js.Array[String]): Self = StObject.set(x, "collectionIds", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdsUndefined: Self = StObject.set(x, "collectionIds", js.undefined)
    
    inline def setCollectionIdsVarargs(value: String*): Self = StObject.set(x, "collectionIds", js.Array(value :_*))
    
    inline def setInputUriPrefix(value: String): Self = StObject.set(x, "inputUriPrefix", value.asInstanceOf[js.Any])
    
    inline def setInputUriPrefixUndefined: Self = StObject.set(x, "inputUriPrefix", js.undefined)
  }
}
