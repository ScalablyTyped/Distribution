package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YAxisBreaksOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) A number indicating how much space should
    * be left between the start and the end of the break. The break size is
    * given in axis units, so for instance on a `datetime` axis, a break size
    * of 3600000 would indicate the equivalent of an hour.
    */
  var breakSize: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The point where the break starts.
    */
  var from: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Defines an interval after which the break
    * appears again. By default the breaks do not repeat.
    */
  var repeat: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The point where the break ends.
    */
  var to: js.UndefOr[Double] = js.undefined
}
object YAxisBreaksOptions {
  
  @scala.inline
  def apply(): YAxisBreaksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YAxisBreaksOptions]
  }
  
  @scala.inline
  implicit class YAxisBreaksOptionsMutableBuilder[Self <: YAxisBreaksOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakSize(value: Double): Self = StObject.set(x, "breakSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakSizeUndefined: Self = StObject.set(x, "breakSize", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
