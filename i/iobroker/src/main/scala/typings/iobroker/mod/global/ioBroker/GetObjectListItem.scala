package typings.iobroker.mod.global.ioBroker

import typings.iobroker.objectsMod.global.ioBroker.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectListItem
  extends StObject
     with GetObjectViewItem[Object] {
  
  /** The same as @link{value} */
  var doc: Object
  
  /** A copy of the object */
  @JSName("value")
  var value_GetObjectListItem: Object
}
object GetObjectListItem {
  
  inline def apply(doc: Object, id: String, value: Object): GetObjectListItem = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectListItem]
  }
  
  extension [Self <: GetObjectListItem](x: Self) {
    
    inline def setDoc(value: Object): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
