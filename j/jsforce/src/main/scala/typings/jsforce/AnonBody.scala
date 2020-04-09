package typings.jsforce

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: String | Null
  var created_date: Date | Null
}

object AnonBody {
  @scala.inline
  def apply(body: String = null, created_date: Date = null): AnonBody = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (created_date != null) __obj.updateDynamic("created_date")(created_date.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

