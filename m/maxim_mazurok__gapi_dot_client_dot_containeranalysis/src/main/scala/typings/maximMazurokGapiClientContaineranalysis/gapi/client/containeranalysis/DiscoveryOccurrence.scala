package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoveryOccurrence extends StObject {
  
  var analysisCompleted: js.UndefOr[AnalysisCompleted] = js.undefined
  
  /** Indicates any errors encountered during analysis of a resource. There could be 0 or more of these errors. */
  var analysisError: js.UndefOr[js.Array[Status]] = js.undefined
  
  /** The status of discovery for the resource. */
  var analysisStatus: js.UndefOr[String] = js.undefined
  
  /** When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage is output only and populated by the API. */
  var analysisStatusError: js.UndefOr[Status] = js.undefined
  
  /** Output only. The time occurrences related to this discovery occurrence were archived. */
  var archiveTime: js.UndefOr[String] = js.undefined
  
  /** Whether the resource is continuously analyzed. */
  var continuousAnalysis: js.UndefOr[String] = js.undefined
  
  /** The CPE of the resource being scanned. */
  var cpe: js.UndefOr[String] = js.undefined
  
  /** The last time this resource was scanned. */
  var lastScanTime: js.UndefOr[String] = js.undefined
}
object DiscoveryOccurrence {
  
  inline def apply(): DiscoveryOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoveryOccurrence]
  }
  
  extension [Self <: DiscoveryOccurrence](x: Self) {
    
    inline def setAnalysisCompleted(value: AnalysisCompleted): Self = StObject.set(x, "analysisCompleted", value.asInstanceOf[js.Any])
    
    inline def setAnalysisCompletedUndefined: Self = StObject.set(x, "analysisCompleted", js.undefined)
    
    inline def setAnalysisError(value: js.Array[Status]): Self = StObject.set(x, "analysisError", value.asInstanceOf[js.Any])
    
    inline def setAnalysisErrorUndefined: Self = StObject.set(x, "analysisError", js.undefined)
    
    inline def setAnalysisErrorVarargs(value: Status*): Self = StObject.set(x, "analysisError", js.Array(value*))
    
    inline def setAnalysisStatus(value: String): Self = StObject.set(x, "analysisStatus", value.asInstanceOf[js.Any])
    
    inline def setAnalysisStatusError(value: Status): Self = StObject.set(x, "analysisStatusError", value.asInstanceOf[js.Any])
    
    inline def setAnalysisStatusErrorUndefined: Self = StObject.set(x, "analysisStatusError", js.undefined)
    
    inline def setAnalysisStatusUndefined: Self = StObject.set(x, "analysisStatus", js.undefined)
    
    inline def setArchiveTime(value: String): Self = StObject.set(x, "archiveTime", value.asInstanceOf[js.Any])
    
    inline def setArchiveTimeUndefined: Self = StObject.set(x, "archiveTime", js.undefined)
    
    inline def setContinuousAnalysis(value: String): Self = StObject.set(x, "continuousAnalysis", value.asInstanceOf[js.Any])
    
    inline def setContinuousAnalysisUndefined: Self = StObject.set(x, "continuousAnalysis", js.undefined)
    
    inline def setCpe(value: String): Self = StObject.set(x, "cpe", value.asInstanceOf[js.Any])
    
    inline def setCpeUndefined: Self = StObject.set(x, "cpe", js.undefined)
    
    inline def setLastScanTime(value: String): Self = StObject.set(x, "lastScanTime", value.asInstanceOf[js.Any])
    
    inline def setLastScanTimeUndefined: Self = StObject.set(x, "lastScanTime", js.undefined)
  }
}
