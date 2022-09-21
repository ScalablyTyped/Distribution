package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectViewItem[T] extends StObject {
  
  /** The ID of this object */
  var id: String
  
  /** A copy of the object from the DB */
  var value: T | Null
}
object GetObjectViewItem {
  
  inline def apply[T](id: String): GetObjectViewItem[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[GetObjectViewItem[T]]
  }
  
  extension [Self <: GetObjectViewItem[?], T](x: Self & GetObjectViewItem[T]) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
