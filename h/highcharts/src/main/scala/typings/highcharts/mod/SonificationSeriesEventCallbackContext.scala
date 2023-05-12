package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event context object sent to sonification series events.
  */
trait SonificationSeriesEventCallbackContext extends StObject {
  
  /**
    * The relevant series
    */
  var series: js.UndefOr[typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.Series] = js.undefined
  
  /**
    * The playing timeline object with advanced and internal content
    */
  var timeline: js.UndefOr[js.Object] = js.undefined
}
object SonificationSeriesEventCallbackContext {
  
  inline def apply(): SonificationSeriesEventCallbackContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SonificationSeriesEventCallbackContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SonificationSeriesEventCallbackContext] (val x: Self) extends AnyVal {
    
    inline def setSeries(value: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.Series): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setTimeline(value: js.Object): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    inline def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
  }
}
