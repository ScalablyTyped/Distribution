package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollViewOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var bounceVelocityThreshold: js.UndefOr[Double] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ ScrollViewChangeEvent, Unit]] = js.undefined
  var contentHeight: js.UndefOr[Double | String] = js.undefined
  var dataSource: js.UndefOr[DataSource | js.Any] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var emptyTemplate: js.UndefOr[String] = js.undefined
  var enablePager: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var refresh: js.UndefOr[js.Function1[/* e */ ScrollViewRefreshEvent, Unit]] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var velocityThreshold: js.UndefOr[Double] = js.undefined
}

object ScrollViewOptions {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[Boolean] = js.undefined,
    bounceVelocityThreshold: js.UndefOr[Double] = js.undefined,
    change: /* e */ ScrollViewChangeEvent => Unit = null,
    contentHeight: Double | String = null,
    dataSource: DataSource | js.Any = null,
    duration: js.UndefOr[Double] = js.undefined,
    emptyTemplate: String = null,
    enablePager: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    page: js.UndefOr[Double] = js.undefined,
    refresh: /* e */ ScrollViewRefreshEvent => Unit = null,
    template: String = null,
    velocityThreshold: js.UndefOr[Double] = js.undefined
  ): ScrollViewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceVelocityThreshold)) __obj.updateDynamic("bounceVelocityThreshold")(bounceVelocityThreshold.get.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (contentHeight != null) __obj.updateDynamic("contentHeight")(contentHeight.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (emptyTemplate != null) __obj.updateDynamic("emptyTemplate")(emptyTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePager)) __obj.updateDynamic("enablePager")(enablePager.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(js.Any.fromFunction1(refresh))
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(velocityThreshold)) __obj.updateDynamic("velocityThreshold")(velocityThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewOptions]
  }
}

