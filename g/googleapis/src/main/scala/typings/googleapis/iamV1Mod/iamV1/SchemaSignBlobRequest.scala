package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account sign blob request.
  */
@js.native
trait SchemaSignBlobRequest extends js.Object {
  /**
    * The bytes to sign.
    */
  var bytesToSign: js.UndefOr[String] = js.native
}

object SchemaSignBlobRequest {
  @scala.inline
  def apply(bytesToSign: String = null): SchemaSignBlobRequest = {
    val __obj = js.Dynamic.literal()
    if (bytesToSign != null) __obj.updateDynamic("bytesToSign")(bytesToSign.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSignBlobRequest]
  }
}

