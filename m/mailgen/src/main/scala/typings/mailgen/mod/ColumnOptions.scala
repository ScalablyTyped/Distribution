package typings.mailgen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnOptions extends js.Object {
  var customAlignment: js.Any
  var customWidth: js.Any
}

object ColumnOptions {
  @scala.inline
  def apply(customAlignment: js.Any, customWidth: js.Any): ColumnOptions = {
    val __obj = js.Dynamic.literal(customAlignment = customAlignment.asInstanceOf[js.Any], customWidth = customWidth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColumnOptions]
  }
}

