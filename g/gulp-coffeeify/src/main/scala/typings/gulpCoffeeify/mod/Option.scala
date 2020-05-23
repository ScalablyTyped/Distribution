package typings.gulpCoffeeify.mod

import typings.gulpCoffeeify.anon.Debug
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  /**
    * [DEPRECATED]: You should use a 'paths' options of browserify.
    */
  var aliases: js.UndefOr[Aliases] = js.undefined
  var options: js.UndefOr[Debug] = js.undefined
  /**
    * [DEPRECATED]
    */
  var transforms: js.UndefOr[Transforms] = js.undefined
}

object Option {
  @scala.inline
  def apply(aliases: Aliases = null, options: Debug = null, transforms: Transforms = null): Option = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

