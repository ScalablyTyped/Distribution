package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListExcel extends js.Object {
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var filterable: js.UndefOr[scala.Boolean] = js.undefined
  var forceProxy: js.UndefOr[scala.Boolean] = js.undefined
  var proxyURL: js.UndefOr[java.lang.String] = js.undefined
}

object TreeListExcel {
  @scala.inline
  def apply(
    fileName: java.lang.String = null,
    filterable: js.UndefOr[scala.Boolean] = js.undefined,
    forceProxy: js.UndefOr[scala.Boolean] = js.undefined,
    proxyURL: java.lang.String = null
  ): TreeListExcel = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable)
    if (!js.isUndefined(forceProxy)) __obj.updateDynamic("forceProxy")(forceProxy)
    if (proxyURL != null) __obj.updateDynamic("proxyURL")(proxyURL)
    __obj.asInstanceOf[TreeListExcel]
  }
}

