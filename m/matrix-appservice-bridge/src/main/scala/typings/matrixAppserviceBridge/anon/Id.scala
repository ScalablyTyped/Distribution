package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.stateLookupMod.StateLookupEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id extends StObject {
  
  var id: String = js.native
  
  var realJoinedUsers: js.Array[String] = js.native
  
  var remoteJoinedUsers: js.Array[String] = js.native
  
  var state: js.Array[StateLookupEvent] = js.native
}
object Id {
  
  @scala.inline
  def apply(
    id: String,
    realJoinedUsers: js.Array[String],
    remoteJoinedUsers: js.Array[String],
    state: js.Array[StateLookupEvent]
  ): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], realJoinedUsers = realJoinedUsers.asInstanceOf[js.Any], remoteJoinedUsers = remoteJoinedUsers.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealJoinedUsers(value: js.Array[String]): Self = StObject.set(x, "realJoinedUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealJoinedUsersVarargs(value: String*): Self = StObject.set(x, "realJoinedUsers", js.Array(value :_*))
    
    @scala.inline
    def setRemoteJoinedUsers(value: js.Array[String]): Self = StObject.set(x, "remoteJoinedUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteJoinedUsersVarargs(value: String*): Self = StObject.set(x, "remoteJoinedUsers", js.Array(value :_*))
    
    @scala.inline
    def setState(value: js.Array[StateLookupEvent]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateVarargs(value: StateLookupEvent*): Self = StObject.set(x, "state", js.Array(value :_*))
  }
}
