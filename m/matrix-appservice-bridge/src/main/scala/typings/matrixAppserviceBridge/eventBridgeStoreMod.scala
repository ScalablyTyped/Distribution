package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.bridgeStoreMod.BridgeStore
import typings.matrixAppserviceBridge.eventMod.StoredEvent
import typings.nedb.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventBridgeStoreMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/event-bridge-store", "EventBridgeStore")
  @js.native
  class EventBridgeStore protected () extends BridgeStore {
    def this(db: ^[_]) = this()
    
    /**
      * Get an existing event based on the provided matrix IDs.
      * @param roomId The ID of the room.
      * @param eventId The ID of the event.
      * @return A promise which resolves to the StoredEvent or null.
      */
    def getEntryByMatrixId(roomId: String, eventId: String): js.Promise[StoredEvent | Null] = js.native
    
    /**
      * Get an existing event based on the provided remote IDs.
      * @param roomId The ID of the room.
      * @param eventId The ID of the event.
      * @return A promise which resolves to the StoredEvent or null.
      */
    def getEntryByRemoteId(roomId: String, eventId: String): js.Promise[StoredEvent | Null] = js.native
    
    /**
      * Remove entries based on the event data.
      * @param event The event to remove.
      */
    def removeEvent(event: StoredEvent): js.Promise[Double] = js.native
    
    /**
      * Remove entries based on the matrix IDs.
      * @param roomId The ID of the room.
      * @param eventId The ID of the event.
      */
    def removeEventByMatrixId(roomId: String, eventId: String): js.Promise[Double] = js.native
    
    /**
      * Remove entries based on the matrix IDs.
      * @param roomId The ID of the room.
      * @param eventId The ID of the event.
      */
    def removeEventByRemoteId(roomId: String, eventId: String): js.Promise[Double] = js.native
    
    /**
      * Insert an event, clobbering based on the ID of the StoredEvent.
      * @param event
      */
    def upsertEvent(event: StoredEvent): js.Promise[Double] = js.native
  }
}
