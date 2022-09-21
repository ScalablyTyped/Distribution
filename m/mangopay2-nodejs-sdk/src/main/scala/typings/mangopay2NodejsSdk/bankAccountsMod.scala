package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.baseMod.base.MethodOptionWithResponse
import typings.mangopay2NodejsSdk.baseMod.base.MethodOptionWithoutResponse
import typings.mangopay2NodejsSdk.baseMod.base.MethodOverload
import typings.mangopay2NodejsSdk.baseMod.base.WithResponse
import typings.mangopay2NodejsSdk.transactionMod.transaction.TransactionData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bankAccountsMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/BankAccounts", "BankAccounts")
  @js.native
  open class BankAccounts () extends StObject {
    
    /**
      * Retrieve list of transactions for a bank account
      * @param bankAccountId
      * @param options
      */
    def getTransactions(data: String): js.Promise[js.Array[TransactionData]] = js.native
    /**
      * Retrieve list of transactions for a bank account
      * @param bankAccountId
      * @param options
      */
    def getTransactions(data: String, callback: js.Function1[/* data */ js.Array[TransactionData], Unit]): Unit = js.native
    /**
      * Retrieve list of transactions for a bank account
      * @param bankAccountId
      * @param options
      */
    def getTransactions(
      data: String,
      callback: js.Function1[/* data */ WithResponse[js.Array[TransactionData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getTransactions(
      data: String,
      callback: js.Function1[/* data */ js.Array[TransactionData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Retrieve list of transactions for a bank account
      * @param bankAccountId
      * @param options
      */
    def getTransactions(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[TransactionData]]] = js.native
    def getTransactions(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[TransactionData]] = js.native
    /**
      * Retrieve list of transactions for a bank account
      * @param bankAccountId
      * @param options
      */
    @JSName("getTransactions")
    var getTransactions_Original: MethodOverload[String, js.Array[TransactionData]] = js.native
  }
}
