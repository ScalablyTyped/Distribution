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
    close: () => scala.Unit,
    options: webpackDashHotDashClientLib.webpackDashHotDashClientMod.WebpackHotClientNs.Options,
    server: js.Any
  ): Anon_Close = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), options = options, server = server)
  
    __obj.asInstanceOf[Anon_Close]
  }
}

