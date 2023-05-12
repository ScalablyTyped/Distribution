package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithoutResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.WithResponse
import typings.mangopay2NodejsSdk.typingsModelsDepositMod.deposit.CreateDeposit
import typings.mangopay2NodejsSdk.typingsModelsDepositMod.deposit.DepositData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsServicesDepositsMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/Deposits", "Deposits")
  @js.native
  open class Deposits () extends StObject {
    
    def cancel(data: String): js.Promise[DepositData] = js.native
    def cancel(data: String, callback: js.Function1[/* data */ DepositData, Unit]): Unit = js.native
    def cancel(
      data: String,
      callback: js.Function1[/* data */ WithResponse[DepositData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def cancel(
      data: String,
      callback: js.Function1[/* data */ DepositData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    def cancel(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[DepositData]] = js.native
    def cancel(data: String, options: MethodOptionWithoutResponse): js.Promise[DepositData] = js.native
    @JSName("cancel")
    var cancel_Original: MethodOverload[String, DepositData] = js.native
    
    def create(data: CreateDeposit): js.Promise[DepositData] = js.native
    def create(data: CreateDeposit, callback: js.Function1[/* data */ DepositData, Unit]): Unit = js.native
    def create(
      data: CreateDeposit,
      callback: js.Function1[/* data */ WithResponse[DepositData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def create(
      data: CreateDeposit,
      callback: js.Function1[/* data */ DepositData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    def create(data: CreateDeposit, options: MethodOptionWithResponse): js.Promise[WithResponse[DepositData]] = js.native
    def create(data: CreateDeposit, options: MethodOptionWithoutResponse): js.Promise[DepositData] = js.native
    @JSName("create")
    var create_Original: MethodOverload[CreateDeposit, DepositData] = js.native
    
    def get(data: String): js.Promise[DepositData] = js.native
    def get(data: String, callback: js.Function1[/* data */ DepositData, Unit]): Unit = js.native
    def get(
      data: String,
      callback: js.Function1[/* data */ WithResponse[DepositData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def get(
      data: String,
      callback: js.Function1[/* data */ DepositData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[DepositData]] = js.native
    def get(data: String, options: MethodOptionWithoutResponse): js.Promise[DepositData] = js.native
    @JSName("get")
    var get_Original: MethodOverload[String, DepositData] = js.native
  }
}
