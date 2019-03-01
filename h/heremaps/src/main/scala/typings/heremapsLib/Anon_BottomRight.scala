package typings
package heremapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomRight extends js.Object {
  var BottomRight: Anon_LatitudeLongitude
  var TopLeft: Anon_LatitudeLongitude
}

object Anon_BottomRight {
  @scala.inline
  def apply(BottomRight: Anon_LatitudeLongitude, TopLeft: Anon_LatitudeLongitude): Anon_BottomRight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BottomRight")(BottomRight)
    __obj.updateDynamic("TopLeft")(TopLeft)
    __obj.asInstanceOf[Anon_BottomRight]
  }
}

