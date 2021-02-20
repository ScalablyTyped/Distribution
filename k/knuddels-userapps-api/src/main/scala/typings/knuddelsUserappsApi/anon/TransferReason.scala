package typings.knuddelsUserappsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferReason extends StObject {
  
  var onError: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  
  var onSuccess: js.UndefOr[js.Function0[Unit]] = js.native
  
  var transferReason: js.UndefOr[String] = js.native
}
object TransferReason {
  
  @scala.inline
  def apply(): TransferReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferReason]
  }
  
  @scala.inline
  implicit class TransferReasonMutableBuilder[Self <: TransferReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnError(value: /* message */ String => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: () => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    @scala.inline
    def setTransferReason(value: String): Self = StObject.set(x, "transferReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferReasonUndefined: Self = StObject.set(x, "transferReason", js.undefined)
  }
}
