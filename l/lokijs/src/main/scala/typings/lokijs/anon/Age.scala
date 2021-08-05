package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Age extends StObject {
  
  var age: js.Any
  
  var daemon: js.Any
  
  var ttlInterval: js.Any
}
object Age {
  
  inline def apply(age: js.Any, daemon: js.Any, ttlInterval: js.Any): Age = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], daemon = daemon.asInstanceOf[js.Any], ttlInterval = ttlInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Age]
  }
  
  extension [Self <: Age](x: Self) {
    
    inline def setAge(value: js.Any): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setDaemon(value: js.Any): Self = StObject.set(x, "daemon", value.asInstanceOf[js.Any])
    
    inline def setTtlInterval(value: js.Any): Self = StObject.set(x, "ttlInterval", value.asInstanceOf[js.Any])
  }
}
