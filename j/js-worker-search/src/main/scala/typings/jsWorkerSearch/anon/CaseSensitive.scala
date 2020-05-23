package typings.jsWorkerSearch.anon

import typings.jsWorkerSearch.mod.INDEX_MODES
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaseSensitive extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var indexMode: js.UndefOr[INDEX_MODES] = js.undefined
  var matchAnyToken: js.UndefOr[Boolean] = js.undefined
  var tokenizePattern: js.UndefOr[RegExp] = js.undefined
}

object CaseSensitive {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    indexMode: INDEX_MODES = null,
    matchAnyToken: js.UndefOr[Boolean] = js.undefined,
    tokenizePattern: RegExp = null
  ): CaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (indexMode != null) __obj.updateDynamic("indexMode")(indexMode.asInstanceOf[js.Any])
    if (!js.isUndefined(matchAnyToken)) __obj.updateDynamic("matchAnyToken")(matchAnyToken.get.asInstanceOf[js.Any])
    if (tokenizePattern != null) __obj.updateDynamic("tokenizePattern")(tokenizePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseSensitive]
  }
}

