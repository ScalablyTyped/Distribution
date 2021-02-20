package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderpaymentsNotifyAuthDeclinedRequest extends StObject {
  
  /**
    * Reason why payment authorization was declined.
    */
  var declineReason: js.UndefOr[String] = js.native
}
object SchemaOrderpaymentsNotifyAuthDeclinedRequest {
  
  @scala.inline
  def apply(): SchemaOrderpaymentsNotifyAuthDeclinedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderpaymentsNotifyAuthDeclinedRequest]
  }
  
  @scala.inline
  implicit class SchemaOrderpaymentsNotifyAuthDeclinedRequestMutableBuilder[Self <: SchemaOrderpaymentsNotifyAuthDeclinedRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeclineReason(value: String): Self = StObject.set(x, "declineReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclineReasonUndefined: Self = StObject.set(x, "declineReason", js.undefined)
  }
}
