package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadarOptions extends js.Object {
  /**
    * compute frames for the next n seconds
    * @default 20
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * maximum number of vehicles
    * @default 256
    */
  var results: js.UndefOr[Double] = js.native
}

object RadarOptions {
  @scala.inline
  def apply(): RadarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadarOptions]
  }
  @scala.inline
  implicit class RadarOptionsOps[Self <: RadarOptions] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
  
}

