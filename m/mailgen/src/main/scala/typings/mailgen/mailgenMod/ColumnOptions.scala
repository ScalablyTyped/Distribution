package typings.mailgen.mailgenMod

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
    val __obj = js.Dynamic.literal(customAlignment = customAlignment, customWidth = customWidth)
  
    __obj.asInstanceOf[ColumnOptions]
  }
}

