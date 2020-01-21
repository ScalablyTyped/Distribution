package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returned in the google.longrunning.Operation response field.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1ExportDocumentsResponse extends js.Object {
  /**
    * Location of the output files. This can be used to begin an import into
    * Cloud Firestore (this project or another project) after the operation
    * completes successfully.
    */
  var outputUriPrefix: js.UndefOr[String] = js.native
}

object SchemaGoogleFirestoreAdminV1ExportDocumentsResponse {
  @scala.inline
  def apply(outputUriPrefix: String = null): SchemaGoogleFirestoreAdminV1ExportDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (outputUriPrefix != null) __obj.updateDynamic("outputUriPrefix")(outputUriPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1ExportDocumentsResponse]
  }
}

