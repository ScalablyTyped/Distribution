package typings
package maliLib.maliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mali", "Request")
@js.native
class Request protected ()
  extends maliLib.maliMod.MaliNs.Request {
  def this(call: js.Any, `type`: java.lang.String) = this()
  /* CompleteClass */
  override var call: js.Any = js.native
  /* CompleteClass */
  override var metadata: js.Any = js.native
  /* CompleteClass */
  override var req: maliLib.GrpcRequest = js.native
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
  /* CompleteClass */
  override def get(field: java.lang.String): js.Any = js.native
  /* CompleteClass */
  override def getMetadata(): grpcLib.grpcMod.Metadata = js.native
}

