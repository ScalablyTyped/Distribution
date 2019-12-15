package typings.javascriptDashObfuscator.espreeMod

import typings.javascriptDashObfuscator.Anon_GlobalReturn
import typings.javascriptDashObfuscator.javascriptDashObfuscatorNumbers.`10`
import typings.javascriptDashObfuscator.javascriptDashObfuscatorNumbers.`2015`
import typings.javascriptDashObfuscator.javascriptDashObfuscatorNumbers.`2016`
import typings.javascriptDashObfuscator.javascriptDashObfuscatorNumbers.`2017`
import typings.javascriptDashObfuscator.javascriptDashObfuscatorNumbers.`2018`
import typings.javascriptDashObfuscator.javascriptDashObfuscatorNumbers.`2019`
import typings.javascriptDashObfuscator.javascriptDashObfuscatorNumbers.`3`
import typings.javascriptDashObfuscator.javascriptDashObfuscatorNumbers.`5`
import typings.javascriptDashObfuscator.javascriptDashObfuscatorNumbers.`6`
import typings.javascriptDashObfuscator.javascriptDashObfuscatorNumbers.`7`
import typings.javascriptDashObfuscator.javascriptDashObfuscatorNumbers.`8`
import typings.javascriptDashObfuscator.javascriptDashObfuscatorNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var comment: js.UndefOr[Boolean] = js.undefined
  var ecmaFeatures: js.UndefOr[Anon_GlobalReturn] = js.undefined
  var ecmaVersion: js.UndefOr[
    `3` | `5` | `6` | `7` | `8` | `9` | `10` | `2015` | `2016` | `2017` | `2018` | `2019`
  ] = js.undefined
  var loc: js.UndefOr[Boolean] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
  var sourceType: js.UndefOr[SourceType] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    comment: js.UndefOr[Boolean] = js.undefined,
    ecmaFeatures: Anon_GlobalReturn = null,
    ecmaVersion: `3` | `5` | `6` | `7` | `8` | `9` | `10` | `2015` | `2016` | `2017` | `2018` | `2019` = null,
    loc: js.UndefOr[Boolean] = js.undefined,
    range: js.UndefOr[Boolean] = js.undefined,
    sourceType: SourceType = null
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(comment)) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (ecmaFeatures != null) __obj.updateDynamic("ecmaFeatures")(ecmaFeatures.asInstanceOf[js.Any])
    if (ecmaVersion != null) __obj.updateDynamic("ecmaVersion")(ecmaVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

