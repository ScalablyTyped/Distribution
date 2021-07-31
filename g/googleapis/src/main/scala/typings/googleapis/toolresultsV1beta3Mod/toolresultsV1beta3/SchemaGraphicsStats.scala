package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Graphics statistics for the App. The information is collected from &#39;adb
  * shell dumpsys graphicsstats&#39;. For more info see:
  * https://developer.android.com/training/testing/performance.html Statistics
  * will only be present for API 23+.
  */
trait SchemaGraphicsStats extends StObject {
  
  /**
    * Histogram of frame render times. There should be 154 buckets ranging from
    * [5ms, 6ms) to [4950ms, infinity)
    */
  var buckets: js.UndefOr[js.Array[SchemaGraphicsStatsBucket]] = js.undefined
  
  /**
    * Total &quot;high input latency&quot; events.
    */
  var highInputLatencyCount: js.UndefOr[String] = js.undefined
  
  /**
    * Total frames with slow render time. Should be &lt;= total_frames.
    */
  var jankyFrames: js.UndefOr[String] = js.undefined
  
  /**
    * Total &quot;missed vsync&quot; events.
    */
  var missedVsyncCount: js.UndefOr[String] = js.undefined
  
  /**
    * 50th percentile frame render time in milliseconds.
    */
  var p50Millis: js.UndefOr[String] = js.undefined
  
  /**
    * 90th percentile frame render time in milliseconds.
    */
  var p90Millis: js.UndefOr[String] = js.undefined
  
  /**
    * 95th percentile frame render time in milliseconds.
    */
  var p95Millis: js.UndefOr[String] = js.undefined
  
  /**
    * 99th percentile frame render time in milliseconds.
    */
  var p99Millis: js.UndefOr[String] = js.undefined
  
  /**
    * Total &quot;slow bitmap upload&quot; events.
    */
  var slowBitmapUploadCount: js.UndefOr[String] = js.undefined
  
  /**
    * Total &quot;slow draw&quot; events.
    */
  var slowDrawCount: js.UndefOr[String] = js.undefined
  
  /**
    * Total &quot;slow UI thread&quot; events.
    */
  var slowUiThreadCount: js.UndefOr[String] = js.undefined
  
  /**
    * Total frames rendered by package.
    */
  var totalFrames: js.UndefOr[String] = js.undefined
}
object SchemaGraphicsStats {
  
  @scala.inline
  def apply(): SchemaGraphicsStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGraphicsStats]
  }
  
  @scala.inline
  implicit class SchemaGraphicsStatsMutableBuilder[Self <: SchemaGraphicsStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuckets(value: js.Array[SchemaGraphicsStatsBucket]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    @scala.inline
    def setBucketsVarargs(value: SchemaGraphicsStatsBucket*): Self = StObject.set(x, "buckets", js.Array(value :_*))
    
    @scala.inline
    def setHighInputLatencyCount(value: String): Self = StObject.set(x, "highInputLatencyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighInputLatencyCountUndefined: Self = StObject.set(x, "highInputLatencyCount", js.undefined)
    
    @scala.inline
    def setJankyFrames(value: String): Self = StObject.set(x, "jankyFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJankyFramesUndefined: Self = StObject.set(x, "jankyFrames", js.undefined)
    
    @scala.inline
    def setMissedVsyncCount(value: String): Self = StObject.set(x, "missedVsyncCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissedVsyncCountUndefined: Self = StObject.set(x, "missedVsyncCount", js.undefined)
    
    @scala.inline
    def setP50Millis(value: String): Self = StObject.set(x, "p50Millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP50MillisUndefined: Self = StObject.set(x, "p50Millis", js.undefined)
    
    @scala.inline
    def setP90Millis(value: String): Self = StObject.set(x, "p90Millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP90MillisUndefined: Self = StObject.set(x, "p90Millis", js.undefined)
    
    @scala.inline
    def setP95Millis(value: String): Self = StObject.set(x, "p95Millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP95MillisUndefined: Self = StObject.set(x, "p95Millis", js.undefined)
    
    @scala.inline
    def setP99Millis(value: String): Self = StObject.set(x, "p99Millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP99MillisUndefined: Self = StObject.set(x, "p99Millis", js.undefined)
    
    @scala.inline
    def setSlowBitmapUploadCount(value: String): Self = StObject.set(x, "slowBitmapUploadCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlowBitmapUploadCountUndefined: Self = StObject.set(x, "slowBitmapUploadCount", js.undefined)
    
    @scala.inline
    def setSlowDrawCount(value: String): Self = StObject.set(x, "slowDrawCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlowDrawCountUndefined: Self = StObject.set(x, "slowDrawCount", js.undefined)
    
    @scala.inline
    def setSlowUiThreadCount(value: String): Self = StObject.set(x, "slowUiThreadCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlowUiThreadCountUndefined: Self = StObject.set(x, "slowUiThreadCount", js.undefined)
    
    @scala.inline
    def setTotalFrames(value: String): Self = StObject.set(x, "totalFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFramesUndefined: Self = StObject.set(x, "totalFrames", js.undefined)
  }
}
