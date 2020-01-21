package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an HTTP certificate challenge.
  */
@js.native
trait SchemaCertHttpChallenge extends js.Object {
  /**
    * The URL path on which to serve the specified token to satisfy the
    * certificate challenge.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The token to serve at the specified URL path to satisfy the certificate
    * challenge.
    */
  var token: js.UndefOr[String] = js.native
}

object SchemaCertHttpChallenge {
  @scala.inline
  def apply(path: String = null, token: String = null): SchemaCertHttpChallenge = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCertHttpChallenge]
  }
}

