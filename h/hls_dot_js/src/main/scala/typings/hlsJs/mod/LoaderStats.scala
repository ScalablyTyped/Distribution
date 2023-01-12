package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderStats extends StObject {
  
  var aborted: Boolean
  
  var buffering: HlsProgressivePerformanceTiming
  
  var bwEstimate: Double
  
  var chunkCount: Double
  
  var loaded: Double
  
  var loading: HlsProgressivePerformanceTiming
  
  var parsing: HlsPerformanceTiming
  
  var retry: Double
  
  var total: Double
}
object LoaderStats {
  
  inline def apply(
    aborted: Boolean,
    buffering: HlsProgressivePerformanceTiming,
    bwEstimate: Double,
    chunkCount: Double,
    loaded: Double,
    loading: HlsProgressivePerformanceTiming,
    parsing: HlsPerformanceTiming,
    retry: Double,
    total: Double
  ): LoaderStats = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], buffering = buffering.asInstanceOf[js.Any], bwEstimate = bwEstimate.asInstanceOf[js.Any], chunkCount = chunkCount.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], parsing = parsing.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoaderStats] (val x: Self) extends AnyVal {
    
    inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    
    inline def setBuffering(value: HlsProgressivePerformanceTiming): Self = StObject.set(x, "buffering", value.asInstanceOf[js.Any])
    
    inline def setBwEstimate(value: Double): Self = StObject.set(x, "bwEstimate", value.asInstanceOf[js.Any])
    
    inline def setChunkCount(value: Double): Self = StObject.set(x, "chunkCount", value.asInstanceOf[js.Any])
    
    inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: HlsProgressivePerformanceTiming): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setParsing(value: HlsPerformanceTiming): Self = StObject.set(x, "parsing", value.asInstanceOf[js.Any])
    
    inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
