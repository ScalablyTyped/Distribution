package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.payIn.BankWireDirectPayInData
import typings.mangopay2NodejsSdk.mod.payIn.CardDirectPayInData
import typings.mangopay2NodejsSdk.mod.payIn.CardPreAuthorizedPayInData
import typings.mangopay2NodejsSdk.mod.payIn.CardWebPayInData
import typings.mangopay2NodejsSdk.mod.payIn.CreateBankWireDirectPayIn
import typings.mangopay2NodejsSdk.mod.payIn.CreateCardDirectPayIn
import typings.mangopay2NodejsSdk.mod.payIn.CreateCardPreAuthorizedPayIn
import typings.mangopay2NodejsSdk.mod.payIn.CreateCardWebPayIn
import typings.mangopay2NodejsSdk.mod.payIn.PayInData
import typings.mangopay2NodejsSdk.mod.refund.CreatePayInRefund
import typings.mangopay2NodejsSdk.mod.refund.RefundData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "PayIns")
@js.native
class PayIns () extends js.Object {
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
  var create_Original: (MethodOverload[CreateCardDirectPayIn, CardDirectPayInData]) with (MethodOverload[CreateCardPreAuthorizedPayIn, CardPreAuthorizedPayInData]) with (MethodOverload[CreateCardWebPayIn, CardWebPayInData]) with (MethodOverload[CreateBankWireDirectPayIn, BankWireDirectPayInData]) = js.native
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
}

