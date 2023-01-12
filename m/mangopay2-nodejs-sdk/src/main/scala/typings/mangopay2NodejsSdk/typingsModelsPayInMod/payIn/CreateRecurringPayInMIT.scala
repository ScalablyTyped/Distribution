package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRecurringPayInMIT extends StObject {
  
  /**
    * Amount of the subsequent payment. If this field is empty we will take the amount entered in the NextTransactionDebitedFunds
    * of the Recurring PayIn Registration. An amount must be transmitted during either registration or pay-in (if it’s different from the registration one).
    */
  var DebitedFunds: js.UndefOr[MoneyData] = js.undefined
  
  /**
    * Amount of the subsequent fees. If this field is empty we will take the amount entered in the NextTransactionFees
    * of the Recurring PayIn Registration. An amount must be transmitted during either registration or pay-in.
    */
  var Fees: js.UndefOr[MoneyData] = js.undefined
  
  /**
    * The recurring's ID
    */
  var RecurringPayinRegistrationId: String
  
  /**
    * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and can only include alphanumeric characters or spaces.
    * See here for important info. Note that each bank handles this information differently, some show less or no information.
    */
  var StatementDescriptor: js.UndefOr[String] = js.undefined
  
  /**
    * Custom data that you can add to this item
    */
  var Tag: js.UndefOr[String] = js.undefined
}
object CreateRecurringPayInMIT {
  
  inline def apply(RecurringPayinRegistrationId: String): CreateRecurringPayInMIT = {
    val __obj = js.Dynamic.literal(RecurringPayinRegistrationId = RecurringPayinRegistrationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecurringPayInMIT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRecurringPayInMIT] (val x: Self) extends AnyVal {
    
    inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setDebitedFundsUndefined: Self = StObject.set(x, "DebitedFunds", js.undefined)
    
    inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
    
    inline def setFeesUndefined: Self = StObject.set(x, "Fees", js.undefined)
    
    inline def setRecurringPayinRegistrationId(value: String): Self = StObject.set(x, "RecurringPayinRegistrationId", value.asInstanceOf[js.Any])
    
    inline def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
    
    inline def setStatementDescriptorUndefined: Self = StObject.set(x, "StatementDescriptor", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
