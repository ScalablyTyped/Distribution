package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirestoreAdminV1ExportDocumentsResponse extends StObject {
  
  /**
    * Location of the output files. This can be used to begin an import into Cloud Firestore (this project or another project) after the operation completes successfully.
    */
  var outputUriPrefix: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirestoreAdminV1ExportDocumentsResponse {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1ExportDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1ExportDocumentsResponse]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1ExportDocumentsResponse](x: Self) {
    
    inline def setOutputUriPrefix(value: String): Self = StObject.set(x, "outputUriPrefix", value.asInstanceOf[js.Any])
    
    inline def setOutputUriPrefixNull: Self = StObject.set(x, "outputUriPrefix", null)
    
    inline def setOutputUriPrefixUndefined: Self = StObject.set(x, "outputUriPrefix", js.undefined)
  }
}
