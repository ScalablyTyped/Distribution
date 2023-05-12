package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SonificationEventsOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Called after updating the
    * sonification.
    *
    * A context object is passed to the function, with properties `chart` and
    * `timeline`.
    */
  var afterUpdate: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Called immediately when a play
    * is requested.
    *
    * A context object is passed to the function, with properties `chart` and
    * `timeline`.
    */
  var beforePlay: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Called before updating the
    * sonification.
    *
    * A context object is passed to the function, with properties `chart` and
    * `timeline`.
    */
  var beforeUpdate: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Called when attempting to play
    * an adjacent point or series, and there is none.
    *
    * By default a percussive sound is played.
    *
    * A context object is passed to the function, with properties `chart`,
    * `timeline`, and `attemptedNext`. `attemptedNext` is a boolean property
    * that is `true` if the boundary hit was from trying to play the next
    * series/point, and `false` if it was from trying to play the previous.
    */
  var onBoundaryHit: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Called when play is completed.
    *
    * A context object is passed to the function, with properties `chart`,
    * `timeline` and `pointsPlayed`. `pointsPlayed` is an array of `Point`
    * objects, referencing data points that were related to the audio events
    * played.
    */
  var onEnd: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Called on play.
    *
    * A context object is passed to the function, with properties `chart` and
    * `timeline`.
    */
  var onPlay: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Called when finished playing a
    * series.
    *
    * A context object is passed to the function, with properties `series` and
    * `timeline`.
    */
  var onSeriesEnd: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Called on the beginning of
    * playing a series.
    *
    * A context object is passed to the function, with properties `series` and
    * `timeline`.
    */
  var onSeriesStart: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Called on pause, cancel, or if
    * play is completed.
    *
    * A context object is passed to the function, with properties `chart`,
    * `timeline` and `pointsPlayed`. `pointsPlayed` is an array of `Point`
    * objects, referencing data points that were related to the audio events
    * played.
    */
  var onStop: js.UndefOr[js.Function] = js.undefined
}
object SonificationEventsOptions {
  
  inline def apply(): SonificationEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SonificationEventsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SonificationEventsOptions] (val x: Self) extends AnyVal {
    
    inline def setAfterUpdate(value: js.Function): Self = StObject.set(x, "afterUpdate", value.asInstanceOf[js.Any])
    
    inline def setAfterUpdateUndefined: Self = StObject.set(x, "afterUpdate", js.undefined)
    
    inline def setBeforePlay(value: js.Function): Self = StObject.set(x, "beforePlay", value.asInstanceOf[js.Any])
    
    inline def setBeforePlayUndefined: Self = StObject.set(x, "beforePlay", js.undefined)
    
    inline def setBeforeUpdate(value: js.Function): Self = StObject.set(x, "beforeUpdate", value.asInstanceOf[js.Any])
    
    inline def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
    
    inline def setOnBoundaryHit(value: js.Function): Self = StObject.set(x, "onBoundaryHit", value.asInstanceOf[js.Any])
    
    inline def setOnBoundaryHitUndefined: Self = StObject.set(x, "onBoundaryHit", js.undefined)
    
    inline def setOnEnd(value: js.Function): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    inline def setOnPlay(value: js.Function): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnSeriesEnd(value: js.Function): Self = StObject.set(x, "onSeriesEnd", value.asInstanceOf[js.Any])
    
    inline def setOnSeriesEndUndefined: Self = StObject.set(x, "onSeriesEnd", js.undefined)
    
    inline def setOnSeriesStart(value: js.Function): Self = StObject.set(x, "onSeriesStart", value.asInstanceOf[js.Any])
    
    inline def setOnSeriesStartUndefined: Self = StObject.set(x, "onSeriesStart", js.undefined)
    
    inline def setOnStop(value: js.Function): Self = StObject.set(x, "onStop", value.asInstanceOf[js.Any])
    
    inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
  }
}
