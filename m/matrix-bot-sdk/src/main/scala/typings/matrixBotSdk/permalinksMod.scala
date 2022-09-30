package typings.matrixBotSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permalinksMod {
  
  @JSImport("matrix-bot-sdk/lib/helpers/Permalinks", "Permalinks")
  @js.native
  /* private */ open class Permalinks () extends StObject
  /* static members */
  object Permalinks {
    
    @JSImport("matrix-bot-sdk/lib/helpers/Permalinks", "Permalinks")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("matrix-bot-sdk/lib/helpers/Permalinks", "Permalinks.encodeViaArgs")
    @js.native
    def encodeViaArgs: Any = js.native
    inline def encodeViaArgs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encodeViaArgs")(x.asInstanceOf[js.Any])
    
    /**
      * Creates an event permalink.
      * @param {string} roomIdOrAlias The room ID or alias to create a permalink in.
      * @param {string} eventId The event ID to reference in the permalink.
      * @param {string[]} viaServers The servers to route the permalink through.
      * @returns {string} An event permalink.
      */
    inline def forEvent(roomIdOrAlias: String, eventId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("forEvent")(roomIdOrAlias.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def forEvent(roomIdOrAlias: String, eventId: String, viaServers: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("forEvent")(roomIdOrAlias.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any], viaServers.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Creates a room permalink.
      * @param {string} roomIdOrAlias The room ID or alias to create a permalink for.
      * @param {string[]} viaServers The servers to route the permalink through.
      * @returns {string} A room permalink.
      */
    inline def forRoom(roomIdOrAlias: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("forRoom")(roomIdOrAlias.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def forRoom(roomIdOrAlias: String, viaServers: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("forRoom")(roomIdOrAlias.asInstanceOf[js.Any], viaServers.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Creates a user permalink.
      * @param {string} userId The user ID to create a permalink for.
      * @returns {string} A user permalink.
      */
    inline def forUser(userId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("forUser")(userId.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Parses a permalink URL into usable parts.
      * @param {string} matrixTo The matrix.to URL to parse.
      * @returns {PermalinkParts} The parts of the permalink.
      */
    inline def parseUrl(matrixTo: String): PermalinkParts = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(matrixTo.asInstanceOf[js.Any]).asInstanceOf[PermalinkParts]
  }
  
  trait PermalinkParts extends StObject {
    
    /**
      * The event ID the permalink references. May be null.
      */
    var eventId: String
    
    /**
      * The room ID or alias the permalink references. May be null.
      */
    var roomIdOrAlias: String
    
    /**
      * The user ID the permalink references. May be null.
      */
    var userId: String
    
    /**
      * The servers the permalink is routed through. May be null or empty.
      */
    var viaServers: js.Array[String]
  }
  object PermalinkParts {
    
    inline def apply(eventId: String, roomIdOrAlias: String, userId: String, viaServers: js.Array[String]): PermalinkParts = {
      val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], roomIdOrAlias = roomIdOrAlias.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], viaServers = viaServers.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermalinkParts]
    }
    
    extension [Self <: PermalinkParts](x: Self) {
      
      inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
      
      inline def setRoomIdOrAlias(value: String): Self = StObject.set(x, "roomIdOrAlias", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setViaServers(value: js.Array[String]): Self = StObject.set(x, "viaServers", value.asInstanceOf[js.Any])
      
      inline def setViaServersVarargs(value: String*): Self = StObject.set(x, "viaServers", js.Array(value*))
    }
  }
}
