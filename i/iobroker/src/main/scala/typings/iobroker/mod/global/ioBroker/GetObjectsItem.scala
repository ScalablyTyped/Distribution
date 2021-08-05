package typings.iobroker.mod.global.ioBroker

import typings.iobroker.objectsMod.global.ioBroker.BaseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectsItem[T /* <: BaseObject */] extends StObject {
  
  /** The ID of this object */
  var id: String
  
  /** A copy of the object from the DB */
  var value: T
}
object GetObjectsItem {
  
  inline def apply[T /* <: BaseObject */](id: String, value: T): GetObjectsItem[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectsItem[T]]
  }
  
  extension [Self <: GetObjectsItem[?], T /* <: BaseObject */](x: Self & GetObjectsItem[T]) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
