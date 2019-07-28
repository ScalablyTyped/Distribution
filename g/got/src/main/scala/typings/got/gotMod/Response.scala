package typings.got.gotMod

import typings.node.Buffer
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response[B /* <: Buffer | String | js.Object */] extends IncomingMessage {
  var body: B = js.native
  var fromCache: Boolean = js.native
  var redirectUrls: js.UndefOr[js.Array[String]] = js.native
  var requestUrl: String = js.native
  var retryCount: Double = js.native
  @JSName("url")
  var url_Response: String = js.native
}

