package typings.hapiHawk.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderOptions extends js.Object {
  /** Oz application id */
  var app: js.UndefOr[String] = js.undefined
  /** Payload content-type (ignored if hash provided) */
  var contentType: js.UndefOr[String] = js.undefined
  var credentials: Credentials
  /** Oz delegated-by application id */
  var dlg: js.UndefOr[String] = js.undefined
  /** Application specific data sent via the ext attribute */
  var ext: js.UndefOr[String] = js.undefined
  /** Pre-calculated payload hash */
  var hash: js.UndefOr[String] = js.undefined
  /** Time offset to sync with server time (ignored if timestamp provided) */
  var localtimeOffsetMsec: js.UndefOr[Double] = js.undefined
  /** A pre-generated nonce */
  var nonce: js.UndefOr[String] = js.undefined
  /** UTF-8 encoded string for body hash generation (ignored if hash provided) */
  var payload: js.UndefOr[String] = js.undefined
  /** A pre-calculated timestamp in seconds */
  var timestamp: js.UndefOr[Double] = js.undefined
}

object HeaderOptions {
  @scala.inline
  def apply(
    credentials: Credentials,
    app: String = null,
    contentType: String = null,
    dlg: String = null,
    ext: String = null,
    hash: String = null,
    localtimeOffsetMsec: Int | Double = null,
    nonce: String = null,
    payload: String = null,
    timestamp: Int | Double = null
  ): HeaderOptions = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (dlg != null) __obj.updateDynamic("dlg")(dlg.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (localtimeOffsetMsec != null) __obj.updateDynamic("localtimeOffsetMsec")(localtimeOffsetMsec.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderOptions]
  }
}

