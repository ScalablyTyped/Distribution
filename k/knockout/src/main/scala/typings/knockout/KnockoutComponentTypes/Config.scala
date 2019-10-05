package typings.knockout.KnockoutComponentTypes

import typings.std.DocumentFragment
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var synchronous: js.UndefOr[Boolean] = js.undefined
  var template: String | js.Array[Node] | DocumentFragment | TemplateElement | AMDModule
  var viewModel: js.UndefOr[
    ViewModelFunction | ViewModelSharedInstance | ViewModelFactoryFunction | AMDModule
  ] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    template: String | js.Array[Node] | DocumentFragment | TemplateElement | AMDModule,
    synchronous: js.UndefOr[Boolean] = js.undefined,
    viewModel: ViewModelFunction | ViewModelSharedInstance | ViewModelFactoryFunction | AMDModule = null
  ): Config = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronous)) __obj.updateDynamic("synchronous")(synchronous)
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

