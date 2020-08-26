package typings.mapsjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataFormat extends js.Object {
  var dataFormat: js.UndefOr[String] = js.native
  var maxAvailableZoomLevel: js.UndefOr[Double] = js.native
  var timeoutMs: js.UndefOr[Double] = js.native
}

object DataFormat {
  @scala.inline
  def apply(): DataFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFormat]
  }
  @scala.inline
  implicit class DataFormatOps[Self <: DataFormat] (val x: Self) extends AnyVal {
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
    def setDataFormat(value: String): Self = this.set("dataFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFormat: Self = this.set("dataFormat", js.undefined)
    @scala.inline
    def setMaxAvailableZoomLevel(value: Double): Self = this.set("maxAvailableZoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAvailableZoomLevel: Self = this.set("maxAvailableZoomLevel", js.undefined)
    @scala.inline
    def setTimeoutMs(value: Double): Self = this.set("timeoutMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutMs: Self = this.set("timeoutMs", js.undefined)
  }
  
}

