package typings.lightMyRequest.mod

import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chain
  extends js.Promise[Response] {
  
  def body(body: InjectPayload): Chain = js.native
  
  def cookies(query: js.Object): Chain = js.native
  
  def delete(url: String): Chain = js.native
  
  def end(): js.Promise[Response] = js.native
  def end(callback: CallbackFunc): Unit = js.native
  
  def get(url: String): Chain = js.native
  
  def head(url: String): Chain = js.native
  
  def headers(headers: IncomingHttpHeaders): Chain = js.native
  def headers(headers: OutgoingHttpHeaders): Chain = js.native
  
  def options(url: String): Chain = js.native
  
  def patch(url: String): Chain = js.native
  
  def payload(payload: InjectPayload): Chain = js.native
  
  def post(url: String): Chain = js.native
  
  def put(url: String): Chain = js.native
  
  def query(query: js.Object): Chain = js.native
  
  def trace(url: String): Chain = js.native
}
