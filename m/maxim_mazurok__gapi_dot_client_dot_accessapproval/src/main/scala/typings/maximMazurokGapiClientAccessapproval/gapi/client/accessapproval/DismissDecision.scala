package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DismissDecision extends StObject {
  
  /** The time at which the approval request was dismissed. */
  var dismissTime: js.UndefOr[String] = js.undefined
  
  /**
    * This field will be true if the ApprovalRequest was implicitly dismissed due to inaction by the access approval approvers (the request is not acted on by the approvers before the
    * exiration time).
    */
  var `implicit`: js.UndefOr[Boolean] = js.undefined
}
object DismissDecision {
  
  inline def apply(): DismissDecision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DismissDecision]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DismissDecision] (val x: Self) extends AnyVal {
    
    inline def setDismissTime(value: String): Self = StObject.set(x, "dismissTime", value.asInstanceOf[js.Any])
    
    inline def setDismissTimeUndefined: Self = StObject.set(x, "dismissTime", js.undefined)
    
    inline def setImplicit(value: Boolean): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
    
    inline def setImplicitUndefined: Self = StObject.set(x, "implicit", js.undefined)
  }
}
