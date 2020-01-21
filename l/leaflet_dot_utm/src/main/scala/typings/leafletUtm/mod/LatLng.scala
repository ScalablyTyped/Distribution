package typings.leafletUtm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LatLng extends js.Object {
  def utm(): Utm_ = js.native
  def utm(zone: Double): Utm_ = js.native
  def utm(zone: Double, southHemi: Boolean): Utm_ = js.native
}

