package typings.inversifyDashExpressDashUtils

import typings.inversifyDashExpressDashUtils.dtsContentHttpContentMod.HttpContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/content/stringContent", JSImport.Namespace)
@js.native
object dtsContentStringContentMod extends js.Object {
  @js.native
  class StringContent protected () extends HttpContent {
    def this(content: String) = this()
    def this(content: String, mediaType: String) = this()
    var content: js.Any = js.native
    var mediaType: js.Any = js.native
  }
  
}

