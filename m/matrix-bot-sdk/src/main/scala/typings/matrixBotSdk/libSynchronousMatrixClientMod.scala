package typings.matrixBotSdk

import typings.matrixBotSdk.libMatrixClientMod.MatrixClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSynchronousMatrixClientMod {
  
  /* note: abstract class */ @JSImport("matrix-bot-sdk/lib/SynchronousMatrixClient", "SynchronousMatrixClient")
  @js.native
  open class SynchronousMatrixClient protected () extends MatrixClient {
    /**
      * Creates a new SynchronousMatrixClient. Note that this accepts a MatrixClient, though
      * much of the class's properties are not brought over. Always convert your MatrixClient
      * instance to a SynchronousMatrixClient as soon as possible to avoid diversion in which
      * properties are proxied over.
      * @param {MatrixClient} baseClient The client to wrap.
      */
    /* protected */ def this(baseClient: MatrixClient) = this()
    
    /* private */ var handleEvent: Any = js.native
    
    /**
      * Handles the `account_data` event raised by the client.
      * @param {any} event The account data event.
      * @returns {Promise<any>} Resolves when complete.
      */
    /* protected */ def onAccountData(event: Any): js.Promise[Any] = js.native
    
    /**
      * Handles the `room.account_data` event raised by the client.
      * @param {string} roomId The Room ID the account data applies to.
      * @param {any} event The room account data event.
      * @returns {Promise<any>} Resolves when complete.
      */
    /* protected */ def onRoomAccountData(roomId: String, event: Any): js.Promise[Any] = js.native
    
    /**
      * Handles the `room.archived` event raised by the client.
      * @param {string} roomId The Room ID the event happened in.
      * @param {any} event The event.
      * @returns {Promise<any>} Resolves when complete.
      */
    /* protected */ def onRoomArchived(roomId: String, event: Any): js.Promise[Any] = js.native
    
    /**
      * Handles the `room.event` event raised by the client.
      * @param {string} roomId The Room ID the event happened in.
      * @param {any} event The event.
      * @returns {Promise<any>} Resolves when complete.
      */
    /* protected */ def onRoomEvent(roomId: String, event: Any): js.Promise[Any] = js.native
    
    /**
      * Handles the `room.invite` event raised by the client.
      * @param {string} roomId The Room ID the event happened in.
      * @param {any} event The event.
      * @returns {Promise<any>} Resolves when complete.
      */
    /* protected */ def onRoomInvite(roomId: String, event: Any): js.Promise[Any] = js.native
    
    /**
      * Handles the `room.join` event raised by the client.
      * @param {string} roomId The Room ID the event happened in.
      * @param {any} event The event.
      * @returns {Promise<any>} Resolves when complete.
      */
    /* protected */ def onRoomJoin(roomId: String, event: Any): js.Promise[Any] = js.native
    
    /**
      * Handles the `room.leave` event raised by the client.
      * @param {string} roomId The Room ID the event happened in.
      * @param {any} event The event.
      * @returns {Promise<any>} Resolves when complete.
      */
    /* protected */ def onRoomLeave(roomId: String, event: Any): js.Promise[Any] = js.native
    
    /**
      * Handles the `room.message` event raised by the client.
      * @param {string} roomId The Room ID the event happened in.
      * @param {any} event The event.
      * @returns {Promise<any>} Resolves when complete.
      */
    /* protected */ def onRoomMessage(roomId: String, event: Any): js.Promise[Any] = js.native
    
    /**
      * Handles the `room.upgraded` event raised by the client.
      * @param {string} roomId The Room ID the event happened in.
      * @param {any} event The event.
      * @returns {Promise<any>} Resolves when complete.
      */
    /* protected */ def onRoomUpgraded(roomId: String, event: Any): js.Promise[Any] = js.native
  }
}
