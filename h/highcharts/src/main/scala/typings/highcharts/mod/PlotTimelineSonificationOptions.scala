package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTimelineSonificationOptions extends StObject {
  
  /**
    * (Highcharts) Context tracks for this series. Context tracks are tracks
    * that are not tied to data points.
    *
    * Given as an array of instrument tracks, speech tracks, or a mix of both.
    */
  var contextTracks: js.UndefOr[js.Array[PlotTimelineSonificationContextTracksOptions]] = js.undefined
  
  /**
    * (Highcharts) Default options for all this series' instrument tracks.
    */
  var defaultInstrumentOptions: js.UndefOr[PlotTimelineSonificationDefaultInstrumentOptions] = js.undefined
  
  /**
    * (Highcharts) Default options for all this series' speech tracks.
    */
  var defaultSpeechOptions: js.UndefOr[PlotTimelineSonificationDefaultSpeechOptions] = js.undefined
  
  /**
    * (Highcharts) Whether or not sonification is enabled for this series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) Sonification point grouping options for this series.
    */
  var pointGrouping: js.UndefOr[PlotTimelineSonificationPointGroupingOptions] = js.undefined
  
  /**
    * (Highcharts) Tracks for this series.
    *
    * Given as an array of instrument tracks, speech tracks, or a mix of both.
    */
  var tracks: js.UndefOr[js.Array[PlotTimelineSonificationTracksOptions]] = js.undefined
}
object PlotTimelineSonificationOptions {
  
  inline def apply(): PlotTimelineSonificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTimelineSonificationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotTimelineSonificationOptions] (val x: Self) extends AnyVal {
    
    inline def setContextTracks(value: js.Array[PlotTimelineSonificationContextTracksOptions]): Self = StObject.set(x, "contextTracks", value.asInstanceOf[js.Any])
    
    inline def setContextTracksUndefined: Self = StObject.set(x, "contextTracks", js.undefined)
    
    inline def setContextTracksVarargs(value: PlotTimelineSonificationContextTracksOptions*): Self = StObject.set(x, "contextTracks", js.Array(value*))
    
    inline def setDefaultInstrumentOptions(value: PlotTimelineSonificationDefaultInstrumentOptions): Self = StObject.set(x, "defaultInstrumentOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultInstrumentOptionsUndefined: Self = StObject.set(x, "defaultInstrumentOptions", js.undefined)
    
    inline def setDefaultSpeechOptions(value: PlotTimelineSonificationDefaultSpeechOptions): Self = StObject.set(x, "defaultSpeechOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultSpeechOptionsUndefined: Self = StObject.set(x, "defaultSpeechOptions", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setPointGrouping(value: PlotTimelineSonificationPointGroupingOptions): Self = StObject.set(x, "pointGrouping", value.asInstanceOf[js.Any])
    
    inline def setPointGroupingUndefined: Self = StObject.set(x, "pointGrouping", js.undefined)
    
    inline def setTracks(value: js.Array[PlotTimelineSonificationTracksOptions]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: PlotTimelineSonificationTracksOptions*): Self = StObject.set(x, "tracks", js.Array(value*))
  }
}
