package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithoutResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.TwoArgsMethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.WithResponse
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.BankWireDirectPayInData
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CardDirectPayInData
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CardPreAuthorizedDepositPayInData
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CardPreAuthorizedPayInData
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CardWebPayInData
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CreateBankWireDirectPayIn
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CreateCardDirectPayIn
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CreateCardPreAuthorizedDepositPayIn
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CreateCardPreAuthorizedPayIn
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CreateCardWebPayIn
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CreateDirectDebitDirectPayIn
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CreateDirectDebitWebPayIn
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CreatePayInRecurringRegistration
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CreatePayconiqWebPayInData
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CreateRecurringPayInCIT
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CreateRecurringPayInMIT
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.DirectDebitDirectPayInData
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.DirectDebitWebPayInData
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.PayInData
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.PayInRecurringRegistrationData
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.PayconiqWebPayInData
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.RecurringPayInData
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.UpdatePayInRecurringRegistration
import typings.mangopay2NodejsSdk.typingsModelsRefundMod.refund.CreatePayInRefund
import typings.mangopay2NodejsSdk.typingsModelsRefundMod.refund.RefundData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsServicesPayInsMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/PayIns", "PayIns")
  @js.native
  open class PayIns () extends StObject {
    
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreateBankWireDirectPayIn): js.Promise[BankWireDirectPayInData] = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreateBankWireDirectPayIn, callback: js.Function1[/* data */ BankWireDirectPayInData, Unit]): Unit = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(
      data: CreateBankWireDirectPayIn,
      callback: js.Function1[/* data */ WithResponse[BankWireDirectPayInData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def create(
      data: CreateBankWireDirectPayIn,
      callback: js.Function1[/* data */ BankWireDirectPayInData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreateBankWireDirectPayIn, options: MethodOptionWithResponse): js.Promise[WithResponse[BankWireDirectPayInData]] = js.native
    def create(data: CreateBankWireDirectPayIn, options: MethodOptionWithoutResponse): js.Promise[BankWireDirectPayInData] = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreateCardDirectPayIn): js.Promise[CardDirectPayInData] = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreateCardDirectPayIn, callback: js.Function1[/* data */ CardDirectPayInData, Unit]): Unit = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(
      data: CreateCardDirectPayIn,
      callback: js.Function1[/* data */ WithResponse[CardDirectPayInData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def create(
      data: CreateCardDirectPayIn,
      callback: js.Function1[/* data */ CardDirectPayInData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreateCardDirectPayIn, options: MethodOptionWithResponse): js.Promise[WithResponse[CardDirectPayInData]] = js.native
    def create(data: CreateCardDirectPayIn, options: MethodOptionWithoutResponse): js.Promise[CardDirectPayInData] = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreateCardPreAuthorizedPayIn): js.Promise[CardPreAuthorizedPayInData] = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(
      data: CreateCardPreAuthorizedPayIn,
      callback: js.Function1[/* data */ CardPreAuthorizedPayInData, Unit]
    ): Unit = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(
      data: CreateCardPreAuthorizedPayIn,
      callback: js.Function1[/* data */ WithResponse[CardPreAuthorizedPayInData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def create(
      data: CreateCardPreAuthorizedPayIn,
      callback: js.Function1[/* data */ CardPreAuthorizedPayInData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreateCardPreAuthorizedPayIn, options: MethodOptionWithResponse): js.Promise[WithResponse[CardPreAuthorizedPayInData]] = js.native
    def create(data: CreateCardPreAuthorizedPayIn, options: MethodOptionWithoutResponse): js.Promise[CardPreAuthorizedPayInData] = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreateCardWebPayIn): js.Promise[CardWebPayInData] = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreateCardWebPayIn, callback: js.Function1[/* data */ CardWebPayInData, Unit]): Unit = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(
      data: CreateCardWebPayIn,
      callback: js.Function1[/* data */ WithResponse[CardWebPayInData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def create(
      data: CreateCardWebPayIn,
      callback: js.Function1[/* data */ CardWebPayInData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreateCardWebPayIn, options: MethodOptionWithResponse): js.Promise[WithResponse[CardWebPayInData]] = js.native
    def create(data: CreateCardWebPayIn, options: MethodOptionWithoutResponse): js.Promise[CardWebPayInData] = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreateDirectDebitDirectPayIn): js.Promise[DirectDebitDirectPayInData] = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(
      data: CreateDirectDebitDirectPayIn,
      callback: js.Function1[/* data */ DirectDebitDirectPayInData, Unit]
    ): Unit = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(
      data: CreateDirectDebitDirectPayIn,
      callback: js.Function1[/* data */ WithResponse[DirectDebitDirectPayInData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def create(
      data: CreateDirectDebitDirectPayIn,
      callback: js.Function1[/* data */ DirectDebitDirectPayInData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreateDirectDebitDirectPayIn, options: MethodOptionWithResponse): js.Promise[WithResponse[DirectDebitDirectPayInData]] = js.native
    def create(data: CreateDirectDebitDirectPayIn, options: MethodOptionWithoutResponse): js.Promise[DirectDebitDirectPayInData] = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreateDirectDebitWebPayIn): js.Promise[DirectDebitWebPayInData] = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreateDirectDebitWebPayIn, callback: js.Function1[/* data */ DirectDebitWebPayInData, Unit]): Unit = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(
      data: CreateDirectDebitWebPayIn,
      callback: js.Function1[/* data */ WithResponse[DirectDebitWebPayInData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def create(
      data: CreateDirectDebitWebPayIn,
      callback: js.Function1[/* data */ DirectDebitWebPayInData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreateDirectDebitWebPayIn, options: MethodOptionWithResponse): js.Promise[WithResponse[DirectDebitWebPayInData]] = js.native
    def create(data: CreateDirectDebitWebPayIn, options: MethodOptionWithoutResponse): js.Promise[DirectDebitWebPayInData] = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreatePayconiqWebPayInData): js.Promise[PayconiqWebPayInData] = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreatePayconiqWebPayInData, callback: js.Function1[/* data */ PayconiqWebPayInData, Unit]): Unit = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(
      data: CreatePayconiqWebPayInData,
      callback: js.Function1[/* data */ WithResponse[PayconiqWebPayInData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def create(
      data: CreatePayconiqWebPayInData,
      callback: js.Function1[/* data */ PayconiqWebPayInData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    def create(data: CreatePayconiqWebPayInData, options: MethodOptionWithResponse): js.Promise[WithResponse[PayconiqWebPayInData]] = js.native
    def create(data: CreatePayconiqWebPayInData, options: MethodOptionWithoutResponse): js.Promise[PayconiqWebPayInData] = js.native
    
    def createCardPreAuthorizedDepositPayIn(data: CreateCardPreAuthorizedDepositPayIn): js.Promise[CardPreAuthorizedDepositPayInData] = js.native
    def createCardPreAuthorizedDepositPayIn(
      data: CreateCardPreAuthorizedDepositPayIn,
      callback: js.Function1[/* data */ CardPreAuthorizedDepositPayInData, Unit]
    ): Unit = js.native
    def createCardPreAuthorizedDepositPayIn(
      data: CreateCardPreAuthorizedDepositPayIn,
      callback: js.Function1[/* data */ WithResponse[CardPreAuthorizedDepositPayInData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def createCardPreAuthorizedDepositPayIn(
      data: CreateCardPreAuthorizedDepositPayIn,
      callback: js.Function1[/* data */ CardPreAuthorizedDepositPayInData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    def createCardPreAuthorizedDepositPayIn(data: CreateCardPreAuthorizedDepositPayIn, options: MethodOptionWithResponse): js.Promise[WithResponse[CardPreAuthorizedDepositPayInData]] = js.native
    def createCardPreAuthorizedDepositPayIn(data: CreateCardPreAuthorizedDepositPayIn, options: MethodOptionWithoutResponse): js.Promise[CardPreAuthorizedDepositPayInData] = js.native
    @JSName("createCardPreAuthorizedDepositPayIn")
    var createCardPreAuthorizedDepositPayIn_Original: MethodOverload[CreateCardPreAuthorizedDepositPayIn, CardPreAuthorizedDepositPayInData] = js.native
    
    def createRecurringPayInRegistrationCIT(data: CreateRecurringPayInCIT): js.Promise[RecurringPayInData] = js.native
    def createRecurringPayInRegistrationCIT(data: CreateRecurringPayInCIT, callback: js.Function1[/* data */ RecurringPayInData, Unit]): Unit = js.native
    def createRecurringPayInRegistrationCIT(
      data: CreateRecurringPayInCIT,
      callback: js.Function1[/* data */ WithResponse[RecurringPayInData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def createRecurringPayInRegistrationCIT(
      data: CreateRecurringPayInCIT,
      callback: js.Function1[/* data */ RecurringPayInData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    def createRecurringPayInRegistrationCIT(data: CreateRecurringPayInCIT, options: MethodOptionWithResponse): js.Promise[WithResponse[RecurringPayInData]] = js.native
    def createRecurringPayInRegistrationCIT(data: CreateRecurringPayInCIT, options: MethodOptionWithoutResponse): js.Promise[RecurringPayInData] = js.native
    @JSName("createRecurringPayInRegistrationCIT")
    var createRecurringPayInRegistrationCIT_Original: MethodOverload[CreateRecurringPayInCIT, RecurringPayInData] = js.native
    
    def createRecurringPayInRegistrationMIT(data: CreateRecurringPayInMIT): js.Promise[RecurringPayInData] = js.native
    def createRecurringPayInRegistrationMIT(data: CreateRecurringPayInMIT, callback: js.Function1[/* data */ RecurringPayInData, Unit]): Unit = js.native
    def createRecurringPayInRegistrationMIT(
      data: CreateRecurringPayInMIT,
      callback: js.Function1[/* data */ WithResponse[RecurringPayInData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def createRecurringPayInRegistrationMIT(
      data: CreateRecurringPayInMIT,
      callback: js.Function1[/* data */ RecurringPayInData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    def createRecurringPayInRegistrationMIT(data: CreateRecurringPayInMIT, options: MethodOptionWithResponse): js.Promise[WithResponse[RecurringPayInData]] = js.native
    def createRecurringPayInRegistrationMIT(data: CreateRecurringPayInMIT, options: MethodOptionWithoutResponse): js.Promise[RecurringPayInData] = js.native
    @JSName("createRecurringPayInRegistrationMIT")
    var createRecurringPayInRegistrationMIT_Original: MethodOverload[CreateRecurringPayInMIT, RecurringPayInData] = js.native
    
    /**
      * Create Recurring PayIn
      * @param createData
      */
    def createRecurringPayment(data: CreatePayInRecurringRegistration): js.Promise[PayInRecurringRegistrationData] = js.native
    /**
      * Create Recurring PayIn
      * @param createData
      */
    def createRecurringPayment(
      data: CreatePayInRecurringRegistration,
      callback: js.Function1[/* data */ PayInRecurringRegistrationData, Unit]
    ): Unit = js.native
    /**
      * Create Recurring PayIn
      * @param createData
      */
    def createRecurringPayment(
      data: CreatePayInRecurringRegistration,
      callback: js.Function1[/* data */ WithResponse[PayInRecurringRegistrationData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def createRecurringPayment(
      data: CreatePayInRecurringRegistration,
      callback: js.Function1[/* data */ PayInRecurringRegistrationData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Create Recurring PayIn
      * @param createData
      */
    def createRecurringPayment(data: CreatePayInRecurringRegistration, options: MethodOptionWithResponse): js.Promise[WithResponse[PayInRecurringRegistrationData]] = js.native
    def createRecurringPayment(data: CreatePayInRecurringRegistration, options: MethodOptionWithoutResponse): js.Promise[PayInRecurringRegistrationData] = js.native
    /**
      * Create Recurring PayIn
      * @param createData
      */
    @JSName("createRecurringPayment")
    var createRecurringPayment_Original: MethodOverload[CreatePayInRecurringRegistration, PayInRecurringRegistrationData] = js.native
    
    /**
      * Create refund for pay-in object
      * @param payInId
      * @param refundData
      * @param options
      */
    def createRefund(data: String, extra: CreatePayInRefund): js.Promise[RefundData] = js.native
    /**
      * Create refund for pay-in object
      * @param payInId
      * @param refundData
      * @param options
      */
    def createRefund(
      data: String,
      extra: CreatePayInRefund,
      callback: js.Function1[(/* data */ RefundData) | (/* data */ WithResponse[RefundData]), Unit]
    ): Unit = js.native
    def createRefund(
      data: String,
      extra: CreatePayInRefund,
      callback: js.Function1[/* data */ WithResponse[RefundData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def createRefund(
      data: String,
      extra: CreatePayInRefund,
      callback: js.Function1[/* data */ RefundData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Create refund for pay-in object
      * @param payInId
      * @param refundData
      * @param options
      */
    def createRefund(data: String, extra: CreatePayInRefund, options: MethodOptionWithResponse): js.Promise[WithResponse[RefundData]] = js.native
    def createRefund(data: String, extra: CreatePayInRefund, options: MethodOptionWithoutResponse): js.Promise[RefundData] = js.native
    /**
      * Create refund for pay-in object
      * @param payInId
      * @param refundData
      * @param options
      */
    @JSName("createRefund")
    var createRefund_Original: TwoArgsMethodOverload[String, CreatePayInRefund, RefundData] = js.native
    
    /**
      * Create new pay-in
      * @param payIn
      * @param options
      */
    @JSName("create")
    var create_Original: (MethodOverload[CreateCardDirectPayIn, CardDirectPayInData]) & (MethodOverload[CreateCardPreAuthorizedPayIn, CardPreAuthorizedPayInData]) & (MethodOverload[CreateCardWebPayIn, CardWebPayInData]) & (MethodOverload[CreateBankWireDirectPayIn, BankWireDirectPayInData]) & (MethodOverload[CreatePayconiqWebPayInData, PayconiqWebPayInData]) & (MethodOverload[CreateDirectDebitDirectPayIn, DirectDebitDirectPayInData]) & (MethodOverload[CreateDirectDebitWebPayIn, DirectDebitWebPayInData]) = js.native
    
    /**
      * Get pay-in
      * @param payInId
      * @param options
      */
    def get(data: String): js.Promise[PayInData] = js.native
    /**
      * Get pay-in
      * @param payInId
      * @param options
      */
    def get(data: String, callback: js.Function1[/* data */ PayInData, Unit]): Unit = js.native
    /**
      * Get pay-in
      * @param payInId
      * @param options
      */
    def get(
      data: String,
      callback: js.Function1[/* data */ WithResponse[PayInData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def get(
      data: String,
      callback: js.Function1[/* data */ PayInData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Get pay-in
      * @param payInId
      * @param options
      */
    def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[PayInData]] = js.native
    def get(data: String, options: MethodOptionWithoutResponse): js.Promise[PayInData] = js.native
    
    /**
      * Get Recurring PayIn
      * @param payInId
      */
    def getRecurringPayin(data: String): js.Promise[PayInRecurringRegistrationData] = js.native
    /**
      * Get Recurring PayIn
      * @param payInId
      */
    def getRecurringPayin(data: String, callback: js.Function1[/* data */ PayInRecurringRegistrationData, Unit]): Unit = js.native
    /**
      * Get Recurring PayIn
      * @param payInId
      */
    def getRecurringPayin(
      data: String,
      callback: js.Function1[/* data */ WithResponse[PayInRecurringRegistrationData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getRecurringPayin(
      data: String,
      callback: js.Function1[/* data */ PayInRecurringRegistrationData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Get Recurring PayIn
      * @param payInId
      */
    def getRecurringPayin(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[PayInRecurringRegistrationData]] = js.native
    def getRecurringPayin(data: String, options: MethodOptionWithoutResponse): js.Promise[PayInRecurringRegistrationData] = js.native
    /**
      * Get Recurring PayIn
      * @param payInId
      */
    @JSName("getRecurringPayin")
    var getRecurringPayin_Original: MethodOverload[String, PayInRecurringRegistrationData] = js.native
    
    /**
      * Gets list of Refunds for a PayIn
      * @param payInId
      * @param options
      */
    def getRefunds(data: String): js.Promise[js.Array[RefundData]] = js.native
    /**
      * Gets list of Refunds for a PayIn
      * @param payInId
      * @param options
      */
    def getRefunds(data: String, callback: js.Function1[/* data */ js.Array[RefundData], Unit]): Unit = js.native
    /**
      * Gets list of Refunds for a PayIn
      * @param payInId
      * @param options
      */
    def getRefunds(
      data: String,
      callback: js.Function1[/* data */ WithResponse[js.Array[RefundData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getRefunds(
      data: String,
      callback: js.Function1[/* data */ js.Array[RefundData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Gets list of Refunds for a PayIn
      * @param payInId
      * @param options
      */
    def getRefunds(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[RefundData]]] = js.native
    def getRefunds(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[RefundData]] = js.native
    /**
      * Gets list of Refunds for a PayIn
      * @param payInId
      * @param options
      */
    @JSName("getRefunds")
    var getRefunds_Original: MethodOverload[String, js.Array[RefundData]] = js.native
    
    /**
      * Get pay-in
      * @param payInId
      * @param options
      */
    @JSName("get")
    var get_Original: MethodOverload[String, PayInData] = js.native
    
    /**
      * Update Recurring PayIn
      * @param payInId
      * @param updateData
      */
    def updateRecurringPayin(data: String, extra: UpdatePayInRecurringRegistration): js.Promise[PayInRecurringRegistrationData] = js.native
    /**
      * Update Recurring PayIn
      * @param payInId
      * @param updateData
      */
    def updateRecurringPayin(
      data: String,
      extra: UpdatePayInRecurringRegistration,
      callback: js.Function1[
          (/* data */ PayInRecurringRegistrationData) | (/* data */ WithResponse[PayInRecurringRegistrationData]), 
          Unit
        ]
    ): Unit = js.native
    def updateRecurringPayin(
      data: String,
      extra: UpdatePayInRecurringRegistration,
      callback: js.Function1[/* data */ WithResponse[PayInRecurringRegistrationData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def updateRecurringPayin(
      data: String,
      extra: UpdatePayInRecurringRegistration,
      callback: js.Function1[/* data */ PayInRecurringRegistrationData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Update Recurring PayIn
      * @param payInId
      * @param updateData
      */
    def updateRecurringPayin(data: String, extra: UpdatePayInRecurringRegistration, options: MethodOptionWithResponse): js.Promise[WithResponse[PayInRecurringRegistrationData]] = js.native
    def updateRecurringPayin(data: String, extra: UpdatePayInRecurringRegistration, options: MethodOptionWithoutResponse): js.Promise[PayInRecurringRegistrationData] = js.native
    /**
      * Update Recurring PayIn
      * @param payInId
      * @param updateData
      */
    @JSName("updateRecurringPayin")
    var updateRecurringPayin_Original: TwoArgsMethodOverload[String, UpdatePayInRecurringRegistration, PayInRecurringRegistrationData] = js.native
  }
}
