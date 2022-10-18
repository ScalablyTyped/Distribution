package typings.matrixBotSdk

import typings.matrixBotSdk.libModelsEventsEncryptionEventMod.RoomEncryptionAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libE2eeIcryptoroominformationMod {
  
  /* Inlined parent std.Partial<matrix-bot-sdk.matrix-bot-sdk/lib/models/events/EncryptionEvent.EncryptionEventContent> */
  trait ICryptoRoomInformation extends StObject {
    
    var algorithm: js.UndefOr[String | RoomEncryptionAlgorithm] = js.undefined
    
    var historyVisibility: js.UndefOr[String] = js.undefined
    
    var rotation_period_ms: js.UndefOr[Double] = js.undefined
    
    var rotation_period_msgs: js.UndefOr[Double] = js.undefined
  }
  object ICryptoRoomInformation {
    
    inline def apply(): ICryptoRoomInformation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICryptoRoomInformation]
    }
    
    extension [Self <: ICryptoRoomInformation](x: Self) {
      
      inline def setAlgorithm(value: String | RoomEncryptionAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setHistoryVisibility(value: String): Self = StObject.set(x, "historyVisibility", value.asInstanceOf[js.Any])
      
      inline def setHistoryVisibilityUndefined: Self = StObject.set(x, "historyVisibility", js.undefined)
      
      inline def setRotation_period_ms(value: Double): Self = StObject.set(x, "rotation_period_ms", value.asInstanceOf[js.Any])
      
      inline def setRotation_period_msUndefined: Self = StObject.set(x, "rotation_period_ms", js.undefined)
      
      inline def setRotation_period_msgs(value: Double): Self = StObject.set(x, "rotation_period_msgs", value.asInstanceOf[js.Any])
      
      inline def setRotation_period_msgsUndefined: Self = StObject.set(x, "rotation_period_msgs", js.undefined)
    }
  }
}
