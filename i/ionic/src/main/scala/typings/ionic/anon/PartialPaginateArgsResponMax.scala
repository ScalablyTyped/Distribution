package typings.ionic.anon

import typings.ionic.definitionsMod.APIResponseSuccess
import typings.ionic.definitionsMod.PaginatorGuard
import typings.ionic.definitionsMod.PaginatorRequestGenerator
import typings.ionic.definitionsMod.Response
import typings.ionic.definitionsMod.SSHKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ionic.ionic/definitions.PaginateArgs<ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.SSHKey>>>> */
trait PartialPaginateArgsResponMax extends js.Object {
  var guard: js.UndefOr[PaginatorGuard[Response[js.Array[SSHKey]]]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var reqgen: js.UndefOr[PaginatorRequestGenerator] = js.undefined
  var state: js.UndefOr[PartialPaginatorState] = js.undefined
}

object PartialPaginateArgsResponMax {
  @scala.inline
  def apply(
    guard: /* res */ APIResponseSuccess => /* is T */ Boolean = null,
    max: js.UndefOr[Double] = js.undefined,
    reqgen: () => js.Promise[Req] = null,
    state: PartialPaginatorState = null
  ): PartialPaginateArgsResponMax = {
    val __obj = js.Dynamic.literal()
    if (guard != null) __obj.updateDynamic("guard")(js.Any.fromFunction1(guard))
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (reqgen != null) __obj.updateDynamic("reqgen")(js.Any.fromFunction0(reqgen))
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPaginateArgsResponMax]
  }
}

