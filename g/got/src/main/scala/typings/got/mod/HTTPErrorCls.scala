package typings.got.mod

import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("got", "HTTPError")
@js.native
class HTTPErrorCls () extends HTTPError {
  /* CompleteClass */
  override var body: Buffer | String | js.Object = js.native
  /* CompleteClass */
  override var headers: IncomingHttpHeaders = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  @JSName("name")
  override var name_HTTPError: typings.got.gotStrings.HTTPError = js.native
  /* CompleteClass */
  override var statusCode: Double = js.native
  /* CompleteClass */
  override var statusMessage: String = js.native
}

