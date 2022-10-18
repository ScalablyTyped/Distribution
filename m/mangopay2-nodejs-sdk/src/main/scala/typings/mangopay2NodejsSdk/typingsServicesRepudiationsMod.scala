package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithoutResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.WithResponse
import typings.mangopay2NodejsSdk.typingsModelsRefundMod.refund.RefundData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsServicesRepudiationsMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/Repudiations", "Repudiations")
  @js.native
  open class Repudiations () extends StObject {
    
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
    /**
      * Gets list of Refunds of a Repudiation
      * @param repudiationId
      * @param options
      */
    @JSName("getRefunds")
    var getRefunds_Original: MethodOverload[String, js.Array[RefundData]] = js.native
  }
}
