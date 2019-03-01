package typings
package indentDashStringLib.indentDashStringMod.indentStringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var includeEmptyLines: js.UndefOr[scala.Boolean] = js.undefined
  var indent: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(includeEmptyLines: js.UndefOr[scala.Boolean] = js.undefined, indent: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeEmptyLines)) __obj.updateDynamic("includeEmptyLines")(includeEmptyLines)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    __obj.asInstanceOf[Options]
  }
}

