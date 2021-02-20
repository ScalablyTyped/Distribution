package typings.highcharts.mod

import typings.highcharts.highchartsStrings.legendItemClick
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesLegendItemClickEventObject extends StObject {
  
  /**
    * Related browser event.
    */
  var browserEvent: PointerEvent = js.native
  
  /**
    * Prevent the default action of toggle the visibility of the series.
    */
  var preventDefault: js.Function = js.native
  
  /**
    * Related series.
    */
  var target: Series = js.native
  
  /**
    * Event type.
    */
  var `type`: legendItemClick = js.native
}
object SeriesLegendItemClickEventObject {
  
  @scala.inline
  def apply(browserEvent: PointerEvent, preventDefault: js.Function, target: Series, `type`: legendItemClick): SeriesLegendItemClickEventObject = {
    val __obj = js.Dynamic.literal(browserEvent = browserEvent.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesLegendItemClickEventObject]
  }
  
  @scala.inline
  implicit class SeriesLegendItemClickEventObjectMutableBuilder[Self <: SeriesLegendItemClickEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowserEvent(value: PointerEvent): Self = StObject.set(x, "browserEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Series): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: legendItemClick): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
