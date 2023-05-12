package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SonificationOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The time to wait in milliseconds
    * after each data series when playing the series one after the other.
    */
  var afterSeriesWait: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Default sonification options for
    * all instrument tracks.
    *
    * If specific options are also set on individual tracks or per series,
    * those will override these options.
    */
  var defaultInstrumentOptions: js.UndefOr[SonificationDefaultInstrumentOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Default sonification options for
    * all speech tracks.
    *
    * If specific options are also set on individual tracks or per series,
    * those will override these options.
    */
  var defaultSpeechOptions: js.UndefOr[SonificationDefaultSpeechOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The total duration of the
    * sonification, in milliseconds.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable sonification
    * functionality for the chart.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Set up event handlers for the
    * sonification
    */
  var events: js.UndefOr[SonificationEventsOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Context tracks to add globally,
    * an array of either instrument tracks, speech tracks, or a mix.
    *
    * Context tracks are not tied to data points, but play at a set interval -
    * either based on time or on prop values.
    */
  var globalContextTracks: js.UndefOr[js.Array[SonificationGlobalContextTracksOptions]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Global tracks to add to every
    * series.
    *
    * Defined as an array of either instrument or speech tracks, or a
    * combination.
    */
  var globalTracks: js.UndefOr[js.Array[SonificationGlobalTracksOptions]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Overall/master volume for the
    * sonification, from 0 to 1.
    */
  var masterVolume: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) What order to play the data
    * series in, either `sequential` where the series play individually one
    * after the other, or `simultaneous` where the series play all at once.
    */
  var order: js.UndefOr[OptionsOrderValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for grouping data points
    * together when sonifying. This allows for the visual presentation to
    * contain more points than what is being played. If not enabled, all
    * visible / uncropped points are played.
    */
  var pointGrouping: js.UndefOr[SonificationPointGroupingOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Show X and Y axis crosshairs (if
    * they exist) as the chart plays.
    *
    * Note that if multiple tracks that play at different times try to show the
    * crosshairs, it can be glitchy, so it is recommended in those cases to
    * turn this on/off for individual tracks using the showPlayMarker option.
    */
  var showCrosshair: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Show tooltip as the chart plays.
    *
    * Note that if multiple tracks that play at different times try to show the
    * tooltip, it can be glitchy, so it is recommended in those cases to turn
    * this on/off for individual tracks using the showPlayMarker option.
    */
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) How long to wait between each
    * recomputation of the sonification, if the chart updates rapidly. This
    * avoids slowing down processes like panning. Given in milliseconds.
    */
  var updateInterval: js.UndefOr[Double] = js.undefined
}
object SonificationOptions {
  
  inline def apply(): SonificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SonificationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SonificationOptions] (val x: Self) extends AnyVal {
    
    inline def setAfterSeriesWait(value: Double): Self = StObject.set(x, "afterSeriesWait", value.asInstanceOf[js.Any])
    
    inline def setAfterSeriesWaitUndefined: Self = StObject.set(x, "afterSeriesWait", js.undefined)
    
    inline def setDefaultInstrumentOptions(value: SonificationDefaultInstrumentOptions): Self = StObject.set(x, "defaultInstrumentOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultInstrumentOptionsUndefined: Self = StObject.set(x, "defaultInstrumentOptions", js.undefined)
    
    inline def setDefaultSpeechOptions(value: SonificationDefaultSpeechOptions): Self = StObject.set(x, "defaultSpeechOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultSpeechOptionsUndefined: Self = StObject.set(x, "defaultSpeechOptions", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEvents(value: SonificationEventsOptions): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setGlobalContextTracks(value: js.Array[SonificationGlobalContextTracksOptions]): Self = StObject.set(x, "globalContextTracks", value.asInstanceOf[js.Any])
    
    inline def setGlobalContextTracksUndefined: Self = StObject.set(x, "globalContextTracks", js.undefined)
    
    inline def setGlobalContextTracksVarargs(value: SonificationGlobalContextTracksOptions*): Self = StObject.set(x, "globalContextTracks", js.Array(value*))
    
    inline def setGlobalTracks(value: js.Array[SonificationGlobalTracksOptions]): Self = StObject.set(x, "globalTracks", value.asInstanceOf[js.Any])
    
    inline def setGlobalTracksUndefined: Self = StObject.set(x, "globalTracks", js.undefined)
    
    inline def setGlobalTracksVarargs(value: SonificationGlobalTracksOptions*): Self = StObject.set(x, "globalTracks", js.Array(value*))
    
    inline def setMasterVolume(value: Double): Self = StObject.set(x, "masterVolume", value.asInstanceOf[js.Any])
    
    inline def setMasterVolumeUndefined: Self = StObject.set(x, "masterVolume", js.undefined)
    
    inline def setOrder(value: OptionsOrderValue): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPointGrouping(value: SonificationPointGroupingOptions): Self = StObject.set(x, "pointGrouping", value.asInstanceOf[js.Any])
    
    inline def setPointGroupingUndefined: Self = StObject.set(x, "pointGrouping", js.undefined)
    
    inline def setShowCrosshair(value: Boolean): Self = StObject.set(x, "showCrosshair", value.asInstanceOf[js.Any])
    
    inline def setShowCrosshairUndefined: Self = StObject.set(x, "showCrosshair", js.undefined)
    
    inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
    
    inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
    
    inline def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
    
    inline def setUpdateIntervalUndefined: Self = StObject.set(x, "updateInterval", js.undefined)
  }
}
