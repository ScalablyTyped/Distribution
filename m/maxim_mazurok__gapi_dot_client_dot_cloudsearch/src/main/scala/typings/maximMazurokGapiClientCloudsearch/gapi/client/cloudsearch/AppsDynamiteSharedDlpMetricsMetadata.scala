package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedDlpMetricsMetadata extends StObject {
  
  /** [required] Describes the DLP status of message send and attachment upload events. */
  var dlpStatus: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedDlpMetricsMetadata {
  
  inline def apply(): AppsDynamiteSharedDlpMetricsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedDlpMetricsMetadata]
  }
  
  extension [Self <: AppsDynamiteSharedDlpMetricsMetadata](x: Self) {
    
    inline def setDlpStatus(value: String): Self = StObject.set(x, "dlpStatus", value.asInstanceOf[js.Any])
    
    inline def setDlpStatusUndefined: Self = StObject.set(x, "dlpStatus", js.undefined)
  }
}
