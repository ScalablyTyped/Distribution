package typings.matrixBotSdk

import typings.matrixBotSdk.anon.Index
import typings.matrixBotSdk.anon.PartialEncryptionEventCon
import typings.matrixBotSdk.libE2eeIcryptoroominformationMod.ICryptoRoomInformation
import typings.matrixBotSdk.libModelsCryptoMod.UserDevice
import typings.matrixBotSdk.libStorageIcryptostorageproviderMod.ICryptoStorageProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStorageSqliteCryptoStorageProviderMod {
  
  @JSImport("matrix-bot-sdk/lib/storage/SqliteCryptoStorageProvider", "SqliteCryptoStorageProvider")
  @js.native
  open class SqliteCryptoStorageProvider protected ()
    extends StObject
       with ICryptoStorageProvider {
    /**
      * Creates a new Sqlite storage provider.
      * @param {string} path The file path to store the database at. Use ":memory:" to
      * store the database entirely in memory, or an empty string to do the equivalent
      * on the disk.
      */
    def this(path: String) = this()
    
    /**
      * Closes the crypto store. Primarily for testing purposes.
      */
    def close(): js.Promise[Unit] = js.native
    
    /* private */ var db: Any = js.native
    
    /* private */ var deMetadataSelect: Any = js.native
    
    /* private */ var deMetadataUpsert: Any = js.native
    
    def flagUsersOutdated(userIds: js.Array[String]): js.Promise[Unit] = js.native
    
    def getActiveUserDevice(userId: String, deviceId: String): js.Promise[UserDevice] = js.native
    
    def getActiveUserDevices(userId: String): js.Promise[js.Array[UserDevice]] = js.native
    
    def getAllUserDevices(userId: String): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoredUserDevice */ Any
        ]
      ] = js.native
    
    def getCurrentOlmSession(userId: String, deviceId: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IOlmSession */ Any
      ] = js.native
    
    def getCurrentOutboundGroupSession(roomId: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IOutboundGroupSession */ Any
      ] = js.native
    
    /**
      * Gets the client's device ID, if known.
      * @returns {Promise<string>} Resolves to the device ID, or falsy if not known.
      */
    /* CompleteClass */
    override def getDeviceId(): js.Promise[String] = js.native
    
    def getEventForMessageIndex(roomId: String, sessionId: String, messageIndex: Double): js.Promise[String] = js.native
    
    def getInboundGroupSession(senderUserId: String, senderDeviceId: String, roomId: String, sessionId: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IInboundGroupSession */ Any
      ] = js.native
    
    def getLastSentOutboundGroupSession(userId: String, deviceId: String, roomId: String): js.Promise[Index] = js.native
    
    def getOlmSessions(userId: String, deviceId: String): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IOlmSession */ Any
        ]
      ] = js.native
    
    def getOutboundGroupSession(sessionId: String, roomId: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IOutboundGroupSession */ Any
      ] = js.native
    
    def getPickleKey(): js.Promise[String] = js.native
    
    def getPickledAccount(): js.Promise[String] = js.native
    
    /**
      * Gets a room's configuration. If the room is unknown, a falsy value is returned.
      * @param {string} roomId The room ID to get the configuration for.
      * @returns {Promise<ICryptoRoomInformation>} Resolves to the room's configuration, or
      * to falsy if the room is unknown.
      */
    /* CompleteClass */
    override def getRoom(roomId: String): js.Promise[ICryptoRoomInformation] = js.native
    
    /* private */ var ibGroupSessionSelect: Any = js.native
    
    /* private */ var ibGroupSessionUpsert: Any = js.native
    
    def isUserOutdated(userId: String): js.Promise[Boolean] = js.native
    
    /* private */ var kvSelect: Any = js.native
    
    /* private */ var kvUpsert: Any = js.native
    
    /* private */ var obGroupCurrentSessionSelect: Any = js.native
    
    /* private */ var obGroupSessionMarkAllInactive: Any = js.native
    
    /* private */ var obGroupSessionSelect: Any = js.native
    
    /* private */ var obGroupSessionUpsert: Any = js.native
    
    /* private */ var obSentGroupSessionUpsert: Any = js.native
    
    /* private */ var obSentSelectLastSent: Any = js.native
    
    /* private */ var olmSessionCurrentSelect: Any = js.native
    
    /* private */ var olmSessionSelect: Any = js.native
    
    /* private */ var olmSessionUpsert: Any = js.native
    
    /* private */ var roomSelect: Any = js.native
    
    /* private */ var roomUpsert: Any = js.native
    
    def setActiveUserDevices(userId: String, devices: js.Array[UserDevice]): js.Promise[Unit] = js.native
    
    /**
      * Sets the client's device ID.
      * @param {string} deviceId The device ID.
      * @returns {Promise<void>} Resolves when complete.
      */
    /* CompleteClass */
    override def setDeviceId(deviceId: String): js.Promise[Unit] = js.native
    
    def setMessageIndexForEvent(roomId: String, eventId: String, sessionId: String, messageIndex: Double): js.Promise[Unit] = js.native
    
    def setPickleKey(pickleKey: String): js.Promise[Unit] = js.native
    
    def setPickledAccount(pickled: String): js.Promise[Unit] = js.native
    
    def storeInboundGroupSession(
      session: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IInboundGroupSession */ Any
    ): js.Promise[Unit] = js.native
    
    def storeOlmSession(
      userId: String,
      deviceId: String,
      session: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IOlmSession */ Any
    ): js.Promise[Unit] = js.native
    
    def storeOutboundGroupSession(
      session: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IOutboundGroupSession */ Any
    ): js.Promise[Unit] = js.native
    
    def storeRoom(roomId: String, config: PartialEncryptionEventCon): js.Promise[Unit] = js.native
    /**
      * Stores a room's configuration.
      * @param {string} roomId The room ID to store the configuration for.
      * @param {ICryptoRoomInformation} config The room's encryption config. May be empty.
      * @returns {Promise<void>} Resolves when complete.
      */
    /* CompleteClass */
    override def storeRoom(roomId: String, config: ICryptoRoomInformation): js.Promise[Unit] = js.native
    
    def storeSentOutboundGroupSession(
      session: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IOutboundGroupSession */ Any,
      index: Double,
      device: UserDevice
    ): js.Promise[Unit] = js.native
    
    /* private */ var userActiveDeviceSelect: Any = js.native
    
    /* private */ var userActiveDevicesSelect: Any = js.native
    
    /* private */ var userDeviceUpsert: Any = js.native
    
    /* private */ var userDevicesDelete: Any = js.native
    
    /* private */ var userDevicesSelect: Any = js.native
    
    /* private */ var userSelect: Any = js.native
    
    /* private */ var userUpsert: Any = js.native
  }
}
