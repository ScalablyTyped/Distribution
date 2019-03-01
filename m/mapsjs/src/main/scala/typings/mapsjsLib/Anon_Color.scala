package typings
package mapsjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: java.lang.String
  var thickness: scala.Double
}

object Anon_Color {
  @scala.inline
  def apply(color: java.lang.String, thickness: scala.Double): Anon_Color = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("thickness")(thickness)
    __obj.asInstanceOf[Anon_Color]
  }
}

