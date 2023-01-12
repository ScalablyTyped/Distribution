package typings.highcharts.mod

import typings.highcharts.highchartsStrings.checkboxClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesCheckboxClickEventObject extends StObject {
  
  /**
    * Whether the box has been checked.
    */
  var checked: Boolean
  
  /**
    * Related series.
    */
  var item: Series
  
  /**
    * Related series.
    */
  var target: Series
  
  /**
    * Event type.
    */
  var `type`: checkboxClick
}
object SeriesCheckboxClickEventObject {
  
  inline def apply(checked: Boolean, item: Series, target: Series): SeriesCheckboxClickEventObject = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("checkboxClick")
    __obj.asInstanceOf[SeriesCheckboxClickEventObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesCheckboxClickEventObject] (val x: Self) extends AnyVal {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Series): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Series): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: checkboxClick): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
