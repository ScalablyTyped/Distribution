package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollViewOptions extends js.Object {
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var bounceVelocityThreshold: js.UndefOr[scala.Double] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ ScrollViewChangeEvent, scala.Unit]] = js.undefined
  var contentHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var dataSource: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.DataSource | js.Any] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var emptyTemplate: js.UndefOr[java.lang.String] = js.undefined
  var enablePager: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var refresh: js.UndefOr[js.Function1[/* e */ ScrollViewRefreshEvent, scala.Unit]] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var velocityThreshold: js.UndefOr[scala.Double] = js.undefined
}

object ScrollViewOptions {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    bounceVelocityThreshold: scala.Int | scala.Double = null,
    change: /* e */ ScrollViewChangeEvent => scala.Unit = null,
    contentHeight: scala.Double | java.lang.String = null,
    dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource | js.Any = null,
    duration: scala.Int | scala.Double = null,
    emptyTemplate: java.lang.String = null,
    enablePager: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    refresh: /* e */ ScrollViewRefreshEvent => scala.Unit = null,
    template: java.lang.String = null,
    velocityThreshold: scala.Int | scala.Double = null
  ): ScrollViewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (bounceVelocityThreshold != null) __obj.updateDynamic("bounceVelocityThreshold")(bounceVelocityThreshold.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (contentHeight != null) __obj.updateDynamic("contentHeight")(contentHeight.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (emptyTemplate != null) __obj.updateDynamic("emptyTemplate")(emptyTemplate)
    if (!js.isUndefined(enablePager)) __obj.updateDynamic("enablePager")(enablePager)
    if (name != null) __obj.updateDynamic("name")(name)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(js.Any.fromFunction1(refresh))
    if (template != null) __obj.updateDynamic("template")(template)
    if (velocityThreshold != null) __obj.updateDynamic("velocityThreshold")(velocityThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewOptions]
  }
}

