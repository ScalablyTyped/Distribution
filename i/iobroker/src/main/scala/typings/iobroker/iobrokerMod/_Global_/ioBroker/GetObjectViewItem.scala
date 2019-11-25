package typings.iobroker.iobrokerMod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectViewItem extends js.Object {
  /** The ID of this object */
  var id: String
  /** A copy of the object from the DB or some aggregation result */
  var value: Object | js.Any
}

object GetObjectViewItem {
  @scala.inline
  def apply(id: String, value: Object | js.Any): GetObjectViewItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetObjectViewItem]
  }
}

