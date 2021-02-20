package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for sonifying a series.
  */
@js.native
trait SonifySeriesOptionsObject extends StObject {
  
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
  implicit class SonifySeriesOptionsObjectMutableBuilder[Self <: SonifySeriesOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataExtremes(value: Dictionary[RangeObject]): Self = StObject.set(x, "dataExtremes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataExtremesUndefined: Self = StObject.set(x, "dataExtremes", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarcons(value: js.Array[typings.highcharts.sonificationMod.highchartsAugmentingMod.EarconConfiguration]): Self = StObject.set(x, "earcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarconsUndefined: Self = StObject.set(x, "earcons", js.undefined)
    
    @scala.inline
    def setEarconsVarargs(value: typings.highcharts.sonificationMod.highchartsAugmentingMod.EarconConfiguration*): Self = StObject.set(x, "earcons", js.Array(value :_*))
    
    @scala.inline
    def setInstruments(value: js.Array[typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentObject]): Self = StObject.set(x, "instruments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstrumentsVarargs(value: typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentObject*): Self = StObject.set(x, "instruments", js.Array(value :_*))
    
    @scala.inline
    def setOnEnd(value: js.Function): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    @scala.inline
    def setOnPointEnd(value: js.Function): Self = StObject.set(x, "onPointEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointEndUndefined: Self = StObject.set(x, "onPointEnd", js.undefined)
    
    @scala.inline
    def setOnPointStart(value: js.Function): Self = StObject.set(x, "onPointStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointStartUndefined: Self = StObject.set(x, "onPointStart", js.undefined)
    
    @scala.inline
    def setPointPlayTime(value: String | js.Function): Self = StObject.set(x, "pointPlayTime", value.asInstanceOf[js.Any])
  }
}
