package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.refund.RefundData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "Repudiations")
@js.native
class Repudiations () extends js.Object {
  /**
    * Gets list of Refunds of a Repudiation
    * @param repudiationId
    * @param options
    */
  @JSName("getRefunds")
  var getRefunds_Original: MethodOverload[String, js.Array[RefundData]] = js.native
  /**
    * Gets list of Refunds of a Repudiation
    * @param repudiationId
    * @param options
    */
  def getRefunds(data: String): js.Promise[js.Array[RefundData]] = js.native
  /**
    * Gets list of Refunds of a Repudiation
    * @param repudiationId
    * @param options
    */
  def getRefunds(data: String, callback: js.Function1[/* data */ js.Array[RefundData], Unit]): Unit = js.native
  /**
    * Gets list of Refunds of a Repudiation
    * @param repudiationId
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
    * Gets list of Refunds of a Repudiation
    * @param repudiationId
    * @param options
    */
  def getRefunds(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[RefundData]]] = js.native
  def getRefunds(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[RefundData]] = js.native
}

