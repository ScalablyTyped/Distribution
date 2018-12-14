package typings
package ionicLib.libHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/http", "Paginator")
@js.native
class Paginator[T /* <: ionicLib.definitionsMod.Response[js.Array[js.Object]] */] protected ()
  extends ionicLib.definitionsMod.IPaginator[T, ionicLib.definitionsMod.PagePaginatorState] {
  def this(hasClientReqgenGuardStateMax: ionicLib.definitionsMod.PaginatorDeps[T, ionicLib.definitionsMod.PagePaginatorState]) = this()
  var client: ionicLib.definitionsMod.IClient = js.native
  @JSName("guard")
  var guard_Original: ionicLib.definitionsMod.PaginatorGuard[T] = js.native
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[Paginator[T]] = js.native
  var max: js.UndefOr[scala.Double] = js.native
  @JSName("reqgen")
  var reqgen_Original: ionicLib.definitionsMod.PaginatorRequestGenerator = js.native
  /* CompleteClass */
  override val state: ionicLib.definitionsMod.PagePaginatorState = js.native
  /* protected */ def guard(res: ionicLib.definitionsMod.APIResponseSuccess): /* is T */scala.Boolean = js.native
  def next(): nodeLib.IteratorResult[js.Promise[T]] = js.native
  /* protected */ def reqgen(): js.Promise[ionicLib.Anon_Req] = js.native
}

