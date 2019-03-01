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
    appendTo: js.Function1[stdLib.HTMLElement, scala.Unit],
    build: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    getOffset: js.Function0[js.Object],
    getPosition: js.Function0[js.Object],
    getSize: js.Function0[js.Object],
    hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    isAppended: js.Function0[scala.Boolean],
    isBuilt: js.Function0[scala.Boolean],
    setOffset: js.Function2[scala.Double, scala.Double, scala.Unit],
    setPosition: js.Function2[scala.Double, scala.Double, scala.Unit],
    setSize: js.Function2[scala.Double, scala.Double, scala.Unit],
    state: scala.Double
  ): BaseUI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendTo")(appendTo)
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("getOffset")(getOffset)
    __obj.updateDynamic("getPosition")(getPosition)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("hot")(hot)
    __obj.updateDynamic("isAppended")(isAppended)
    __obj.updateDynamic("isBuilt")(isBuilt)
    __obj.updateDynamic("setOffset")(setOffset)
    __obj.updateDynamic("setPosition")(setPosition)
    __obj.updateDynamic("setSize")(setSize)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[BaseUI]
  }
}

