package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtremesObject extends js.Object {
  
  /**
    * The maximum value of the axis' associated series.
    */
  var dataMax: Double = js.native
  
  /**
    * The minimum value of the axis' associated series.
    */
  var dataMin: Double = js.native
  
  /**
    * The maximum axis value, either automatic or set manually. If the `max`
    * option is not set, `maxPadding` is 0 and `endOnTick` is false, this value
    * will be the same as `dataMax`.
    */
  var max: Double = js.native
  
  /**
    * The minimum axis value, either automatic or set manually. If the `min`
    * option is not set, `minPadding` is 0 and `startOnTick` is false, this
    * value will be the same as `dataMin`.
    */
  var min: Double = js.native
  
  /**
    * The user defined maximum, either from the `max` option or from a zoom or
    * `setExtremes` action.
    */
  var userMax: Double = js.native
  
  /**
    * The user defined minimum, either from the `min` option or from a zoom or
    * `setExtremes` action.
    */
  var userMin: Double = js.native
}
object ExtremesObject {
  
  @scala.inline
  def apply(dataMax: Double, dataMin: Double, max: Double, min: Double, userMax: Double, userMin: Double): ExtremesObject = {
    val __obj = js.Dynamic.literal(dataMax = dataMax.asInstanceOf[js.Any], dataMin = dataMin.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], userMax = userMax.asInstanceOf[js.Any], userMin = userMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtremesObject]
  }
  
  @scala.inline
  implicit class ExtremesObjectOps[Self <: ExtremesObject] (val x: Self) extends AnyVal {
    
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
    def setDataMax(value: Double): Self = this.set("dataMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataMin(value: Double): Self = this.set("dataMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMax(value: Double): Self = this.set("userMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMin(value: Double): Self = this.set("userMin", value.asInstanceOf[js.Any])
  }
}
