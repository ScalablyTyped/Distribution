package typings.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/http", "patch")
@js.native
object patch extends js.Object {
  
  def apply[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
  def apply[RT /* <: js.UndefOr[ResponseType] */](url: String, body: js.UndefOr[RequestBody], params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def apply[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def apply[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = js.native
}
