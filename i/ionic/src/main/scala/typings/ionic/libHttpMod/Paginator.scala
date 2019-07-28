package typings.ionic.libHttpMod

import typings.ionic.Anon_Req
import typings.ionic.definitionsMod.APIResponseSuccess
import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IPaginator
import typings.ionic.definitionsMod.PagePaginatorState
import typings.ionic.definitionsMod.PaginatorDeps
import typings.ionic.definitionsMod.PaginatorGuard
import typings.ionic.definitionsMod.PaginatorRequestGenerator
import typings.ionic.definitionsMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/http", "Paginator")
@js.native
class Paginator[T /* <: Response[js.Array[js.Object]] */] protected () extends IPaginator[T, PagePaginatorState] {
  def this(hasClientReqgenGuardStateMax: PaginatorDeps[T, PagePaginatorState]) = this()
  var client: IClient = js.native
  @JSName("guard")
  var guard_Original: PaginatorGuard[T] = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator_Paginator: js.Function0[this.type] = js.native
  var max: js.UndefOr[Double] = js.native
  @JSName("reqgen")
  var reqgen_Original: PaginatorRequestGenerator = js.native
  /* protected */ def guard(res: APIResponseSuccess): /* is T */ Boolean = js.native
  /* protected */ def reqgen(): js.Promise[Anon_Req] = js.native
}

