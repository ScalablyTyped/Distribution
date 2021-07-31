package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.anon.PartialOmitCreateIBANBank
import typings.mangopay2NodejsSdk.mod.bankingAlias.CreateIBANBankingAlias
import typings.mangopay2NodejsSdk.mod.bankingAlias.IBANBankingAliasData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "BankingAliases")
@js.native
class BankingAliases () extends StObject {
  
  /**
    * Activate banking alias
    * @param bankingAliasId
    * @param options
    */
  def activate(data: String): js.Promise[IBANBankingAliasData] = js.native
  /**
    * Activate banking alias
    * @param bankingAliasId
    * @param options
    */
  def activate(data: String, callback: js.Function1[/* data */ IBANBankingAliasData, Unit]): Unit = js.native
  /**
    * Activate banking alias
    * @param bankingAliasId
    * @param options
    */
  def activate(
    data: String,
    callback: js.Function1[/* data */ WithResponse[IBANBankingAliasData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def activate(
    data: String,
    callback: js.Function1[/* data */ IBANBankingAliasData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Activate banking alias
    * @param bankingAliasId
    * @param options
    */
  def activate(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[IBANBankingAliasData]] = js.native
  def activate(data: String, options: MethodOptionWithoutResponse): js.Promise[IBANBankingAliasData] = js.native
  /**
    * Activate banking alias
    * @param bankingAliasId
    * @param options
    */
  @JSName("activate")
  var activate_Original: MethodOverload[String, IBANBankingAliasData] = js.native
  
  /**
    * Create a banking alias
    * @param bankingAlias
    * @param options
    */
  def create(data: CreateIBANBankingAlias): js.Promise[IBANBankingAliasData] = js.native
  /**
    * Create a banking alias
    * @param bankingAlias
    * @param options
    */
  def create(data: CreateIBANBankingAlias, callback: js.Function1[/* data */ IBANBankingAliasData, Unit]): Unit = js.native
  /**
    * Create a banking alias
    * @param bankingAlias
    * @param options
    */
  def create(
    data: CreateIBANBankingAlias,
    callback: js.Function1[/* data */ WithResponse[IBANBankingAliasData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def create(
    data: CreateIBANBankingAlias,
    callback: js.Function1[/* data */ IBANBankingAliasData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Create a banking alias
    * @param bankingAlias
    * @param options
    */
  def create(data: CreateIBANBankingAlias, options: MethodOptionWithResponse): js.Promise[WithResponse[IBANBankingAliasData]] = js.native
  def create(data: CreateIBANBankingAlias, options: MethodOptionWithoutResponse): js.Promise[IBANBankingAliasData] = js.native
  /**
    * Create a banking alias
    * @param bankingAlias
    * @param options
    */
  @JSName("create")
  var create_Original: MethodOverload[CreateIBANBankingAlias, IBANBankingAliasData] = js.native
  
  /**
    * Deactivate banking alias
    * @param bankingAliasId
    * @param options
    */
  def deactivate(data: String): js.Promise[IBANBankingAliasData] = js.native
  /**
    * Deactivate banking alias
    * @param bankingAliasId
    * @param options
    */
  def deactivate(data: String, callback: js.Function1[/* data */ IBANBankingAliasData, Unit]): Unit = js.native
  /**
    * Deactivate banking alias
    * @param bankingAliasId
    * @param options
    */
  def deactivate(
    data: String,
    callback: js.Function1[/* data */ WithResponse[IBANBankingAliasData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def deactivate(
    data: String,
    callback: js.Function1[/* data */ IBANBankingAliasData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Deactivate banking alias
    * @param bankingAliasId
    * @param options
    */
  def deactivate(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[IBANBankingAliasData]] = js.native
  def deactivate(data: String, options: MethodOptionWithoutResponse): js.Promise[IBANBankingAliasData] = js.native
  /**
    * Deactivate banking alias
    * @param bankingAliasId
    * @param options
    */
  @JSName("deactivate")
  var deactivate_Original: MethodOverload[String, IBANBankingAliasData] = js.native
  
  /**
    * Get a banking alias
    * @param bankingAliasId
    * @param options
    */
  def get(data: String): js.Promise[IBANBankingAliasData] = js.native
  /**
    * Get a banking alias
    * @param bankingAliasId
    * @param options
    */
  def get(data: String, callback: js.Function1[/* data */ IBANBankingAliasData, Unit]): Unit = js.native
  /**
    * Get a banking alias
    * @param bankingAliasId
    * @param options
    */
  def get(
    data: String,
    callback: js.Function1[/* data */ WithResponse[IBANBankingAliasData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def get(
    data: String,
    callback: js.Function1[/* data */ IBANBankingAliasData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get a banking alias
    * @param bankingAliasId
    * @param options
    */
  def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[IBANBankingAliasData]] = js.native
  def get(data: String, options: MethodOptionWithoutResponse): js.Promise[IBANBankingAliasData] = js.native
  
  /**
    * Get all banking aliases
    * @param options
    */
  def getAll(): js.Promise[js.Array[IBANBankingAliasData]] = js.native
  /**
    * Get all banking aliases
    * @param options
    */
  def getAll(
    callback: js.Function1[
      (/* data */ js.Array[IBANBankingAliasData]) | (/* data */ WithResponse[js.Array[IBANBankingAliasData]]), 
      Unit
    ]
  ): Unit = js.native
  def getAll(
    callback: js.Function1[/* data */ WithResponse[js.Array[IBANBankingAliasData]], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def getAll(
    callback: js.Function1[/* data */ js.Array[IBANBankingAliasData], Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Get all banking aliases
    * @param options
    */
  def getAll(options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[IBANBankingAliasData]]] = js.native
  def getAll(options: MethodOptionWithoutResponse): js.Promise[js.Array[IBANBankingAliasData]] = js.native
  /**
    * Get all banking aliases
    * @param options
    */
  @JSName("getAll")
  var getAll_Original: NoArgMethodOverload[js.Array[IBANBankingAliasData]] = js.native
  
  /**
    * Get a banking alias
    * @param bankingAliasId
    * @param options
    */
  @JSName("get")
  var get_Original: MethodOverload[String, IBANBankingAliasData] = js.native
  
  /**
    * Update banking alias
    * @param bankingAliasId
    * @param options
    */
  def update(data: PartialOmitCreateIBANBank): js.Promise[IBANBankingAliasData] = js.native
  /**
    * Update banking alias
    * @param bankingAliasId
    * @param options
    */
  def update(data: PartialOmitCreateIBANBank, callback: js.Function1[/* data */ IBANBankingAliasData, Unit]): Unit = js.native
  /**
    * Update banking alias
    * @param bankingAliasId
    * @param options
    */
  def update(
    data: PartialOmitCreateIBANBank,
    callback: js.Function1[/* data */ WithResponse[IBANBankingAliasData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def update(
    data: PartialOmitCreateIBANBank,
    callback: js.Function1[/* data */ IBANBankingAliasData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Update banking alias
    * @param bankingAliasId
    * @param options
    */
  def update(data: PartialOmitCreateIBANBank, options: MethodOptionWithResponse): js.Promise[WithResponse[IBANBankingAliasData]] = js.native
  def update(data: PartialOmitCreateIBANBank, options: MethodOptionWithoutResponse): js.Promise[IBANBankingAliasData] = js.native
  /**
    * Update banking alias
    * @param bankingAliasId
    * @param options
    */
  @JSName("update")
  var update_Original: MethodOverload[PartialOmitCreateIBANBank, IBANBankingAliasData] = js.native
}
