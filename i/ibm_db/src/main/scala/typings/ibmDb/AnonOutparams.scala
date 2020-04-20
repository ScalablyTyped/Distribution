package typings.ibmDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOutparams extends js.Object {
  var outparams: js.Any
  var result: js.Array[_]
}

object AnonOutparams {
  @scala.inline
  def apply(outparams: js.Any, result: js.Array[_]): AnonOutparams = {
    val __obj = js.Dynamic.literal(outparams = outparams.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOutparams]
  }
}

