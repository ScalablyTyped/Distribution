package typings
package maliLib.maliMod.MaliNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var call: js.Any = js.native
  var metadata: js.Any = js.native
  var res: maliLib.GrpcResponse = js.native
  var status: js.Any = js.native
  var `type`: java.lang.String = js.native
  def get(field: java.lang.String): js.Any = js.native
  def getMetadata(): grpcLib.grpcMod.Metadata = js.native
  def getStatus(field: java.lang.String): js.Any = js.native
  def sendMetadata(): scala.Unit = js.native
  def sendMetadata(md: js.Any): scala.Unit = js.native
  def set(field: js.Any): scala.Unit = js.native
  def set(field: js.Any, `val`: js.Any): scala.Unit = js.native
  def setStatus(field: js.Any): scala.Unit = js.native
  def setStatus(field: js.Any, `val`: js.Any): scala.Unit = js.native
}

