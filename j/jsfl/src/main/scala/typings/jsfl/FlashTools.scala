package typings.jsfl

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
    constraintPoint: () => js.Any,
    ctlIsDown: js.Any,
    getKeyDown: () => js.Any,
    mouseIsDown: js.Any,
    penDownLoc: js.Any,
    penLoc: js.Any,
    setCreatingBbox: () => js.Any,
    setCursor: () => js.Any,
    shiftIsDown: js.Any,
    snapPoint: () => js.Any,
    toolObjs: js.Any
  ): FlashTools = {
    val __obj = js.Dynamic.literal(activeTool = activeTool, altIsDown = altIsDown, constraintPoint = js.Any.fromFunction0(constraintPoint), ctlIsDown = ctlIsDown, getKeyDown = js.Any.fromFunction0(getKeyDown), mouseIsDown = mouseIsDown, penDownLoc = penDownLoc, penLoc = penLoc, setCreatingBbox = js.Any.fromFunction0(setCreatingBbox), setCursor = js.Any.fromFunction0(setCursor), shiftIsDown = shiftIsDown, snapPoint = js.Any.fromFunction0(snapPoint), toolObjs = toolObjs)
  
    __obj.asInstanceOf[FlashTools]
  }
}

