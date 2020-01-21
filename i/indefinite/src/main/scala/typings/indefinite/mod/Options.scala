package typings.indefinite.mod

import typings.indefinite.indefiniteStrings.colloquial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var articleOnly: js.UndefOr[Boolean] = js.undefined
  var capitalize: js.UndefOr[Boolean] = js.undefined
  var caseInsensitive: js.UndefOr[Boolean] = js.undefined
  var numbers: js.UndefOr[colloquial] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    articleOnly: js.UndefOr[Boolean] = js.undefined,
    capitalize: js.UndefOr[Boolean] = js.undefined,
    caseInsensitive: js.UndefOr[Boolean] = js.undefined,
    numbers: colloquial = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(articleOnly)) __obj.updateDynamic("articleOnly")(articleOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(capitalize)) __obj.updateDynamic("capitalize")(capitalize.asInstanceOf[js.Any])
    if (!js.isUndefined(caseInsensitive)) __obj.updateDynamic("caseInsensitive")(caseInsensitive.asInstanceOf[js.Any])
    if (numbers != null) __obj.updateDynamic("numbers")(numbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

