package typings.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxEventLoopDelay extends StObject {
  
  /**
    * maximum event loop delay duration in milliseconds over which incoming requests are rejected with an HTTP Server Timeout (503) response.
    * Defaults to 0 (no limit).
    */
  var maxEventLoopDelay: js.UndefOr[Double] = js.undefined
  
  /** maximum V8 heap size over which incoming requests are rejected with an HTTP Server Timeout (503) response. Defaults to 0 (no limit). */
  var maxHeapUsedBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * maximum process RSS size over which incoming requests are rejected with an HTTP Server Timeout (503) response. Defaults to 0 (no limit).
    */
  var maxRssBytes: js.UndefOr[Double] = js.undefined
  
  /** the frequency of sampling in milliseconds. When set to 0, the other load options are ignored. Defaults to 0 (no sampling). */
  var sampleInterval: js.UndefOr[Double] = js.undefined
}
object MaxEventLoopDelay {
  
  @scala.inline
  def apply(): MaxEventLoopDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxEventLoopDelay]
  }
  
  @scala.inline
  implicit class MaxEventLoopDelayMutableBuilder[Self <: MaxEventLoopDelay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxEventLoopDelay(value: Double): Self = StObject.set(x, "maxEventLoopDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxEventLoopDelayUndefined: Self = StObject.set(x, "maxEventLoopDelay", js.undefined)
    
    @scala.inline
    def setMaxHeapUsedBytes(value: Double): Self = StObject.set(x, "maxHeapUsedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeapUsedBytesUndefined: Self = StObject.set(x, "maxHeapUsedBytes", js.undefined)
    
    @scala.inline
    def setMaxRssBytes(value: Double): Self = StObject.set(x, "maxRssBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRssBytesUndefined: Self = StObject.set(x, "maxRssBytes", js.undefined)
    
    @scala.inline
    def setSampleInterval(value: Double): Self = StObject.set(x, "sampleInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleIntervalUndefined: Self = StObject.set(x, "sampleInterval", js.undefined)
  }
}
