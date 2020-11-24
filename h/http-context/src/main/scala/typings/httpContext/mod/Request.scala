package typings.httpContext.mod

import typings.accepts.mod.Accepts
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends RequestDelegate {
  
  var accept: Accepts = js.native
  
  var charset: String = js.native
  
  def inspect(): RequestJSON = js.native
  
  var length: Double = js.native
  
  var request: IncomingMessage = js.native
  
  def toJSON(): RequestJSON = js.native
  
  var `type`: String = js.native
}
