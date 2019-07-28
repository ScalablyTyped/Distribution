package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.kendoNs.dataNs.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStripOptions extends js.Object {
  var activate: js.UndefOr[js.Function1[/* e */ TabStripActivateEvent, Unit]] = js.undefined
  var animation: js.UndefOr[Boolean | TabStripAnimation] = js.undefined
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var contentLoad: js.UndefOr[js.Function1[/* e */ TabStripContentLoadEvent, Unit]] = js.undefined
  var contentUrls: js.UndefOr[js.Any] = js.undefined
  var dataContentField: js.UndefOr[String] = js.undefined
  var dataContentUrlField: js.UndefOr[String] = js.undefined
  var dataImageUrlField: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var dataSpriteCssClass: js.UndefOr[String] = js.undefined
  var dataTextField: js.UndefOr[String] = js.undefined
  var dataUrlField: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ TabStripErrorEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var navigatable: js.UndefOr[Boolean] = js.undefined
  var scrollable: js.UndefOr[Boolean | TabStripScrollable] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ TabStripSelectEvent, Unit]] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ TabStripShowEvent, Unit]] = js.undefined
  var tabPosition: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TabStripOptions {
  @scala.inline
  def apply(
    activate: /* e */ TabStripActivateEvent => Unit = null,
    animation: Boolean | TabStripAnimation = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    contentLoad: /* e */ TabStripContentLoadEvent => Unit = null,
    contentUrls: js.Any = null,
    dataContentField: String = null,
    dataContentUrlField: String = null,
    dataImageUrlField: String = null,
    dataSource: js.Any | DataSource = null,
    dataSpriteCssClass: String = null,
    dataTextField: String = null,
    dataUrlField: String = null,
    error: /* e */ TabStripErrorEvent => Unit = null,
    name: String = null,
    navigatable: js.UndefOr[Boolean] = js.undefined,
    scrollable: Boolean | TabStripScrollable = null,
    select: /* e */ TabStripSelectEvent => Unit = null,
    show: /* e */ TabStripShowEvent => Unit = null,
    tabPosition: String = null,
    value: String = null
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

