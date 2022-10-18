package typings.matrixBotSdk

import typings.matrixBotSdk.libMatrixClientMod.MatrixClient
import typings.matrixBotSdk.libModelsMsc2176Mod.MSC2716BatchSendResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAppserviceUnstableAppserviceApisMod {
  
  @JSImport("matrix-bot-sdk/lib/appservice/UnstableAppserviceApis", "UnstableAppserviceApis")
  @js.native
  open class UnstableAppserviceApis protected () extends StObject {
    def this(client: MatrixClient) = this()
    
    /* private */ var client: Any = js.native
    
    /* private */ var requestId: Any = js.native
    
    /**
      * Sends an event to the given room with a given timestamp.
      * @param {string} roomId the room ID to send the event to
      * @param {string} eventType the type of event to send
      * @param {string} content the event body to send
      * @param {number} ts The origin_server_ts of the new event
      * @returns {Promise<string>} resolves to the event ID that represents the event
      */
    def sendEventWithTimestamp(roomId: String, eventType: String, content: Any, ts: Double): js.Promise[Any] = js.native
    
    /**
      * Send several historical events into a room.
      * @see https://github.com/matrix-org/matrix-doc/pull/2716
      * @param {string} roomId The roomID to send to.
      * @param {string} prevEventId The event ID where this batch will be inserted
      * @param {string} chunkId The chunk ID returned from a previous call. Set falsy to start at the beginning.
      * @param {any[]} events A set of event contents for events to be inserted into the room.
      * @param {any[]} stateEventsAtStart A set of state events to be inserted into the room. Defaults to empty.
      * @returns A set of eventIds and the next chunk ID
      */
    def sendHistoricalEventBatch(roomId: String, prevEventId: String, events: js.Array[Any]): js.Promise[MSC2716BatchSendResponse] = js.native
    def sendHistoricalEventBatch(roomId: String, prevEventId: String, events: js.Array[Any], stateEventsAtStart: js.Array[Any]): js.Promise[MSC2716BatchSendResponse] = js.native
    def sendHistoricalEventBatch(
      roomId: String,
      prevEventId: String,
      events: js.Array[Any],
      stateEventsAtStart: js.Array[Any],
      chunkId: String
    ): js.Promise[MSC2716BatchSendResponse] = js.native
    def sendHistoricalEventBatch(
      roomId: String,
      prevEventId: String,
      events: js.Array[Any],
      stateEventsAtStart: Unit,
      chunkId: String
    ): js.Promise[MSC2716BatchSendResponse] = js.native
    
    /**
      * Sends a state event to the given room with a given timestamp.
      * @param {string} roomId the room ID to send the event to
      * @param {string} type the event type to send
      * @param {string} stateKey the state key to send, should not be null
      * @param {string} content the event body to send
      * @param {number} ts The origin_server_ts of the new event
      * @returns {Promise<string>} resolves to the event ID that represents the message
      */
    def sendStateEventWithTimestamp(roomId: String, `type`: String, stateKey: String, content: Any, ts: Double): js.Promise[String] = js.native
  }
}
