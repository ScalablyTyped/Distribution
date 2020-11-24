package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Graphics statistics for the App. The information is collected from &#39;adb
  * shell dumpsys graphicsstats&#39;. For more info see:
  * https://developer.android.com/training/testing/performance.html Statistics
  * will only be present for API 23+.
  */
@js.native
trait SchemaGraphicsStats extends js.Object {
  
  /**
    * Histogram of frame render times. There should be 154 buckets ranging from
    * [5ms, 6ms) to [4950ms, infinity)
    */
  var buckets: js.UndefOr[js.Array[SchemaGraphicsStatsBucket]] = js.native
  
  /**
    * Total &quot;high input latency&quot; events.
    */
  var highInputLatencyCount: js.UndefOr[String] = js.native
  
  /**
    * Total frames with slow render time. Should be &lt;= total_frames.
    */
  var jankyFrames: js.UndefOr[String] = js.native
  
  /**
    * Total &quot;missed vsync&quot; events.
    */
  var missedVsyncCount: js.UndefOr[String] = js.native
  
  /**
    * 50th percentile frame render time in milliseconds.
    */
  var p50Millis: js.UndefOr[String] = js.native
  
  /**
    * 90th percentile frame render time in milliseconds.
    */
  var p90Millis: js.UndefOr[String] = js.native
  
  /**
    * 95th percentile frame render time in milliseconds.
    */
  var p95Millis: js.UndefOr[String] = js.native
  
  /**
    * 99th percentile frame render time in milliseconds.
    */
  var p99Millis: js.UndefOr[String] = js.native
  
  /**
    * Total &quot;slow bitmap upload&quot; events.
    */
  var slowBitmapUploadCount: js.UndefOr[String] = js.native
  
  /**
    * Total &quot;slow draw&quot; events.
    */
  var slowDrawCount: js.UndefOr[String] = js.native
  
  /**
    * Total &quot;slow UI thread&quot; events.
    */
  var slowUiThreadCount: js.UndefOr[String] = js.native
  
  /**
    * Total frames rendered by package.
    */
  var totalFrames: js.UndefOr[String] = js.native
}
object SchemaGraphicsStats {
  
  @scala.inline
  def apply(): SchemaGraphicsStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGraphicsStats]
  }
  
  @scala.inline
  implicit class SchemaGraphicsStatsOps[Self <: SchemaGraphicsStats] (val x: Self) extends AnyVal {
    
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
    def setBucketsVarargs(value: SchemaGraphicsStatsBucket*): Self = this.set("buckets", js.Array(value :_*))
    
    @scala.inline
    def setBuckets(value: js.Array[SchemaGraphicsStatsBucket]): Self = this.set("buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuckets: Self = this.set("buckets", js.undefined)
    
    @scala.inline
    def setHighInputLatencyCount(value: String): Self = this.set("highInputLatencyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighInputLatencyCount: Self = this.set("highInputLatencyCount", js.undefined)
    
    @scala.inline
    def setJankyFrames(value: String): Self = this.set("jankyFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJankyFrames: Self = this.set("jankyFrames", js.undefined)
    
    @scala.inline
    def setMissedVsyncCount(value: String): Self = this.set("missedVsyncCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissedVsyncCount: Self = this.set("missedVsyncCount", js.undefined)
    
    @scala.inline
    def setP50Millis(value: String): Self = this.set("p50Millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP50Millis: Self = this.set("p50Millis", js.undefined)
    
    @scala.inline
    def setP90Millis(value: String): Self = this.set("p90Millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP90Millis: Self = this.set("p90Millis", js.undefined)
    
    @scala.inline
    def setP95Millis(value: String): Self = this.set("p95Millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP95Millis: Self = this.set("p95Millis", js.undefined)
    
    @scala.inline
    def setP99Millis(value: String): Self = this.set("p99Millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP99Millis: Self = this.set("p99Millis", js.undefined)
    
    @scala.inline
    def setSlowBitmapUploadCount(value: String): Self = this.set("slowBitmapUploadCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlowBitmapUploadCount: Self = this.set("slowBitmapUploadCount", js.undefined)
    
    @scala.inline
    def setSlowDrawCount(value: String): Self = this.set("slowDrawCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlowDrawCount: Self = this.set("slowDrawCount", js.undefined)
    
    @scala.inline
    def setSlowUiThreadCount(value: String): Self = this.set("slowUiThreadCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlowUiThreadCount: Self = this.set("slowUiThreadCount", js.undefined)
    
    @scala.inline
    def setTotalFrames(value: String): Self = this.set("totalFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalFrames: Self = this.set("totalFrames", js.undefined)
  }
}
