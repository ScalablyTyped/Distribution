package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingTarget extends js.Object {
  var options: js.Any
  var source: js.Any
  var target: js.Any
}

object BindingTarget {
  @scala.inline
  def apply(options: js.Any, source: js.Any, target: js.Any): BindingTarget = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingTarget]
  }
}

