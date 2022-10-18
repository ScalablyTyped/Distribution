package typings.matrixAppserviceBridge

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsRoomsRemoteMod {
  
  @JSImport("matrix-appservice-bridge/lib/models/rooms/remote", "RemoteRoom")
  @js.native
  open class RemoteRoom protected () extends StObject {
    /**
      * Create a remote room.
      * @param identifier The ID for this room
      * @param data The key-value data object to assign to this room.
      */
    def this(roomId: String) = this()
    def this(roomId: String, data: Record[String, Any]) = this()
    
    var data: Record[String, Any] = js.native
    
    /**
      * Get the data value for the given key.
      * @param key An arbitrary bridge-specific key.
      * @return Stored data for this key. May be undefined.
      */
    def get[T](key: String): T = js.native
    
    /**
      * Get the room ID.
      * @return The room ID
      */
    def getId(): String = js.native
    
    var roomId: String = js.native
    
    /**
      * Serialize all the data about this room, excluding the room ID.
      * @return The serialised data
      */
    def serialize(): Record[String, Any] = js.native
    
    /**
      * Set an arbitrary bridge-specific data value for this room.
      * @param key The key to store the data value under.
      * @param val The data value. This value should be serializable via
      * <code>JSON.stringify(data)</code>.
      */
    def set(key: String, `val`: Any): Unit = js.native
  }
}
