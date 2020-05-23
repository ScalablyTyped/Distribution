package typings.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RStyle extends js.Object {
  var r: Double
  var style: Left
}

object RStyle {
  @scala.inline
  def apply(r: Double, style: Left): RStyle = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RStyle]
  }
}

