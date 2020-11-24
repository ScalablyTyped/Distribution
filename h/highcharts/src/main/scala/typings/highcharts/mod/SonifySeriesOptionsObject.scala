package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for sonifying a series.
  */
@js.native
trait SonifySeriesOptionsObject extends js.Object {
  
  /**
    * Optionally provide the minimum/maximum data values for the points. If
    * this is not supplied, it is calculated from all points in the chart
    * on demand. This option is supplied in the following format, as a map
    * of point data properties to objects with min/max values: (see online
    * documentation for example)
    */
  var dataExtremes: js.UndefOr[Dictionary[RangeObject]] = js.native
  
  /**
    * The duration for playing the points. Note that points might continue
    * to play after the duration has passed, but no new points will start
    * playing.
    */
  var duration: Double = js.native
  
  /**
    * Earcons to add to the series.
    */
  var earcons: js.UndefOr[
    js.Array[typings.highcharts.sonificationMod.highchartsAugmentingMod.EarconConfiguration]
  ] = js.native
  
  /**
    * The instrument definitions for the points in this series.
    */
  var instruments: js.Array[typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentObject] = js.native
  
  /**
    * Callback after the series has played.
    */
  var onEnd: js.UndefOr[js.Function] = js.native
  
  /**
    * Callback after a point has finished playing.
    */
  var onPointEnd: js.UndefOr[js.Function] = js.native
  
  /**
    * Callback before a point is played.
    */
  var onPointStart: js.UndefOr[js.Function] = js.native
  
  /**
    * The axis to use for when to play the points. Can be a string with a
    * data property (e.g. `x`), or a function. If it is a function, this
    * function receives the point as argument, and should return a numeric
    * value. The points with the lowest numeric values are then played
    * first, and the time between points will be proportional to the
    * distance between the numeric values.
    */
  var pointPlayTime: String | js.Function = js.native
}
object SonifySeriesOptionsObject {
  
  @scala.inline
  def apply(
    duration: Double,
    instruments: js.Array[typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentObject],
    pointPlayTime: String | js.Function
  ): SonifySeriesOptionsObject = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], instruments = instruments.asInstanceOf[js.Any], pointPlayTime = pointPlayTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SonifySeriesOptionsObject]
  }
  
  @scala.inline
  implicit class SonifySeriesOptionsObjectOps[Self <: SonifySeriesOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstrumentsVarargs(value: typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentObject*): Self = this.set("instruments", js.Array(value :_*))
    
    @scala.inline
    def setInstruments(value: js.Array[typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentObject]): Self = this.set("instruments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointPlayTime(value: String | js.Function): Self = this.set("pointPlayTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataExtremes(value: Dictionary[RangeObject]): Self = this.set("dataExtremes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataExtremes: Self = this.set("dataExtremes", js.undefined)
    
    @scala.inline
    def setEarconsVarargs(value: typings.highcharts.sonificationMod.highchartsAugmentingMod.EarconConfiguration*): Self = this.set("earcons", js.Array(value :_*))
    
    @scala.inline
    def setEarcons(value: js.Array[typings.highcharts.sonificationMod.highchartsAugmentingMod.EarconConfiguration]): Self = this.set("earcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEarcons: Self = this.set("earcons", js.undefined)
    
    @scala.inline
    def setOnEnd(value: js.Function): Self = this.set("onEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    
    @scala.inline
    def setOnPointEnd(value: js.Function): Self = this.set("onPointEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointEnd: Self = this.set("onPointEnd", js.undefined)
    
    @scala.inline
    def setOnPointStart(value: js.Function): Self = this.set("onPointStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointStart: Self = this.set("onPointStart", js.undefined)
  }
}
