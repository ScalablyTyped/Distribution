package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeSelectorButtonPositionOptions extends StObject {
  
  /**
    * (Highstock, Gantt) The alignment of the input box. Allowed properties are
    * `left`, `center`, `right`.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  
  /**
    * (Highstock, Gantt) X offset of the button row.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) Y offset of the button row.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object RangeSelectorButtonPositionOptions {
  
  inline def apply(): RangeSelectorButtonPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSelectorButtonPositionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeSelectorButtonPositionOptions] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
