package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.baseMod.base.MethodOptionWithResponse
import typings.mangopay2NodejsSdk.baseMod.base.MethodOptionWithoutResponse
import typings.mangopay2NodejsSdk.baseMod.base.MethodOverload
import typings.mangopay2NodejsSdk.baseMod.base.NoArgMethodOverload
import typings.mangopay2NodejsSdk.baseMod.base.TwoArgsMethodOverload
import typings.mangopay2NodejsSdk.baseMod.base.WithResponse
import typings.mangopay2NodejsSdk.mandateMod.mandate.CreateMandate
import typings.mangopay2NodejsSdk.mandateMod.mandate.MandateData
import typings.mangopay2NodejsSdk.transactionMod.transaction.TransactionData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mandatesMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/Mandates", "Mandates")
  @js.native
  open class Mandates () extends StObject {
    
    /**
      * Cancel a mandate
      * @param mandateId
      * @param options
      */
    def cancel(data: String): js.Promise[MandateData] = js.native
    /**
      * Cancel a mandate
      * @param mandateId
      * @param options
      */
    def cancel(data: String, callback: js.Function1[/* data */ MandateData, Unit]): Unit = js.native
    /**
      * Cancel a mandate
      * @param mandateId
      * @param options
      */
    def cancel(
      data: String,
      callback: js.Function1[/* data */ WithResponse[MandateData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def cancel(
      data: String,
      callback: js.Function1[/* data */ MandateData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Cancel a mandate
      * @param mandateId
      * @param options
      */
    def cancel(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[MandateData]] = js.native
    def cancel(data: String, options: MethodOptionWithoutResponse): js.Promise[MandateData] = js.native
    /**
      * Cancel a mandate
      * @param mandateId
      * @param options
      */
    @JSName("cancel")
    var cancel_Original: MethodOverload[String, MandateData] = js.native
    
    /**
      * Create a new Mandate
      * @param mandate
      * @param options
      */
    def create(data: CreateMandate): js.Promise[MandateData] = js.native
    /**
      * Create a new Mandate
      * @param mandate
      * @param options
      */
    def create(data: CreateMandate, callback: js.Function1[/* data */ MandateData, Unit]): Unit = js.native
    /**
      * Create a new Mandate
      * @param mandate
      * @param options
      */
    def create(
      data: CreateMandate,
      callback: js.Function1[/* data */ WithResponse[MandateData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def create(
      data: CreateMandate,
      callback: js.Function1[/* data */ MandateData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Create a new Mandate
      * @param mandate
      * @param options
      */
    def create(data: CreateMandate, options: MethodOptionWithResponse): js.Promise[WithResponse[MandateData]] = js.native
    def create(data: CreateMandate, options: MethodOptionWithoutResponse): js.Promise[MandateData] = js.native
    /**
      * Create a new Mandate
      * @param mandate
      * @param options
      */
    @JSName("create")
    var create_Original: MethodOverload[CreateMandate, MandateData] = js.native
    
    /**
      * Get mandate by ID
      * @param mandateId
      * @param options
      */
    def get(data: String): js.Promise[MandateData] = js.native
    /**
      * Get mandate by ID
      * @param mandateId
      * @param options
      */
    def get(data: String, callback: js.Function1[/* data */ MandateData, Unit]): Unit = js.native
    /**
      * Get mandate by ID
      * @param mandateId
      * @param options
      */
    def get(
      data: String,
      callback: js.Function1[/* data */ WithResponse[MandateData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def get(
      data: String,
      callback: js.Function1[/* data */ MandateData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Get mandate by ID
      * @param mandateId
      * @param options
      */
    def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[MandateData]] = js.native
    def get(data: String, options: MethodOptionWithoutResponse): js.Promise[MandateData] = js.native
    
    /**
      * Get all mandates
      * @param options
      */
    def getAll(): js.Promise[js.Array[MandateData]] = js.native
    /**
      * Get all mandates
      * @param options
      */
    def getAll(
      callback: js.Function1[
          (/* data */ js.Array[MandateData]) | (/* data */ WithResponse[js.Array[MandateData]]), 
          Unit
        ]
    ): Unit = js.native
    def getAll(
      callback: js.Function1[/* data */ WithResponse[js.Array[MandateData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getAll(
      callback: js.Function1[/* data */ js.Array[MandateData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Get all mandates
      * @param options
      */
    def getAll(options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[MandateData]]] = js.native
    def getAll(options: MethodOptionWithoutResponse): js.Promise[js.Array[MandateData]] = js.native
    /**
      * Get all mandates
      * @param options
      */
    @JSName("getAll")
    var getAll_Original: NoArgMethodOverload[js.Array[MandateData]] = js.native
    
    /**
      * Gets bank account mandates
      * @param userId
      * @param bankAccountId
      * @param options
      */
    def getMandatesForBankAccount(data: String, extra: String): js.Promise[js.Array[MandateData]] = js.native
    /**
      * Gets bank account mandates
      * @param userId
      * @param bankAccountId
      * @param options
      */
    def getMandatesForBankAccount(
      data: String,
      extra: String,
      callback: js.Function1[
          (/* data */ js.Array[MandateData]) | (/* data */ WithResponse[js.Array[MandateData]]), 
          Unit
        ]
    ): Unit = js.native
    def getMandatesForBankAccount(
      data: String,
      extra: String,
      callback: js.Function1[/* data */ WithResponse[js.Array[MandateData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getMandatesForBankAccount(
      data: String,
      extra: String,
      callback: js.Function1[/* data */ js.Array[MandateData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Gets bank account mandates
      * @param userId
      * @param bankAccountId
      * @param options
      */
    def getMandatesForBankAccount(data: String, extra: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[MandateData]]] = js.native
    def getMandatesForBankAccount(data: String, extra: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[MandateData]] = js.native
    /**
      * Gets bank account mandates
      * @param userId
      * @param bankAccountId
      * @param options
      */
    @JSName("getMandatesForBankAccount")
    var getMandatesForBankAccount_Original: TwoArgsMethodOverload[String, String, js.Array[MandateData]] = js.native
    
    /**
      * Gets user's mandates
      * @param userId
      * @param options
      */
    def getMandatesForUser(data: String): js.Promise[js.Array[MandateData]] = js.native
    /**
      * Gets user's mandates
      * @param userId
      * @param options
      */
    def getMandatesForUser(data: String, callback: js.Function1[/* data */ js.Array[MandateData], Unit]): Unit = js.native
    /**
      * Gets user's mandates
      * @param userId
      * @param options
      */
    def getMandatesForUser(
      data: String,
      callback: js.Function1[/* data */ WithResponse[js.Array[MandateData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getMandatesForUser(
      data: String,
      callback: js.Function1[/* data */ js.Array[MandateData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Gets user's mandates
      * @param userId
      * @param options
      */
    def getMandatesForUser(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[MandateData]]] = js.native
    def getMandatesForUser(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[MandateData]] = js.native
    /**
      * Gets user's mandates
      * @param userId
      * @param options
      */
    @JSName("getMandatesForUser")
    var getMandatesForUser_Original: MethodOverload[String, js.Array[MandateData]] = js.native
    
    /**
      * Gets Transactions for a Mandate
      * @param mandateId
      * @param options
      */
    def getTransactions(data: String): js.Promise[js.Array[TransactionData]] = js.native
    /**
      * Gets Transactions for a Mandate
      * @param mandateId
      * @param options
      */
    def getTransactions(data: String, callback: js.Function1[/* data */ js.Array[TransactionData], Unit]): Unit = js.native
    /**
      * Gets Transactions for a Mandate
      * @param mandateId
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
      * Gets Transactions for a Mandate
      * @param mandateId
      * @param options
      */
    def getTransactions(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[TransactionData]]] = js.native
    def getTransactions(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[TransactionData]] = js.native
    /**
      * Gets Transactions for a Mandate
      * @param mandateId
      * @param options
      */
    @JSName("getTransactions")
    var getTransactions_Original: MethodOverload[String, js.Array[TransactionData]] = js.native
    
    /**
      * Get mandate by ID
      * @param mandateId
      * @param options
      */
    @JSName("get")
    var get_Original: MethodOverload[String, MandateData] = js.native
  }
}
