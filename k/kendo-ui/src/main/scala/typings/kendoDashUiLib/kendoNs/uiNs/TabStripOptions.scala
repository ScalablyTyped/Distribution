package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStripOptions extends js.Object {
  var activate: js.UndefOr[js.Function1[/* e */ TabStripActivateEvent, scala.Unit]] = js.undefined
  var animation: js.UndefOr[scala.Boolean | TabStripAnimation] = js.undefined
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  var contentLoad: js.UndefOr[js.Function1[/* e */ TabStripContentLoadEvent, scala.Unit]] = js.undefined
  var contentUrls: js.UndefOr[js.Any] = js.undefined
  var dataContentField: js.UndefOr[java.lang.String] = js.undefined
  var dataContentUrlField: js.UndefOr[java.lang.String] = js.undefined
  var dataImageUrlField: js.UndefOr[java.lang.String] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var dataSpriteCssClass: js.UndefOr[java.lang.String] = js.undefined
  var dataTextField: js.UndefOr[java.lang.String] = js.undefined
  var dataUrlField: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ TabStripErrorEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var navigatable: js.UndefOr[scala.Boolean] = js.undefined
  var scrollable: js.UndefOr[scala.Boolean | TabStripScrollable] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ TabStripSelectEvent, scala.Unit]] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ TabStripShowEvent, scala.Unit]] = js.undefined
  var tabPosition: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object TabStripOptions {
  @scala.inline
  def apply(
    activate: /* e */ TabStripActivateEvent => scala.Unit = null,
    animation: scala.Boolean | TabStripAnimation = null,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    contentLoad: /* e */ TabStripContentLoadEvent => scala.Unit = null,
    contentUrls: js.Any = null,
    dataContentField: java.lang.String = null,
    dataContentUrlField: java.lang.String = null,
    dataImageUrlField: java.lang.String = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource = null,
    dataSpriteCssClass: java.lang.String = null,
    dataTextField: java.lang.String = null,
    dataUrlField: java.lang.String = null,
    error: /* e */ TabStripErrorEvent => scala.Unit = null,
    name: java.lang.String = null,
    navigatable: js.UndefOr[scala.Boolean] = js.undefined,
    scrollable: scala.Boolean | TabStripScrollable = null,
    select: /* e */ TabStripSelectEvent => scala.Unit = null,
    show: /* e */ TabStripShowEvent => scala.Unit = null,
    tabPosition: java.lang.String = null,
    value: java.lang.String = null
  ): TabStripOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction1(activate))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (contentLoad != null) __obj.updateDynamic("contentLoad")(js.Any.fromFunction1(contentLoad))
    if (contentUrls != null) __obj.updateDynamic("contentUrls")(contentUrls)
    if (dataContentField != null) __obj.updateDynamic("dataContentField")(dataContentField)
    if (dataContentUrlField != null) __obj.updateDynamic("dataContentUrlField")(dataContentUrlField)
    if (dataImageUrlField != null) __obj.updateDynamic("dataImageUrlField")(dataImageUrlField)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSpriteCssClass != null) __obj.updateDynamic("dataSpriteCssClass")(dataSpriteCssClass)
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField)
    if (dataUrlField != null) __obj.updateDynamic("dataUrlField")(dataUrlField)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(navigatable)) __obj.updateDynamic("navigatable")(navigatable)
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    if (tabPosition != null) __obj.updateDynamic("tabPosition")(tabPosition)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TabStripOptions]
  }
}

