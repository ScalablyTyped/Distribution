package typings.iobroker.iobrokerMod.Global.ioBroker

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
    val __obj = js.Dynamic.literal(doc = doc, id = id, value = value)
  
    __obj.asInstanceOf[GetObjectListItem]
  }
}

