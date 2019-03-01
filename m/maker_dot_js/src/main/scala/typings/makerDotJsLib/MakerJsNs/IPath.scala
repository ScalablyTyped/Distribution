package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A line, curved line or other simple two dimensional shape.
  */
trait IPath extends js.Object {
  /**
    * Optional layer of this path.
    */
  var layer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The main point of reference for this path.
    */
  var origin: IPoint
  /**
    * The type of the path, e.g. "line", "circle", or "arc". These strings are enumerated in pathType.
    */
  var `type`: java.lang.String
}

object IPath {
  @scala.inline
  def apply(origin: IPoint, `type`: java.lang.String, layer: java.lang.String = null): IPath = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("origin")(origin)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    __obj.asInstanceOf[IPath]
  }
}

