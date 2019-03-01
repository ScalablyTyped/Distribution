package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiColumnComboBoxColumn extends js.Object {
  var field: js.UndefOr[java.lang.String] = js.undefined
  var headerTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object MultiColumnComboBoxColumn {
  @scala.inline
  def apply(
    field: java.lang.String = null,
    headerTemplate: java.lang.String | js.Function = null,
    template: java.lang.String | js.Function = null,
    title: java.lang.String = null,
    width: scala.Double | java.lang.String = null
  ): MultiColumnComboBoxColumn = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiColumnComboBoxColumn]
  }
}

