package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotZigzagParamsOptions extends js.Object {
  
  /**
    * (Highstock) The threshold for the value change.
    *
    * For example deviation=1 means the indicator will ignore all price
    * movements less than 1%.
    */
  var deviation: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The point index which indicator calculations will base - high
    * value.
    *
    * For example using OHLC data, index=1 means the indicator will be
    * calculated using High values.
    */
  var highIndex: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The point index which indicator calculations will base - low
    * value.
    *
    * For example using OHLC data, index=2 means the indicator will be
    * calculated using Low values.
    */
  var lowIndex: js.UndefOr[Double] = js.native
}
object PlotZigzagParamsOptions {
  
  @scala.inline
  def apply(): PlotZigzagParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotZigzagParamsOptions]
  }
  
  @scala.inline
  implicit class PlotZigzagParamsOptionsOps[Self <: PlotZigzagParamsOptions] (val x: Self) extends AnyVal {
    
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
    def setDeviation(value: Double): Self = this.set("deviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviation: Self = this.set("deviation", js.undefined)
    
    @scala.inline
    def setHighIndex(value: Double): Self = this.set("highIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighIndex: Self = this.set("highIndex", js.undefined)
    
    @scala.inline
    def setLowIndex(value: Double): Self = this.set("lowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowIndex: Self = this.set("lowIndex", js.undefined)
  }
}
