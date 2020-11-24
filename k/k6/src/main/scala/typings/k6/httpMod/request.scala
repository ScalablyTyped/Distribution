package typings.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/http", "request")
@js.native
object request extends js.Object {
  
  def apply[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String): RefinedResponse[RT] = js.native
  def apply[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: js.UndefOr[RequestBody], params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def apply[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def apply[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: RequestBody): RefinedResponse[RT] = js.native
}
