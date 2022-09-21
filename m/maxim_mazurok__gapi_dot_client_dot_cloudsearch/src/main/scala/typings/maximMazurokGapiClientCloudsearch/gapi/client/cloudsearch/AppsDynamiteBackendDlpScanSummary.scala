package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteBackendDlpScanSummary extends StObject {
  
  /**
    * The scan ID of the corresponding {@link DlpViolationScanRecord} in the {@link EphemeralDlpScans} Spanner table. This can be used to fetch additional details about the scan, e.g. for
    * audit logging.
    */
  var scanId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that was no attempt to scan a message or attachment because it was not applicable in the given context (e.g. atomic mutuate). If this is true, scan_outcome should not be
    * set. This flag is used to identify messages that DLP did not attempt to scan for monitoring scan coverage. Contents that DLP attempted to scan but skipped can be identified by
    * DlpScanOutcome.SCAN_SKIPPED_* reasons.
    */
  var scanNotApplicableForContext: js.UndefOr[Boolean] = js.undefined
  
  /** The outcome of a DLP Scan. If this is set, scan_not_applicable_for_context should not be true. */
  var scanOutcome: js.UndefOr[String] = js.undefined
}
object AppsDynamiteBackendDlpScanSummary {
  
  inline def apply(): AppsDynamiteBackendDlpScanSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteBackendDlpScanSummary]
  }
  
  extension [Self <: AppsDynamiteBackendDlpScanSummary](x: Self) {
    
    inline def setScanId(value: String): Self = StObject.set(x, "scanId", value.asInstanceOf[js.Any])
    
    inline def setScanIdUndefined: Self = StObject.set(x, "scanId", js.undefined)
    
    inline def setScanNotApplicableForContext(value: Boolean): Self = StObject.set(x, "scanNotApplicableForContext", value.asInstanceOf[js.Any])
    
    inline def setScanNotApplicableForContextUndefined: Self = StObject.set(x, "scanNotApplicableForContext", js.undefined)
    
    inline def setScanOutcome(value: String): Self = StObject.set(x, "scanOutcome", value.asInstanceOf[js.Any])
    
    inline def setScanOutcomeUndefined: Self = StObject.set(x, "scanOutcome", js.undefined)
  }
}
