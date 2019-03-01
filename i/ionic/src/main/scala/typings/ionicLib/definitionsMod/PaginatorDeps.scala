package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginatorDeps[T /* <: Response[js.Array[js.Object]] */, S] extends js.Object {
  val client: IClient
  val max: js.UndefOr[scala.Double] = js.undefined
  val state: js.UndefOr[stdLib.Partial[S]] = js.undefined
  def guard(res: APIResponseSuccess): /* is T */ scala.Boolean
  def reqgen(): js.Promise[ionicLib.Anon_Req]
}

object PaginatorDeps {
  @scala.inline
  def apply[T /* <: Response[js.Array[js.Object]] */, S](
    client: IClient,
    guard: js.Function1[APIResponseSuccess, /* is T */ scala.Boolean],
    reqgen: js.Function0[js.Promise[ionicLib.Anon_Req]],
    max: scala.Int | scala.Double = null,
    state: stdLib.Partial[S] = null
  ): PaginatorDeps[T, S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client")(client)
    __obj.updateDynamic("guard")(guard)
    __obj.updateDynamic("reqgen")(reqgen)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[PaginatorDeps[T, S]]
  }
}

