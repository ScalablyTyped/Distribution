package typings.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightsRepositoryHighlightsTrayResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[HighlightsRepositoryHighlightsTrayResponseCandidatesItem]
}
object HighlightsRepositoryHighlightsTrayResponseImageVersions2 {
  
  inline def apply(candidates: js.Array[HighlightsRepositoryHighlightsTrayResponseCandidatesItem]): HighlightsRepositoryHighlightsTrayResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseImageVersions2]
  }
  
  extension [Self <: HighlightsRepositoryHighlightsTrayResponseImageVersions2](x: Self) {
    
    inline def setCandidates(value: js.Array[HighlightsRepositoryHighlightsTrayResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesVarargs(value: HighlightsRepositoryHighlightsTrayResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
