package typings.got.mod

import typings.node.Buffer
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response[B /* <: Buffer | String | js.Object */] extends IncomingMessage {
  
  var body: B = js.native
  
  var fromCache: Boolean = js.native
  
  var redirectUrls: js.UndefOr[js.Array[String]] = js.native
  
  var requestUrl: String = js.native
  
  var retryCount: Double = js.native
  
  // got's Response is always a "response obtained from http.ClientRequest", therefore these two properties are never undefined
  @JSName("statusCode")
  var statusCode_Response: Double = js.native
  
  @JSName("statusMessage")
  var statusMessage_Response: String = js.native
  
  var timings: GotTimings = js.native
  
  @JSName("url")
  var url_Response: String = js.native
}
