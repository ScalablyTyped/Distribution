package typings
package makerDotJsLib.MakerJsNs

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
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
}

object IPathDirectional {
  @scala.inline
  def apply(
    endPoints: js.Array[IPoint],
    origin: IPoint,
    `type`: java.lang.String,
    layer: java.lang.String = null,
    reversed: js.UndefOr[scala.Boolean] = js.undefined
  ): IPathDirectional = {
    val __obj = js.Dynamic.literal(endPoints = endPoints, origin = origin)
    __obj.updateDynamic("type")(`type`)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[IPathDirectional]
  }
}

