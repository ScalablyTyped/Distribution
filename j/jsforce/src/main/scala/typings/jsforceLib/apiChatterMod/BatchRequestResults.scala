package typings
package jsforceLib.apiChatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchRequestResults extends js.Object {
  var hasError: scala.Boolean
  var results: js.Array[BatchRequestResult]
}

object BatchRequestResults {
  @scala.inline
  def apply(hasError: scala.Boolean, results: js.Array[BatchRequestResult]): BatchRequestResults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasError")(hasError)
    __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[BatchRequestResults]
  }
}

