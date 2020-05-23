package typings.jqueryFlagstrap.jQueryFlagStrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagStrapStatic extends js.Object {
  var flagStrap: js.UndefOr[Unit] = js.undefined
}

object FlagStrapStatic {
  @scala.inline
  def apply(flagStrap: js.UndefOr[Unit] = js.undefined): FlagStrapStatic = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flagStrap)) __obj.updateDynamic("flagStrap")(flagStrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlagStrapStatic]
  }
}

