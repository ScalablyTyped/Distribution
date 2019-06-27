package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefinedResponse[RT /* <: js.UndefOr[ResponseType] */] extends Response {
  @JSName("body")
  var body_RefinedResponse: RefinedResponseBody[RT] = js.native
}

