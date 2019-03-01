package typings
package markoLib.srcCompilerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var assumeUpToDate: js.UndefOr[scala.Boolean] = js.undefined
  var autoKeyEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var checkUpToDate: js.UndefOr[scala.Boolean] = js.undefined
  var escapeAtTags: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreUnrecognizedTags: js.UndefOr[scala.Boolean] = js.undefined
  var output: js.UndefOr[markoLib.markoLibStrings.vdom | markoLib.markoLibStrings.html] = js.undefined
  var preserveWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  var writeToDisk: js.UndefOr[scala.Boolean] = js.undefined
  var writeVersionComment: js.UndefOr[scala.Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    assumeUpToDate: js.UndefOr[scala.Boolean] = js.undefined,
    autoKeyEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    checkUpToDate: js.UndefOr[scala.Boolean] = js.undefined,
    escapeAtTags: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreUnrecognizedTags: js.UndefOr[scala.Boolean] = js.undefined,
    output: markoLib.markoLibStrings.vdom | markoLib.markoLibStrings.html = null,
    preserveWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    writeToDisk: js.UndefOr[scala.Boolean] = js.undefined,
    writeVersionComment: js.UndefOr[scala.Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assumeUpToDate)) __obj.updateDynamic("assumeUpToDate")(assumeUpToDate)
    if (!js.isUndefined(autoKeyEnabled)) __obj.updateDynamic("autoKeyEnabled")(autoKeyEnabled)
    if (!js.isUndefined(checkUpToDate)) __obj.updateDynamic("checkUpToDate")(checkUpToDate)
    if (!js.isUndefined(escapeAtTags)) __obj.updateDynamic("escapeAtTags")(escapeAtTags)
    if (!js.isUndefined(ignoreUnrecognizedTags)) __obj.updateDynamic("ignoreUnrecognizedTags")(ignoreUnrecognizedTags)
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace)
    if (!js.isUndefined(writeToDisk)) __obj.updateDynamic("writeToDisk")(writeToDisk)
    if (!js.isUndefined(writeVersionComment)) __obj.updateDynamic("writeVersionComment")(writeVersionComment)
    __obj.asInstanceOf[Config]
  }
}

