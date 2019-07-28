package typings.grpcDashError.grpcDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc-error", JSImport.Namespace)
@js.native
class ^ protected () extends GRPCError {
  def this(value: String) = this()
  def this(value: js.Object) = this()
  def this(message: String, value: js.Object) = this()
  def this(message: String, value: Double) = this()
  def this(message: String, code: Double, metadata: js.Object) = this()
  /* CompleteClass */
  override var code: Double = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var metadata: js.Object = js.native
  /* CompleteClass */
  override var name: String = js.native
}

