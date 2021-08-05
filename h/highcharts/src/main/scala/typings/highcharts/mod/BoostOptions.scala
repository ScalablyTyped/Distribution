package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoostOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) If set to true, the whole chart
    * will be boosted if one of the series crosses its threshold, and all the
    * series can be boosted.
    */
  var allowForce: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Debugging options for boost.
    * Useful for benchmarking, and general timing.
    */
  var debug: js.UndefOr[BoostDebugOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable boost on a
    * chart.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Set the series threshold for
    * when the boost should kick in globally.
    *
    * Setting to e.g. 20 will cause the whole chart to enter boost mode if
    * there are 20 or more series active. When the chart is in boost mode,
    * every series in it will be rendered to a common canvas. This offers a
    * significant speed improvment in charts with a very high amount of series.
    */
  var seriesThreshold: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable GPU
    * translations. GPU translations are faster than doing the translation in
    * JavaScript.
    *
    * This option may cause rendering issues with certain datasets. Namely, if
    * your dataset has large numbers with small increments (such as
    * timestamps), it won't work correctly. This is due to floating point
    * precission.
    */
  var useGPUTranslations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable pre-allocation
    * of vertex buffers.
    *
    * Enabling this will make it so that the binary data arrays required for
    * storing the series data will be allocated prior to transforming the data
    * to a WebGL-compatible format.
    *
    * This saves a copy operation on the order of O(n) and so is significantly
    * more performant. However, this is currently an experimental option, and
    * may cause visual artifacts with some datasets.
    *
    * As such, care should be taken when using this setting to make sure that
    * it doesn't cause any rendering glitches with the given use-case.
    */
  var usePreallocated: js.UndefOr[Boolean] = js.undefined
}
object BoostOptions {
  
  inline def apply(): BoostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoostOptions]
  }
  
  extension [Self <: BoostOptions](x: Self) {
    
    inline def setAllowForce(value: Boolean): Self = StObject.set(x, "allowForce", value.asInstanceOf[js.Any])
    
    inline def setAllowForceUndefined: Self = StObject.set(x, "allowForce", js.undefined)
    
    inline def setDebug(value: BoostDebugOptions): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setSeriesThreshold(value: Double): Self = StObject.set(x, "seriesThreshold", value.asInstanceOf[js.Any])
    
    inline def setSeriesThresholdNull: Self = StObject.set(x, "seriesThreshold", null)
    
    inline def setSeriesThresholdUndefined: Self = StObject.set(x, "seriesThreshold", js.undefined)
    
    inline def setUseGPUTranslations(value: Boolean): Self = StObject.set(x, "useGPUTranslations", value.asInstanceOf[js.Any])
    
    inline def setUseGPUTranslationsUndefined: Self = StObject.set(x, "useGPUTranslations", js.undefined)
    
    inline def setUsePreallocated(value: Boolean): Self = StObject.set(x, "usePreallocated", value.asInstanceOf[js.Any])
    
    inline def setUsePreallocatedUndefined: Self = StObject.set(x, "usePreallocated", js.undefined)
  }
}
