package typings.httpBasic

import typings.httpBasic.callbackMod.Callback
import typings.httpBasic.httpVerbMod.HttpVerb
import typings.httpBasic.optionsMod.Options
import typings.httpResponseObject.mod.^
import typings.node.NodeJS.WritableStream
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http-basic", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(method: HttpVerb, url: String, callback: Callback): Unit | WritableStream = js.native
  def default(method: HttpVerb, url: String, options: Null, callback: Callback): Unit | WritableStream = js.native
  def default(method: HttpVerb, url: String, options: Unit, callback: Callback): Unit | WritableStream = js.native
  def default(method: HttpVerb, url: String, options: Options, callback: Callback): Unit | WritableStream = js.native
  def default(method: HttpVerb, url: URL_, callback: Callback): Unit | WritableStream = js.native
  def default(method: HttpVerb, url: URL_, options: Null, callback: Callback): Unit | WritableStream = js.native
  def default(method: HttpVerb, url: URL_, options: Unit, callback: Callback): Unit | WritableStream = js.native
  def default(method: HttpVerb, url: URL_, options: Options, callback: Callback): Unit | WritableStream = js.native
  
  /**
    * A response from a web request
    */
  @js.native
  class Response[TBody] protected () extends ^[TBody] {
    def this(statusCode: Double, headers: IncomingHttpHeaders, body: TBody, url: String) = this()
  }
}
