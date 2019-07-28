package typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs

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
    val __obj = js.Dynamic.literal(allowUTurns = allowUTurns, fileFormat = fileFormat, geometryOnly = geometryOnly, simplifyGeometry = simplifyGeometry, z = z)
  
    __obj.asInstanceOf[RoutingOptions]
  }
}

