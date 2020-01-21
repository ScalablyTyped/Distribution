package typings.marko.configMod

import typings.marko.markoStrings.html
import typings.marko.markoStrings.vdom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var assumeUpToDate: js.UndefOr[Boolean] = js.undefined
  var autoKeyEnabled: js.UndefOr[Boolean] = js.undefined
  var checkUpToDate: js.UndefOr[Boolean] = js.undefined
  var escapeAtTags: js.UndefOr[Boolean] = js.undefined
  var ignoreUnrecognizedTags: js.UndefOr[Boolean] = js.undefined
  var output: js.UndefOr[vdom | html] = js.undefined
  var preserveWhitespace: js.UndefOr[Boolean] = js.undefined
  var writeToDisk: js.UndefOr[Boolean] = js.undefined
  var writeVersionComment: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    assumeUpToDate: js.UndefOr[Boolean] = js.undefined,
    autoKeyEnabled: js.UndefOr[Boolean] = js.undefined,
    checkUpToDate: js.UndefOr[Boolean] = js.undefined,
    escapeAtTags: js.UndefOr[Boolean] = js.undefined,
    ignoreUnrecognizedTags: js.UndefOr[Boolean] = js.undefined,
    output: vdom | html = null,
    preserveWhitespace: js.UndefOr[Boolean] = js.undefined,
    writeToDisk: js.UndefOr[Boolean] = js.undefined,
    writeVersionComment: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assumeUpToDate)) __obj.updateDynamic("assumeUpToDate")(assumeUpToDate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoKeyEnabled)) __obj.updateDynamic("autoKeyEnabled")(autoKeyEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(checkUpToDate)) __obj.updateDynamic("checkUpToDate")(checkUpToDate.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeAtTags)) __obj.updateDynamic("escapeAtTags")(escapeAtTags.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnrecognizedTags)) __obj.updateDynamic("ignoreUnrecognizedTags")(ignoreUnrecognizedTags.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace.asInstanceOf[js.Any])
    if (!js.isUndefined(writeToDisk)) __obj.updateDynamic("writeToDisk")(writeToDisk.asInstanceOf[js.Any])
    if (!js.isUndefined(writeVersionComment)) __obj.updateDynamic("writeVersionComment")(writeVersionComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

