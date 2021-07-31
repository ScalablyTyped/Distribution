package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Discovered extends StObject {
  
  /** The status of discovery for the resource. */
  var analysisStatus: js.UndefOr[String] = js.undefined
  
  /** When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage is output only and populated by the API. */
  var analysisStatusError: js.UndefOr[Status] = js.undefined
  
  /** Whether the resource is continuously analyzed. */
  var continuousAnalysis: js.UndefOr[String] = js.undefined
  
  /** The last time continuous analysis was done for this resource. Deprecated, do not use. */
  var lastAnalysisTime: js.UndefOr[String] = js.undefined
}
object Discovered {
  
  @scala.inline
  def apply(): Discovered = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Discovered]
  }
  
  @scala.inline
  implicit class DiscoveredMutableBuilder[Self <: Discovered] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisStatus(value: String): Self = StObject.set(x, "analysisStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisStatusError(value: Status): Self = StObject.set(x, "analysisStatusError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisStatusErrorUndefined: Self = StObject.set(x, "analysisStatusError", js.undefined)
    
    @scala.inline
    def setAnalysisStatusUndefined: Self = StObject.set(x, "analysisStatus", js.undefined)
    
    @scala.inline
    def setContinuousAnalysis(value: String): Self = StObject.set(x, "continuousAnalysis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousAnalysisUndefined: Self = StObject.set(x, "continuousAnalysis", js.undefined)
    
    @scala.inline
    def setLastAnalysisTime(value: String): Self = StObject.set(x, "lastAnalysisTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAnalysisTimeUndefined: Self = StObject.set(x, "lastAnalysisTime", js.undefined)
  }
}
