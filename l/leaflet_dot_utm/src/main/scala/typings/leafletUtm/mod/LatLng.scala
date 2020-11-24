package typings.leafletUtm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LatLng extends js.Object {
  
  def utm(): Utm_ = js.native
  def utm(zone: js.UndefOr[scala.Nothing], southHemi: Boolean): Utm_ = js.native
  def utm(zone: Double): Utm_ = js.native
  def utm(zone: Double, southHemi: Boolean): Utm_ = js.native
}
