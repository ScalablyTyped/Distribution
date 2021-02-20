package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Age extends StObject {
  
  var age: js.Any = js.native
  
  var daemon: js.Any = js.native
  
  var ttlInterval: js.Any = js.native
}
object Age {
  
  @scala.inline
  def apply(age: js.Any, daemon: js.Any, ttlInterval: js.Any): Age = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], daemon = daemon.asInstanceOf[js.Any], ttlInterval = ttlInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Age]
  }
  
  @scala.inline
  implicit class AgeMutableBuilder[Self <: Age] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAge(value: js.Any): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaemon(value: js.Any): Self = StObject.set(x, "daemon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlInterval(value: js.Any): Self = StObject.set(x, "ttlInterval", value.asInstanceOf[js.Any])
  }
}
