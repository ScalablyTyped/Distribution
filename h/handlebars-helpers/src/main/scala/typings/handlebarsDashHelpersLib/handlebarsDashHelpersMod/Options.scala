package typings
package handlebarsDashHelpersLib.handlebarsDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var handlebars: js.UndefOr[handlebarsDashHelpersLib.TypeofHandlebars] = js.undefined
  var hbs: js.UndefOr[handlebarsDashHelpersLib.TypeofHandlebars] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    handlebars: handlebarsDashHelpersLib.TypeofHandlebars = null,
    hbs: handlebarsDashHelpersLib.TypeofHandlebars = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (handlebars != null) __obj.updateDynamic("handlebars")(handlebars)
    if (hbs != null) __obj.updateDynamic("hbs")(hbs)
    __obj.asInstanceOf[Options]
  }
}

