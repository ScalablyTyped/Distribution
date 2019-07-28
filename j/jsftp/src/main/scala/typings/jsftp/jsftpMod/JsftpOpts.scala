package typings.jsftp.jsftpMod

import typings.jsftp.Anon_Host
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsftpOpts extends js.Object {
  var createSocket: js.UndefOr[
    js.Function2[/* hasPortHost */ Anon_Host, /* firstAction */ js.Function0[js.Object], Socket]
  ] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var pass: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var useList: js.UndefOr[Boolean] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object JsftpOpts {
  @scala.inline
  def apply(
    createSocket: (/* hasPortHost */ Anon_Host, /* firstAction */ js.Function0[js.Object]) => Socket = null,
    host: String = null,
    pass: String = null,
    port: Int | Double = null,
    useList: js.UndefOr[Boolean] = js.undefined,
    user: String = null
  ): JsftpOpts = {
    val __obj = js.Dynamic.literal()
    if (createSocket != null) __obj.updateDynamic("createSocket")(js.Any.fromFunction2(createSocket))
    if (host != null) __obj.updateDynamic("host")(host)
    if (pass != null) __obj.updateDynamic("pass")(pass)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(useList)) __obj.updateDynamic("useList")(useList)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[JsftpOpts]
  }
}

