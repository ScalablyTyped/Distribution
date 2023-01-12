package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import typings.mangopay2NodejsSdk.typingsModelsBillingMod.billing.BillingOrShippingRecurringPayInData
import typings.mangopay2NodejsSdk.typingsModelsEntityBaseMod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayInRecurringRegistrationData
  extends StObject
     with EntityBaseData {
  
  /**
    * A user's ID
    */
  var AuthorId: String
  
  /**
    * Contains every useful informations related to the user billing
    */
  var Billing: BillingOrShippingRecurringPayInData
  
  /**
    * The ID of a card
    */
  var CardId: String
  
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  var CreditedUserId: String
  
  /**
    * The ID of the wallet where money will be credited
    */
  var CreditedWalletId: String
  
  var CurrentState: PayInRecurringRegistrationState
  
  var CycleNumber: Double
  
  /**
    * Date on which the recurring payments will end
    */
  var EndDate: Timestamp
  
  /**
    * Amount of the first payment. This amount may be different from the NextTransactionDebitedFunds.
    */
  var FirstTransactionDebitedFunds: MoneyData
  
  /**
    * Amount of the first payment fees. This amount may be different from the NextTransactionFees.
    */
  var FirstTransactionFees: MoneyData
  
  /**
    * Indicates whether the payment amount is likely to change during the payment period
    */
  var FixedNextAmount: Boolean
  
  /**
    * Indicates whether this recurring payment is a payment in installments in N times
    */
  var FractionedPayment: Boolean
  
  var FreeCycles: js.UndefOr[Double] = js.undefined
  
  /**
    * Frequency at which the recurring payments will be made
    */
  var Frequency: FrequencyType
  
  /**
    * Indicates whether the object is being used to attempt registration of an existing recurring payment
    */
  var Migration: Boolean
  
  /**
    * Amount of subsequent payments. If this field is empty and either FixedNextAmount or FractionedPayment are TRUE,
    * we will take the amount of the FirstTransactionDebitedFunds as the subsequent payment amount.
    */
  var NextTransactionDebitedFunds: MoneyData
  
  /**
    * Amount of subsequent fees. If this field is empty and either FixedNextAmount or FractionedPayment are TRUE,
    * we will take the amount of the FirstTransactionFees as the subsequent fees.
    */
  var NextTransactionFees: MoneyData
  
  var RecurringType: typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.RecurringType
  
  /**
    * Contains every useful information's related to the user shipping
    */
  var Shipping: BillingOrShippingRecurringPayInData
  
  /**
    * The status of the transaction
    */
  var Status: RecurringPaymentStatus
  
  var TotalAmount: Double
}
object PayInRecurringRegistrationData {
  
  inline def apply(
    AuthorId: String,
    Billing: BillingOrShippingRecurringPayInData,
    CardId: String,
    CreationDate: Double,
    CreditedUserId: String,
    CreditedWalletId: String,
    CurrentState: PayInRecurringRegistrationState,
    CycleNumber: Double,
    EndDate: Timestamp,
    FirstTransactionDebitedFunds: MoneyData,
    FirstTransactionFees: MoneyData,
    FixedNextAmount: Boolean,
    FractionedPayment: Boolean,
    Frequency: FrequencyType,
    Id: String,
    Migration: Boolean,
    NextTransactionDebitedFunds: MoneyData,
    NextTransactionFees: MoneyData,
    RecurringType: RecurringType,
    Shipping: BillingOrShippingRecurringPayInData,
    Status: RecurringPaymentStatus,
    Tag: String,
    TotalAmount: Double
  ): PayInRecurringRegistrationData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], Billing = Billing.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], CurrentState = CurrentState.asInstanceOf[js.Any], CycleNumber = CycleNumber.asInstanceOf[js.Any], EndDate = EndDate.asInstanceOf[js.Any], FirstTransactionDebitedFunds = FirstTransactionDebitedFunds.asInstanceOf[js.Any], FirstTransactionFees = FirstTransactionFees.asInstanceOf[js.Any], FixedNextAmount = FixedNextAmount.asInstanceOf[js.Any], FractionedPayment = FractionedPayment.asInstanceOf[js.Any], Frequency = Frequency.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Migration = Migration.asInstanceOf[js.Any], NextTransactionDebitedFunds = NextTransactionDebitedFunds.asInstanceOf[js.Any], NextTransactionFees = NextTransactionFees.asInstanceOf[js.Any], RecurringType = RecurringType.asInstanceOf[js.Any], Shipping = Shipping.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], TotalAmount = TotalAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayInRecurringRegistrationData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PayInRecurringRegistrationData] (val x: Self) extends AnyVal {
    
    inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    inline def setBilling(value: BillingOrShippingRecurringPayInData): Self = StObject.set(x, "Billing", value.asInstanceOf[js.Any])
    
    inline def setCardId(value: String): Self = StObject.set(x, "CardId", value.asInstanceOf[js.Any])
    
    inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
    
    inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
    
    inline def setCurrentState(value: PayInRecurringRegistrationState): Self = StObject.set(x, "CurrentState", value.asInstanceOf[js.Any])
    
    inline def setCycleNumber(value: Double): Self = StObject.set(x, "CycleNumber", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: Timestamp): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setFirstTransactionDebitedFunds(value: MoneyData): Self = StObject.set(x, "FirstTransactionDebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setFirstTransactionFees(value: MoneyData): Self = StObject.set(x, "FirstTransactionFees", value.asInstanceOf[js.Any])
    
    inline def setFixedNextAmount(value: Boolean): Self = StObject.set(x, "FixedNextAmount", value.asInstanceOf[js.Any])
    
    inline def setFractionedPayment(value: Boolean): Self = StObject.set(x, "FractionedPayment", value.asInstanceOf[js.Any])
    
    inline def setFreeCycles(value: Double): Self = StObject.set(x, "FreeCycles", value.asInstanceOf[js.Any])
    
    inline def setFreeCyclesUndefined: Self = StObject.set(x, "FreeCycles", js.undefined)
    
    inline def setFrequency(value: FrequencyType): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
    
    inline def setMigration(value: Boolean): Self = StObject.set(x, "Migration", value.asInstanceOf[js.Any])
    
    inline def setNextTransactionDebitedFunds(value: MoneyData): Self = StObject.set(x, "NextTransactionDebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setNextTransactionFees(value: MoneyData): Self = StObject.set(x, "NextTransactionFees", value.asInstanceOf[js.Any])
    
    inline def setRecurringType(value: RecurringType): Self = StObject.set(x, "RecurringType", value.asInstanceOf[js.Any])
    
    inline def setShipping(value: BillingOrShippingRecurringPayInData): Self = StObject.set(x, "Shipping", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: RecurringPaymentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTotalAmount(value: Double): Self = StObject.set(x, "TotalAmount", value.asInstanceOf[js.Any])
  }
}
