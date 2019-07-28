package typings.gulpDashTslint.gulpDashTslintMod

import typings.node.NodeJSNs.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TslintPlugin extends js.Object {
  var pluginOptions: PluginOptions = js.native
  def apply(): ReadWriteStream = js.native
  def apply(pluginOptions: PluginOptions): ReadWriteStream = js.native
  def report(): ReadWriteStream = js.native
  def report(options: ReportOptions): ReadWriteStream = js.native
}

