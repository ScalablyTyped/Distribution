package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownMenu extends Base {
  var SEPARATOR: SeparatorObject
  var commandExecutor: CommandExecutor
  var eventManager: EventManager
  var itemsFactory: ItemsFactory | scala.Unit
  var menu: Menu | scala.Unit
  def close(): scala.Unit
  def executeCommand(commandName: java.lang.String, params: js.Any*): scala.Unit
  def open(event: stdLib.Event): scala.Unit
}

