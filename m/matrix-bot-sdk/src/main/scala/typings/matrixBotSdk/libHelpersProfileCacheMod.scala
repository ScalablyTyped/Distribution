package typings.matrixBotSdk

import typings.matrixBotSdk.libAppserviceAppserviceMod.Appservice
import typings.matrixBotSdk.mod.MatrixClient
import typings.matrixBotSdk.mod.MatrixProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpersProfileCacheMod {
  
  @JSImport("matrix-bot-sdk/lib/helpers/ProfileCache", "ProfileCache")
  @js.native
  open class ProfileCache protected () extends StObject {
    /**
      * Creates a new profile cache.
      * @param {number} maxEntries The maximum number of entries to cache.
      * @param {number} maxAgeMs The maximum age of an entry in milliseconds.
      * @param {MatrixClient} client The client to use to get profile updates.
      */
    def this(maxEntries: Double, maxAgeMs: Double, client: MatrixClient) = this()
    
    /* private */ var cache: Any = js.native
    
    /* private */ var client: Any = js.native
    
    /* private */ var getCacheKey: Any = js.native
    
    /**
      * Gets a profile for a user in optional room.
      * @param {string} userId The user ID to get a profile for.
      * @param {string|null} roomId Optional room ID to get a per-room profile for the user.
      * @returns {Promise<MatrixProfile>} Resolves to the user's profile.
      */
    def getUserProfile(userId: String): js.Promise[MatrixProfile] = js.native
    def getUserProfile(userId: String, roomId: String): js.Promise[MatrixProfile] = js.native
    
    /* private */ var getUserProfileWith: Any = js.native
    
    /* private */ var tryUpdateProfile: Any = js.native
    
    /**
      * Watch for profile changes to cached entries with the provided application
      * service. The clientFn will be called to get the relevant client for any
      * updates. If the clientFn is null, the appservice's bot user will be used.
      * The clientFn takes two arguments: the user ID being updated and the room ID
      * they are being updated in (shouldn't be null). The return value should be the
      * MatrixClient to use, or null to use the appservice's bot client. The same
      * client will be used to update the user's general profile, if that profile
      * is cached.
      * @param {Appservice} appservice The application service to watch for profile changes with.
      * @param {Function} clientFn The function to use to acquire profile updates with. If null, the appservice's bot client will be used.
      */
    def watchWithAppservice(appservice: Appservice): Unit = js.native
    def watchWithAppservice(
      appservice: Appservice,
      clientFn: js.Function2[/* userId */ String, /* roomId */ String, MatrixClient]
    ): Unit = js.native
    
    /**
      * Watch for profile changes to cached entries with the provided client. The
      * same client will also be used to update the user's profile in the cache.
      * @param {MatrixClient} client The client to watch for profile changes with.
      */
    def watchWithClient(client: MatrixClient): Unit = js.native
  }
}
