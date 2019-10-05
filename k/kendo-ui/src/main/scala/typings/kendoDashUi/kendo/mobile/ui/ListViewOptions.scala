package typings.kendoDashUi.kendo.mobile.ui

import typings.kendoDashUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewOptions extends js.Object {
  var appendOnRefresh: js.UndefOr[Boolean] = js.undefined
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var click: js.UndefOr[js.Function1[/* e */ ListViewClickEvent, Unit]] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[DataSource | js.Any] = js.undefined
  var endlessScroll: js.UndefOr[Boolean] = js.undefined
  var filterable: js.UndefOr[Boolean | ListViewFilterable] = js.undefined
  var fixedHeaders: js.UndefOr[Boolean] = js.undefined
  var headerTemplate: js.UndefOr[String | js.Function] = js.undefined
  var itemChange: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.undefined
  var loadMore: js.UndefOr[Boolean] = js.undefined
  var messages: js.UndefOr[ListViewMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pullParameters: js.UndefOr[js.Function] = js.undefined
  var pullToRefresh: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var virtualViewSize: js.UndefOr[Double] = js.undefined
}

object ListViewOptions {
  @scala.inline
  def apply(
    appendOnRefresh: js.UndefOr[Boolean] = js.undefined,
    autoBind: js.UndefOr[Boolean] = js.undefined,
    click: /* e */ ListViewClickEvent => Unit = null,
    dataBinding: /* e */ ListViewEvent => Unit = null,
    dataBound: /* e */ ListViewEvent => Unit = null,
    dataSource: DataSource | js.Any = null,
    endlessScroll: js.UndefOr[Boolean] = js.undefined,
    filterable: Boolean | ListViewFilterable = null,
    fixedHeaders: js.UndefOr[Boolean] = js.undefined,
    headerTemplate: String | js.Function = null,
    itemChange: /* e */ ListViewEvent => Unit = null,
    loadMore: js.UndefOr[Boolean] = js.undefined,
    messages: ListViewMessages = null,
    name: String = null,
    pullParameters: js.Function = null,
    pullToRefresh: js.UndefOr[Boolean] = js.undefined,
    style: String = null,
    template: String | js.Function = null,
    `type`: String = null,
    virtualViewSize: Int | Double = null
  ): ListViewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appendOnRefresh)) __obj.updateDynamic("appendOnRefresh")(appendOnRefresh)
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction1(dataBinding))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(endlessScroll)) __obj.updateDynamic("endlessScroll")(endlessScroll)
    if (filterable != null) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeaders)) __obj.updateDynamic("fixedHeaders")(fixedHeaders)
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (itemChange != null) __obj.updateDynamic("itemChange")(js.Any.fromFunction1(itemChange))
    if (!js.isUndefined(loadMore)) __obj.updateDynamic("loadMore")(loadMore)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pullParameters != null) __obj.updateDynamic("pullParameters")(pullParameters)
    if (!js.isUndefined(pullToRefresh)) __obj.updateDynamic("pullToRefresh")(pullToRefresh)
    if (style != null) __obj.updateDynamic("style")(style)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (virtualViewSize != null) __obj.updateDynamic("virtualViewSize")(virtualViewSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewOptions]
  }
}

