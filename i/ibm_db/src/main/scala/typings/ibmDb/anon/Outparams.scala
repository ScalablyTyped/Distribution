package typings.ibmDb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Outparams extends js.Object {
  var outparams: js.Any
  var result: js.Array[_]
}

object Outparams {
  @scala.inline
  def apply(outparams: js.Any, result: js.Array[_]): Outparams = {
    val __obj = js.Dynamic.literal(outparams = outparams.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outparams]
  }
}

