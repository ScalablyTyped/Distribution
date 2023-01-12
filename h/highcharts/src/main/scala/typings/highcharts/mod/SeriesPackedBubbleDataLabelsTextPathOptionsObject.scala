package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesPackedBubbleDataLabelsTextPathOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable `textPath`
    * option for link's or marker's data labels.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object SeriesPackedBubbleDataLabelsTextPathOptionsObject {
  
  inline def apply(): SeriesPackedBubbleDataLabelsTextPathOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesPackedBubbleDataLabelsTextPathOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesPackedBubbleDataLabelsTextPathOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
