package typings.highcharts.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeSelectorButtonsEventsOptions extends StObject {
  
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
  implicit class RangeSelectorButtonsEventsOptionsMutableBuilder[Self <: RangeSelectorButtonsEventsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: (/* e */ Event, /* Return */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "click", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
  }
}
