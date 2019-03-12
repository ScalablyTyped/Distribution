package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBarOptions extends js.Object {
  var activate: js.UndefOr[js.Function1[/* e */ PanelBarActivateEvent, scala.Unit]] = js.undefined
  var animation: js.UndefOr[scala.Boolean | PanelBarAnimation] = js.undefined
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var collapse: js.UndefOr[js.Function1[/* e */ PanelBarCollapseEvent, scala.Unit]] = js.undefined
  var contentLoad: js.UndefOr[js.Function1[/* e */ PanelBarContentLoadEvent, scala.Unit]] = js.undefined
  var contentUrls: js.UndefOr[js.Any] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ PanelBarDataBoundEvent, scala.Unit]] = js.undefined
  var dataImageUrlField: js.UndefOr[java.lang.String] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.HierarchicalDataSource] = js.undefined
  var dataSpriteCssClassField: js.UndefOr[java.lang.String] = js.undefined
  var dataTextField: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var dataUrlField: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ PanelBarErrorEvent, scala.Unit]] = js.undefined
  var expand: js.UndefOr[js.Function1[/* e */ PanelBarExpandEvent, scala.Unit]] = js.undefined
  var expandMode: js.UndefOr[java.lang.String] = js.undefined
  var loadOnDemand: js.UndefOr[scala.Boolean] = js.undefined
  var messages: js.UndefOr[PanelBarMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ PanelBarSelectEvent, scala.Unit]] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

object PanelBarOptions {
  @scala.inline
  def apply(
    activate: /* e */ PanelBarActivateEvent => scala.Unit = null,
    animation: scala.Boolean | PanelBarAnimation = null,
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    collapse: /* e */ PanelBarCollapseEvent => scala.Unit = null,
    contentLoad: /* e */ PanelBarContentLoadEvent => scala.Unit = null,
    contentUrls: js.Any = null,
    dataBound: /* e */ PanelBarDataBoundEvent => scala.Unit = null,
    dataImageUrlField: java.lang.String = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.HierarchicalDataSource = null,
    dataSpriteCssClassField: java.lang.String = null,
    dataTextField: java.lang.String | js.Any = null,
    dataUrlField: java.lang.String = null,
    error: /* e */ PanelBarErrorEvent => scala.Unit = null,
    expand: /* e */ PanelBarExpandEvent => scala.Unit = null,
    expandMode: java.lang.String = null,
    loadOnDemand: js.UndefOr[scala.Boolean] = js.undefined,
    messages: PanelBarMessages = null,
    name: java.lang.String = null,
    select: /* e */ PanelBarSelectEvent => scala.Unit = null,
    template: java.lang.String | js.Function = null
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

