package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomerReturnReason extends StObject {
  
  /**
    * Description of the reason.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Code of the return reason. Acceptable values are: - "`betterPriceFound`" - "`changedMind`" - "`damagedOrDefectiveItem`" - "`didNotMatchDescription`" - "`doesNotFit`" - "`expiredItem`" - "`incorrectItemReceived`" - "`noLongerNeeded`" - "`notSpecified`" - "`orderedWrongItem`" - "`other`" - "`qualityNotExpected`" - "`receivedTooLate`" - "`undeliverable`"
    */
  var reasonCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomerReturnReason {
  
  inline def apply(): SchemaCustomerReturnReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerReturnReason]
  }
  
  extension [Self <: SchemaCustomerReturnReason](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setReasonCode(value: String): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeNull: Self = StObject.set(x, "reasonCode", null)
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
  }
}
