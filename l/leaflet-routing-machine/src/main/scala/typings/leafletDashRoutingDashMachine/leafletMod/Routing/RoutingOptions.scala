package typings.leafletDashRoutingDashMachine.leafletMod.Routing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interfaces
trait RoutingOptions extends js.Object {
  var allowUTurns: Boolean
  var fileFormat: String
  var geometryOnly: Boolean
  var simplifyGeometry: Boolean
  var z: Double
}

object RoutingOptions {
  @scala.inline
  def apply(
    allowUTurns: Boolean,
    fileFormat: String,
    geometryOnly: Boolean,
    simplifyGeometry: Boolean,
    z: Double
  ): RoutingOptions = {
    val __obj = js.Dynamic.literal(allowUTurns = allowUTurns.asInstanceOf[js.Any], fileFormat = fileFormat.asInstanceOf[js.Any], geometryOnly = geometryOnly.asInstanceOf[js.Any], simplifyGeometry = simplifyGeometry.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RoutingOptions]
  }
}

