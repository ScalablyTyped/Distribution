package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bezier seed defines the endpoints and control points of a bezier curve.
  */
@js.native
trait IPathBezierSeed extends IPathLine {
  /**
    * The bezier control points. One point for quadratic, 2 points for cubic.
    */
  var controls: js.Array[IPoint] = js.native
  /**
    * T values of the parent if this is a child that represents a split.
    */
  var parentRange: js.UndefOr[IBezierRange] = js.native
}

object IPathBezierSeed {
  @scala.inline
  def apply(controls: js.Array[IPoint], end: IPoint, origin: IPoint, `type`: String): IPathBezierSeed = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathBezierSeed]
  }
  @scala.inline
  implicit class IPathBezierSeedOps[Self <: IPathBezierSeed] (val x: Self) extends AnyVal {
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
    def setControlsVarargs(value: IPoint*): Self = this.set("controls", js.Array(value :_*))
    @scala.inline
    def setControls(value: js.Array[IPoint]): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentRange(value: IBezierRange): Self = this.set("parentRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentRange: Self = this.set("parentRange", js.undefined)
  }
  
}

