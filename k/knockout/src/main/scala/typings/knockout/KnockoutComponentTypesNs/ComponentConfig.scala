package typings.knockout.KnockoutComponentTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentConfig extends js.Object {
  var createViewModel: js.UndefOr[js.Any] = js.undefined
  var template: js.Any
  var viewModel: js.UndefOr[
    ViewModelFunction | ViewModelSharedInstance | ViewModelFactoryFunction | AMDModule
  ] = js.undefined
}

object ComponentConfig {
  @scala.inline
  def apply(
    template: js.Any,
    createViewModel: js.Any = null,
    viewModel: ViewModelFunction | ViewModelSharedInstance | ViewModelFactoryFunction | AMDModule = null
  ): ComponentConfig = {
    val __obj = js.Dynamic.literal(template = template)
    if (createViewModel != null) __obj.updateDynamic("createViewModel")(createViewModel)
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfig]
  }
}

