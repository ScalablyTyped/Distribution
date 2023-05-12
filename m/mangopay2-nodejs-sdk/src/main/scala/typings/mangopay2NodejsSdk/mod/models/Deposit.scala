package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialCreateDeposit
import typings.mangopay2NodejsSdk.typingsBaseMod.base.BrowserInfoData
import typings.mangopay2NodejsSdk.typingsModelsBillingMod.billing.CompleteBillingData
import typings.mangopay2NodejsSdk.typingsModelsDepositMod.deposit.DepositData
import typings.mangopay2NodejsSdk.typingsModelsDepositMod.deposit.PayinsLinkedData
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.`3DSVersion`
import typings.mangopay2NodejsSdk.typingsModelsShippingMod.shipping.ShippingData
import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.Deposit")
@js.native
open class Deposit ()
  extends EntityBase[DepositData]
     with DepositData {
  def this(data: PartialCreateDeposit) = this()
  
  /* CompleteClass */
  var Applied3DSVersion: `3DSVersion` = js.native
  
  /* CompleteClass */
  var AuthorId: String = js.native
  
  /* CompleteClass */
  var Billing: CompleteBillingData = js.native
  
  /* CompleteClass */
  var BrowserInfo: BrowserInfoData = js.native
  
  /* CompleteClass */
  var CardId: String = js.native
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /* CompleteClass */
  var Culture: CountryISO = js.native
  
  /* CompleteClass */
  var DebitedFunds: MoneyData = js.native
  
  /* CompleteClass */
  var ExecutionType: typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.PayInExecutionType = js.native
  
  /* CompleteClass */
  var ExpirationDate: Timestamp = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /* CompleteClass */
  var IpAddress: String = js.native
  
  /* CompleteClass */
  var PayinsLinked: PayinsLinkedData = js.native
  
  /* CompleteClass */
  var PaymentStatus: typings.mangopay2NodejsSdk.typingsModelsDepositMod.deposit.PaymentStatus = js.native
  
  /* CompleteClass */
  var PaymentType: typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.PayInPaymentType = js.native
  
  /* CompleteClass */
  var Requested3DSVersion: `3DSVersion` = js.native
  
  /* CompleteClass */
  var ResultCode: String = js.native
  
  /* CompleteClass */
  var ResultMessage: String = js.native
  
  /* CompleteClass */
  var SecureModeNeeded: Boolean = js.native
  
  /* CompleteClass */
  var SecureModeRedirectURL: String = js.native
  
  /* CompleteClass */
  var SecureModeReturnURL: String = js.native
  
  /* CompleteClass */
  var Shipping: ShippingData = js.native
  
  /* CompleteClass */
  var StatementDescriptor: String = js.native
  
  /* CompleteClass */
  var Status: typings.mangopay2NodejsSdk.typingsModelsDepositMod.deposit.DepositStatus = js.native
  
  /* CompleteClass */
  var Tag: String = js.native
}
