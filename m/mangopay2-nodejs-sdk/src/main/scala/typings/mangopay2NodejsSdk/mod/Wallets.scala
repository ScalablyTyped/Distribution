package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.models.Wallet
import typings.mangopay2NodejsSdk.mod.transaction.TransactionData
import typings.mangopay2NodejsSdk.mod.wallet.CreateWallet
import typings.mangopay2NodejsSdk.mod.wallet.UpdateWallet
import typings.mangopay2NodejsSdk.mod.wallet.WalletData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "Wallets")
@js.native
class Wallets () extends StObject {
  
  def create(data: Wallet): js.Promise[WalletData] = js.native
  def create(data: Wallet, callback: js.Function1[/* data */ WalletData, Unit]): Unit = js.native
  def create(
    data: Wallet,
    callback: js.Function1[/* data */ WithResponse[WalletData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def create(
    data: Wallet,
    callback: js.Function1[/* data */ WalletData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  def create(data: Wallet, options: MethodOptionWithResponse): js.Promise[WithResponse[WalletData]] = js.native
  def create(data: Wallet, options: MethodOptionWithoutResponse): js.Promise[WalletData] = js.native
  /**
    * Create new wallet
    * @param wallet
    * @param options
    */
  def create(data: CreateWallet): js.Promise[WalletData] = js.native
  /**
    * Create new wallet
    * @param wallet
    * @param options
    */
  def create(data: CreateWallet, callback: js.Function1[/* data */ WalletData, Unit]): Unit = js.native
  /**
    * Create new wallet
    * @param wallet
    * @param options
    */
  def create(
    data: CreateWallet,
    callback: js.Function1[/* data */ WithResponse[WalletData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def create(
    data: CreateWallet,
    callback: js.Function1[/* data */ WalletData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create new wallet
    * @param wallet
    * @param options
    */
  def create(data: CreateWallet, options: MethodOptionWithResponse): js.Promise[WithResponse[WalletData]] = js.native
  def create(data: CreateWallet, options: MethodOptionWithoutResponse): js.Promise[WalletData] = js.native
  /**
    * Create new wallet
    * @param wallet
    * @param options
    */
  @JSName("create")
  var create_Original: MethodOverload[CreateWallet | Wallet, WalletData] = js.native
  
  /**
    * Get a specific wallet
    * @param walletId
    */
  def get(data: String): js.Promise[WalletData] = js.native
  /**
    * Get a specific wallet
    * @param walletId
    */
  def get(data: String, callback: js.Function1[/* data */ WalletData, Unit]): Unit = js.native
  /**
    * Get a specific wallet
    * @param walletId
    */
  def get(
    data: String,
    callback: js.Function1[/* data */ WithResponse[WalletData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def get(
    data: String,
    callback: js.Function1[/* data */ WalletData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get a specific wallet
    * @param walletId
    */
  def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[WalletData]] = js.native
  def get(data: String, options: MethodOptionWithoutResponse): js.Promise[WalletData] = js.native
  
  /**
    * Get transactions for the wallet
    * @param walletId
    * @param options
    */
  def getTransactions(data: String): js.Promise[js.Array[TransactionData]] = js.native
  /**
    * Get transactions for the wallet
    * @param walletId
    * @param options
    */
  def getTransactions(data: String, callback: js.Function1[/* data */ js.Array[TransactionData], Unit]): Unit = js.native
  /**
    * Get transactions for the wallet
    * @param walletId
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
    * Get transactions for the wallet
    * @param walletId
    * @param options
    */
  def getTransactions(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[TransactionData]]] = js.native
  def getTransactions(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[TransactionData]] = js.native
  /**
    * Get transactions for the wallet
    * @param walletId
    * @param options
    */
  @JSName("getTransactions")
  var getTransactions_Original: MethodOverload[String, js.Array[TransactionData]] = js.native
  
  /**
    * Get a specific wallet
    * @param walletId
    */
  @JSName("get")
  var get_Original: MethodOverload[String, WalletData] = js.native
  
  def update(data: Wallet): js.Promise[WalletData] = js.native
  def update(data: Wallet, callback: js.Function1[/* data */ WalletData, Unit]): Unit = js.native
  def update(
    data: Wallet,
    callback: js.Function1[/* data */ WithResponse[WalletData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def update(
    data: Wallet,
    callback: js.Function1[/* data */ WalletData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  def update(data: Wallet, options: MethodOptionWithResponse): js.Promise[WithResponse[WalletData]] = js.native
  def update(data: Wallet, options: MethodOptionWithoutResponse): js.Promise[WalletData] = js.native
  /**
    * Update wallet
    * @param wallet
    * @param options
    */
  def update(data: UpdateWallet): js.Promise[WalletData] = js.native
  /**
    * Update wallet
    * @param wallet
    * @param options
    */
  def update(data: UpdateWallet, callback: js.Function1[/* data */ WalletData, Unit]): Unit = js.native
  /**
    * Update wallet
    * @param wallet
    * @param options
    */
  def update(
    data: UpdateWallet,
    callback: js.Function1[/* data */ WithResponse[WalletData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def update(
    data: UpdateWallet,
    callback: js.Function1[/* data */ WalletData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Update wallet
    * @param wallet
    * @param options
    */
  def update(data: UpdateWallet, options: MethodOptionWithResponse): js.Promise[WithResponse[WalletData]] = js.native
  def update(data: UpdateWallet, options: MethodOptionWithoutResponse): js.Promise[WalletData] = js.native
  /**
    * Update wallet
    * @param wallet
    * @param options
    */
  @JSName("update")
  var update_Original: MethodOverload[UpdateWallet | Wallet, WalletData] = js.native
}
