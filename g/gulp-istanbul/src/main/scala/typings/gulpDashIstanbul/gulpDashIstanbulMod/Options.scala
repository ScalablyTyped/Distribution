package typings.gulpDashIstanbul.gulpDashIstanbulMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var codeGenerationOptions: js.UndefOr[js.Object] = js.undefined
  var coverageVariable: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var embedSource: js.UndefOr[Boolean] = js.undefined
  var includeUntested: js.UndefOr[Boolean] = js.undefined
  var noAutoWrap: js.UndefOr[Boolean] = js.undefined
  var noCompact: js.UndefOr[Boolean] = js.undefined
  var preserveComments: js.UndefOr[Boolean] = js.undefined
  var walkDebug: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    codeGenerationOptions: js.Object = null,
    coverageVariable: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    embedSource: js.UndefOr[Boolean] = js.undefined,
    includeUntested: js.UndefOr[Boolean] = js.undefined,
    noAutoWrap: js.UndefOr[Boolean] = js.undefined,
    noCompact: js.UndefOr[Boolean] = js.undefined,
    preserveComments: js.UndefOr[Boolean] = js.undefined,
    walkDebug: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (codeGenerationOptions != null) __obj.updateDynamic("codeGenerationOptions")(codeGenerationOptions)
    if (coverageVariable != null) __obj.updateDynamic("coverageVariable")(coverageVariable)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(embedSource)) __obj.updateDynamic("embedSource")(embedSource)
    if (!js.isUndefined(includeUntested)) __obj.updateDynamic("includeUntested")(includeUntested)
    if (!js.isUndefined(noAutoWrap)) __obj.updateDynamic("noAutoWrap")(noAutoWrap)
    if (!js.isUndefined(noCompact)) __obj.updateDynamic("noCompact")(noCompact)
    if (!js.isUndefined(preserveComments)) __obj.updateDynamic("preserveComments")(preserveComments)
    if (!js.isUndefined(walkDebug)) __obj.updateDynamic("walkDebug")(walkDebug)
    __obj.asInstanceOf[Options]
  }
}

