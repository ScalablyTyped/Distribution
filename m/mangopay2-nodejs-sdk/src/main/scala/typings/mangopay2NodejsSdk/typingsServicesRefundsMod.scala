package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithoutResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.WithResponse
import typings.mangopay2NodejsSdk.typingsModelsRefundMod.refund.RefundData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsServicesRefundsMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/Refunds", "Refunds")
  @js.native
  open class Refunds () extends StObject {
    
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
}
