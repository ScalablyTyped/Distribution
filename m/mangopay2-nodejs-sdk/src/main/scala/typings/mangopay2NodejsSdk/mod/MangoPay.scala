package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.models.RateLimit
import typings.mangopay2NodejsSdk.typingsBaseMod.base.AuthorizationData
import typings.mangopay2NodejsSdk.typingsBaseMod.base.Config
import typings.mangopay2NodejsSdk.typingsBaseMod.base.RequestOptions
import typings.mangopay2NodejsSdk.typingsTypesMod.ApiMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MangoPay extends StObject {
  
  var BankAccounts: typings.mangopay2NodejsSdk.typingsServicesBankAccountsMod.BankAccounts = js.native
  
  var BankingAliases: typings.mangopay2NodejsSdk.typingsServicesBankingAliasesMod.BankingAliases = js.native
  
  var CardPreAuthorizations: typings.mangopay2NodejsSdk.typingsServicesCardPreauthorizationsMod.CardPreAuthorizations = js.native
  
  var CardRegistrations: typings.mangopay2NodejsSdk.typingsServicesCardRegistrationsMod.CardRegistrations = js.native
  
  var Cards: typings.mangopay2NodejsSdk.typingsServicesCardsMod.Cards = js.native
  
  var Clients: typings.mangopay2NodejsSdk.typingsServicesClientsMod.Clients = js.native
  
  var DisputeDocuments: typings.mangopay2NodejsSdk.typingsServicesDisputeDocumentsMod.DisputeDocuments = js.native
  
  var Disputes: typings.mangopay2NodejsSdk.typingsServicesDisputesMod.Disputes = js.native
  
  var Events: typings.mangopay2NodejsSdk.typingsServicesEventsMod.Events = js.native
  
  var Hooks: typings.mangopay2NodejsSdk.typingsServicesHooksMod.Hooks = js.native
  
  var Idempotency: typings.mangopay2NodejsSdk.typingsServicesIdempotencyMod.Idempotency = js.native
  
  var KycDocuments: typings.mangopay2NodejsSdk.typingsServicesKycDocumentsMod.KycDocuments = js.native
  
  def Log(args: Any*): Unit = js.native
  
  var Mandates: typings.mangopay2NodejsSdk.typingsServicesMandatesMod.Mandates = js.native
  
  var PayIns: typings.mangopay2NodejsSdk.typingsServicesPayInsMod.PayIns = js.native
  
  var PayOuts: typings.mangopay2NodejsSdk.typingsServicesPayOutsMod.PayOuts = js.native
  
  var Refunds: typings.mangopay2NodejsSdk.typingsServicesRefundsMod.Refunds = js.native
  
  var Regulatory: typings.mangopay2NodejsSdk.typingsServicesRegulatoryMod.Regulatory = js.native
  
  var Reports: typings.mangopay2NodejsSdk.typingsServicesReportsMod.Reports = js.native
  
  var Repudiations: typings.mangopay2NodejsSdk.typingsServicesRepudiationsMod.Repudiations = js.native
  
  var Responses: typings.mangopay2NodejsSdk.typingsServicesResponsesMod.Responses = js.native
  
  var Transfers: typings.mangopay2NodejsSdk.typingsServicesTransfersMod.Transfers = js.native
  
  var UboDeclarations: typings.mangopay2NodejsSdk.typingsServicesUboDeclarationsMod.UboDeclarations = js.native
  
  var Users: typings.mangopay2NodejsSdk.typingsServicesUsersMod.Users = js.native
  
  var Wallets: typings.mangopay2NodejsSdk.typingsServicesWalletsMod.Wallets = js.native
  
  def authorize(): js.Promise[AuthorizationData] = js.native
  def authorize(callback: js.Function1[/* data */ AuthorizationData, Unit]): Unit = js.native
  
  def buildRequestData(entity: Any): Any = js.native
  
  def canReadSubRequestData(entity: Any, propertyName: Any): Boolean = js.native
  
  var config: Config = js.native
  
  def isExpired(): Boolean = js.native
  
  def method(method: ApiMethod, callback: js.Function1[/* repeated */ Any, Unit], options: RequestOptions): Any = js.native
  
  var models: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MangoPay.models */ Any = js.native
  
  var rateLimits: js.Array[RateLimit] = js.native
  
  var requestOptions: RequestOptions = js.native
}
