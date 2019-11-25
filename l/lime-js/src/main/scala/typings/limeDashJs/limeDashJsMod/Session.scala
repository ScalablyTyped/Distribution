package typings.limeDashJs.limeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends Envelope {
  var authentication: js.UndefOr[js.Any] = js.undefined
  var compression: js.UndefOr[String] = js.undefined
  var compressionOptions: js.UndefOr[js.Array[String]] = js.undefined
  var encryption: js.UndefOr[String] = js.undefined
  var encryptionOptions: js.UndefOr[js.Array[String]] = js.undefined
  var reason: js.UndefOr[Reason] = js.undefined
  var scheme: js.UndefOr[String] = js.undefined
  var state: String
}

object Session {
  @scala.inline
  def apply(
    state: String,
    authentication: js.Any = null,
    compression: String = null,
    compressionOptions: js.Array[String] = null,
    encryption: String = null,
    encryptionOptions: js.Array[String] = null,
    from: String = null,
    id: String = null,
    metadata: js.Any = null,
    pp: String = null,
    reason: Reason = null,
    scheme: String = null,
    to: String = null
  ): Session = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (authentication != null) __obj.updateDynamic("authentication")(authentication.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (compressionOptions != null) __obj.updateDynamic("compressionOptions")(compressionOptions.asInstanceOf[js.Any])
    if (encryption != null) __obj.updateDynamic("encryption")(encryption.asInstanceOf[js.Any])
    if (encryptionOptions != null) __obj.updateDynamic("encryptionOptions")(encryptionOptions.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (pp != null) __obj.updateDynamic("pp")(pp.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
}

