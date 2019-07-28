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
    val __obj = js.Dynamic.literal(state = state)
    if (authentication != null) __obj.updateDynamic("authentication")(authentication)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (compressionOptions != null) __obj.updateDynamic("compressionOptions")(compressionOptions)
    if (encryption != null) __obj.updateDynamic("encryption")(encryption)
    if (encryptionOptions != null) __obj.updateDynamic("encryptionOptions")(encryptionOptions)
    if (from != null) __obj.updateDynamic("from")(from)
    if (id != null) __obj.updateDynamic("id")(id)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (pp != null) __obj.updateDynamic("pp")(pp)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Session]
  }
}

