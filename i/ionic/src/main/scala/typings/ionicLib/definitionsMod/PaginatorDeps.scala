package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PaginatorDeps[T /* <: Response[js.Array[js.Object]] */, S] extends js.Object {
  val client: IClient
  val max: js.UndefOr[scala.Double] = js.undefined
  val state: js.UndefOr[stdLib.Partial[S]] = js.undefined
  def guard(res: APIResponseSuccess): /* is T */scala.Boolean
  def reqgen(): stdLib.Promise[ionicLib.Anon_Req]
}

