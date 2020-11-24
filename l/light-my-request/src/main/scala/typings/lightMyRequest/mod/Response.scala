package typings.lightMyRequest.mod

import org.scalablytyped.runtime.StringDictionary
import typings.lightMyRequest.anon.Req
import typings.node.Buffer
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends ServerResponse {
  
  var body: String = js.native
  
  var cookies: js.Array[js.Object] = js.native
  
  var headers: OutgoingHttpHeaders = js.native
  
  def json[T](): T = js.native
  
  var payload: String = js.native
  
  var raw: Req = js.native
  
  var rawPayload: Buffer = js.native
  
  var trailers: StringDictionary[String] = js.native
}
