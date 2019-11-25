package typings.knockoutDashPreDashRendered.KnockoutComponentTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentConfig extends js.Object {
  var createViewModel: js.UndefOr[js.Any] = js.undefined
  var template: js.Any
}

object ComponentConfig {
  @scala.inline
  def apply(template: js.Any, createViewModel: js.Any = null): ComponentConfig = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (createViewModel != null) __obj.updateDynamic("createViewModel")(createViewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfig]
  }
}

