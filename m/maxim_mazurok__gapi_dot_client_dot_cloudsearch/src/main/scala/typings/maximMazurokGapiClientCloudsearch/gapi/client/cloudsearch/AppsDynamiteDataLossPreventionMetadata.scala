package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteDataLossPreventionMetadata extends StObject {
  
  /** The DLP scan summary that should only be set after the message is scanned in the Chat backend. */
  var dlpScanSummary: js.UndefOr[AppsDynamiteBackendDlpScanSummary] = js.undefined
  
  /** Flag set by client on message resend to bypass WARN violation. */
  var warnAcknowledged: js.UndefOr[Boolean] = js.undefined
}
object AppsDynamiteDataLossPreventionMetadata {
  
  inline def apply(): AppsDynamiteDataLossPreventionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteDataLossPreventionMetadata]
  }
  
  extension [Self <: AppsDynamiteDataLossPreventionMetadata](x: Self) {
    
    inline def setDlpScanSummary(value: AppsDynamiteBackendDlpScanSummary): Self = StObject.set(x, "dlpScanSummary", value.asInstanceOf[js.Any])
    
    inline def setDlpScanSummaryUndefined: Self = StObject.set(x, "dlpScanSummary", js.undefined)
    
    inline def setWarnAcknowledged(value: Boolean): Self = StObject.set(x, "warnAcknowledged", value.asInstanceOf[js.Any])
    
    inline def setWarnAcknowledgedUndefined: Self = StObject.set(x, "warnAcknowledged", js.undefined)
  }
}
