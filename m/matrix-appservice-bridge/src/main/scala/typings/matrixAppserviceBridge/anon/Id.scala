package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.stateLookupMod.StateLookupEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: String
  
  var realJoinedUsers: js.Array[String]
  
  var remoteJoinedUsers: js.Array[String]
  
  var state: js.Array[StateLookupEvent]
}
object Id {
  
  inline def apply(
    id: String,
    realJoinedUsers: js.Array[String],
    remoteJoinedUsers: js.Array[String],
    state: js.Array[StateLookupEvent]
  ): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], realJoinedUsers = realJoinedUsers.asInstanceOf[js.Any], remoteJoinedUsers = remoteJoinedUsers.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRealJoinedUsers(value: js.Array[String]): Self = StObject.set(x, "realJoinedUsers", value.asInstanceOf[js.Any])
    
    inline def setRealJoinedUsersVarargs(value: String*): Self = StObject.set(x, "realJoinedUsers", js.Array(value :_*))
    
    inline def setRemoteJoinedUsers(value: js.Array[String]): Self = StObject.set(x, "remoteJoinedUsers", value.asInstanceOf[js.Any])
    
    inline def setRemoteJoinedUsersVarargs(value: String*): Self = StObject.set(x, "remoteJoinedUsers", js.Array(value :_*))
    
    inline def setState(value: js.Array[StateLookupEvent]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateVarargs(value: StateLookupEvent*): Self = StObject.set(x, "state", js.Array(value :_*))
  }
}
