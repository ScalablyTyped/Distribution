package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.anon.EventId_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  @JSImport("matrix-appservice-bridge/lib/models/events/event", "StoredEvent")
  @js.native
  class StoredEvent protected () extends StObject {
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
      _extras: Record[String, _]
    ) = this()
    
    val _extras: js.Any = js.native
    
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
    def set(key: String, `val`: js.Any): Unit = js.native
  }
  /* static members */
  object StoredEvent {
    
    /**
      * Set data about this event from a serialized data object.
      * @param data The serialized data
      */
    @JSImport("matrix-appservice-bridge/lib/models/events/event", "StoredEvent.deserialize")
    @js.native
    def deserialize(data: StoredEventDoc): StoredEvent = js.native
  }
  
  @js.native
  trait StoredEventDoc extends StObject {
    
    var extras: Record[String, _] = js.native
    
    var id: String = js.native
    
    var matrix: EventId_ = js.native
    
    var remote: EventId_ = js.native
  }
  object StoredEventDoc {
    
    @scala.inline
    def apply(extras: Record[String, _], id: String, matrix: EventId_, remote: EventId_): StoredEventDoc = {
      val __obj = js.Dynamic.literal(extras = extras.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoredEventDoc]
    }
    
    @scala.inline
    implicit class StoredEventDocMutableBuilder[Self <: StoredEventDoc] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtras(value: Record[String, _]): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrix(value: EventId_): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemote(value: EventId_): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    }
  }
}
