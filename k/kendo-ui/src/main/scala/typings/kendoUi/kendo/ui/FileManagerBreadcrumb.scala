package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerBreadcrumb extends js.Object {
  var delimiterIcon: js.UndefOr[String] = js.undefined
  var rootIcon: js.UndefOr[String] = js.undefined
}

object FileManagerBreadcrumb {
  @scala.inline
  def apply(delimiterIcon: String = null, rootIcon: String = null): FileManagerBreadcrumb = {
    val __obj = js.Dynamic.literal()
    if (delimiterIcon != null) __obj.updateDynamic("delimiterIcon")(delimiterIcon.asInstanceOf[js.Any])
    if (rootIcon != null) __obj.updateDynamic("rootIcon")(rootIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerBreadcrumb]
  }
}

