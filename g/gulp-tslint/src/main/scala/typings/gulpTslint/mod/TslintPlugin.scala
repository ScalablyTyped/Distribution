package typings.gulpTslint.mod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TslintPlugin extends js.Object {
  
  def apply(): ReadWriteStream = js.native
  def apply(pluginOptions: PluginOptions): ReadWriteStream = js.native
  
  var pluginOptions: PluginOptions = js.native
  
  def report(): ReadWriteStream = js.native
  def report(options: ReportOptions): ReadWriteStream = js.native
}
