package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsPitchforkControlPointOptions extends js.Object {
  var events: js.UndefOr[js.Any] = js.native
}

object AnnotationsPitchforkControlPointOptions {
  @scala.inline
  def apply(): AnnotationsPitchforkControlPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsPitchforkControlPointOptions]
  }
  @scala.inline
  implicit class AnnotationsPitchforkControlPointOptionsOps[Self <: AnnotationsPitchforkControlPointOptions] (val x: Self) extends AnyVal {
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
    def setEvents(value: js.Any): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
  }
  
}

