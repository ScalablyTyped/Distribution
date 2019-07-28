package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.kendoNs.dataNs.HierarchicalDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBarOptions extends js.Object {
  var activate: js.UndefOr[js.Function1[/* e */ PanelBarActivateEvent, Unit]] = js.undefined
  var animation: js.UndefOr[Boolean | PanelBarAnimation] = js.undefined
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var collapse: js.UndefOr[js.Function1[/* e */ PanelBarCollapseEvent, Unit]] = js.undefined
  var contentLoad: js.UndefOr[js.Function1[/* e */ PanelBarContentLoadEvent, Unit]] = js.undefined
  var contentUrls: js.UndefOr[js.Any] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ PanelBarDataBoundEvent, Unit]] = js.undefined
  var dataImageUrlField: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Any | HierarchicalDataSource] = js.undefined
  var dataSpriteCssClassField: js.UndefOr[String] = js.undefined
  var dataTextField: js.UndefOr[String | js.Any] = js.undefined
  var dataUrlField: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ PanelBarErrorEvent, Unit]] = js.undefined
  var expand: js.UndefOr[js.Function1[/* e */ PanelBarExpandEvent, Unit]] = js.undefined
  var expandMode: js.UndefOr[String] = js.undefined
  var loadOnDemand: js.UndefOr[Boolean] = js.undefined
  var messages: js.UndefOr[PanelBarMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ PanelBarSelectEvent, Unit]] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
}

object PanelBarOptions {
  @scala.inline
  def apply(
    activate: /* e */ PanelBarActivateEvent => Unit = null,
    animation: Boolean | PanelBarAnimation = null,
    autoBind: js.UndefOr[Boolean] = js.undefined,
    collapse: /* e */ PanelBarCollapseEvent => Unit = null,
    contentLoad: /* e */ PanelBarContentLoadEvent => Unit = null,
    contentUrls: js.Any = null,
    dataBound: /* e */ PanelBarDataBoundEvent => Unit = null,
    dataImageUrlField: String = null,
    dataSource: js.Any | HierarchicalDataSource = null,
    dataSpriteCssClassField: String = null,
    dataTextField: String | js.Any = null,
    dataUrlField: String = null,
    error: /* e */ PanelBarErrorEvent => Unit = null,
    expand: /* e */ PanelBarExpandEvent => Unit = null,
    expandMode: String = null,
    loadOnDemand: js.UndefOr[Boolean] = js.undefined,
    messages: PanelBarMessages = null,
    name: String = null,
    select: /* e */ PanelBarSelectEvent => Unit = null,
    template: String | js.Function = null
  ): PanelBarOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction1(activate))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction1(collapse))
    if (contentLoad != null) __obj.updateDynamic("contentLoad")(js.Any.fromFunction1(contentLoad))
    if (contentUrls != null) __obj.updateDynamic("contentUrls")(contentUrls)
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataImageUrlField != null) __obj.updateDynamic("dataImageUrlField")(dataImageUrlField)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSpriteCssClassField != null) __obj.updateDynamic("dataSpriteCssClassField")(dataSpriteCssClassField)
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField.asInstanceOf[js.Any])
    if (dataUrlField != null) __obj.updateDynamic("dataUrlField")(dataUrlField)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction1(expand))
    if (expandMode != null) __obj.updateDynamic("expandMode")(expandMode)
    if (!js.isUndefined(loadOnDemand)) __obj.updateDynamic("loadOnDemand")(loadOnDemand)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelBarOptions]
  }
}

