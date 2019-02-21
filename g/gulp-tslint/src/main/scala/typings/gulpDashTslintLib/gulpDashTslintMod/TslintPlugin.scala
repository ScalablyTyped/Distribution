package typings
package gulpDashTslintLib.gulpDashTslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TslintPlugin extends js.Object {
  var pluginOptions: PluginOptions = js.native
  def apply(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def apply(pluginOptions: PluginOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def report(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def report(options: ReportOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
}

