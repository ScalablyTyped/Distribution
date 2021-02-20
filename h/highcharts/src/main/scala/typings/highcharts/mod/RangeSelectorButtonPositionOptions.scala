package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeSelectorButtonPositionOptions extends StObject {
  
  /**
    * (Highstock, Gantt) The alignment of the input box. Allowed properties are
    * `left`, `center`, `right`.
    */
  var align: js.UndefOr[AlignValue] = js.native
  
  /**
    * (Highstock, Gantt) X offset of the button row.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock, Gantt) Y offset of the button row.
    */
  var y: js.UndefOr[Double] = js.native
}
object RangeSelectorButtonPositionOptions {
  
  @scala.inline
  def apply(): RangeSelectorButtonPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSelectorButtonPositionOptions]
  }
  
  @scala.inline
  implicit class RangeSelectorButtonPositionOptionsMutableBuilder[Self <: RangeSelectorButtonPositionOptions] (val x: Self) extends AnyVal {
    
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
