package typings.gulpDashMinifyDashHtml.gulpDashMinifyDashHtmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Options from https://github.com/Swaagie/minimize#options
trait Options extends js.Object {
  // Do not strip CDATA from scripts
  var cdata: js.UndefOr[Boolean] = js.undefined
  // Do not remove comments
  var comments: js.UndefOr[Boolean] = js.undefined
  // Do not remove conditional internet explorer comments
  var conditionals: js.UndefOr[Boolean] = js.undefined
  // Do not remove empty attributes
  var empty: js.UndefOr[Boolean] = js.undefined
  // Preserve one whitespace
  var loose: js.UndefOr[Boolean] = js.undefined
  // Do not remove arbitrary quotes
  var quotes: js.UndefOr[Boolean] = js.undefined
  // Do not remove redundant attributes
  var spare: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cdata: js.UndefOr[Boolean] = js.undefined,
    comments: js.UndefOr[Boolean] = js.undefined,
    conditionals: js.UndefOr[Boolean] = js.undefined,
    empty: js.UndefOr[Boolean] = js.undefined,
    loose: js.UndefOr[Boolean] = js.undefined,
    quotes: js.UndefOr[Boolean] = js.undefined,
    spare: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cdata)) __obj.updateDynamic("cdata")(cdata.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(conditionals)) __obj.updateDynamic("conditionals")(conditionals.asInstanceOf[js.Any])
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose.asInstanceOf[js.Any])
    if (!js.isUndefined(quotes)) __obj.updateDynamic("quotes")(quotes.asInstanceOf[js.Any])
    if (!js.isUndefined(spare)) __obj.updateDynamic("spare")(spare.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

