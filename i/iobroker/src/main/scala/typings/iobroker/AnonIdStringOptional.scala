package typings.iobroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdStringOptional extends js.Object {
  var id: js.UndefOr[String] = js.undefined
}

object AnonIdStringOptional {
  @scala.inline
  def apply(id: String = null): AnonIdStringOptional = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdStringOptional]
  }
}

