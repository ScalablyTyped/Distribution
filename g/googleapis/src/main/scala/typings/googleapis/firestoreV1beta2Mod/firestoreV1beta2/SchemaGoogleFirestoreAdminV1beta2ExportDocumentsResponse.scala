package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returned in the google.longrunning.Operation response field.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta2ExportDocumentsResponse extends StObject {
  
  /**
    * Location of the output files. This can be used to begin an import into
    * Cloud Firestore (this project or another project) after the operation
    * completes successfully.
    */
  var outputUriPrefix: js.UndefOr[String] = js.native
}
object SchemaGoogleFirestoreAdminV1beta2ExportDocumentsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta2ExportDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2ExportDocumentsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta2ExportDocumentsResponseMutableBuilder[Self <: SchemaGoogleFirestoreAdminV1beta2ExportDocumentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputUriPrefix(value: String): Self = StObject.set(x, "outputUriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUriPrefixUndefined: Self = StObject.set(x, "outputUriPrefix", js.undefined)
  }
}
