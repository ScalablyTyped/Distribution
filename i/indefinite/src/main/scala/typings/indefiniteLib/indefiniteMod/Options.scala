package typings
package indefiniteLib.indefiniteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var capitalize: js.UndefOr[scala.Boolean] = js.undefined
  var caseInsensitive: js.UndefOr[scala.Boolean] = js.undefined
  var numbers: js.UndefOr[indefiniteLib.indefiniteLibStrings.colloquial] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    capitalize: js.UndefOr[scala.Boolean] = js.undefined,
    caseInsensitive: js.UndefOr[scala.Boolean] = js.undefined,
    numbers: indefiniteLib.indefiniteLibStrings.colloquial = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capitalize)) __obj.updateDynamic("capitalize")(capitalize)
    if (!js.isUndefined(caseInsensitive)) __obj.updateDynamic("caseInsensitive")(caseInsensitive)
    if (numbers != null) __obj.updateDynamic("numbers")(numbers)
    __obj.asInstanceOf[Options]
  }
}

