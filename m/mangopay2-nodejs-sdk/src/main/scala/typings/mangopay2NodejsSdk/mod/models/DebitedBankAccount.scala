package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.bankAccountMod.bankAccount.DebitedBankAccountData
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.DebitedBankAccount")
@js.native
open class DebitedBankAccount protected ()
  extends EntityBase[DebitedBankAccountData]
     with DebitedBankAccountData {
  def this(data: DebitedBankAccountData) = this()
  
  /**
    * The account number of the bank account. Must be numbers only. Canadian account numbers must be a maximum of 20 digits.
    */
  /* CompleteClass */
  var AccountNumber: String = js.native
  
  /**
    * The BIC of the bank account
    */
  /* CompleteClass */
  var BIC: String = js.native
  
  /**
    * The Country ISO
    */
  /* CompleteClass */
  var Country: CountryISO = js.native
  
  /**
    * The IBAN of the bank account
    */
  /* CompleteClass */
  var IBAN: String = js.native
  
  /**
    * The name of the owner of the bank account
    */
  /* CompleteClass */
  var OwnerName: String = js.native
  
  /**
    * The Type of the bank account
    */
  /* CompleteClass */
  var Type: typings.mangopay2NodejsSdk.bankAccountMod.bankAccount.BankAccountType = js.native
}
