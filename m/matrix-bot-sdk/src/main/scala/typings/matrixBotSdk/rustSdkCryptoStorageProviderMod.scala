package typings.matrixBotSdk

import typings.matrixBotSdk.iappservicestorageproviderMod.IAppserviceCryptoStorageProvider
import typings.matrixBotSdk.icryptoroominformationMod.ICryptoRoomInformation
import typings.matrixBotSdk.icryptostorageproviderMod.ICryptoStorageProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rustSdkCryptoStorageProviderMod {
  
  @JSImport("matrix-bot-sdk/lib/storage/RustSdkCryptoStorageProvider", "RustSdkAppserviceCryptoStorageProvider")
  @js.native
  open class RustSdkAppserviceCryptoStorageProvider protected ()
    extends RustSdkCryptoStorageProvider
       with IAppserviceCryptoStorageProvider {
    /**
      * Creates a new rust-sdk storage provider.
      * @param {string} baseStoragePath The *directory* to persist database details to.
      */
    def this(baseStoragePath: String) = this()
    
    /* private */ var baseStoragePath: Any = js.native
    
    /**
      * Gets a storage provider to use for the given user ID.
      * @param {string} userId The user ID.
      * @returns {ICryptoStorageProvider} The storage provider.
      */
    /* CompleteClass */
    override def storageForUser(userId: String): ICryptoStorageProvider = js.native
  }
  
  @JSImport("matrix-bot-sdk/lib/storage/RustSdkCryptoStorageProvider", "RustSdkCryptoStorageProvider")
  @js.native
  open class RustSdkCryptoStorageProvider protected ()
    extends StObject
       with ICryptoStorageProvider {
    /**
      * Creates a new rust-sdk storage provider.
      * @param {string} storagePath The *directory* to persist database details to.
      */
    def this(storagePath: String) = this()
    
    /* private */ var db: Any = js.native
    
    /**
      * Gets the client's device ID, if known.
      * @returns {Promise<string>} Resolves to the device ID, or falsy if not known.
      */
    /* CompleteClass */
    override def getDeviceId(): js.Promise[String] = js.native
    
    /**
      * Gets a room's configuration. If the room is unknown, a falsy value is returned.
      * @param {string} roomId The room ID to get the configuration for.
      * @returns {Promise<ICryptoRoomInformation>} Resolves to the room's configuration, or
      * to falsy if the room is unknown.
      */
    /* CompleteClass */
    override def getRoom(roomId: String): js.Promise[ICryptoRoomInformation] = js.native
    
    /**
      * Sets the client's device ID.
      * @param {string} deviceId The device ID.
      * @returns {Promise<void>} Resolves when complete.
      */
    /* CompleteClass */
    override def setDeviceId(deviceId: String): js.Promise[Unit] = js.native
    
    val storagePath: String = js.native
    
    /**
      * Stores a room's configuration.
      * @param {string} roomId The room ID to store the configuration for.
      * @param {ICryptoRoomInformation} config The room's encryption config. May be empty.
      * @returns {Promise<void>} Resolves when complete.
      */
    /* CompleteClass */
    override def storeRoom(roomId: String, config: ICryptoRoomInformation): js.Promise[Unit] = js.native
  }
}
