package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseUI extends js.Object {
  var buildState: scala.Boolean
  var eventManager: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.EventManager
  var hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core
  var options: js.Object
  def build(): scala.Unit
  def destroy(): scala.Unit
  def element(): stdLib.Element
  def focus(): scala.Unit
  def getValue(): js.Any
  def hide(): scala.Unit
  def isBuilt(): scala.Boolean
  def reset(): scala.Unit
  def setValue(value: js.Any): js.Any
  def show(): scala.Unit
  def update(): scala.Unit
}

