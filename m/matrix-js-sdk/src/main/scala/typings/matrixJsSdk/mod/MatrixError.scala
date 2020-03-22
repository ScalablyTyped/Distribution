package typings.matrixJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-js-sdk", "MatrixError")
@js.native
class MatrixError protected () extends js.Object {
    // The numeric HTTP status code given
  def this(errorJson: js.Object) = this()
    //  The Matrix 'error' value, e.g. "Missing token."
  var data: js.Object = js.native
  var errcode: String = js.native
    //  The raw Matrix error JSON used to construct this object.
  var httpStatus: Double = js.native
    //  Same as MatrixError.errcode but with a default unknown string.
  var message: String = js.native
    //  The Matrix 'errcode' value, e.g. "M_FORBIDDEN".
  var name: String = js.native
}

