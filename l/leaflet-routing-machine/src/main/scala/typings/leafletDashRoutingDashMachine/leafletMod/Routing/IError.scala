package typings.leafletDashRoutingDashMachine.leafletMod.Routing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
trait IError extends js.Object {
  var message: String
  var status: String | Double
}

object IError {
  @scala.inline
  def apply(message: String, status: String | Double): IError = {
    val __obj = js.Dynamic.literal(message = message, status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IError]
  }
}

