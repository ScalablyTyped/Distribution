package typings.highcharts.mod

import typings.highcharts.highchartsStrings.afterAnimate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesAfterAnimateEventObject extends js.Object {
  /**
    * Animated series.
    */
  var target: Series = js.native
  /**
    * Event type.
    */
  var `type`: afterAnimate = js.native
}

object SeriesAfterAnimateEventObject {
  @scala.inline
  def apply(target: Series, `type`: afterAnimate): SeriesAfterAnimateEventObject = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesAfterAnimateEventObject]
  }
  @scala.inline
  implicit class SeriesAfterAnimateEventObjectOps[Self <: SeriesAfterAnimateEventObject] (val x: Self) extends AnyVal {
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
    def setTarget(value: Series): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: afterAnimate): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

