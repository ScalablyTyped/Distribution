package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollViewOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.native
  var bounceVelocityThreshold: js.UndefOr[Double] = js.native
  var change: js.UndefOr[js.Function1[/* e */ ScrollViewChangeEvent, Unit]] = js.native
  var contentHeight: js.UndefOr[Double | String] = js.native
  var dataSource: js.UndefOr[DataSource | js.Any] = js.native
  var duration: js.UndefOr[Double] = js.native
  var emptyTemplate: js.UndefOr[String] = js.native
  var enablePager: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var page: js.UndefOr[Double] = js.native
  var refresh: js.UndefOr[js.Function1[/* e */ ScrollViewRefreshEvent, Unit]] = js.native
  var template: js.UndefOr[String] = js.native
  var velocityThreshold: js.UndefOr[Double] = js.native
}

object ScrollViewOptions {
  @scala.inline
  def apply(): ScrollViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollViewOptions]
  }
  @scala.inline
  implicit class ScrollViewOptionsOps[Self <: ScrollViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    @scala.inline
    def setBounceVelocityThreshold(value: Double): Self = this.set("bounceVelocityThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounceVelocityThreshold: Self = this.set("bounceVelocityThreshold", js.undefined)
    @scala.inline
    def setChange(value: /* e */ ScrollViewChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setContentHeight(value: Double | String): Self = this.set("contentHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentHeight: Self = this.set("contentHeight", js.undefined)
    @scala.inline
    def setDataSource(value: DataSource | js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEmptyTemplate(value: String): Self = this.set("emptyTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyTemplate: Self = this.set("emptyTemplate", js.undefined)
    @scala.inline
    def setEnablePager(value: Boolean): Self = this.set("enablePager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePager: Self = this.set("enablePager", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setRefresh(value: /* e */ ScrollViewRefreshEvent => Unit): Self = this.set("refresh", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setVelocityThreshold(value: Double): Self = this.set("velocityThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVelocityThreshold: Self = this.set("velocityThreshold", js.undefined)
  }
  
}

