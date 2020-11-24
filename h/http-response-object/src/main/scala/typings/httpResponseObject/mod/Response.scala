package typings.httpResponseObject.mod

import typings.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response from a web request
  */
@js.native
trait Response[TBody] extends js.Object {
  
  val body: TBody = js.native
  
  def getBody(): TBody = js.native
  def getBody(encoding: String): String = js.native
  
  val headers: IncomingHttpHeaders = js.native
  
  def isError(): Boolean = js.native
  
  val statusCode: Double = js.native
  
  val url: String = js.native
}
