package typings.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interfaces
@js.native
trait RoutingOptions extends js.Object {
  var allowUTurns: Boolean = js.native
  var fileFormat: String = js.native
  var geometryOnly: Boolean = js.native
  var simplifyGeometry: Boolean = js.native
  var z: Double = js.native
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
  @scala.inline
  implicit class RoutingOptionsOps[Self <: RoutingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowUTurns(value: Boolean): Self = this.set("allowUTurns", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileFormat(value: String): Self = this.set("fileFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeometryOnly(value: Boolean): Self = this.set("geometryOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setSimplifyGeometry(value: Boolean): Self = this.set("simplifyGeometry", value.asInstanceOf[js.Any])
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
  }
  
}

