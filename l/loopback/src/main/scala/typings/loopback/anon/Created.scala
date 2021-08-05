package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Created[T] extends StObject {
  
  var created: Boolean
  
  var instance: T
}
object Created {
  
  inline def apply[T](created: Boolean, instance: T): Created[T] = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created[T]]
  }
  
  extension [Self <: Created[?], T](x: Self & Created[T]) {
    
    inline def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setInstance(value: T): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
  }
}
