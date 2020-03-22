package typings.knockout.KnockoutComponentTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentConfig[T] extends js.Object {
  var createViewModel: js.UndefOr[js.Any] = js.undefined
  var template: js.Any
  var viewModel: js.UndefOr[T] = js.undefined
}

object ComponentConfig {
  @scala.inline
  def apply[T](template: js.Any, createViewModel: js.Any = null, viewModel: T = null): ComponentConfig[T] = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (createViewModel != null) __obj.updateDynamic("createViewModel")(createViewModel.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfig[T]]
  }
}

