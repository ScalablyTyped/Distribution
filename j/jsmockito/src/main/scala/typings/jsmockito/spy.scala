package typings.jsmockito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spy")
@js.native
object spy extends js.Object {
  /**
    * Create a mock that proxies a real function or object.  All un-stubbed
    * invocations will be passed through to the real implementation, but can
    * still be verified.
    *
    * @param delegate A 'real' (concrete) object or function that the mock will delegate unstubbed invocations to
    * @return {T} A mock object (as per mock) or mock function (as per mockFunction)
    */
  def apply[T](delegate: T): T = js.native
}

