package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bezier seed defines the endpoints and control points of a bezier curve.
  */
trait IPathBezierSeed extends IPathLine {
  /**
    * The bezier control points. One point for quadratic, 2 points for cubic.
    */
  var controls: js.Array[IPoint]
  /**
    * T values of the parent if this is a child that represents a split.
    */
  var parentRange: js.UndefOr[IBezierRange] = js.undefined
}

object IPathBezierSeed {
  @scala.inline
  def apply(
    controls: js.Array[IPoint],
    end: IPoint,
    origin: IPoint,
    `type`: String,
    layer: String = null,
    parentRange: IBezierRange = null
  ): IPathBezierSeed = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (parentRange != null) __obj.updateDynamic("parentRange")(parentRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathBezierSeed]
  }
}

