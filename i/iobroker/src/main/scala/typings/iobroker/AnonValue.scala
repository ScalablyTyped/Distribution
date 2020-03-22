package typings.iobroker

import typings.iobroker.mod._Global_.ioBroker.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var id: String
  var value: Object
}

object AnonValue {
  @scala.inline
  def apply(id: String, value: Object): AnonValue = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValue]
  }
}

