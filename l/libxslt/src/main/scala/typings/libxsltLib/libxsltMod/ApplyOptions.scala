package typings
package libxsltLib.libxsltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyOptions extends js.Object {
  var noWrapParams: js.UndefOr[scala.Boolean] = js.undefined
  var outputFormat: js.UndefOr[libxsltLib.internalDashTypesMod.OutputFormat] = js.undefined
}

object ApplyOptions {
  @scala.inline
  def apply(
    noWrapParams: js.UndefOr[scala.Boolean] = js.undefined,
    outputFormat: libxsltLib.internalDashTypesMod.OutputFormat = null
  ): ApplyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noWrapParams)) __obj.updateDynamic("noWrapParams")(noWrapParams)
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat)
    __obj.asInstanceOf[ApplyOptions]
  }
}

