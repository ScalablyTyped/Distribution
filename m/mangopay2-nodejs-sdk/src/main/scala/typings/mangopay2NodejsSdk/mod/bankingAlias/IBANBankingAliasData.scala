package typings.mangopay2NodejsSdk.mod.bankingAlias

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBANBankingAliasData extends BankingAliasData {
  
  /**
    * The BIC of the banking alias
    */
  var BIC: String = js.native
  
  /**
    * The IBAN of the banking alias
    */
  var IBAN: String = js.native
  
  /**
    * The type of banking alias (note that only IBAN is available at present)
    */
  @JSName("Type")
  var Type_IBANBankingAliasData: IBAN = js.native
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
  
  @scala.inline
  implicit class IBANBankingAliasDataOps[Self <: IBANBankingAliasData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBIC(value: String): Self = this.set("BIC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIBAN(value: String): Self = this.set("IBAN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: IBAN): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
