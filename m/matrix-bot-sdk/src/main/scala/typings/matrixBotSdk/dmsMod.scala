package typings.matrixBotSdk

import typings.matrixBotSdk.matrixClientMod.MatrixClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dmsMod {
  
  @JSImport("matrix-bot-sdk/lib/DMs", "DMs")
  @js.native
  open class DMs protected () extends StObject {
    /**
      * Creates a new DM map.
      * @param {MatrixClient} client The client the DM map is for.
      */
    def this(client: MatrixClient) = this()
    
    /* private */ var cached: Any = js.native
    
    /* private */ var client: Any = js.native
    
    /* private */ var fixDms: Any = js.native
    
    /**
      * Gets or creates a DM with a given user. If a DM needs to be created, it will
      * be created as an encrypted DM (if both the MatrixClient and target user support
      * crypto). Otherwise, the createFn can be used to override the call. Note that
      * when creating a DM room the room should have `is_direct: true` set.
      * @param {string} userId The user ID to get/create a DM for.
      * @param {Function} createFn Optional function to use to create the room. Resolves
      * to the created room ID.
      * @returns {Promise<string>} Resolves to the DM room ID.
      */
    def getOrCreateDm(userId: String): js.Promise[String] = js.native
    def getOrCreateDm(userId: String, createFn: js.Function1[/* targetUserId */ String, js.Promise[String]]): js.Promise[String] = js.native
    
    /* private */ var handleInvite: Any = js.native
    
    /**
      * Determines if a given room is a DM according to the cache.
      * @param {string} roomId The room ID.
      * @returns {boolean} True if the room ID is a cached DM room ID.
      */
    def isDm(roomId: String): Boolean = js.native
    
    /* private */ var persistCache: Any = js.native
    
    /* private */ var ready: Any = js.native
    
    /**
      * Forces an update of the DM cache.
      * @returns {Promise<void>} Resolves when complete.
      */
    def update(): js.Promise[Unit] = js.native
    
    /* private */ var updateFromAccountData: Any = js.native
  }
}
