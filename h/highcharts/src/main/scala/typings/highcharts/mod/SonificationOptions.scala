package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for sonifying a chart.
  */
trait SonificationOptions extends StObject {
  
  /**
    * Milliseconds of silent waiting to add between series. Note that
    * waiting time is considered part of the sonify duration.
    */
  var afterSeriesWait: js.UndefOr[Double] = js.undefined
  
  /**
    * Optionally provide the minimum/maximum data values for the points. If
    * this is not supplied, it is calculated from all points in the chart
    * on demand. This option is supplied in the following format, as a map
    * of point data properties to objects with min/max values: (see online
    * documentation for example)
    */
  var dataExtremes: js.UndefOr[Dictionary[RangeObject]] = js.undefined
  
  /**
    * Duration for sonifying the entire chart. The duration is distributed
    * across the different series intelligently, but does not take earcons
    * into account. It is also possible to set the duration explicitly per
    * series, using `seriesOptions`. Note that points may continue to play
    * after the duration has passed, but no new points will start playing.
    */
  var duration: Double
  
  /**
    * Earcons to add to the chart. Note that earcons can also be added per
    * series using `seriesOptions`.
    */
  var earcons: js.UndefOr[
    js.Array[typings.highcharts.sonificationMod.highchartsAugmentingMod.EarconConfiguration]
  ] = js.undefined
  
  /**
    * The instrument definitions for the points in this chart.
    */
  var instruments: js.UndefOr[
    js.Array[typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentObject]
  ] = js.undefined
  
  /**
    * Callback after the chart has played.
    */
  var onEnd: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Callback after a series has finished playing.
    */
  var onSeriesEnd: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Callback before a series is played.
    */
  var onSeriesStart: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Define the order to play the series in. This can be given as a
    * string, or an array specifying a custom ordering. If given as a
    * string, valid values are `sequential` - where each series is played
    * in order - or `simultaneous`, where all series are played at once.
    * For custom ordering, supply an array as the order. Each element in
    * the array can be either a string with a series ID, an Earcon object,
    * or an object with a numeric `silentWait` property designating a
    * number of milliseconds to wait before continuing. Each element of the
    * array will be played in order. To play elements simultaneously, group
    * the elements in an array.
    */
  var order: String | (js.Array[
    String | typings.highcharts.sonificationMod.highchartsAugmentingMod.Earcon | (js.Array[String | typings.highcharts.sonificationMod.highchartsAugmentingMod.Earcon])
  ])
  
  /**
    * The axis to use for when to play the points. Can be a string with a
    * data property (e.g. `x`), or a function. If it is a function, this
    * function receives the point as argument, and should return a numeric
    * value. The points with the lowest numeric values are then played
    * first, and the time between points will be proportional to the
    * distance between the numeric values. This option can not be
    * overridden per series.
    */
  var pointPlayTime: String | js.Function
  
  /**
    * Options as given to `series.sonify` to override options per series.
    * If the option is supplied as an array of options objects, the `id`
    * property of the object should correspond to the series' id. If the
    * option is supplied as a single object, the options apply to all
    * series.
    */
  var seriesOptions: js.UndefOr[js.Object | js.Array[js.Object]] = js.undefined
}
object SonificationOptions {
  
  @scala.inline
  def apply(
    duration: Double,
    order: String | (js.Array[
      String | typings.highcharts.sonificationMod.highchartsAugmentingMod.Earcon | (js.Array[String | typings.highcharts.sonificationMod.highchartsAugmentingMod.Earcon])
    ]),
    pointPlayTime: String | js.Function
  ): SonificationOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], pointPlayTime = pointPlayTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SonificationOptions]
  }
  
  @scala.inline
  implicit class SonificationOptionsMutableBuilder[Self <: SonificationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterSeriesWait(value: Double): Self = StObject.set(x, "afterSeriesWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterSeriesWaitUndefined: Self = StObject.set(x, "afterSeriesWait", js.undefined)
    
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
    def setInstrumentsUndefined: Self = StObject.set(x, "instruments", js.undefined)
    
    @scala.inline
    def setInstrumentsVarargs(value: typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentObject*): Self = StObject.set(x, "instruments", js.Array(value :_*))
    
    @scala.inline
    def setOnEnd(value: js.Function): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    @scala.inline
    def setOnSeriesEnd(value: js.Function): Self = StObject.set(x, "onSeriesEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSeriesEndUndefined: Self = StObject.set(x, "onSeriesEnd", js.undefined)
    
    @scala.inline
    def setOnSeriesStart(value: js.Function): Self = StObject.set(x, "onSeriesStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSeriesStartUndefined: Self = StObject.set(x, "onSeriesStart", js.undefined)
    
    @scala.inline
    def setOrder(
      value: String | (js.Array[
          String | typings.highcharts.sonificationMod.highchartsAugmentingMod.Earcon | (js.Array[String | typings.highcharts.sonificationMod.highchartsAugmentingMod.Earcon])
        ])
    ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderVarargs(
      value: (String | typings.highcharts.sonificationMod.highchartsAugmentingMod.Earcon | (js.Array[String | typings.highcharts.sonificationMod.highchartsAugmentingMod.Earcon]))*
    ): Self = StObject.set(x, "order", js.Array(value :_*))
    
    @scala.inline
    def setPointPlayTime(value: String | js.Function): Self = StObject.set(x, "pointPlayTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesOptions(value: js.Object | js.Array[js.Object]): Self = StObject.set(x, "seriesOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesOptionsUndefined: Self = StObject.set(x, "seriesOptions", js.undefined)
    
    @scala.inline
    def setSeriesOptionsVarargs(value: js.Object*): Self = StObject.set(x, "seriesOptions", js.Array(value :_*))
  }
}
