package typings.matrixBotSdk

import typings.matrixBotSdk.libE2eeIcryptoroominformationMod.ICryptoRoomInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStorageIcryptostorageproviderMod {
  
  trait ICryptoStorageProvider extends StObject {
    
    /**
      * Gets the client's device ID, if known.
      * @returns {Promise<string>} Resolves to the device ID, or falsy if not known.
      */
    def getDeviceId(): js.Promise[String]
    
    /**
      * Gets a room's configuration. If the room is unknown, a falsy value is returned.
      * @param {string} roomId The room ID to get the configuration for.
      * @returns {Promise<ICryptoRoomInformation>} Resolves to the room's configuration, or
      * to falsy if the room is unknown.
      */
    def getRoom(roomId: String): js.Promise[ICryptoRoomInformation]
    
    /**
      * Sets the client's device ID.
      * @param {string} deviceId The device ID.
      * @returns {Promise<void>} Resolves when complete.
      */
    def setDeviceId(deviceId: String): js.Promise[Unit]
    
    /**
      * Stores a room's configuration.
      * @param {string} roomId The room ID to store the configuration for.
      * @param {ICryptoRoomInformation} config The room's encryption config. May be empty.
      * @returns {Promise<void>} Resolves when complete.
      */
    def storeRoom(roomId: String, config: ICryptoRoomInformation): js.Promise[Unit]
  }
  object ICryptoStorageProvider {
    
    inline def apply(
      getDeviceId: () => js.Promise[String],
      getRoom: String => js.Promise[ICryptoRoomInformation],
      setDeviceId: String => js.Promise[Unit],
      storeRoom: (String, ICryptoRoomInformation) => js.Promise[Unit]
    ): ICryptoStorageProvider = {
      val __obj = js.Dynamic.literal(getDeviceId = js.Any.fromFunction0(getDeviceId), getRoom = js.Any.fromFunction1(getRoom), setDeviceId = js.Any.fromFunction1(setDeviceId), storeRoom = js.Any.fromFunction2(storeRoom))
      __obj.asInstanceOf[ICryptoStorageProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICryptoStorageProvider] (val x: Self) extends AnyVal {
      
      inline def setGetDeviceId(value: () => js.Promise[String]): Self = StObject.set(x, "getDeviceId", js.Any.fromFunction0(value))
      
      inline def setGetRoom(value: String => js.Promise[ICryptoRoomInformation]): Self = StObject.set(x, "getRoom", js.Any.fromFunction1(value))
      
      inline def setSetDeviceId(value: String => js.Promise[Unit]): Self = StObject.set(x, "setDeviceId", js.Any.fromFunction1(value))
      
      inline def setStoreRoom(value: (String, ICryptoRoomInformation) => js.Promise[Unit]): Self = StObject.set(x, "storeRoom", js.Any.fromFunction2(value))
    }
  }
}
