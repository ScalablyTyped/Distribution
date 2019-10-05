package typings.leafletDashRoutingDashMachine.leafletMod.Routing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutingErrorEvent extends js.Object {
  var error: IError
}

object RoutingErrorEvent {
  @scala.inline
  def apply(error: IError): RoutingErrorEvent = {
    val __obj = js.Dynamic.literal(error = error)
  
    __obj.asInstanceOf[RoutingErrorEvent]
  }
}

