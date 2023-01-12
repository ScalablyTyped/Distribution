package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Age extends StObject {
  
  var age: Any
  
  var daemon: Any
  
  var ttlInterval: Any
}
object Age {
  
  inline def apply(age: Any, daemon: Any, ttlInterval: Any): Age = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], daemon = daemon.asInstanceOf[js.Any], ttlInterval = ttlInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Age]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Age] (val x: Self) extends AnyVal {
    
    inline def setAge(value: Any): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setDaemon(value: Any): Self = StObject.set(x, "daemon", value.asInstanceOf[js.Any])
    
    inline def setTtlInterval(value: Any): Self = StObject.set(x, "ttlInterval", value.asInstanceOf[js.Any])
  }
}
