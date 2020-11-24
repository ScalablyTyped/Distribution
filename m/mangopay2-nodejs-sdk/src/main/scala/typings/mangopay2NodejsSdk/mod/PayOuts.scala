package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.PayOut.CreatePayOut
import typings.mangopay2NodejsSdk.mod.PayOut.PayOutData
import typings.mangopay2NodejsSdk.mod.refund.RefundData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "PayOuts")
@js.native
class PayOuts () extends js.Object {
  
  /**
    * Create new pay-out
    * @param payOut
    * @param options
    */
  def create(data: CreatePayOut): js.Promise[PayOutData] = js.native
  /**
    * Create new pay-out
    * @param payOut
    * @param options
    */
  def create(data: CreatePayOut, callback: js.Function1[/* data */ PayOutData, Unit]): Unit = js.native
  /**
    * Create new pay-out
    * @param payOut
    * @param options
    */
  def create(
    data: CreatePayOut,
    callback: js.Function1[/* data */ WithResponse[PayOutData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def create(
    data: CreatePayOut,
    callback: js.Function1[/* data */ PayOutData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create new pay-out
    * @param payOut
    * @param options
    */
  def create(data: CreatePayOut, options: MethodOptionWithResponse): js.Promise[WithResponse[PayOutData]] = js.native
  def create(data: CreatePayOut, options: MethodOptionWithoutResponse): js.Promise[PayOutData] = js.native
  /**
    * Create new pay-out
    * @param payOut
    * @param options
    */
  @JSName("create")
  var create_Original: MethodOverload[CreatePayOut, PayOutData] = js.native
  
  /**
    * Get payout
    * @param payOutId
    * @param options
    */
  def get(data: String): js.Promise[PayOutData] = js.native
  /**
    * Get payout
    * @param payOutId
    * @param options
    */
  def get(data: String, callback: js.Function1[/* data */ PayOutData, Unit]): Unit = js.native
  /**
    * Get payout
    * @param payOutId
    * @param options
    */
  def get(
    data: String,
    callback: js.Function1[/* data */ WithResponse[PayOutData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def get(
    data: String,
    callback: js.Function1[/* data */ PayOutData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get payout
    * @param payOutId
    * @param options
    */
  def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[PayOutData]] = js.native
  def get(data: String, options: MethodOptionWithoutResponse): js.Promise[PayOutData] = js.native
  
  /**
    * Gets list of Refunds of a PayOut
    * @param payOutId
    * @param options
    */
  def getRefunds(data: String): js.Promise[js.Array[RefundData]] = js.native
  /**
    * Gets list of Refunds of a PayOut
    * @param payOutId
    * @param options
    */
  def getRefunds(data: String, callback: js.Function1[/* data */ js.Array[RefundData], Unit]): Unit = js.native
  /**
    * Gets list of Refunds of a PayOut
    * @param payOutId
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
    * Gets list of Refunds of a PayOut
    * @param payOutId
    * @param options
    */
  def getRefunds(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[RefundData]]] = js.native
  def getRefunds(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[RefundData]] = js.native
  /**
    * Gets list of Refunds of a PayOut
    * @param payOutId
    * @param options
    */
  @JSName("getRefunds")
  var getRefunds_Original: MethodOverload[String, js.Array[RefundData]] = js.native
  
  /**
    * Get payout
    * @param payOutId
    * @param options
    */
  @JSName("get")
  var get_Original: MethodOverload[String, PayOutData] = js.native
}
