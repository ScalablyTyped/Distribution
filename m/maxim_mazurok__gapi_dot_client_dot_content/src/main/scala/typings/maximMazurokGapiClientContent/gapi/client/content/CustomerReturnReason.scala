package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerReturnReason extends StObject {
  
  /** Description of the reason. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Code of the return reason. Acceptable values are: - "`betterPriceFound`" - "`changedMind`" - "`damagedOrDefectiveItem`" - "`didNotMatchDescription`" - "`doesNotFit`" -
    * "`expiredItem`" - "`incorrectItemReceived`" - "`noLongerNeeded`" - "`notSpecified`" - "`orderedWrongItem`" - "`other`" - "`qualityNotExpected`" - "`receivedTooLate`" -
    * "`undeliverable`"
    */
  var reasonCode: js.UndefOr[String] = js.undefined
}
object CustomerReturnReason {
  
  @scala.inline
  def apply(): CustomerReturnReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerReturnReason]
  }
  
  @scala.inline
  implicit class CustomerReturnReasonMutableBuilder[Self <: CustomerReturnReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setReasonCode(value: String): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
  }
}
