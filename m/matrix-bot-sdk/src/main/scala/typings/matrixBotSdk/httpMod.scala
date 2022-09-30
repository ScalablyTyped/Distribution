package typings.matrixBotSdk

import typings.matrixBotSdk.matrixBotSdkStrings.DELETE
import typings.matrixBotSdk.matrixBotSdkStrings.GET
import typings.matrixBotSdk.matrixBotSdkStrings.POST
import typings.matrixBotSdk.matrixBotSdkStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("matrix-bot-sdk/lib/http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def doHttpRequest(
    baseUrl: String,
    method: GET | POST | PUT | DELETE,
    endpoint: String,
    qs: js.UndefOr[Any],
    body: js.UndefOr[Any],
    headers: js.UndefOr[js.Object],
    timeout: js.UndefOr[Double],
    raw: js.UndefOr[Boolean],
    contentType: js.UndefOr[String],
    noEncoding: js.UndefOr[Boolean]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("doHttpRequest")(baseUrl.asInstanceOf[js.Any], method.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], qs.asInstanceOf[js.Any], body.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any], noEncoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def redactObjectForLogging(input: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("redactObjectForLogging")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
}
