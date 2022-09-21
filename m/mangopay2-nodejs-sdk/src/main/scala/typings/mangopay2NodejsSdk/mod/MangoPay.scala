package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.baseMod.base.AuthorizationData
import typings.mangopay2NodejsSdk.baseMod.base.Config
import typings.mangopay2NodejsSdk.baseMod.base.RequestOptions
import typings.mangopay2NodejsSdk.mod.models.RateLimit
import typings.mangopay2NodejsSdk.typesMod.ApiMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MangoPay extends StObject {
  
  var BankAccounts: typings.mangopay2NodejsSdk.bankAccountsMod.BankAccounts = js.native
  
  var BankingAliases: typings.mangopay2NodejsSdk.bankingAliasesMod.BankingAliases = js.native
  
  var CardPreAuthorizations: typings.mangopay2NodejsSdk.cardPreauthorizationsMod.CardPreAuthorizations = js.native
  
  var CardRegistrations: typings.mangopay2NodejsSdk.cardRegistrationsMod.CardRegistrations = js.native
  
  var Cards: typings.mangopay2NodejsSdk.cardsMod.Cards = js.native
  
  var Clients: typings.mangopay2NodejsSdk.clientsMod.Clients = js.native
  
  var DisputeDocuments: typings.mangopay2NodejsSdk.disputeDocumentsMod.DisputeDocuments = js.native
  
  var Disputes: typings.mangopay2NodejsSdk.disputesMod.Disputes = js.native
  
  var Events: typings.mangopay2NodejsSdk.eventsMod.Events = js.native
  
  var Hooks: typings.mangopay2NodejsSdk.hooksMod.Hooks = js.native
  
  var Idempotency: typings.mangopay2NodejsSdk.servicesIdempotencyMod.Idempotency = js.native
  
  var KycDocuments: typings.mangopay2NodejsSdk.kycDocumentsMod.KycDocuments = js.native
  
  def Log(args: Any*): Unit = js.native
  
  var Mandates: typings.mangopay2NodejsSdk.mandatesMod.Mandates = js.native
  
  var PayIns: typings.mangopay2NodejsSdk.payInsMod.PayIns = js.native
  
  var PayOuts: typings.mangopay2NodejsSdk.payOutsMod.PayOuts = js.native
  
  var Refunds: typings.mangopay2NodejsSdk.refundsMod.Refunds = js.native
  
  var Regulatory: typings.mangopay2NodejsSdk.regulatoryMod.Regulatory = js.native
  
  var Reports: typings.mangopay2NodejsSdk.reportsMod.Reports = js.native
  
  var Repudiations: typings.mangopay2NodejsSdk.repudiationsMod.Repudiations = js.native
  
  var Responses: typings.mangopay2NodejsSdk.responsesMod.Responses = js.native
  
  var Transfers: typings.mangopay2NodejsSdk.transfersMod.Transfers = js.native
  
  var UboDeclarations: typings.mangopay2NodejsSdk.uboDeclarationsMod.UboDeclarations = js.native
  
  var Users: typings.mangopay2NodejsSdk.usersMod.Users = js.native
  
  var Wallets: typings.mangopay2NodejsSdk.walletsMod.Wallets = js.native
  
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
