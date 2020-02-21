package typings.hapiHawk.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Artifacts extends js.Object {
  var app: js.UndefOr[String] = js.undefined
  var dlg: js.UndefOr[String] = js.undefined
  var ext: js.UndefOr[String] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var host: String
  var method: String
  var nonce: String
  var port: Double
  var resource: String
  var ts: String
}

object Artifacts {
  @scala.inline
  def apply(
    host: String,
    method: String,
    nonce: String,
    port: Double,
    resource: String,
    ts: String,
    app: String = null,
    dlg: String = null,
    ext: String = null,
    hash: String = null
  ): Artifacts = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (dlg != null) __obj.updateDynamic("dlg")(dlg.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifacts]
  }
}

