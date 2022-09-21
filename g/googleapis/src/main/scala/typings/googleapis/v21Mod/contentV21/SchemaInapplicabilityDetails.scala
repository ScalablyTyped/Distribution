package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInapplicabilityDetails extends StObject {
  
  /**
    * Count of this inapplicable reason code.
    */
  var inapplicableCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Reason code this rule was not applicable.
    */
  var inapplicableReason: js.UndefOr[String | Null] = js.undefined
}
object SchemaInapplicabilityDetails {
  
  inline def apply(): SchemaInapplicabilityDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInapplicabilityDetails]
  }
  
  extension [Self <: SchemaInapplicabilityDetails](x: Self) {
    
    inline def setInapplicableCount(value: String): Self = StObject.set(x, "inapplicableCount", value.asInstanceOf[js.Any])
    
    inline def setInapplicableCountNull: Self = StObject.set(x, "inapplicableCount", null)
    
    inline def setInapplicableCountUndefined: Self = StObject.set(x, "inapplicableCount", js.undefined)
    
    inline def setInapplicableReason(value: String): Self = StObject.set(x, "inapplicableReason", value.asInstanceOf[js.Any])
    
    inline def setInapplicableReasonNull: Self = StObject.set(x, "inapplicableReason", null)
    
    inline def setInapplicableReasonUndefined: Self = StObject.set(x, "inapplicableReason", js.undefined)
  }
}
