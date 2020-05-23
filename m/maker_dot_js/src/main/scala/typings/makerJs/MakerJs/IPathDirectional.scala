package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A path that may be indicated to "flow" in either direction between its endpoints.
  */
trait IPathDirectional extends IPath {
  /**
    * The endpoints of the path.
    */
  var endPoints: js.Array[IPoint]
  /**
    * Path flows forwards or reverse.
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object IPathDirectional {
  @scala.inline
  def apply(
    endPoints: js.Array[IPoint],
    origin: IPoint,
    `type`: String,
    layer: String = null,
    reversed: js.UndefOr[Boolean] = js.undefined
  ): IPathDirectional = {
    val __obj = js.Dynamic.literal(endPoints = endPoints.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathDirectional]
  }
}

