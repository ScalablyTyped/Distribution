package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "LoadStats")
@js.native
open class LoadStats ()
  extends StObject
     with LoaderStats {
  
  /* CompleteClass */
  var aborted: Boolean = js.native
  
  /* CompleteClass */
  var buffering: HlsProgressivePerformanceTiming = js.native
  
  /* CompleteClass */
  var bwEstimate: Double = js.native
  
  /* CompleteClass */
  var chunkCount: Double = js.native
  
  /* CompleteClass */
  var loaded: Double = js.native
  
  /* CompleteClass */
  var loading: HlsProgressivePerformanceTiming = js.native
  
  /* CompleteClass */
  var parsing: HlsPerformanceTiming = js.native
  
  /* CompleteClass */
  var retry: Double = js.native
  
  /* CompleteClass */
  var total: Double = js.native
}
