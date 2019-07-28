package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import typings.kendoDashUi.kendoNs.dataNs.HierarchicalDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeMapOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var colorField: js.UndefOr[String] = js.undefined
  var colors: js.UndefOr[js.Any] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ TreeMapDataBoundEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | HierarchicalDataSource] = js.undefined
  var itemCreated: js.UndefOr[js.Function1[/* e */ TreeMapItemCreatedEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var textField: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var valueField: js.UndefOr[String] = js.undefined
}

object TreeMapOptions {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[Boolean] = js.undefined,
    colorField: String = null,
    colors: js.Any = null,
    dataBound: /* e */ TreeMapDataBoundEvent => Unit = null,
    dataSource: js.Any | HierarchicalDataSource = null,
    itemCreated: /* e */ TreeMapItemCreatedEvent => Unit = null,
    name: String = null,
    template: String | js.Function = null,
    textField: String = null,
    theme: String = null,
    `type`: String = null,
    valueField: String = null
  ): TreeMapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (colorField != null) __obj.updateDynamic("colorField")(colorField)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (itemCreated != null) __obj.updateDynamic("itemCreated")(js.Any.fromFunction1(itemCreated))
    if (name != null) __obj.updateDynamic("name")(name)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (textField != null) __obj.updateDynamic("textField")(textField)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (valueField != null) __obj.updateDynamic("valueField")(valueField)
    __obj.asInstanceOf[TreeMapOptions]
  }
}

