package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithoutResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.NoArgMethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.TwoArgsMethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.WithResponse
import typings.mangopay2NodejsSdk.typingsModelsClientMod.client.ClientData
import typings.mangopay2NodejsSdk.typingsModelsClientMod.client.UpdateClient
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionData
import typings.mangopay2NodejsSdk.typingsModelsWalletMod.wallet.ClientFundsType
import typings.mangopay2NodejsSdk.typingsModelsWalletMod.wallet.ClientWalletData
import typings.mangopay2NodejsSdk.typingsTypesMod.CurrencyISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsServicesClientsMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/Clients", "Clients")
  @js.native
  open class Clients () extends StObject {
    
    /**
      * Get the client
      */
    def get(): js.Promise[ClientData] = js.native
    /**
      * Get the client
      */
    def get(callback: js.Function1[(/* data */ ClientData) | (/* data */ WithResponse[ClientData]), Unit]): Unit = js.native
    def get(
      callback: js.Function1[/* data */ WithResponse[ClientData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def get(callback: js.Function1[/* data */ ClientData, Unit], options: MethodOptionWithoutResponse): Unit = js.native
    /**
      * Get the client
      */
    def get(options: MethodOptionWithResponse): js.Promise[WithResponse[ClientData]] = js.native
    def get(options: MethodOptionWithoutResponse): js.Promise[ClientData] = js.native
    
    /**
      * Get a client wallet
      * @param fundsType
      * @param currency
      * @param options
      */
    def getClientWallet(data: ClientFundsType, extra: CurrencyISO): js.Promise[ClientWalletData] = js.native
    /**
      * Get a client wallet
      * @param fundsType
      * @param currency
      * @param options
      */
    def getClientWallet(
      data: ClientFundsType,
      extra: CurrencyISO,
      callback: js.Function1[(/* data */ ClientWalletData) | (/* data */ WithResponse[ClientWalletData]), Unit]
    ): Unit = js.native
    def getClientWallet(
      data: ClientFundsType,
      extra: CurrencyISO,
      callback: js.Function1[/* data */ WithResponse[ClientWalletData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getClientWallet(
      data: ClientFundsType,
      extra: CurrencyISO,
      callback: js.Function1[/* data */ ClientWalletData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Get a client wallet
      * @param fundsType
      * @param currency
      * @param options
      */
    def getClientWallet(data: ClientFundsType, extra: CurrencyISO, options: MethodOptionWithResponse): js.Promise[WithResponse[ClientWalletData]] = js.native
    def getClientWallet(data: ClientFundsType, extra: CurrencyISO, options: MethodOptionWithoutResponse): js.Promise[ClientWalletData] = js.native
    
    /**
      * Get a client wallet's transactions
      * @param fundsType
      * @param currency
      * @param options
      */
    def getClientWalletTransactions(data: ClientFundsType, extra: CurrencyISO): js.Promise[js.Array[TransactionData]] = js.native
    /**
      * Get a client wallet's transactions
      * @param fundsType
      * @param currency
      * @param options
      */
    def getClientWalletTransactions(
      data: ClientFundsType,
      extra: CurrencyISO,
      callback: js.Function1[
          (/* data */ js.Array[TransactionData]) | (/* data */ WithResponse[js.Array[TransactionData]]), 
          Unit
        ]
    ): Unit = js.native
    def getClientWalletTransactions(
      data: ClientFundsType,
      extra: CurrencyISO,
      callback: js.Function1[/* data */ WithResponse[js.Array[TransactionData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getClientWalletTransactions(
      data: ClientFundsType,
      extra: CurrencyISO,
      callback: js.Function1[/* data */ js.Array[TransactionData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Get a client wallet's transactions
      * @param fundsType
      * @param currency
      * @param options
      */
    def getClientWalletTransactions(data: ClientFundsType, extra: CurrencyISO, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[TransactionData]]] = js.native
    def getClientWalletTransactions(data: ClientFundsType, extra: CurrencyISO, options: MethodOptionWithoutResponse): js.Promise[js.Array[TransactionData]] = js.native
    /**
      * Get a client wallet's transactions
      * @param fundsType
      * @param currency
      * @param options
      */
    @JSName("getClientWalletTransactions")
    var getClientWalletTransactions_Original: TwoArgsMethodOverload[ClientFundsType, CurrencyISO, js.Array[TransactionData]] = js.native
    
    /**
      * Get a client wallet
      * @param fundsType
      * @param currency
      * @param options
      */
    @JSName("getClientWallet")
    var getClientWallet_Original: TwoArgsMethodOverload[ClientFundsType, CurrencyISO, ClientWalletData] = js.native
    
    /**
      * Get all client wallets
      * @param options
      */
    def getClientWallets(): js.Promise[js.Array[ClientWalletData]] = js.native
    /**
      * Get all client wallets
      * @param options
      */
    def getClientWallets(
      callback: js.Function1[
          (/* data */ js.Array[ClientWalletData]) | (/* data */ WithResponse[js.Array[ClientWalletData]]), 
          Unit
        ]
    ): Unit = js.native
    def getClientWallets(
      callback: js.Function1[/* data */ WithResponse[js.Array[ClientWalletData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getClientWallets(
      callback: js.Function1[/* data */ js.Array[ClientWalletData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Get all client wallets
      * @param options
      */
    def getClientWallets(options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[ClientWalletData]]] = js.native
    def getClientWallets(options: MethodOptionWithoutResponse): js.Promise[js.Array[ClientWalletData]] = js.native
    
    /**
      * Get client wallets by the type of funds
      * @param fundsType
      * @param options
      */
    def getClientWalletsByFundsType(data: ClientFundsType): js.Promise[js.Array[ClientWalletData]] = js.native
    /**
      * Get client wallets by the type of funds
      * @param fundsType
      * @param options
      */
    def getClientWalletsByFundsType(data: ClientFundsType, callback: js.Function1[/* data */ js.Array[ClientWalletData], Unit]): Unit = js.native
    /**
      * Get client wallets by the type of funds
      * @param fundsType
      * @param options
      */
    def getClientWalletsByFundsType(
      data: ClientFundsType,
      callback: js.Function1[/* data */ WithResponse[js.Array[ClientWalletData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getClientWalletsByFundsType(
      data: ClientFundsType,
      callback: js.Function1[/* data */ js.Array[ClientWalletData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Get client wallets by the type of funds
      * @param fundsType
      * @param options
      */
    def getClientWalletsByFundsType(data: ClientFundsType, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[ClientWalletData]]] = js.native
    def getClientWalletsByFundsType(data: ClientFundsType, options: MethodOptionWithoutResponse): js.Promise[js.Array[ClientWalletData]] = js.native
    /**
      * Get client wallets by the type of funds
      * @param fundsType
      * @param options
      */
    @JSName("getClientWalletsByFundsType")
    var getClientWalletsByFundsType_Original: MethodOverload[ClientFundsType, js.Array[ClientWalletData]] = js.native
    
    /**
      * Get all client wallets
      * @param options
      */
    @JSName("getClientWallets")
    var getClientWallets_Original: NoArgMethodOverload[js.Array[ClientWalletData]] = js.native
    
    /**
      * Get the client
      */
    @JSName("get")
    var get_Original: NoArgMethodOverload[ClientData] = js.native
    
    /**
      * Update the client
      * @param client
      * @param options
      */
    def update(data: UpdateClient): js.Promise[ClientData] = js.native
    /**
      * Update the client
      * @param client
      * @param options
      */
    def update(data: UpdateClient, callback: js.Function1[/* data */ ClientData, Unit]): Unit = js.native
    /**
      * Update the client
      * @param client
      * @param options
      */
    def update(
      data: UpdateClient,
      callback: js.Function1[/* data */ WithResponse[ClientData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def update(
      data: UpdateClient,
      callback: js.Function1[/* data */ ClientData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Update the client
      * @param client
      * @param options
      */
    def update(data: UpdateClient, options: MethodOptionWithResponse): js.Promise[WithResponse[ClientData]] = js.native
    def update(data: UpdateClient, options: MethodOptionWithoutResponse): js.Promise[ClientData] = js.native
    /**
      * Update the client
      * @param client
      * @param options
      */
    @JSName("update")
    var update_Original: MethodOverload[UpdateClient, ClientData] = js.native
    
    /**
      * Upload client logo from base64 image string
      * @param base64Logo
      * @param options
      */
    def uploadLogo(data: String): js.Promise[ClientData] = js.native
    /**
      * Upload client logo from base64 image string
      * @param base64Logo
      * @param options
      */
    def uploadLogo(data: String, callback: js.Function1[/* data */ ClientData, Unit]): Unit = js.native
    /**
      * Upload client logo from base64 image string
      * @param base64Logo
      * @param options
      */
    def uploadLogo(
      data: String,
      callback: js.Function1[/* data */ WithResponse[ClientData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def uploadLogo(
      data: String,
      callback: js.Function1[/* data */ ClientData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Upload client logo from base64 image string
      * @param base64Logo
      * @param options
      */
    def uploadLogo(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[ClientData]] = js.native
    def uploadLogo(data: String, options: MethodOptionWithoutResponse): js.Promise[ClientData] = js.native
    
    /**
      * Upload client logo from file path
      * @param filePath
      * @param options
      */
    def uploadLogoFromFile(data: String): js.Promise[ClientData] = js.native
    /**
      * Upload client logo from file path
      * @param filePath
      * @param options
      */
    def uploadLogoFromFile(data: String, callback: js.Function1[/* data */ ClientData, Unit]): Unit = js.native
    /**
      * Upload client logo from file path
      * @param filePath
      * @param options
      */
    def uploadLogoFromFile(
      data: String,
      callback: js.Function1[/* data */ WithResponse[ClientData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def uploadLogoFromFile(
      data: String,
      callback: js.Function1[/* data */ ClientData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Upload client logo from file path
      * @param filePath
      * @param options
      */
    def uploadLogoFromFile(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[ClientData]] = js.native
    def uploadLogoFromFile(data: String, options: MethodOptionWithoutResponse): js.Promise[ClientData] = js.native
    /**
      * Upload client logo from file path
      * @param filePath
      * @param options
      */
    @JSName("uploadLogoFromFile")
    var uploadLogoFromFile_Original: MethodOverload[String, ClientData] = js.native
    
    /**
      * Upload client logo from base64 image string
      * @param base64Logo
      * @param options
      */
    @JSName("uploadLogo")
    var uploadLogo_Original: MethodOverload[String, ClientData] = js.native
  }
}
