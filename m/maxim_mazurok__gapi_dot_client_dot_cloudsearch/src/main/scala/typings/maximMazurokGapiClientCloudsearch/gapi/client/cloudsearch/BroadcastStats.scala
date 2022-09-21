package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BroadcastStats extends StObject {
  
  /** Estimated concurrent viewer count. */
  var estimatedViewerCount: js.UndefOr[String] = js.undefined
}
object BroadcastStats {
  
  inline def apply(): BroadcastStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BroadcastStats]
  }
  
  extension [Self <: BroadcastStats](x: Self) {
    
    inline def setEstimatedViewerCount(value: String): Self = StObject.set(x, "estimatedViewerCount", value.asInstanceOf[js.Any])
    
    inline def setEstimatedViewerCountUndefined: Self = StObject.set(x, "estimatedViewerCount", js.undefined)
  }
}
