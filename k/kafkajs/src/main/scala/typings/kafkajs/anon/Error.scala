package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: js.Error
  
  var groupId: String
  
  var restart: Boolean
}
object Error {
  
  inline def apply(error: js.Error, groupId: String, restart: Boolean): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], restart = restart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setRestart(value: Boolean): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
  }
}
