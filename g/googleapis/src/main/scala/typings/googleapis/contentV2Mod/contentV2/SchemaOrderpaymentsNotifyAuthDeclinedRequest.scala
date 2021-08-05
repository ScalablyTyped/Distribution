package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderpaymentsNotifyAuthDeclinedRequest extends StObject {
  
  /**
    * Reason why payment authorization was declined.
    */
  var declineReason: js.UndefOr[String] = js.undefined
}
object SchemaOrderpaymentsNotifyAuthDeclinedRequest {
  
  inline def apply(): SchemaOrderpaymentsNotifyAuthDeclinedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderpaymentsNotifyAuthDeclinedRequest]
  }
  
  extension [Self <: SchemaOrderpaymentsNotifyAuthDeclinedRequest](x: Self) {
    
    inline def setDeclineReason(value: String): Self = StObject.set(x, "declineReason", value.asInstanceOf[js.Any])
    
    inline def setDeclineReasonUndefined: Self = StObject.set(x, "declineReason", js.undefined)
  }
}
