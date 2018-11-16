package typings
package httpDashContextLib.httpDashContextMod.HttpContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends RequestDelegate {
  var accept: acceptsLib.acceptsMod.acceptsNs.Accepts = js.native
  var charset: java.lang.String = js.native
  var length: scala.Double = js.native
  var request: nodeLib.httpMod.IncomingMessage = js.native
  var `type`: java.lang.String = js.native
  def inspect(): RequestJSON = js.native
  def toJSON(): RequestJSON = js.native
}

