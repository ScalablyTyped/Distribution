package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommandExecutor extends js.Object {
  var commands: js.Object
  var commonCallback: js.Function0[scala.Unit] | scala.Unit
  var hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core
  def execute(commandName: java.lang.String, params: js.Any*): scala.Unit
  def registerCommand(name: java.lang.String, commandDescriptor: js.Object): scala.Unit
  def setCommonCallback(callback: js.Function0[scala.Unit]): scala.Unit
}

