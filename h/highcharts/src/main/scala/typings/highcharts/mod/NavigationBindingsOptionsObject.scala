package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationBindingsOptionsObject extends js.Object {
  /**
    * ClassName of the element for a binding.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Last event to be fired after last step event.
    */
  var end: js.UndefOr[js.Function] = js.native
  /**
    * Initial event, fired on a button click.
    */
  var init: js.UndefOr[js.Function] = js.native
  /**
    * Event fired on first click on a chart.
    */
  var start: js.UndefOr[js.Function] = js.native
  /**
    * Last event to be fired after last step event. Array of step events to be
    * called sequentially after each user click.
    */
  var steps: js.UndefOr[js.Array[js.Function]] = js.native
}

object NavigationBindingsOptionsObject {
  @scala.inline
  def apply(): NavigationBindingsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBindingsOptionsObject]
  }
  @scala.inline
  implicit class NavigationBindingsOptionsObjectOps[Self <: NavigationBindingsOptionsObject] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setEnd(value: js.Function): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setInit(value: js.Function): Self = this.set("init", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setStart(value: js.Function): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStepsVarargs(value: js.Function*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[js.Function]): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
  }
  
}

