package typings.matrixBotSdk.anon

import typings.matrixBotSdk.encryptionEventMod.RoomEncryptionAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<matrix-bot-sdk.matrix-bot-sdk/lib/models/events/EncryptionEvent.EncryptionEventContent> */
trait PartialEncryptionEventCon extends StObject {
  
  var algorithm: js.UndefOr[String | RoomEncryptionAlgorithm] = js.undefined
  
  var rotation_period_ms: js.UndefOr[Double] = js.undefined
  
  var rotation_period_msgs: js.UndefOr[Double] = js.undefined
}
object PartialEncryptionEventCon {
  
  inline def apply(): PartialEncryptionEventCon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEncryptionEventCon]
  }
  
  extension [Self <: PartialEncryptionEventCon](x: Self) {
    
    inline def setAlgorithm(value: String | RoomEncryptionAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setRotation_period_ms(value: Double): Self = StObject.set(x, "rotation_period_ms", value.asInstanceOf[js.Any])
    
    inline def setRotation_period_msUndefined: Self = StObject.set(x, "rotation_period_ms", js.undefined)
    
    inline def setRotation_period_msgs(value: Double): Self = StObject.set(x, "rotation_period_msgs", value.asInstanceOf[js.Any])
    
    inline def setRotation_period_msgsUndefined: Self = StObject.set(x, "rotation_period_msgs", js.undefined)
  }
}
