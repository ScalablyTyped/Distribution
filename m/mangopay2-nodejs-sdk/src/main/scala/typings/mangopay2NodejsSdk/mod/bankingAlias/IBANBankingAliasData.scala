package typings.mangopay2NodejsSdk.mod.bankingAlias

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBANBankingAliasData extends BankingAliasData {
  /**
    * The BIC of the banking alias
    */
  var BIC: String
  /**
    * The IBAN of the banking alias
    */
  var IBAN: String
  /**
    * The type of banking alias (note that only IBAN is available at present)
    */
  @JSName("Type")
  var Type_IBANBankingAliasData: IBAN
}

object IBANBankingAliasData {
  @scala.inline
  def apply(
    Active: Boolean,
    BIC: String,
    Country: CountryISO,
    CreationDate: Double,
    CreditedUserId: String,
    IBAN: String,
    Id: String,
    OwnerName: String,
    Tag: String,
    Type: IBAN,
    WalletId: String
  ): IBANBankingAliasData = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], BIC = BIC.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], WalletId = WalletId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBANBankingAliasData]
  }
}

