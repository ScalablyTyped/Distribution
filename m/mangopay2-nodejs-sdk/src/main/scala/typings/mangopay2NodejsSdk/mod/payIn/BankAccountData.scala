package typings.mangopay2NodejsSdk.mod.payIn

import typings.mangopay2NodejsSdk.mod.IBankAccountType
import typings.mangopay2NodejsSdk.typesMod.ValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BankAccountData extends js.Object {
  
  /**
    * The BIC of the bank account
    */
  var BIC: String = js.native
  
  /**
    * The IBAN of the bank account
    */
  var IBAN: String = js.native
  
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: String = js.native
  
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String = js.native
  
  /**
    * The type of bank account
    */
  var Type: ValueOf[IBankAccountType] = js.native
}
object BankAccountData {
  
  @scala.inline
  def apply(
    BIC: String,
    IBAN: String,
    OwnerAddress: String,
    OwnerName: String,
    Type: ValueOf[IBankAccountType]
  ): BankAccountData = {
    val __obj = js.Dynamic.literal(BIC = BIC.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankAccountData]
  }
  
  @scala.inline
  implicit class BankAccountDataOps[Self <: BankAccountData] (val x: Self) extends AnyVal {
    
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
    def setOwnerAddress(value: String): Self = this.set("OwnerAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerName(value: String): Self = this.set("OwnerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ValueOf[IBankAccountType]): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
