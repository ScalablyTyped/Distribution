package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returned in the google.longrunning.Operation response field.
  */
trait SchemaGoogleFirestoreAdminV1beta1ExportDocumentsResponse extends StObject {
  
  /**
    * Location of the output files. This can be used to begin an import into
    * Cloud Firestore (this project or another project) after the operation
    * completes successfully.
    */
  var outputUriPrefix: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFirestoreAdminV1beta1ExportDocumentsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta1ExportDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta1ExportDocumentsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta1ExportDocumentsResponseMutableBuilder[Self <: SchemaGoogleFirestoreAdminV1beta1ExportDocumentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputUriPrefix(value: String): Self = StObject.set(x, "outputUriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUriPrefixUndefined: Self = StObject.set(x, "outputUriPrefix", js.undefined)
  }
}
