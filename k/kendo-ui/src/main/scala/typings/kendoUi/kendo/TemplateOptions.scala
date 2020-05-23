package typings.kendoUi.kendo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateOptions extends js.Object {
  var paramName: js.UndefOr[String] = js.undefined
  var useWithBlock: js.UndefOr[Boolean] = js.undefined
}

object TemplateOptions {
  @scala.inline
  def apply(paramName: String = null, useWithBlock: js.UndefOr[Boolean] = js.undefined): TemplateOptions = {
    val __obj = js.Dynamic.literal()
    if (paramName != null) __obj.updateDynamic("paramName")(paramName.asInstanceOf[js.Any])
    if (!js.isUndefined(useWithBlock)) __obj.updateDynamic("useWithBlock")(useWithBlock.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateOptions]
  }
}

