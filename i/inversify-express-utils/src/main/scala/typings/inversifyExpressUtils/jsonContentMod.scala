package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.httpContentMod.HttpContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/content/jsonContent", JSImport.Namespace)
@js.native
object jsonContentMod extends js.Object {
  @js.native
  class JsonContent protected () extends HttpContent {
    def this(content: js.Any) = this()
    def this(content: js.Any, mediaType: String) = this()
    var content: js.Any = js.native
    var mediaType: js.Any = js.native
  }
  
}

