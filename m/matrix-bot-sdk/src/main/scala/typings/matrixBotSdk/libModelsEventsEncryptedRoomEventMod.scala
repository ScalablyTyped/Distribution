package typings.matrixBotSdk

import typings.matrixBotSdk.libModelsCryptoMod.EncryptionAlgorithm
import typings.matrixBotSdk.libModelsCryptoMod.IMegolmEncrypted
import typings.matrixBotSdk.libModelsEventsRoomEventMod.RoomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsEventsEncryptedRoomEventMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/EncryptedRoomEvent", "EncryptedRoomEvent")
  @js.native
  open class EncryptedRoomEvent protected () extends RoomEvent[EncryptedRoomEventContent] {
    def this(event: Any) = this()
    
    /**
      * The encryption algorithm used on the event. Should match the m.room.encryption
      * state config.
      */
    def algorithm: EncryptionAlgorithm = js.native
    
    /**
      * The Megolm encrypted payload information.
      */
    def megolmProperties: IMegolmEncrypted = js.native
  }
  
  trait EncryptedRoomEventContent extends StObject {
    
    var algorithm: EncryptionAlgorithm
    
    /**
      * For m.megolm.v1.aes-sha2 messages. The encrypted payload.
      */
    var ciphertext: js.UndefOr[String] = js.undefined
    
    /**
      * For m.megolm.v1.aes-sha2 messages. The sender's device ID.
      */
    var device_id: js.UndefOr[String] = js.undefined
    
    /**
      * For m.megolm.v1.aes-sha2 messages. The sender's Curve25519 key.
      */
    var sender_key: js.UndefOr[String] = js.undefined
    
    /**
      * For m.megolm.v1.aes-sha2 messages. The session ID established by the sender.
      */
    var session_id: js.UndefOr[String] = js.undefined
  }
  object EncryptedRoomEventContent {
    
    inline def apply(algorithm: EncryptionAlgorithm): EncryptedRoomEventContent = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptedRoomEventContent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncryptedRoomEventContent] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: EncryptionAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      inline def setCiphertextUndefined: Self = StObject.set(x, "ciphertext", js.undefined)
      
      inline def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
      
      inline def setDevice_idUndefined: Self = StObject.set(x, "device_id", js.undefined)
      
      inline def setSender_key(value: String): Self = StObject.set(x, "sender_key", value.asInstanceOf[js.Any])
      
      inline def setSender_keyUndefined: Self = StObject.set(x, "sender_key", js.undefined)
      
      inline def setSession_id(value: String): Self = StObject.set(x, "session_id", value.asInstanceOf[js.Any])
      
      inline def setSession_idUndefined: Self = StObject.set(x, "session_id", js.undefined)
    }
  }
}
