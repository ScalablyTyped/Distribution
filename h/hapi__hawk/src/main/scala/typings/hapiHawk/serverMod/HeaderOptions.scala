package typings.hapiHawk.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderOptions extends js.Object {
  /** Payload content-type (ignored if hash provided) */
  var contentType: js.UndefOr[String] = js.undefined
  /** Application specific data sent via the ext attribute */
  var ext: js.UndefOr[String] = js.undefined
  /** Pre-calculated payload hash */
  var hash: js.UndefOr[String] = js.undefined
  /** UTF-8 encoded string for body hash generation (ignored if hash provided) */
  var payload: js.UndefOr[String] = js.undefined
}

object HeaderOptions {
  @scala.inline
  def apply(contentType: String = null, ext: String = null, hash: String = null, payload: String = null): HeaderOptions = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderOptions]
  }
}

