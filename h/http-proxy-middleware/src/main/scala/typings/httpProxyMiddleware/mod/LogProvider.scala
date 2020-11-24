package typings.httpProxyMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogProvider extends js.Object {
  
  var debug: js.UndefOr[Logger] = js.native
  
  var error: js.UndefOr[Logger] = js.native
  
  var info: js.UndefOr[Logger] = js.native
  
  def log(args: js.Any*): Unit = js.native
  @JSName("log")
  var log_Original: Logger = js.native
  
  var warn: js.UndefOr[Logger] = js.native
}
