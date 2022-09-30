package typings.matrixBotSdk

import typings.matrixBotSdk.anon.Chunk
import typings.matrixBotSdk.matrixClientMod.MatrixClient
import typings.matrixBotSdk.mediaInfoMod.MSC2380MediaInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unstableApisMod {
  
  @JSImport("matrix-bot-sdk/lib/UnstableApis", "UnstableApis")
  @js.native
  open class UnstableApis protected () extends StObject {
    def this(client: MatrixClient) = this()
    
    /**
      * Adds a reaction to an event. The contract for this function may change in the future.
      * @param {string} roomId The room ID to react in
      * @param {string} eventId The event ID to react against, in the given room
      * @param {string} emoji The emoji to react with
      * @returns {Promise<string>} Resolves to the event ID of the reaction
      */
    def addReactionToEvent(roomId: String, eventId: String, emoji: String): js.Promise[String] = js.native
    
    /* private */ var client: Any = js.native
    
    /**
      * Get information about a media item. Implements MSC2380
      * @param {string} mxcUrl The MXC to get information about.
      * @returns {Promise<MSC2380MediaInfo>} Resolves to an object containing the media information.
      */
    def getMediaInfo(mxcUrl: String): js.Promise[MSC2380MediaInfo] = js.native
    
    /**
      * Get relations for a given event.
      * @param {string} roomId The room ID to for the given event.
      * @param {string} eventId The event ID to list reacations for.
      * @param {string?} relationType The type of reaction (e.g. `m.room.member`) to filter for. Optional.
      * @param {string?} eventType The type of event to look for (e.g. `m.room.member`). Optional.
      * @returns {Promise<{original_event: any, chunk: any[]}>} Resolves to an object containing the original event, and a chunk of relations
      */
    def getRelationsForEvent(roomId: String, eventId: String): js.Promise[Chunk] = js.native
    def getRelationsForEvent(roomId: String, eventId: String, relationType: String): js.Promise[Chunk] = js.native
    def getRelationsForEvent(roomId: String, eventId: String, relationType: String, eventType: String): js.Promise[Chunk] = js.native
    def getRelationsForEvent(roomId: String, eventId: String, relationType: Unit, eventType: String): js.Promise[Chunk] = js.native
    
    /**
      * Gets the local room aliases that are published for a given room.
      * @param {string} roomId The room ID to get local aliases for.
      * @returns {Promise<string[]>} Resolves to the aliases on the room, or an empty array.
      * @deprecated Relies on MSC2432 endpoint.
      */
    def getRoomAliases(roomId: String): js.Promise[js.Array[String]] = js.native
  }
}
