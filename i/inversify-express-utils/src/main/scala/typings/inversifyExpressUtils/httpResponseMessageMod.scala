package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.httpContentMod.HttpContent
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/httpResponseMessage", JSImport.Namespace)
@js.native
object httpResponseMessageMod extends js.Object {
  @js.native
  class HttpResponseMessage () extends js.Object {
    def this(statusCode: Double) = this()
    var _content: js.Any = js.native
    var _headers: js.Any = js.native
    var _statusCode: js.Any = js.native
    var content: HttpContent = js.native
    var headers: OutgoingHttpHeaders = js.native
    var statusCode: Double = js.native
  }
  
}

