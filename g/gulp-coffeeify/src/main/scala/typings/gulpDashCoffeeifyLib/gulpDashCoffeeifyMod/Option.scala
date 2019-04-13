package typings
package gulpDashCoffeeifyLib.gulpDashCoffeeifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  /**
    * [DEPRECATED]: You should use a 'paths' options of browserify.
    */
  var aliases: js.UndefOr[Aliases] = js.undefined
  var options: js.UndefOr[gulpDashCoffeeifyLib.Anon_Debug] = js.undefined
  /**
    * [DEPRECATED]
    */
  var transforms: js.UndefOr[Transforms] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    aliases: Aliases = null,
    options: gulpDashCoffeeifyLib.Anon_Debug = null,
    transforms: Transforms = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (options != null) __obj.updateDynamic("options")(options)
    if (transforms != null) __obj.updateDynamic("transforms")(transforms)
    __obj.asInstanceOf[Option]
  }
}

