package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returned in the google.longrunning.Operation response field.
  */
trait SchemaGoogleFirestoreAdminV1beta2ExportDocumentsResponse extends StObject {
  
  /**
    * Location of the output files. This can be used to begin an import into
    * Cloud Firestore (this project or another project) after the operation
    * completes successfully.
    */
  var outputUriPrefix: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFirestoreAdminV1beta2ExportDocumentsResponse {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1beta2ExportDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2ExportDocumentsResponse]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1beta2ExportDocumentsResponse](x: Self) {
    
    inline def setOutputUriPrefix(value: String): Self = StObject.set(x, "outputUriPrefix", value.asInstanceOf[js.Any])
    
    inline def setOutputUriPrefixUndefined: Self = StObject.set(x, "outputUriPrefix", js.undefined)
  }
}
