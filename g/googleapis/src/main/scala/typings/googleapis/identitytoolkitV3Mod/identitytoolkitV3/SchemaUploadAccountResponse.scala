package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typings.googleapis.AnonIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Respone of uploading accounts in batch.
  */
@js.native
trait SchemaUploadAccountResponse extends js.Object {
  /**
    * The error encountered while processing the account info.
    */
  var error: js.UndefOr[js.Array[AnonIndex]] = js.native
  /**
    * The fixed string &quot;identitytoolkit#UploadAccountResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaUploadAccountResponse {
  @scala.inline
  def apply(error: js.Array[AnonIndex] = null, kind: String = null): SchemaUploadAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUploadAccountResponse]
  }
}

