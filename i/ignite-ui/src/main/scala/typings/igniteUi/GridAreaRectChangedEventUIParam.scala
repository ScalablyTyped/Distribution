package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridAreaRectChangedEventUIParam extends js.Object {
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[js.Any] = js.native
  /**
    * Used to get new height value.
    */
  var newHeight: js.UndefOr[js.Any] = js.native
  /**
    * Used to get new left value.
    */
  var newLeft: js.UndefOr[js.Any] = js.native
  /**
    * Used to get new top value.
    */
  var newTop: js.UndefOr[js.Any] = js.native
  /**
    * Used to get new top value.
    */
  var newWidth: js.UndefOr[js.Any] = js.native
  /**
    * Used to get old height value.
    */
  var oldHeight: js.UndefOr[js.Any] = js.native
  /**
    * Used to get old left value.
    */
  var oldLeft: js.UndefOr[js.Any] = js.native
  /**
    * Used to get old top value.
    */
  var oldTop: js.UndefOr[js.Any] = js.native
  /**
    * Used to get old top value.
    */
  var oldWidth: js.UndefOr[js.Any] = js.native
}

object GridAreaRectChangedEventUIParam {
  @scala.inline
  def apply(): GridAreaRectChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAreaRectChangedEventUIParam]
  }
  @scala.inline
  implicit class GridAreaRectChangedEventUIParamOps[Self <: GridAreaRectChangedEventUIParam] (val x: Self) extends AnyVal {
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
    def setChart(value: js.Any): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
    @scala.inline
    def setNewHeight(value: js.Any): Self = this.set("newHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewHeight: Self = this.set("newHeight", js.undefined)
    @scala.inline
    def setNewLeft(value: js.Any): Self = this.set("newLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewLeft: Self = this.set("newLeft", js.undefined)
    @scala.inline
    def setNewTop(value: js.Any): Self = this.set("newTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewTop: Self = this.set("newTop", js.undefined)
    @scala.inline
    def setNewWidth(value: js.Any): Self = this.set("newWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewWidth: Self = this.set("newWidth", js.undefined)
    @scala.inline
    def setOldHeight(value: js.Any): Self = this.set("oldHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldHeight: Self = this.set("oldHeight", js.undefined)
    @scala.inline
    def setOldLeft(value: js.Any): Self = this.set("oldLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldLeft: Self = this.set("oldLeft", js.undefined)
    @scala.inline
    def setOldTop(value: js.Any): Self = this.set("oldTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldTop: Self = this.set("oldTop", js.undefined)
    @scala.inline
    def setOldWidth(value: js.Any): Self = this.set("oldWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldWidth: Self = this.set("oldWidth", js.undefined)
  }
  
}

