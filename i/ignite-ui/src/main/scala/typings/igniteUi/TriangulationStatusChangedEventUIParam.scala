package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriangulationStatusChangedEventUIParam extends js.Object {
  /**
    * Used to get current status.
    */
  var currentStatus: js.UndefOr[js.Any] = js.native
  /**
    * Used to get reference to map object.
    */
  var map: js.UndefOr[js.Any] = js.native
  /**
    * Used to get reference to current series object.
    */
  var series: js.UndefOr[js.Any] = js.native
}

object TriangulationStatusChangedEventUIParam {
  @scala.inline
  def apply(): TriangulationStatusChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriangulationStatusChangedEventUIParam]
  }
  @scala.inline
  implicit class TriangulationStatusChangedEventUIParamOps[Self <: TriangulationStatusChangedEventUIParam] (val x: Self) extends AnyVal {
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
    def setCurrentStatus(value: js.Any): Self = this.set("currentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentStatus: Self = this.set("currentStatus", js.undefined)
    @scala.inline
    def setMap(value: js.Any): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setSeries(value: js.Any): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
  }
  
}

