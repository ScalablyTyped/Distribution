package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
trait IError extends js.Object {
  var message: java.lang.String
  var status: java.lang.String | scala.Double
}

object IError {
  @scala.inline
  def apply(message: java.lang.String, status: java.lang.String | scala.Double): IError = {
    val __obj = js.Dynamic.literal(message = message, status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IError]
  }
}

