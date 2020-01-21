package typings.mapboxGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCenter extends js.Object {
  /** Map center */
  var center: AnonLat
}

object AnonCenter {
  @scala.inline
  def apply(center: AnonLat): AnonCenter = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCenter]
  }
}

