package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.refund.RefundData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "Refunds")
@js.native
class Refunds () extends js.Object {
  
  /**
    * Get events
    * @param refundId
    * @param options
    */
  def get(data: String): js.Promise[RefundData] = js.native
  /**
    * Get events
    * @param refundId
    * @param options
    */
  def get(data: String, callback: js.Function1[/* data */ RefundData, Unit]): Unit = js.native
  /**
    * Get events
    * @param refundId
    * @param options
    */
  def get(
    data: String,
    callback: js.Function1[/* data */ WithResponse[RefundData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def get(
    data: String,
    callback: js.Function1[/* data */ RefundData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get events
    * @param refundId
    * @param options
    */
  def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[RefundData]] = js.native
  def get(data: String, options: MethodOptionWithoutResponse): js.Promise[RefundData] = js.native
  /**
    * Get events
    * @param refundId
    * @param options
    */
  @JSName("get")
  var get_Original: MethodOverload[String, RefundData] = js.native
}
