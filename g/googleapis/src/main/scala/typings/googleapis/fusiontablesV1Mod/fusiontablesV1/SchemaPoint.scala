package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a point object.
  */
@js.native
trait SchemaPoint extends js.Object {
  /**
    * The coordinates that define the point.
    */
  var coordinates: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Point: A point geometry.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaPoint {
  @scala.inline
  def apply(coordinates: js.Array[Double] = null, `type`: String = null): SchemaPoint = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPoint]
  }
}

