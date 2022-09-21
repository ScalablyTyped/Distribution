package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamViewerStats extends StObject {
  
  /** The estimate of the current viewer count. */
  var estimatedViewerCount: js.UndefOr[String] = js.undefined
}
object StreamViewerStats {
  
  inline def apply(): StreamViewerStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamViewerStats]
  }
  
  extension [Self <: StreamViewerStats](x: Self) {
    
    inline def setEstimatedViewerCount(value: String): Self = StObject.set(x, "estimatedViewerCount", value.asInstanceOf[js.Any])
    
    inline def setEstimatedViewerCountUndefined: Self = StObject.set(x, "estimatedViewerCount", js.undefined)
  }
}
