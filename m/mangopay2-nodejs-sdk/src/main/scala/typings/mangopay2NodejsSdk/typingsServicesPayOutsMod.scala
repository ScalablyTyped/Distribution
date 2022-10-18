package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithoutResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.WithResponse
import typings.mangopay2NodejsSdk.typingsModelsPayOutMod.payOut.CheckPayOutEligibility
import typings.mangopay2NodejsSdk.typingsModelsPayOutMod.payOut.CheckPayOutEligibilityData
import typings.mangopay2NodejsSdk.typingsModelsPayOutMod.payOut.CreatePayOut
import typings.mangopay2NodejsSdk.typingsModelsPayOutMod.payOut.PayOutData
import typings.mangopay2NodejsSdk.typingsModelsRefundMod.refund.RefundData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsServicesPayOutsMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/PayOuts", "PayOuts")
  @js.native
  open class PayOuts () extends StObject {
    
    /**
      * Check Instant PayOut Eligibility
      * @param payOut
      * @param options
      */
    def checkEligibility(data: CheckPayOutEligibility): js.Promise[CheckPayOutEligibilityData] = js.native
    /**
      * Check Instant PayOut Eligibility
      * @param payOut
      * @param options
      */
    def checkEligibility(data: CheckPayOutEligibility, callback: js.Function1[/* data */ CheckPayOutEligibilityData, Unit]): Unit = js.native
    /**
      * Check Instant PayOut Eligibility
      * @param payOut
      * @param options
      */
    def checkEligibility(
      data: CheckPayOutEligibility,
      callback: js.Function1[/* data */ WithResponse[CheckPayOutEligibilityData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def checkEligibility(
      data: CheckPayOutEligibility,
      callback: js.Function1[/* data */ CheckPayOutEligibilityData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Check Instant PayOut Eligibility
      * @param payOut
      * @param options
      */
    def checkEligibility(data: CheckPayOutEligibility, options: MethodOptionWithResponse): js.Promise[WithResponse[CheckPayOutEligibilityData]] = js.native
    def checkEligibility(data: CheckPayOutEligibility, options: MethodOptionWithoutResponse): js.Promise[CheckPayOutEligibilityData] = js.native
    /**
      * Check Instant PayOut Eligibility
      * @param payOut
      * @param options
      */
    @JSName("checkEligibility")
    var checkEligibility_Original: MethodOverload[CheckPayOutEligibility, CheckPayOutEligibilityData] = js.native
    
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
}
