package typings.knockout.KnockoutComponentTypes

import typings.std.DocumentFragment
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config[T] extends js.Object {
  var synchronous: js.UndefOr[Boolean] = js.undefined
  var template: String | js.Array[Node] | DocumentFragment | TemplateElement | AMDModule
  var viewModel: js.UndefOr[T] = js.undefined
}

object Config {
  @scala.inline
  def apply[T](
    template: String | js.Array[Node] | DocumentFragment | TemplateElement | AMDModule,
    synchronous: js.UndefOr[Boolean] = js.undefined,
    viewModel: T = null
  ): Config[T] = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronous)) __obj.updateDynamic("synchronous")(synchronous.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config[T]]
  }
}

