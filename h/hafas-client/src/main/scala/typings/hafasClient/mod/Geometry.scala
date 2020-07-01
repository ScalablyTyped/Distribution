package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends js.Object {
  var coordinates: js.Array[Double]
  var `type`: point
}

object Geometry {
  @scala.inline
  def apply(coordinates: js.Array[Double], `type`: point): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
}

