package typings
package kendoDashUiLib.kendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateOptions extends js.Object {
  var paramName: js.UndefOr[java.lang.String] = js.undefined
  var useWithBlock: js.UndefOr[scala.Boolean] = js.undefined
}

object TemplateOptions {
  @scala.inline
  def apply(paramName: java.lang.String = null, useWithBlock: js.UndefOr[scala.Boolean] = js.undefined): TemplateOptions = {
    val __obj = js.Dynamic.literal()
    if (paramName != null) __obj.updateDynamic("paramName")(paramName)
    if (!js.isUndefined(useWithBlock)) __obj.updateDynamic("useWithBlock")(useWithBlock)
    __obj.asInstanceOf[TemplateOptions]
  }
}

