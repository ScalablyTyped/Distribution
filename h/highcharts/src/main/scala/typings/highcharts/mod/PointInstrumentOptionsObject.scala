package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointInstrumentOptionsObject extends js.Object {
  
  /**
    * The maximum duration for a note when using a data property for
    * duration. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.duration. Defaults to 2000.
    */
  var maxDuration: js.UndefOr[Double] = js.native
  
  /**
    * The maximum frequency for a note when using a data property for
    * frequency. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.frequency. Defaults to 2200.
    */
  var maxFrequency: js.UndefOr[Double] = js.native
  
  /**
    * The maximum pan value for a note when using a data property for
    * panning. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.pan. Defaults to 1 (fully right).
    */
  var maxPan: js.UndefOr[Double] = js.native
  
  /**
    * The maximum volume for a note when using a data property for volume.
    * Can be overridden by using either a fixed number or a function for
    * instrumentMapping.volume. Defaults to 1.
    */
  var maxVolume: js.UndefOr[Double] = js.native
  
  /**
    * The minimum duration for a note when using a data property for
    * duration. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.duration. Defaults to 20.
    */
  var minDuration: js.UndefOr[Double] = js.native
  
  /**
    * The minimum frequency for a note when using a data property for
    * frequency. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.frequency. Defaults to 220.
    */
  var minFrequency: js.UndefOr[Double] = js.native
  
  /**
    * The minimum pan value for a note when using a data property for
    * panning. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.pan. Defaults to -1 (fully left).
    */
  var minPan: js.UndefOr[Double] = js.native
  
  /**
    * The minimum volume for a note when using a data property for volume.
    * Can be overridden by using either a fixed number or a function for
    * instrumentMapping.volume. Defaults to 0.1.
    */
  var minVolume: js.UndefOr[Double] = js.native
}
object PointInstrumentOptionsObject {
  
  @scala.inline
  def apply(): PointInstrumentOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointInstrumentOptionsObject]
  }
  
  @scala.inline
  implicit class PointInstrumentOptionsObjectOps[Self <: PointInstrumentOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setMaxDuration(value: Double): Self = this.set("maxDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDuration: Self = this.set("maxDuration", js.undefined)
    
    @scala.inline
    def setMaxFrequency(value: Double): Self = this.set("maxFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFrequency: Self = this.set("maxFrequency", js.undefined)
    
    @scala.inline
    def setMaxPan(value: Double): Self = this.set("maxPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPan: Self = this.set("maxPan", js.undefined)
    
    @scala.inline
    def setMaxVolume(value: Double): Self = this.set("maxVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxVolume: Self = this.set("maxVolume", js.undefined)
    
    @scala.inline
    def setMinDuration(value: Double): Self = this.set("minDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDuration: Self = this.set("minDuration", js.undefined)
    
    @scala.inline
    def setMinFrequency(value: Double): Self = this.set("minFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinFrequency: Self = this.set("minFrequency", js.undefined)
    
    @scala.inline
    def setMinPan(value: Double): Self = this.set("minPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPan: Self = this.set("minPan", js.undefined)
    
    @scala.inline
    def setMinVolume(value: Double): Self = this.set("minVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinVolume: Self = this.set("minVolume", js.undefined)
  }
}
