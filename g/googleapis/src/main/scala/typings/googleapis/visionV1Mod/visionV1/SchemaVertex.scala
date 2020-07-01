package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A vertex represents a 2D point in the image. NOTE: the vertex coordinates
  * are in the same scale as the original image.
  */
@js.native
trait SchemaVertex extends js.Object {
  /**
    * X coordinate.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Y coordinate.
    */
  var y: js.UndefOr[Double] = js.native
}

object SchemaVertex {
  @scala.inline
  def apply(x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): SchemaVertex = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVertex]
  }
}

