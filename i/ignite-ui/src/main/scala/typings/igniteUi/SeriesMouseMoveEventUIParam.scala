package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesMouseMoveEventUIParam extends js.Object {
  /**
    * Used to get item brush.
    */
  var actualItemBrush: js.UndefOr[js.Any] = js.native
  /**
    * Used to get series brush.
    */
  var actualSeriesBrush: js.UndefOr[js.Any] = js.native
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[js.Any] = js.native
  /**
    * Used to get reference to current series item object.
    */
  var item: js.UndefOr[js.Any] = js.native
  /**
    * Used to get mouse X position.
    */
  var positionX: js.UndefOr[js.Any] = js.native
  /**
    * Used to get mouse Y position.
    */
  var positionY: js.UndefOr[js.Any] = js.native
  /**
    * Used to get reference to current series object.
    */
  var series: js.UndefOr[js.Any] = js.native
}

object SeriesMouseMoveEventUIParam {
  @scala.inline
  def apply(): SeriesMouseMoveEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesMouseMoveEventUIParam]
  }
  @scala.inline
  implicit class SeriesMouseMoveEventUIParamOps[Self <: SeriesMouseMoveEventUIParam] (val x: Self) extends AnyVal {
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
    def setActualItemBrush(value: js.Any): Self = this.set("actualItemBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActualItemBrush: Self = this.set("actualItemBrush", js.undefined)
    @scala.inline
    def setActualSeriesBrush(value: js.Any): Self = this.set("actualSeriesBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActualSeriesBrush: Self = this.set("actualSeriesBrush", js.undefined)
    @scala.inline
    def setChart(value: js.Any): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setPositionX(value: js.Any): Self = this.set("positionX", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionX: Self = this.set("positionX", js.undefined)
    @scala.inline
    def setPositionY(value: js.Any): Self = this.set("positionY", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionY: Self = this.set("positionY", js.undefined)
    @scala.inline
    def setSeries(value: js.Any): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
  }
  
}

