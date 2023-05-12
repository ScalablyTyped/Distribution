package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotGeoheatmapSonificationOptions extends StObject {
  
  /**
    * (Highmaps) Context tracks for this series. Context tracks are tracks that
    * are not tied to data points.
    *
    * Given as an array of instrument tracks, speech tracks, or a mix of both.
    */
  var contextTracks: js.UndefOr[js.Array[PlotGeoheatmapSonificationContextTracksOptions]] = js.undefined
  
  /**
    * (Highmaps) Default options for all this series' instrument tracks.
    */
  var defaultInstrumentOptions: js.UndefOr[PlotGeoheatmapSonificationDefaultInstrumentOptions] = js.undefined
  
  /**
    * (Highmaps) Default options for all this series' speech tracks.
    */
  var defaultSpeechOptions: js.UndefOr[PlotGeoheatmapSonificationDefaultSpeechOptions] = js.undefined
  
  /**
    * (Highmaps) Whether or not sonification is enabled for this series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highmaps) Sonification point grouping options for this series.
    */
  var pointGrouping: js.UndefOr[PlotGeoheatmapSonificationPointGroupingOptions] = js.undefined
  
  /**
    * (Highmaps) Tracks for this series.
    *
    * Given as an array of instrument tracks, speech tracks, or a mix of both.
    */
  var tracks: js.UndefOr[js.Array[PlotGeoheatmapSonificationTracksOptions]] = js.undefined
}
object PlotGeoheatmapSonificationOptions {
  
  inline def apply(): PlotGeoheatmapSonificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotGeoheatmapSonificationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotGeoheatmapSonificationOptions] (val x: Self) extends AnyVal {
    
    inline def setContextTracks(value: js.Array[PlotGeoheatmapSonificationContextTracksOptions]): Self = StObject.set(x, "contextTracks", value.asInstanceOf[js.Any])
    
    inline def setContextTracksUndefined: Self = StObject.set(x, "contextTracks", js.undefined)
    
    inline def setContextTracksVarargs(value: PlotGeoheatmapSonificationContextTracksOptions*): Self = StObject.set(x, "contextTracks", js.Array(value*))
    
    inline def setDefaultInstrumentOptions(value: PlotGeoheatmapSonificationDefaultInstrumentOptions): Self = StObject.set(x, "defaultInstrumentOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultInstrumentOptionsUndefined: Self = StObject.set(x, "defaultInstrumentOptions", js.undefined)
    
    inline def setDefaultSpeechOptions(value: PlotGeoheatmapSonificationDefaultSpeechOptions): Self = StObject.set(x, "defaultSpeechOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultSpeechOptionsUndefined: Self = StObject.set(x, "defaultSpeechOptions", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setPointGrouping(value: PlotGeoheatmapSonificationPointGroupingOptions): Self = StObject.set(x, "pointGrouping", value.asInstanceOf[js.Any])
    
    inline def setPointGroupingUndefined: Self = StObject.set(x, "pointGrouping", js.undefined)
    
    inline def setTracks(value: js.Array[PlotGeoheatmapSonificationTracksOptions]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: PlotGeoheatmapSonificationTracksOptions*): Self = StObject.set(x, "tracks", js.Array(value*))
  }
}
