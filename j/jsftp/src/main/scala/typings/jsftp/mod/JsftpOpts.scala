package typings.jsftp.mod

import typings.jsftp.anon.Host
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsftpOpts extends js.Object {
  var createSocket: js.UndefOr[
    js.Function2[/* hasPortHost */ Host, /* firstAction */ js.Function0[js.Object], Socket]
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
    createSocket: (/* hasPortHost */ Host, /* firstAction */ js.Function0[js.Object]) => Socket = null,
    host: String = null,
    pass: String = null,
    port: js.UndefOr[Double] = js.undefined,
    useList: js.UndefOr[Boolean] = js.undefined,
    user: String = null
  ): JsftpOpts = {
    val __obj = js.Dynamic.literal()
    if (createSocket != null) __obj.updateDynamic("createSocket")(js.Any.fromFunction2(createSocket))
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (pass != null) __obj.updateDynamic("pass")(pass.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useList)) __obj.updateDynamic("useList")(useList.get.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsftpOpts]
  }
}

