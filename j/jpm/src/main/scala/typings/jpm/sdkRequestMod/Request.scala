package typings.jpm.sdkRequestMod

import typings.jpm.Anon_Anonymous
import typings.jpm.Anon_AnonymousContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends BaseRequest {
  var response: Response
}

@JSImport("sdk/request", "Request")
@js.native
object Request extends js.Object {
  def apply(options: Anon_Anonymous): Request = js.native
  def apply[ResponseType](options: Anon_AnonymousContent[ResponseType]): STRequest[ResponseType] = js.native
}

