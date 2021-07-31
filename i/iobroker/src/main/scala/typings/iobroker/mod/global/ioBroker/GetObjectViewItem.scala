package typings.iobroker.mod.global.ioBroker

import typings.iobroker.objectsMod.global.ioBroker.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectViewItem extends StObject {
  
  /** The ID of this object */
  var id: String
  
  /** A copy of the object from the DB */
  var value: Object | Null
}
object GetObjectViewItem {
  
  @scala.inline
  def apply(id: String): GetObjectViewItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[GetObjectViewItem]
  }
  
  @scala.inline
  implicit class GetObjectViewItemMutableBuilder[Self <: GetObjectViewItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
  }
}
