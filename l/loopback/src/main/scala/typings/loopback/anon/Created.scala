package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Created[T] extends StObject {
  
  var created: Boolean
  
  var instance: T
}
object Created {
  
  @scala.inline
  def apply[T](created: Boolean, instance: T): Created[T] = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created[T]]
  }
  
  @scala.inline
  implicit class CreatedMutableBuilder[Self <: Created[?], T] (val x: Self & Created[T]) extends AnyVal {
    
    @scala.inline
    def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: T): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
  }
}
