package typings.libxslt.mod

import typings.libxslt.internalTypesMod.OutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyOptions extends js.Object {
  var noWrapParams: js.UndefOr[Boolean] = js.undefined
  var outputFormat: js.UndefOr[OutputFormat] = js.undefined
}

object ApplyOptions {
  @scala.inline
  def apply(noWrapParams: js.UndefOr[Boolean] = js.undefined, outputFormat: OutputFormat = null): ApplyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noWrapParams)) __obj.updateDynamic("noWrapParams")(noWrapParams.get.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyOptions]
  }
}

