package typings.jpm.requestMod

import typings.jpm.anon.Anonymous
import typings.jpm.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends BaseRequest {
  var response: Response = js.native
}

@JSImport("sdk/request", "Request")
@js.native
object Request extends js.Object {
  def apply(options: Anonymous): Request = js.native
  def apply[ResponseType](options: Content[ResponseType]): STRequest[ResponseType] = js.native
}

