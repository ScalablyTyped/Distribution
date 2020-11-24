package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoostDebugOptions extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Show the number of points
    * skipped through culling.
    *
    * When set to true, the number of points skipped in series processing is
    * outputted. Points are skipped if they are closer than 1 pixel from each
    * other.
    */
  var showSkipSummary: js.UndefOr[Boolean] = js.native
  
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
  var timeBufferCopy: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the building of the k-d
    * tree.
    *
    * This outputs the time spent building the k-d tree used for markers etc.
    *
    * Note that the k-d tree is built async, and runs post-rendering.
    * Following, it does not affect the performance of the rendering itself.
    */
  var timeKDTree: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the series rendering.
    *
    * This outputs the time spent on actual rendering in the console when set
    * to true.
    */
  var timeRendering: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the series processing.
    *
    * This outputs the time spent on transforming the series data to vertex
    * buffers when set to true.
    */
  var timeSeriesProcessing: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the the WebGL setup.
    *
    * This outputs the time spent on setting up the WebGL context, creating
    * shaders, and textures.
    */
  var timeSetup: js.UndefOr[Boolean] = js.native
}
object BoostDebugOptions {
  
  @scala.inline
  def apply(): BoostDebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoostDebugOptions]
  }
  
  @scala.inline
  implicit class BoostDebugOptionsOps[Self <: BoostDebugOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setShowSkipSummary(value: Boolean): Self = this.set("showSkipSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSkipSummary: Self = this.set("showSkipSummary", js.undefined)
    
    @scala.inline
    def setTimeBufferCopy(value: Boolean): Self = this.set("timeBufferCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeBufferCopy: Self = this.set("timeBufferCopy", js.undefined)
    
    @scala.inline
    def setTimeKDTree(value: Boolean): Self = this.set("timeKDTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeKDTree: Self = this.set("timeKDTree", js.undefined)
    
    @scala.inline
    def setTimeRendering(value: Boolean): Self = this.set("timeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeRendering: Self = this.set("timeRendering", js.undefined)
    
    @scala.inline
    def setTimeSeriesProcessing(value: Boolean): Self = this.set("timeSeriesProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSeriesProcessing: Self = this.set("timeSeriesProcessing", js.undefined)
    
    @scala.inline
    def setTimeSetup(value: Boolean): Self = this.set("timeSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSetup: Self = this.set("timeSetup", js.undefined)
  }
}
