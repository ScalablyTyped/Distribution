package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interfaces
trait RoutingOptions extends js.Object {
  var allowUTurns: scala.Boolean
  var fileFormat: java.lang.String
  var geometryOnly: scala.Boolean
  var simplifyGeometry: scala.Boolean
  var z: scala.Double
}

object RoutingOptions {
  @scala.inline
  def apply(
    allowUTurns: scala.Boolean,
    fileFormat: java.lang.String,
    geometryOnly: scala.Boolean,
    simplifyGeometry: scala.Boolean,
    z: scala.Double
  ): RoutingOptions = {
    val __obj = js.Dynamic.literal(allowUTurns = allowUTurns, fileFormat = fileFormat, geometryOnly = geometryOnly, simplifyGeometry = simplifyGeometry, z = z)
  
    __obj.asInstanceOf[RoutingOptions]
  }
}

