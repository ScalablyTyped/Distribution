package typings
package ibmUnderscoreDbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Outparams extends js.Object {
  var outparams: js.Any
  var result: js.Array[_]
}

object Anon_Outparams {
  @scala.inline
  def apply(outparams: js.Any, result: js.Array[_]): Anon_Outparams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("outparams")(outparams)
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[Anon_Outparams]
  }
}

