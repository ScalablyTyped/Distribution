package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialBankingAliasData
import typings.mangopay2NodejsSdk.mod.bankingAlias.IBANBankingAliasData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.BankingAlias")
@js.native
class BankingAlias protected ()
  extends EntityBase[IBANBankingAliasData]
     with IBANBankingAliasData {
  def this(data: PartialBankingAliasData) = this()
}
