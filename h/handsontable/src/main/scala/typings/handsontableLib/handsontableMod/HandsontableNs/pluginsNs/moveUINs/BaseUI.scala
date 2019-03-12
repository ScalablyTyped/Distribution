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

object BaseUI {
  @scala.inline
  def apply(
    appendTo: stdLib.HTMLElement => scala.Unit,
    build: () => scala.Unit,
    destroy: () => scala.Unit,
    getOffset: () => js.Object,
    getPosition: () => js.Object,
    getSize: () => js.Object,
    hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    isAppended: () => scala.Boolean,
    isBuilt: () => scala.Boolean,
    setOffset: (scala.Double, scala.Double) => scala.Unit,
    setPosition: (scala.Double, scala.Double) => scala.Unit,
    setSize: (scala.Double, scala.Double) => scala.Unit,
    state: scala.Double
  ): BaseUI = {
    val __obj = js.Dynamic.literal(appendTo = js.Any.fromFunction1(appendTo), build = js.Any.fromFunction0(build), destroy = js.Any.fromFunction0(destroy), getOffset = js.Any.fromFunction0(getOffset), getPosition = js.Any.fromFunction0(getPosition), getSize = js.Any.fromFunction0(getSize), hot = hot, isAppended = js.Any.fromFunction0(isAppended), isBuilt = js.Any.fromFunction0(isBuilt), setOffset = js.Any.fromFunction2(setOffset), setPosition = js.Any.fromFunction2(setPosition), setSize = js.Any.fromFunction2(setSize), state = state)
  
    __obj.asInstanceOf[BaseUI]
  }
}

