package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightsRepositoryEditReelResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[HighlightsRepositoryEditReelResponseCandidatesItem]
}
object HighlightsRepositoryEditReelResponseImageVersions2 {
  
  inline def apply(candidates: js.Array[HighlightsRepositoryEditReelResponseCandidatesItem]): HighlightsRepositoryEditReelResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseImageVersions2]
  }
  
  extension [Self <: HighlightsRepositoryEditReelResponseImageVersions2](x: Self) {
    
    inline def setCandidates(value: js.Array[HighlightsRepositoryEditReelResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesVarargs(value: HighlightsRepositoryEditReelResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
