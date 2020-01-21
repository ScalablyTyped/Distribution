package typings.materialUiCore.unstableUseMediaQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var defaultMatches: js.UndefOr[Boolean] = js.native
  var noSsr: js.UndefOr[Boolean] = js.native
  var ssrMatchMedia: js.UndefOr[js.Function1[/* query */ String, MuiMediaQueryList]] = js.native
}

object Options {
  @scala.inline
  def apply(
    defaultMatches: js.UndefOr[Boolean] = js.undefined,
    noSsr: js.UndefOr[Boolean] = js.undefined,
    ssrMatchMedia: /* query */ String => MuiMediaQueryList = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultMatches)) __obj.updateDynamic("defaultMatches")(defaultMatches.asInstanceOf[js.Any])
    if (!js.isUndefined(noSsr)) __obj.updateDynamic("noSsr")(noSsr.asInstanceOf[js.Any])
    if (ssrMatchMedia != null) __obj.updateDynamic("ssrMatchMedia")(js.Any.fromFunction1(ssrMatchMedia))
    __obj.asInstanceOf[Options]
  }
}

