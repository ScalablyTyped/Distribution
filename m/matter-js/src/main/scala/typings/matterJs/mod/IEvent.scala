package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEvent[T] extends StObject {
  
  /**
    * The name of the event
    */
  var name: String
  
  /**
    * The source object of the event
    */
  var source: T
}
object IEvent {
  
  inline def apply[T](name: String, source: T): IEvent[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent[T]]
  }
  
  extension [Self <: IEvent[?], T](x: Self & IEvent[T]) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: T): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
