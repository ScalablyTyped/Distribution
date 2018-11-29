package typings
package maliLib.maliMod.MaliNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var app: maliLib.maliMod.Mali = js.native
  var call: js.Any = js.native
  var fullName: java.lang.String = js.native
  var metadata: js.Any = js.native
  var name: java.lang.String = js.native
  var `package`: java.lang.String = js.native
  var req: maliLib.GrpcRequest = js.native
  var request: Request = js.native
  var res: maliLib.GrpcResponse = js.native
  var response: Response = js.native
  var service: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  def get(field: java.lang.String): js.Any = js.native
  def getStatus(field: java.lang.String): js.Any = js.native
  def sendMetadata(md: js.Any): scala.Unit = js.native
  def set(field: js.Any): scala.Unit = js.native
  def set(field: js.Any, `val`: js.Any): scala.Unit = js.native
  def setStatus(field: js.Any): scala.Unit = js.native
  def setStatus(field: js.Any, `val`: js.Any): scala.Unit = js.native
}

