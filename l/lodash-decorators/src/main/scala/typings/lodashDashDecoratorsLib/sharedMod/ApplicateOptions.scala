package typings
package lodashDashDecoratorsLib.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicateOptions extends js.Object {
  var args: js.Array[_]
  var config: lodashDashDecoratorsLib.factoryMod.DecoratorConfig
  var instance: js.UndefOr[js.Object] = js.undefined
  var target: js.Any
  var value: js.Any
}

object ApplicateOptions {
  @scala.inline
  def apply(
    args: js.Array[_],
    config: lodashDashDecoratorsLib.factoryMod.DecoratorConfig,
    target: js.Any,
    value: js.Any,
    instance: js.Object = null
  ): ApplicateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("value")(value)
    if (instance != null) __obj.updateDynamic("instance")(instance)
    __obj.asInstanceOf[ApplicateOptions]
  }
}

