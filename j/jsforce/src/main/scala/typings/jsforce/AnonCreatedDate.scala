package typings.jsforce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreatedDate extends js.Object {
  var createdDate: js.Any
  var `type`: js.Object
}

object AnonCreatedDate {
  @scala.inline
  def apply(createdDate: js.Any, `type`: js.Object): AnonCreatedDate = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreatedDate]
  }
}

