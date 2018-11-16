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

