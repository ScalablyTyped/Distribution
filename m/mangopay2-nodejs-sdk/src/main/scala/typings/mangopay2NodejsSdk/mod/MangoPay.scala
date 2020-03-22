package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.typesMod.ApiMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MangoPay extends js.Object {
  var BankAccounts: typings.mangopay2NodejsSdk.mod.BankAccounts = js.native
  var BankingAliases: typings.mangopay2NodejsSdk.mod.BankingAliases = js.native
  var CardPreAuthorizations: typings.mangopay2NodejsSdk.mod.CardPreAuthorizations = js.native
  var CardRegistrations: typings.mangopay2NodejsSdk.mod.CardRegistrations = js.native
  var Cards: typings.mangopay2NodejsSdk.mod.Cards = js.native
  var Clients: typings.mangopay2NodejsSdk.mod.Clients = js.native
  var DisputeDocuments: typings.mangopay2NodejsSdk.mod.DisputeDocuments = js.native
  var Disputes: typings.mangopay2NodejsSdk.mod.Disputes = js.native
  var Events: typings.mangopay2NodejsSdk.mod.Events = js.native
  var Hooks: typings.mangopay2NodejsSdk.mod.Hooks = js.native
  var KycDocuments: typings.mangopay2NodejsSdk.mod.KycDocuments = js.native
  var Mandates: typings.mangopay2NodejsSdk.mod.Mandates = js.native
  var PayIns: typings.mangopay2NodejsSdk.mod.PayIns = js.native
  var PayOuts: typings.mangopay2NodejsSdk.mod.PayOuts = js.native
  var Refunds: typings.mangopay2NodejsSdk.mod.Refunds = js.native
  var Reports: typings.mangopay2NodejsSdk.mod.Reports = js.native
  var Repudiations: typings.mangopay2NodejsSdk.mod.Repudiations = js.native
  var Responses: typings.mangopay2NodejsSdk.mod.Responses = js.native
  var Transfers: typings.mangopay2NodejsSdk.mod.Transfers = js.native
  var UboDeclarations: typings.mangopay2NodejsSdk.mod.UboDeclarations = js.native
  var Users: typings.mangopay2NodejsSdk.mod.Users = js.native
  var Wallets: typings.mangopay2NodejsSdk.mod.Wallets = js.native
  var config: Config = js.native
  var models: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MangoPay.models */ js.Any = js.native
  var requestOptions: RequestOptions = js.native
  def Log(args: js.Any*): Unit = js.native
  def authorize(): js.Promise[AuthorizationData] = js.native
  def authorize(callback: js.Function1[/* data */ AuthorizationData, Unit]): Unit = js.native
  def buildRequestData(entity: js.Any): js.Any = js.native
  def canReadSubRequestData(entity: js.Any, propertyName: js.Any): Boolean = js.native
  def isExpired(): Boolean = js.native
  def method(method: ApiMethod, callback: js.Function1[/* repeated */ js.Any, Unit], options: RequestOptions): js.Any = js.native
}

