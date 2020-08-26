package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashTools extends js.Object {
  var activeTool: js.Any = js.native
  var altIsDown: js.Any = js.native
  var ctlIsDown: js.Any = js.native
  var mouseIsDown: js.Any = js.native
  var penDownLoc: js.Any = js.native
  var penLoc: js.Any = js.native
  var shiftIsDown: js.Any = js.native
  var toolObjs: js.Any = js.native
  def constraintPoint(): js.Any = js.native
  def getKeyDown(): js.Any = js.native
  def setCreatingBbox(): js.Any = js.native
  def setCursor(): js.Any = js.native
  def snapPoint(): js.Any = js.native
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
    val __obj = js.Dynamic.literal(activeTool = activeTool.asInstanceOf[js.Any], altIsDown = altIsDown.asInstanceOf[js.Any], constraintPoint = js.Any.fromFunction0(constraintPoint), ctlIsDown = ctlIsDown.asInstanceOf[js.Any], getKeyDown = js.Any.fromFunction0(getKeyDown), mouseIsDown = mouseIsDown.asInstanceOf[js.Any], penDownLoc = penDownLoc.asInstanceOf[js.Any], penLoc = penLoc.asInstanceOf[js.Any], setCreatingBbox = js.Any.fromFunction0(setCreatingBbox), setCursor = js.Any.fromFunction0(setCursor), shiftIsDown = shiftIsDown.asInstanceOf[js.Any], snapPoint = js.Any.fromFunction0(snapPoint), toolObjs = toolObjs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashTools]
  }
  @scala.inline
  implicit class FlashToolsOps[Self <: FlashTools] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveTool(value: js.Any): Self = this.set("activeTool", value.asInstanceOf[js.Any])
    @scala.inline
    def setAltIsDown(value: js.Any): Self = this.set("altIsDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setConstraintPoint(value: () => js.Any): Self = this.set("constraintPoint", js.Any.fromFunction0(value))
    @scala.inline
    def setCtlIsDown(value: js.Any): Self = this.set("ctlIsDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetKeyDown(value: () => js.Any): Self = this.set("getKeyDown", js.Any.fromFunction0(value))
    @scala.inline
    def setMouseIsDown(value: js.Any): Self = this.set("mouseIsDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setPenDownLoc(value: js.Any): Self = this.set("penDownLoc", value.asInstanceOf[js.Any])
    @scala.inline
    def setPenLoc(value: js.Any): Self = this.set("penLoc", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetCreatingBbox(value: () => js.Any): Self = this.set("setCreatingBbox", js.Any.fromFunction0(value))
    @scala.inline
    def setSetCursor(value: () => js.Any): Self = this.set("setCursor", js.Any.fromFunction0(value))
    @scala.inline
    def setShiftIsDown(value: js.Any): Self = this.set("shiftIsDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapPoint(value: () => js.Any): Self = this.set("snapPoint", js.Any.fromFunction0(value))
    @scala.inline
    def setToolObjs(value: js.Any): Self = this.set("toolObjs", value.asInstanceOf[js.Any])
  }
  
}

