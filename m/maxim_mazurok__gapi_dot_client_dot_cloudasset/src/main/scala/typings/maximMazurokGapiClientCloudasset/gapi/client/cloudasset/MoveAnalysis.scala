package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveAnalysis extends StObject {
  
  /** Analysis result of moving the target resource. */
  var analysis: js.UndefOr[MoveAnalysisResult] = js.undefined
  
  /** The user friendly display name of the analysis. E.g. IAM, Organization Policy etc. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Description of error encountered when performing the analysis. */
  var error: js.UndefOr[Status] = js.undefined
}
object MoveAnalysis {
  
  inline def apply(): MoveAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveAnalysis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveAnalysis] (val x: Self) extends AnyVal {
    
    inline def setAnalysis(value: MoveAnalysisResult): Self = StObject.set(x, "analysis", value.asInstanceOf[js.Any])
    
    inline def setAnalysisUndefined: Self = StObject.set(x, "analysis", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
