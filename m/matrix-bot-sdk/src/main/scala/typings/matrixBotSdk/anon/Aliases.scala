package typings.matrixBotSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aliases extends StObject {
  
  /**
    * The room alias namespaces the application service is requesting.
    */
  var aliases: js.Array[Exclusive]
  
  /**
    * The room namespaces the application service is requesting. This is not for alises.
    */
  var rooms: js.Array[Exclusive]
  
  /**
    * The user namespaces the application service is requesting.
    */
  var users: js.Array[Exclusive]
}
object Aliases {
  
  inline def apply(aliases: js.Array[Exclusive], rooms: js.Array[Exclusive], users: js.Array[Exclusive]): Aliases = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], rooms = rooms.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aliases]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Aliases] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: js.Array[Exclusive]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesVarargs(value: Exclusive*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setRooms(value: js.Array[Exclusive]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
    
    inline def setRoomsVarargs(value: Exclusive*): Self = StObject.set(x, "rooms", js.Array(value*))
    
    inline def setUsers(value: js.Array[Exclusive]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: Exclusive*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
