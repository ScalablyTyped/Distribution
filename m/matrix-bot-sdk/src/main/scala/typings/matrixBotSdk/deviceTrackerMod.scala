package typings.matrixBotSdk

import typings.matrixBotSdk.cryptoMod.UserDevice
import typings.matrixBotSdk.matrixClientMod.MatrixClient
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceTrackerMod {
  
  @JSImport("matrix-bot-sdk/lib/e2ee/DeviceTracker", "DeviceTracker")
  @js.native
  open class DeviceTracker protected () extends StObject {
    def this(client: MatrixClient) = this()
    
    /* private */ var client: Any = js.native
    
    /* private */ var deviceListUpdates: Any = js.native
    
    /**
      * Flags multiple user's device lists as outdated, optionally queuing an immediate update.
      * @param {string} userIds The user IDs to flag the device lists of.
      * @param {boolean} resync True (default) to queue an immediate update, false otherwise.
      * @returns {Promise<void>} Resolves when the flagging has completed. Will wait for the resync
      * if requested too.
      */
    def flagUsersOutdated(userIds: js.Array[String]): js.Promise[Unit] = js.native
    def flagUsersOutdated(userIds: js.Array[String], resync: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Gets the device lists for the given user IDs. Outdated device lists will be updated before
      * returning.
      * @param {string[]} userIds The user IDs to get the device lists of.
      * @returns {Promise<Record<string, UserDevice[]>>} Resolves to a map of user ID to device list.
      * If a user has no devices, they may be excluded from the result or appear as an empty array.
      */
    def getDevicesFor(userIds: js.Array[String]): js.Promise[Record[String, js.Array[UserDevice]]] = js.native
    
    /**
      * Updates multiple user's device lists regardless of outdated flag.
      * @param {string[]} userIds The user IDs to update.
      * @returns {Promise<void>} Resolves when complete.
      */
    def updateUsersDeviceLists(userIds: js.Array[String]): js.Promise[Unit] = js.native
  }
}
