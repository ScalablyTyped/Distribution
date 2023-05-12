package typings.highcharts.mod

import typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.Chart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event context object sent to sonification chart events.
  */
trait SonificationChartEventCallbackContext extends StObject {
  
  /**
    * The relevant chart
    */
  var chart: js.UndefOr[Chart] = js.undefined
  
  /**
    * The points that were played, if any
    */
  var pointsPlayed: js.UndefOr[
    js.Array[typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.Point]
  ] = js.undefined
  
  /**
    * The playing timeline object with advanced and internal content
    */
  var timeline: js.UndefOr[js.Object] = js.undefined
}
object SonificationChartEventCallbackContext {
  
  inline def apply(): SonificationChartEventCallbackContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SonificationChartEventCallbackContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SonificationChartEventCallbackContext] (val x: Self) extends AnyVal {
    
    inline def setChart(value: Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
    
    inline def setPointsPlayed(value: js.Array[typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.Point]): Self = StObject.set(x, "pointsPlayed", value.asInstanceOf[js.Any])
    
    inline def setPointsPlayedUndefined: Self = StObject.set(x, "pointsPlayed", js.undefined)
    
    inline def setPointsPlayedVarargs(value: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.Point*): Self = StObject.set(x, "pointsPlayed", js.Array(value*))
    
    inline def setTimeline(value: js.Object): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    inline def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
  }
}
