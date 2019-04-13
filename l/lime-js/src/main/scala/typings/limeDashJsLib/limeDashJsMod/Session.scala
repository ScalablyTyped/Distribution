package typings
package limeDashJsLib.limeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends Envelope {
  var authentication: js.UndefOr[js.Any] = js.undefined
  var compression: js.UndefOr[java.lang.String] = js.undefined
  var compressionOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var encryption: js.UndefOr[java.lang.String] = js.undefined
  var encryptionOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var reason: js.UndefOr[Reason] = js.undefined
  var scheme: js.UndefOr[java.lang.String] = js.undefined
  var state: java.lang.String
}

object Session {
  @scala.inline
  def apply(
    state: java.lang.String,
    authentication: js.Any = null,
    compression: java.lang.String = null,
    compressionOptions: js.Array[java.lang.String] = null,
    encryption: java.lang.String = null,
    encryptionOptions: js.Array[java.lang.String] = null,
    from: java.lang.String = null,
    id: java.lang.String = null,
    metadata: js.Any = null,
    pp: java.lang.String = null,
    reason: Reason = null,
    scheme: java.lang.String = null,
    to: java.lang.String = null
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

