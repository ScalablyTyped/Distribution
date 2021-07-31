package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeSelectorInputPositionOptions extends StObject {
  
  /**
    * (Highstock, Gantt) The alignment of the input box. Allowed properties are
    * `left`, `center`, `right`.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  
  /**
    * (Highstock, Gantt) X offset of the input row.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) Y offset of the input row.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object RangeSelectorInputPositionOptions {
  
  @scala.inline
  def apply(): RangeSelectorInputPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSelectorInputPositionOptions]
  }
  
  @scala.inline
  implicit class RangeSelectorInputPositionOptionsMutableBuilder[Self <: RangeSelectorInputPositionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
