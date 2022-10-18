package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import typings.mangopay2NodejsSdk.typingsModelsBillingMod.billing.BillingOrShippingRecurringPayInData
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePayInRecurringRegistration extends StObject {
  
  /**
    * A user's ID
    */
  var AuthorId: String
  
  /**
    * Contains every useful informations related to the user billing
    */
  var Billing: js.UndefOr[BillingOrShippingRecurringPayInData] = js.undefined
  
  /**
    * The ID of a card
    */
  var CardId: String
  
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  var CreditedUserId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the wallet where money will be credited
    */
  var CreditedWalletId: String
  
  /**
    * Date on which the recurring payments will end
    */
  var EndDate: js.UndefOr[Timestamp] = js.undefined
  
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
  var FixedNextAmount: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether this recurring payment is a payment in installments in N times
    */
  var FractionedPayment: js.UndefOr[Boolean] = js.undefined
  
  var FreeCycles: js.UndefOr[Double] = js.undefined
  
  /**
    * Frequency at which the recurring payments will be made
    */
  var Frequency: js.UndefOr[FrequencyType] = js.undefined
  
  /**
    * Indicates whether the object is being used to attempt registration of an existing recurring payment
    */
  var Migration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Amount of subsequent payments. If this field is empty and either FixedNextAmount or FractionedPayment are TRUE,
    * we will take the amount of the FirstTransactionDebitedFunds as the subsequent payment amount.
    */
  var NextTransactionDebitedFunds: js.UndefOr[MoneyData] = js.undefined
  
  /**
    * Amount of subsequent fees. If this field is empty and either FixedNextAmount or FractionedPayment are TRUE,
    * we will take the amount of the FirstTransactionFees as the subsequent fees.
    */
  var NextTransactionFees: js.UndefOr[MoneyData] = js.undefined
  
  /**
    * Contains every useful information's related to the user shipping
    */
  var Shipping: js.UndefOr[BillingOrShippingRecurringPayInData] = js.undefined
}
object CreatePayInRecurringRegistration {
  
  inline def apply(
    AuthorId: String,
    CardId: String,
    CreditedWalletId: String,
    FirstTransactionDebitedFunds: MoneyData,
    FirstTransactionFees: MoneyData
  ): CreatePayInRecurringRegistration = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], FirstTransactionDebitedFunds = FirstTransactionDebitedFunds.asInstanceOf[js.Any], FirstTransactionFees = FirstTransactionFees.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePayInRecurringRegistration]
  }
  
  extension [Self <: CreatePayInRecurringRegistration](x: Self) {
    
    inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    inline def setBilling(value: BillingOrShippingRecurringPayInData): Self = StObject.set(x, "Billing", value.asInstanceOf[js.Any])
    
    inline def setBillingUndefined: Self = StObject.set(x, "Billing", js.undefined)
    
    inline def setCardId(value: String): Self = StObject.set(x, "CardId", value.asInstanceOf[js.Any])
    
    inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
    
    inline def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
    
    inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: Timestamp): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    inline def setFirstTransactionDebitedFunds(value: MoneyData): Self = StObject.set(x, "FirstTransactionDebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setFirstTransactionFees(value: MoneyData): Self = StObject.set(x, "FirstTransactionFees", value.asInstanceOf[js.Any])
    
    inline def setFixedNextAmount(value: Boolean): Self = StObject.set(x, "FixedNextAmount", value.asInstanceOf[js.Any])
    
    inline def setFixedNextAmountUndefined: Self = StObject.set(x, "FixedNextAmount", js.undefined)
    
    inline def setFractionedPayment(value: Boolean): Self = StObject.set(x, "FractionedPayment", value.asInstanceOf[js.Any])
    
    inline def setFractionedPaymentUndefined: Self = StObject.set(x, "FractionedPayment", js.undefined)
    
    inline def setFreeCycles(value: Double): Self = StObject.set(x, "FreeCycles", value.asInstanceOf[js.Any])
    
    inline def setFreeCyclesUndefined: Self = StObject.set(x, "FreeCycles", js.undefined)
    
    inline def setFrequency(value: FrequencyType): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "Frequency", js.undefined)
    
    inline def setMigration(value: Boolean): Self = StObject.set(x, "Migration", value.asInstanceOf[js.Any])
    
    inline def setMigrationUndefined: Self = StObject.set(x, "Migration", js.undefined)
    
    inline def setNextTransactionDebitedFunds(value: MoneyData): Self = StObject.set(x, "NextTransactionDebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setNextTransactionDebitedFundsUndefined: Self = StObject.set(x, "NextTransactionDebitedFunds", js.undefined)
    
    inline def setNextTransactionFees(value: MoneyData): Self = StObject.set(x, "NextTransactionFees", value.asInstanceOf[js.Any])
    
    inline def setNextTransactionFeesUndefined: Self = StObject.set(x, "NextTransactionFees", js.undefined)
    
    inline def setShipping(value: BillingOrShippingRecurringPayInData): Self = StObject.set(x, "Shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingUndefined: Self = StObject.set(x, "Shipping", js.undefined)
  }
}
