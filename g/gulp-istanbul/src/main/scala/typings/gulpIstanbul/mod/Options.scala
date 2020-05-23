package typings.gulpIstanbul.mod

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
    if (codeGenerationOptions != null) __obj.updateDynamic("codeGenerationOptions")(codeGenerationOptions.asInstanceOf[js.Any])
    if (coverageVariable != null) __obj.updateDynamic("coverageVariable")(coverageVariable.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(embedSource)) __obj.updateDynamic("embedSource")(embedSource.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUntested)) __obj.updateDynamic("includeUntested")(includeUntested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noAutoWrap)) __obj.updateDynamic("noAutoWrap")(noAutoWrap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noCompact)) __obj.updateDynamic("noCompact")(noCompact.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveComments)) __obj.updateDynamic("preserveComments")(preserveComments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(walkDebug)) __obj.updateDynamic("walkDebug")(walkDebug.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

