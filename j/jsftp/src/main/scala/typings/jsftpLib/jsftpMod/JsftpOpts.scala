package typings
package jsftpLib.jsftpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsftpOpts extends js.Object {
  var createSocket: js.UndefOr[
    js.Function2[
      /* hasPortHost */ jsftpLib.Anon_Host, 
      /* firstAction */ js.Function0[js.Object], 
      nodeLib.netMod.Socket
    ]
  ] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var pass: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var useList: js.UndefOr[scala.Boolean] = js.undefined
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object JsftpOpts {
  @scala.inline
  def apply(
    createSocket: js.Function2[
      /* hasPortHost */ jsftpLib.Anon_Host, 
      /* firstAction */ js.Function0[js.Object], 
      nodeLib.netMod.Socket
    ] = null,
    host: java.lang.String = null,
    pass: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    useList: js.UndefOr[scala.Boolean] = js.undefined,
    user: java.lang.String = null
  ): JsftpOpts = {
    val __obj = js.Dynamic.literal()
    if (createSocket != null) __obj.updateDynamic("createSocket")(createSocket)
    if (host != null) __obj.updateDynamic("host")(host)
    if (pass != null) __obj.updateDynamic("pass")(pass)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(useList)) __obj.updateDynamic("useList")(useList)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[JsftpOpts]
  }
}

