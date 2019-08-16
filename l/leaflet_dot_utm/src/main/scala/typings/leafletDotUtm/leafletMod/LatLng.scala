package typings.leafletDotUtm.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LatLng extends js.Object {
  def utm(): Utm = js.native
  def utm(zone: Double): Utm = js.native
  def utm(zone: Double, southHemi: Boolean): Utm = js.native
}

