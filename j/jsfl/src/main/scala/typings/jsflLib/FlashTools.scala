package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashTools extends js.Object {
  var activeTool: js.Any
  var altIsDown: js.Any
  var ctlIsDown: js.Any
  var mouseIsDown: js.Any
  var penDownLoc: js.Any
  var penLoc: js.Any
  var shiftIsDown: js.Any
  var toolObjs: js.Any
  def constraintPoint(): js.Any
  def getKeyDown(): js.Any
  def setCreatingBbox(): js.Any
  def setCursor(): js.Any
  def snapPoint(): js.Any
}

object FlashTools {
  @scala.inline
  def apply(
    activeTool: js.Any,
    altIsDown: js.Any,
    constraintPoint: js.Function0[js.Any],
    ctlIsDown: js.Any,
    getKeyDown: js.Function0[js.Any],
    mouseIsDown: js.Any,
    penDownLoc: js.Any,
    penLoc: js.Any,
    setCreatingBbox: js.Function0[js.Any],
    setCursor: js.Function0[js.Any],
    shiftIsDown: js.Any,
    snapPoint: js.Function0[js.Any],
    toolObjs: js.Any
  ): FlashTools = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activeTool")(activeTool)
    __obj.updateDynamic("altIsDown")(altIsDown)
    __obj.updateDynamic("constraintPoint")(constraintPoint)
    __obj.updateDynamic("ctlIsDown")(ctlIsDown)
    __obj.updateDynamic("getKeyDown")(getKeyDown)
    __obj.updateDynamic("mouseIsDown")(mouseIsDown)
    __obj.updateDynamic("penDownLoc")(penDownLoc)
    __obj.updateDynamic("penLoc")(penLoc)
    __obj.updateDynamic("setCreatingBbox")(setCreatingBbox)
    __obj.updateDynamic("setCursor")(setCursor)
    __obj.updateDynamic("shiftIsDown")(shiftIsDown)
    __obj.updateDynamic("snapPoint")(snapPoint)
    __obj.updateDynamic("toolObjs")(toolObjs)
    __obj.asInstanceOf[FlashTools]
  }
}

