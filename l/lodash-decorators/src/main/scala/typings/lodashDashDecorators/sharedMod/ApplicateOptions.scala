package typings.lodashDashDecorators.sharedMod

import typings.lodashDashDecorators.factoryMod.DecoratorConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicateOptions extends js.Object {
  var args: js.Array[_]
  var config: DecoratorConfig
  var instance: js.UndefOr[js.Object] = js.undefined
  var target: js.Any
  var value: js.Any
}

object ApplicateOptions {
  @scala.inline
  def apply(
    args: js.Array[_],
    config: DecoratorConfig,
    target: js.Any,
    value: js.Any,
    instance: js.Object = null
  ): ApplicateOptions = {
    val __obj = js.Dynamic.literal(args = args, config = config, target = target, value = value)
    if (instance != null) __obj.updateDynamic("instance")(instance)
    __obj.asInstanceOf[ApplicateOptions]
  }
}

