package typings.iobroker.iobrokerMod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectListItem extends GetObjectViewItem {
  /** The same as @link{value} */
  var doc: Object
  /** A copy of the object */
  @JSName("value")
  var value_GetObjectListItem: Object
}

object GetObjectListItem {
  @scala.inline
  def apply(doc: Object, id: String, value: Object): GetObjectListItem = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetObjectListItem]
  }
}

