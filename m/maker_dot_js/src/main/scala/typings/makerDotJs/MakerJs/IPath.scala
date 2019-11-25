package typings.makerDotJs.MakerJs

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
  var layer: js.UndefOr[String] = js.undefined
  /**
    * The main point of reference for this path.
    */
  var origin: IPoint
  /**
    * The type of the path, e.g. "line", "circle", or "arc". These strings are enumerated in pathType.
    */
  var `type`: String
}

object IPath {
  @scala.inline
  def apply(origin: IPoint, `type`: String, layer: String = null): IPath = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPath]
  }
}

