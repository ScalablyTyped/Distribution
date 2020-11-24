package typings.ionic.definitionsMod

import typings.ionic.anon.PartialPaginatorState
import typings.ionic.anon.Req
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<ionic.ionic/definitions.PaginatorDeps<T, ionic.ionic/definitions.PaginatorState>, 'reqgen' | 'guard' | 'state' | 'max'> */
@js.native
trait PaginateArgs[T /* <: Response[js.Array[js.Object]] */] extends js.Object {
  
  def guard(res: APIResponseSuccess): /* is T */ Boolean = js.native
  @JSName("guard")
  var guard_Original: PaginatorGuard[T] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  def reqgen(): js.Promise[Req] = js.native
  @JSName("reqgen")
  var reqgen_Original: PaginatorRequestGenerator = js.native
  
  var state: js.UndefOr[PartialPaginatorState] = js.native
}
