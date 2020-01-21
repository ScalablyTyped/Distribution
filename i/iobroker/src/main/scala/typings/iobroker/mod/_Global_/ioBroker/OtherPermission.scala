package typings.iobroker.mod._Global_.ioBroker

import typings.iobroker.iobrokerStrings.execute
import typings.iobroker.iobrokerStrings.http
import typings.iobroker.iobrokerStrings.other
import typings.iobroker.iobrokerStrings.sendto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherPermission extends Permission {
  @JSName("operation")
  var operation_OtherPermission: execute | http | sendto
  @JSName("type")
  var type_OtherPermission: other
}

object OtherPermission {
  @scala.inline
  def apply(operation: execute | http | sendto, `type`: other): OtherPermission = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherPermission]
  }
}

