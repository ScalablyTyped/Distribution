package typings.inversifyExpressUtils

import typings.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpContentMod {
  
  @JSImport("inversify-express-utils/dts/content/httpContent", "HttpContent")
  @js.native
  abstract class HttpContent () extends StObject {
    
    var _headers: js.Any = js.native
    
    val headers: OutgoingHttpHeaders = js.native
    
    def readAsStringAsync(): js.Promise[String] = js.native
  }
}
