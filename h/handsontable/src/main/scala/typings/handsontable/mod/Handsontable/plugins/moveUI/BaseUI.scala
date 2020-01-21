package typings.handsontable.mod.Handsontable.plugins.moveUI

import typings.handsontable.mod._Handsontable.Core
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseUI extends js.Object {
  var hot: Core
  var state: Double
  def appendTo(wrapper: HTMLElement): Unit
  def build(): Unit
  def destroy(): Unit
  def getOffset(): js.Object
  def getPosition(): js.Object
  def getSize(): js.Object
  def isAppended(): Boolean
  def isBuilt(): Boolean
  def setOffset(top: Double, left: Double): Unit
  def setPosition(top: Double, left: Double): Unit
  def setSize(width: Double, height: Double): Unit
}

object BaseUI {
  @scala.inline
  def apply(
    appendTo: HTMLElement => Unit,
    build: () => Unit,
    destroy: () => Unit,
    getOffset: () => js.Object,
    getPosition: () => js.Object,
    getSize: () => js.Object,
    hot: Core,
    isAppended: () => Boolean,
    isBuilt: () => Boolean,
    setOffset: (Double, Double) => Unit,
    setPosition: (Double, Double) => Unit,
    setSize: (Double, Double) => Unit,
    state: Double
  ): BaseUI = {
    val __obj = js.Dynamic.literal(appendTo = js.Any.fromFunction1(appendTo), build = js.Any.fromFunction0(build), destroy = js.Any.fromFunction0(destroy), getOffset = js.Any.fromFunction0(getOffset), getPosition = js.Any.fromFunction0(getPosition), getSize = js.Any.fromFunction0(getSize), hot = hot.asInstanceOf[js.Any], isAppended = js.Any.fromFunction0(isAppended), isBuilt = js.Any.fromFunction0(isBuilt), setOffset = js.Any.fromFunction2(setOffset), setPosition = js.Any.fromFunction2(setPosition), setSize = js.Any.fromFunction2(setSize), state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseUI]
  }
}

