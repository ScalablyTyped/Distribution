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
    guard: APIResponseSuccess => /* is T */ scala.Boolean,
    reqgen: () => js.Promise[ionicLib.Anon_Req],
    max: scala.Int | scala.Double = null,
    state: stdLib.Partial[S] = null
  ): PaginatorDeps[T, S] = {
    val __obj = js.Dynamic.literal(client = client, guard = js.Any.fromFunction1(guard), reqgen = js.Any.fromFunction0(reqgen))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[PaginatorDeps[T, S]]
  }
}

