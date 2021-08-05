package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoostDebugOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Show the number of points
    * skipped through culling.
    *
    * When set to true, the number of points skipped in series processing is
    * outputted. Points are skipped if they are closer than 1 pixel from each
    * other.
    */
  var showSkipSummary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the WebGL to SVG buffer
    * copy
    *
    * After rendering, the result is copied to an image which is injected into
    * the SVG.
    *
    * If this property is set to true, the time it takes for the buffer copy to
    * complete is outputted.
    */
  var timeBufferCopy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the building of the k-d
    * tree.
    *
    * This outputs the time spent building the k-d tree used for markers etc.
    *
    * Note that the k-d tree is built async, and runs post-rendering.
    * Following, it does not affect the performance of the rendering itself.
    */
  var timeKDTree: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the series rendering.
    *
    * This outputs the time spent on actual rendering in the console when set
    * to true.
    */
  var timeRendering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the series processing.
    *
    * This outputs the time spent on transforming the series data to vertex
    * buffers when set to true.
    */
  var timeSeriesProcessing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the the WebGL setup.
    *
    * This outputs the time spent on setting up the WebGL context, creating
    * shaders, and textures.
    */
  var timeSetup: js.UndefOr[Boolean] = js.undefined
}
object BoostDebugOptions {
  
  inline def apply(): BoostDebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoostDebugOptions]
  }
  
  extension [Self <: BoostDebugOptions](x: Self) {
    
    inline def setShowSkipSummary(value: Boolean): Self = StObject.set(x, "showSkipSummary", value.asInstanceOf[js.Any])
    
    inline def setShowSkipSummaryUndefined: Self = StObject.set(x, "showSkipSummary", js.undefined)
    
    inline def setTimeBufferCopy(value: Boolean): Self = StObject.set(x, "timeBufferCopy", value.asInstanceOf[js.Any])
    
    inline def setTimeBufferCopyUndefined: Self = StObject.set(x, "timeBufferCopy", js.undefined)
    
    inline def setTimeKDTree(value: Boolean): Self = StObject.set(x, "timeKDTree", value.asInstanceOf[js.Any])
    
    inline def setTimeKDTreeUndefined: Self = StObject.set(x, "timeKDTree", js.undefined)
    
    inline def setTimeRendering(value: Boolean): Self = StObject.set(x, "timeRendering", value.asInstanceOf[js.Any])
    
    inline def setTimeRenderingUndefined: Self = StObject.set(x, "timeRendering", js.undefined)
    
    inline def setTimeSeriesProcessing(value: Boolean): Self = StObject.set(x, "timeSeriesProcessing", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesProcessingUndefined: Self = StObject.set(x, "timeSeriesProcessing", js.undefined)
    
    inline def setTimeSetup(value: Boolean): Self = StObject.set(x, "timeSetup", value.asInstanceOf[js.Any])
    
    inline def setTimeSetupUndefined: Self = StObject.set(x, "timeSetup", js.undefined)
  }
}
