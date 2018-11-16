package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.moveUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseUI extends js.Object {
  var hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core
  var state: scala.Double
  def appendTo(wrapper: stdLib.HTMLElement): scala.Unit
  def build(): scala.Unit
  def destroy(): scala.Unit
  def getOffset(): js.Object
  def getPosition(): js.Object
  def getSize(): js.Object
  def isAppended(): scala.Boolean
  def isBuilt(): scala.Boolean
  def setOffset(top: scala.Double, left: scala.Double): scala.Unit
  def setPosition(top: scala.Double, left: scala.Double): scala.Unit
  def setSize(width: scala.Double, height: scala.Double): scala.Unit
}

