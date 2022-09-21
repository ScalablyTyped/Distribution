package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.anon.EventId_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  @JSImport("matrix-appservice-bridge/lib/models/events/event", "StoredEvent")
  @js.native
  open class StoredEvent protected () extends StObject {
    /**
      * Create a store event.
      * @param roomId The matrix room ID
      * @param eventId The matrix event ID
      * @param remoteRoomId The remote room ID
      * @param remoteEventId The remote event ID
      * @param _extras Any extra data that may be included with the event.
      */
    def this(roomId: String, eventId: String, remoteRoomId: String, remoteEventId: String) = this()
    def this(
      roomId: String,
      eventId: String,
      remoteRoomId: String,
      remoteEventId: String,
      _extras: Record[String, Any]
    ) = this()
    
    /* private */ val _extras: Any = js.native
    
    var eventId: String = js.native
    
    /**
      * Get the data value for the given key.
      * @param key An arbitrary bridge-specific key.
      * @return Stored data for this key. May be undefined.
      */
    def get[T](key: String): T = js.native
    
    /**
      * Get the unique ID.
      * @return A unique ID
      */
    def getId(): String = js.native
    
    /**
      * Get the matrix event ID.
      * @return The event ID
      */
    def getMatrixEventId(): String = js.native
    
    /**
      * Get the matrix room ID.
      * @return The room ID
      */
    def getMatrixRoomId(): String = js.native
    
    /**
      * Get the remote event ID.
      * @return The remote event ID
      */
    def getRemoteEventId(): String = js.native
    
    /**
      * Get the remote room ID.
      * @return The remote room ID
      */
    def getRemoteRoomId(): String = js.native
    
    var remoteEventId: String = js.native
    
    var remoteRoomId: String = js.native
    
    var roomId: String = js.native
    
    /**
      * Serialize data about this event into a JSON object.
      */
    def serialize(): StoredEventDoc = js.native
    
    /**
      * Set an arbitrary bridge-specific data value for this event. This will be serailized
      * under an 'extras' key.
      * @param key The key to store the data value under.
      * @param val The data value. This value should be serializable via
      * <code>JSON.stringify(data)</code>.
      */
    def set(key: String, `val`: Any): Unit = js.native
  }
  /* static members */
  object StoredEvent {
    
    @JSImport("matrix-appservice-bridge/lib/models/events/event", "StoredEvent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Set data about this event from a serialized data object.
      * @param data The serialized data
      */
    inline def deserialize(data: StoredEventDoc): StoredEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any]).asInstanceOf[StoredEvent]
  }
  
  trait StoredEventDoc extends StObject {
    
    var extras: Record[String, Any]
    
    var id: String
    
    var matrix: EventId_
    
    var remote: EventId_
  }
  object StoredEventDoc {
    
    inline def apply(extras: Record[String, Any], id: String, matrix: EventId_, remote: EventId_): StoredEventDoc = {
      val __obj = js.Dynamic.literal(extras = extras.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoredEventDoc]
    }
    
    extension [Self <: StoredEventDoc](x: Self) {
      
      inline def setExtras(value: Record[String, Any]): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMatrix(value: EventId_): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setRemote(value: EventId_): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    }
  }
}
