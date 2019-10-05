package typings.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/http", "options")
@js.native
object options extends js.Object {
  def apply[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
  def apply[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def apply[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = js.native
  def apply[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
}

