package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.httpContentMod.HttpContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify-express-utils/dts/content/stringContent", JSImport.Namespace)
@js.native
object stringContentMod extends js.Object {
  
  @js.native
  class StringContent protected () extends HttpContent {
    def this(content: String) = this()
    def this(content: String, mediaType: String) = this()
    
    var content: js.Any = js.native
    
    var mediaType: js.Any = js.native
  }
}
