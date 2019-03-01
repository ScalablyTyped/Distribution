package typings
package koaDashWebpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Close extends js.Object {
  var options: webpackDashHotDashClientLib.webpackDashHotDashClientMod.WebpackHotClientNs.Options
  var server: js.Any
  def close(): scala.Unit
}

object Anon_Close {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    options: webpackDashHotDashClientLib.webpackDashHotDashClientMod.WebpackHotClientNs.Options,
    server: js.Any
  ): Anon_Close = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[Anon_Close]
  }
}

