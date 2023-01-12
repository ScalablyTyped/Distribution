package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InapplicabilityDetails extends StObject {
  
  /** Count of this inapplicable reason code. */
  var inapplicableCount: js.UndefOr[String] = js.undefined
  
  /** Reason code this rule was not applicable. */
  var inapplicableReason: js.UndefOr[String] = js.undefined
}
object InapplicabilityDetails {
  
  inline def apply(): InapplicabilityDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InapplicabilityDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InapplicabilityDetails] (val x: Self) extends AnyVal {
    
    inline def setInapplicableCount(value: String): Self = StObject.set(x, "inapplicableCount", value.asInstanceOf[js.Any])
    
    inline def setInapplicableCountUndefined: Self = StObject.set(x, "inapplicableCount", js.undefined)
    
    inline def setInapplicableReason(value: String): Self = StObject.set(x, "inapplicableReason", value.asInstanceOf[js.Any])
    
    inline def setInapplicableReasonUndefined: Self = StObject.set(x, "inapplicableReason", js.undefined)
  }
}
