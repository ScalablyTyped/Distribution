package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotLollipopSonificationOptions extends StObject {
  
  /**
    * (Highcharts, Highstock) Context tracks for this series. Context tracks
    * are tracks that are not tied to data points.
    *
    * Given as an array of instrument tracks, speech tracks, or a mix of both.
    */
  var contextTracks: js.UndefOr[js.Array[PlotLollipopSonificationContextTracksOptions]] = js.undefined
  
  /**
    * (Highcharts, Highstock) Default options for all this series' instrument
    * tracks.
    */
  var defaultInstrumentOptions: js.UndefOr[PlotLollipopSonificationDefaultInstrumentOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock) Default options for all this series' speech
    * tracks.
    */
  var defaultSpeechOptions: js.UndefOr[PlotLollipopSonificationDefaultSpeechOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock) Whether or not sonification is enabled for this
    * series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock) Sonification point grouping options for this
    * series.
    */
  var pointGrouping: js.UndefOr[PlotLollipopSonificationPointGroupingOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock) Tracks for this series.
    *
    * Given as an array of instrument tracks, speech tracks, or a mix of both.
    */
  var tracks: js.UndefOr[js.Array[PlotLollipopSonificationTracksOptions]] = js.undefined
}
object PlotLollipopSonificationOptions {
  
  inline def apply(): PlotLollipopSonificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotLollipopSonificationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotLollipopSonificationOptions] (val x: Self) extends AnyVal {
    
    inline def setContextTracks(value: js.Array[PlotLollipopSonificationContextTracksOptions]): Self = StObject.set(x, "contextTracks", value.asInstanceOf[js.Any])
    
    inline def setContextTracksUndefined: Self = StObject.set(x, "contextTracks", js.undefined)
    
    inline def setContextTracksVarargs(value: PlotLollipopSonificationContextTracksOptions*): Self = StObject.set(x, "contextTracks", js.Array(value*))
    
    inline def setDefaultInstrumentOptions(value: PlotLollipopSonificationDefaultInstrumentOptions): Self = StObject.set(x, "defaultInstrumentOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultInstrumentOptionsUndefined: Self = StObject.set(x, "defaultInstrumentOptions", js.undefined)
    
    inline def setDefaultSpeechOptions(value: PlotLollipopSonificationDefaultSpeechOptions): Self = StObject.set(x, "defaultSpeechOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultSpeechOptionsUndefined: Self = StObject.set(x, "defaultSpeechOptions", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setPointGrouping(value: PlotLollipopSonificationPointGroupingOptions): Self = StObject.set(x, "pointGrouping", value.asInstanceOf[js.Any])
    
    inline def setPointGroupingUndefined: Self = StObject.set(x, "pointGrouping", js.undefined)
    
    inline def setTracks(value: js.Array[PlotLollipopSonificationTracksOptions]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: PlotLollipopSonificationTracksOptions*): Self = StObject.set(x, "tracks", js.Array(value*))
  }
}
