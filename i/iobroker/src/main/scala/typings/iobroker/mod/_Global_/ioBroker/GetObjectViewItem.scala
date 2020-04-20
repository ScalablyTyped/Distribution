package typings.iobroker.mod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectViewItem extends js.Object {
  /** The ID of this object */
  var id: String
  /** A copy of the object from the DB */
  var value: Object | Null
}

object GetObjectViewItem {
  @scala.inline
  def apply(id: String, value: Object = null): GetObjectViewItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectViewItem]
  }
}

