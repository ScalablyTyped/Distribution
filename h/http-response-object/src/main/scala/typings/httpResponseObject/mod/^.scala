package typings.httpResponseObject.mod

import typings.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response from a web request
  */
@JSImport("http-response-object", JSImport.Namespace)
@js.native
class ^[TBody] protected () extends Response[TBody] {
  def this(statusCode: Double, headers: IncomingHttpHeaders, body: TBody, url: String) = this()
}
