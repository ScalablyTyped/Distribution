package typings.matrixBotSdk

import typings.matrixBotSdk.libE2eeIcryptoroominformationMod.ICryptoRoomInformation
import typings.matrixBotSdk.libMatrixClientMod.MatrixClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libE2eeRoomTrackerMod {
  
  @JSImport("matrix-bot-sdk/lib/e2ee/RoomTracker", "RoomTracker")
  @js.native
  open class RoomTracker protected () extends StObject {
    def this(client: MatrixClient) = this()
    
    /* private */ var client: Any = js.native
    
    /**
      * Gets the room's crypto configuration, as known by the underlying store. If the room is
      * not encrypted then this will return an empty object.
      * @param {string} roomId The room ID to get the config for.
      * @returns {Promise<ICryptoRoomInformation>} Resolves to the encryption config.
      */
    def getRoomCryptoConfig(roomId: String): js.Promise[ICryptoRoomInformation] = js.native
    
    /**
      * Handles a room event.
      * @internal
      * @param roomId The room ID.
      * @param event The event.
      */
    def onRoomEvent(roomId: String, event: Any): js.Promise[Unit] = js.native
    
    /**
      * Handles a room join
      * @internal
      * @param roomId The room ID.
      */
    def onRoomJoin(roomId: String): js.Promise[Unit] = js.native
    
    /**
      * Prepares the room tracker to track the given rooms.
      * @param {string[]} roomIds The room IDs to track. This should be the joined rooms set.
      */
    def prepare(roomIds: js.Array[String]): js.Promise[Unit] = js.native
    
    /**
      * Queues a room check for the tracker. If the room needs an update to the store, an
      * update will be made.
      * @param {string} roomId The room ID to check.
      */
    def queueRoomCheck(roomId: String): js.Promise[Unit] = js.native
  }
}
