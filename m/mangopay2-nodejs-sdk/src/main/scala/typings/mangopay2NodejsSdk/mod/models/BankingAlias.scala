package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialBankingAliasData
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typings.mangopay2NodejsSdk.mod.bankingAlias.BankingAliasType
import typings.mangopay2NodejsSdk.mod.bankingAlias.IBANBankingAliasData
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.BankingAlias")
@js.native
class BankingAlias protected ()
  extends EntityBase[IBANBankingAliasData]
     with IBANBankingAliasData {
  def this(data: PartialBankingAliasData) = this()
  /**
    * Whether the banking alias is active or not
    */
  /* CompleteClass */
  override var Active: Boolean = js.native
  /**
    * The BIC of the banking alias
    */
  /* CompleteClass */
  override var BIC: String = js.native
  /**
    * The Country of the Address
    */
  /* CompleteClass */
  override var Country: CountryISO = js.native
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  /* CompleteClass */
  override var CreditedUserId: String = js.native
  /**
    * The IBAN of the banking alias
    */
  /* CompleteClass */
  override var IBAN: String = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /**
    * The owner of the wallet/banking alias
    */
  /* CompleteClass */
  override var OwnerName: String = js.native
  /* CompleteClass */
  override var Tag: String = js.native
  /**
    * The type of banking alias (note that only IBAN is available at present)
    */
  /* CompleteClass */
  override var Type: BankingAliasType = js.native
  /**
    * The type of banking alias (note that only IBAN is available at present)
    */
  /* CompleteClass */
  @JSName("Type")
  override var Type_IBANBankingAliasData: IBAN = js.native
  /**
    * The ID of a wallet
    */
  /* CompleteClass */
  override var WalletId: String = js.native
}

