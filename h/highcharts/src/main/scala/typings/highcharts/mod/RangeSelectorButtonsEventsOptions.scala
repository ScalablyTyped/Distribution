package typings.highcharts.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeSelectorButtonsEventsOptions extends js.Object {
  
  /**
    * (Highstock, Gantt) Fires when clicking on the rangeSelector button. One
    * parameter, event, is passed to the function, containing common event
    * information. (see online documentation for example)
    *
    * Return false to stop default button's click action.
    */
  var click: js.UndefOr[RangeSelectorClickCallbackFunction] = js.native
}
object RangeSelectorButtonsEventsOptions {
  
  @scala.inline
  def apply(): RangeSelectorButtonsEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSelectorButtonsEventsOptions]
  }
  
  @scala.inline
  implicit class RangeSelectorButtonsEventsOptionsOps[Self <: RangeSelectorButtonsEventsOptions] (val x: Self) extends AnyVal {
    
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
    def setClick(value: (/* e */ Event, /* Return */ js.UndefOr[Boolean]) => Unit): Self = this.set("click", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
  }
}
