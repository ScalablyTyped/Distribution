package typings.mapsjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: String
  var thickness: Double
}

object Anon_Color {
  @scala.inline
  def apply(color: String, thickness: Double): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Color]
  }
}

