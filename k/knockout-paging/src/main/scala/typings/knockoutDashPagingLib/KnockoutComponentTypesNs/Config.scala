package typings
package knockoutDashPagingLib.KnockoutComponentTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var synchronous: js.UndefOr[scala.Boolean] = js.undefined
  var template: java.lang.String | js.Array[stdLib.Node] | stdLib.DocumentFragment | TemplateElement | AMDModule
  var viewModel: js.UndefOr[
    ViewModelFunction | ViewModelSharedInstance | ViewModelFactoryFunction | AMDModule
  ] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    template: java.lang.String | js.Array[stdLib.Node] | stdLib.DocumentFragment | TemplateElement | AMDModule,
    synchronous: js.UndefOr[scala.Boolean] = js.undefined,
    viewModel: ViewModelFunction | ViewModelSharedInstance | ViewModelFactoryFunction | AMDModule = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronous)) __obj.updateDynamic("synchronous")(synchronous)
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

