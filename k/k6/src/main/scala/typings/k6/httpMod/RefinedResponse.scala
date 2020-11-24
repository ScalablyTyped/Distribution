package typings.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefinedResponse[RT /* <: js.UndefOr[ResponseType] */] extends Response {
  
  @JSName("body")
  var body_RefinedResponse: RefinedResponseBody[RT] = js.native
}
