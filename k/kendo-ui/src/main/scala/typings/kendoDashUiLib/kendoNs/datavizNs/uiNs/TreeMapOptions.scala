package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeMapOptions extends js.Object {
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var colorField: js.UndefOr[java.lang.String] = js.undefined
  var colors: js.UndefOr[js.Any] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ TreeMapDataBoundEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.HierarchicalDataSource] = js.undefined
  var itemCreated: js.UndefOr[js.Function1[/* e */ TreeMapItemCreatedEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var textField: js.UndefOr[java.lang.String] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var valueField: js.UndefOr[java.lang.String] = js.undefined
}

object TreeMapOptions {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    colorField: java.lang.String = null,
    colors: js.Any = null,
    dataBound: js.Function1[/* e */ TreeMapDataBoundEvent, scala.Unit] = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.HierarchicalDataSource = null,
    itemCreated: js.Function1[/* e */ TreeMapItemCreatedEvent, scala.Unit] = null,
    name: java.lang.String = null,
    template: java.lang.String | js.Function = null,
    textField: java.lang.String = null,
    theme: java.lang.String = null,
    `type`: java.lang.String = null,
    valueField: java.lang.String = null
  ): TreeMapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (colorField != null) __obj.updateDynamic("colorField")(colorField)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (itemCreated != null) __obj.updateDynamic("itemCreated")(itemCreated)
    if (name != null) __obj.updateDynamic("name")(name)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (textField != null) __obj.updateDynamic("textField")(textField)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (valueField != null) __obj.updateDynamic("valueField")(valueField)
    __obj.asInstanceOf[TreeMapOptions]
  }
}

