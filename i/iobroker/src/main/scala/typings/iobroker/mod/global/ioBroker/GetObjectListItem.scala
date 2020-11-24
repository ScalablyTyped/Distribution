package typings.iobroker.mod.global.ioBroker

import typings.iobroker.objectsMod.global.ioBroker.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectListItem extends GetObjectViewItem {
  
  /** The same as @link{value} */
  var doc: Object = js.native
  
  /** A copy of the object */
  @JSName("value")
  var value_GetObjectListItem: Object = js.native
}
object GetObjectListItem {
  
  @scala.inline
  def apply(doc: Object, id: String, value: Object): GetObjectListItem = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectListItem]
  }
  
  @scala.inline
  implicit class GetObjectListItemOps[Self <: GetObjectListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDoc(value: Object): Self = this.set("doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Object): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
