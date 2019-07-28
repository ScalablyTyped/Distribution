package typings.ionic.libHttpMod

import typings.ionic.Anon_Req
import typings.ionic.definitionsMod.APIResponseSuccess
import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IPaginator
import typings.ionic.definitionsMod.PaginatorDeps
import typings.ionic.definitionsMod.PaginatorGuard
import typings.ionic.definitionsMod.PaginatorRequestGenerator
import typings.ionic.definitionsMod.Response
import typings.ionic.definitionsMod.TokenPaginatorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/http", "TokenPaginator")
@js.native
class TokenPaginator[T /* <: Response[js.Array[js.Object]] */] protected () extends IPaginator[T, TokenPaginatorState] {
  def this(hasClientReqgenGuardStateMax: PaginatorDeps[T, TokenPaginatorState]) = this()
  var client: IClient = js.native
  @JSName("guard")
  var guard_Original: PaginatorGuard[T] = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator_TokenPaginator: js.Function0[this.type] = js.native
  var max: js.UndefOr[Double] = js.native
  @JSName("reqgen")
  var reqgen_Original: PaginatorRequestGenerator = js.native
  /* protected */ def guard(res: APIResponseSuccess): /* is T */ Boolean = js.native
  def isPageTokenResponseMeta(meta: js.Any): /* is ionic.ionic/definitions.APIResponsePageTokenMeta */ Boolean = js.native
  /* protected */ def reqgen(): js.Promise[Anon_Req] = js.native
}

