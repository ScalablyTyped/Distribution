package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SslCerts create ephemeral certificate request.
  */
@js.native
trait SchemaSslCertsCreateEphemeralRequest extends js.Object {
  /**
    * PEM encoded public key to include in the signed certificate.
    */
  var public_key: js.UndefOr[String] = js.native
}

object SchemaSslCertsCreateEphemeralRequest {
  @scala.inline
  def apply(public_key: String = null): SchemaSslCertsCreateEphemeralRequest = {
    val __obj = js.Dynamic.literal()
    if (public_key != null) __obj.updateDynamic("public_key")(public_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSslCertsCreateEphemeralRequest]
  }
}

