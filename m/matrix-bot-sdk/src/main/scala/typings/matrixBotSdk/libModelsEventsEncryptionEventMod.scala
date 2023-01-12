package typings.matrixBotSdk

import typings.matrixBotSdk.libModelsEventsRoomEventMod.StateEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsEventsEncryptionEventMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/EncryptionEvent", "EncryptionEvent")
  @js.native
  open class EncryptionEvent protected () extends StateEvent[EncryptionEventContent] {
    def this(event: Any) = this()
    
    /**
      * The encryption algorithm for the room.
      */
    def algorithm: String | RoomEncryptionAlgorithm = js.native
    
    /**
      * How many messages should be sent before a session changes. Defaults to 100.
      */
    def rotationPeriodMessages: Double = js.native
    
    /**
      * How long a session should be used before changing it. Defaults to a week.
      */
    def rotationPeriodMs: Double = js.native
  }
  
  @js.native
  sealed trait RoomEncryptionAlgorithm extends StObject
  @JSImport("matrix-bot-sdk/lib/models/events/EncryptionEvent", "RoomEncryptionAlgorithm")
  @js.native
  object RoomEncryptionAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RoomEncryptionAlgorithm & String] = js.native
    
    @js.native
    sealed trait MegolmV1AesSha2
      extends StObject
         with RoomEncryptionAlgorithm
    /* "m.megolm.v1.aes-sha2" */ val MegolmV1AesSha2: typings.matrixBotSdk.libModelsEventsEncryptionEventMod.RoomEncryptionAlgorithm.MegolmV1AesSha2 & String = js.native
  }
  
  trait EncryptionEventContent extends StObject {
    
    /**
      * The encryption algorithm for the room.
      */
    var algorithm: String | RoomEncryptionAlgorithm
    
    /**
      * How long a session should be used before changing it.
      */
    var rotation_period_ms: js.UndefOr[Double] = js.undefined
    
    /**
      * How many messages should be sent before changing the session.
      */
    var rotation_period_msgs: js.UndefOr[Double] = js.undefined
  }
  object EncryptionEventContent {
    
    inline def apply(algorithm: String | RoomEncryptionAlgorithm): EncryptionEventContent = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptionEventContent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncryptionEventContent] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: String | RoomEncryptionAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setRotation_period_ms(value: Double): Self = StObject.set(x, "rotation_period_ms", value.asInstanceOf[js.Any])
      
      inline def setRotation_period_msUndefined: Self = StObject.set(x, "rotation_period_ms", js.undefined)
      
      inline def setRotation_period_msgs(value: Double): Self = StObject.set(x, "rotation_period_msgs", value.asInstanceOf[js.Any])
      
      inline def setRotation_period_msgsUndefined: Self = StObject.set(x, "rotation_period_msgs", js.undefined)
    }
  }
}
