package typings
package log4javascriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppendResult extends js.Object {
  var appendResult: scala.Boolean
  var isError: scala.Boolean
}

object Anon_AppendResult {
  @scala.inline
  def apply(appendResult: scala.Boolean, isError: scala.Boolean): Anon_AppendResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendResult")(appendResult)
    __obj.updateDynamic("isError")(isError)
    __obj.asInstanceOf[Anon_AppendResult]
  }
}

