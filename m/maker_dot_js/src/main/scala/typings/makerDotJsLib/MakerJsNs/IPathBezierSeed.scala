package typings
package makerDotJsLib.MakerJsNs

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
    `type`: java.lang.String,
    layer: java.lang.String = null,
    parentRange: IBezierRange = null
  ): IPathBezierSeed = {
    val __obj = js.Dynamic.literal(controls = controls, end = end, origin = origin)
    __obj.updateDynamic("type")(`type`)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (parentRange != null) __obj.updateDynamic("parentRange")(parentRange)
    __obj.asInstanceOf[IPathBezierSeed]
  }
}

