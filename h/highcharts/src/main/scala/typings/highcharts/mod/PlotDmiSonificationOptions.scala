package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotDmiSonificationOptions extends StObject {
  
  /**
    * (Highstock) Context tracks for this series. Context tracks are tracks
    * that are not tied to data points.
    *
    * Given as an array of instrument tracks, speech tracks, or a mix of both.
    */
  var contextTracks: js.UndefOr[js.Array[PlotDmiSonificationContextTracksOptions]] = js.undefined
  
  /**
    * (Highstock) Default options for all this series' instrument tracks.
    */
  var defaultInstrumentOptions: js.UndefOr[PlotDmiSonificationDefaultInstrumentOptions] = js.undefined
  
  /**
    * (Highstock) Default options for all this series' speech tracks.
    */
  var defaultSpeechOptions: js.UndefOr[PlotDmiSonificationDefaultSpeechOptions] = js.undefined
  
  /**
    * (Highstock) Whether or not sonification is enabled for this series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock) Sonification point grouping options for this series.
    */
  var pointGrouping: js.UndefOr[PlotDmiSonificationPointGroupingOptions] = js.undefined
  
  /**
    * (Highstock) Tracks for this series.
    *
    * Given as an array of instrument tracks, speech tracks, or a mix of both.
    */
  var tracks: js.UndefOr[js.Array[PlotDmiSonificationTracksOptions]] = js.undefined
}
object PlotDmiSonificationOptions {
  
  inline def apply(): PlotDmiSonificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotDmiSonificationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotDmiSonificationOptions] (val x: Self) extends AnyVal {
    
    inline def setContextTracks(value: js.Array[PlotDmiSonificationContextTracksOptions]): Self = StObject.set(x, "contextTracks", value.asInstanceOf[js.Any])
    
    inline def setContextTracksUndefined: Self = StObject.set(x, "contextTracks", js.undefined)
    
    inline def setContextTracksVarargs(value: PlotDmiSonificationContextTracksOptions*): Self = StObject.set(x, "contextTracks", js.Array(value*))
    
    inline def setDefaultInstrumentOptions(value: PlotDmiSonificationDefaultInstrumentOptions): Self = StObject.set(x, "defaultInstrumentOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultInstrumentOptionsUndefined: Self = StObject.set(x, "defaultInstrumentOptions", js.undefined)
    
    inline def setDefaultSpeechOptions(value: PlotDmiSonificationDefaultSpeechOptions): Self = StObject.set(x, "defaultSpeechOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultSpeechOptionsUndefined: Self = StObject.set(x, "defaultSpeechOptions", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setPointGrouping(value: PlotDmiSonificationPointGroupingOptions): Self = StObject.set(x, "pointGrouping", value.asInstanceOf[js.Any])
    
    inline def setPointGroupingUndefined: Self = StObject.set(x, "pointGrouping", js.undefined)
    
    inline def setTracks(value: js.Array[PlotDmiSonificationTracksOptions]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: PlotDmiSonificationTracksOptions*): Self = StObject.set(x, "tracks", js.Array(value*))
  }
}
