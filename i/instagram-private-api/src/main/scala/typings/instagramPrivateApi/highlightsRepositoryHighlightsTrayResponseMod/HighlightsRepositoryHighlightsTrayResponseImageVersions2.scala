package typings.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightsRepositoryHighlightsTrayResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[HighlightsRepositoryHighlightsTrayResponseCandidatesItem]
}
object HighlightsRepositoryHighlightsTrayResponseImageVersions2 {
  
  @scala.inline
  def apply(candidates: js.Array[HighlightsRepositoryHighlightsTrayResponseCandidatesItem]): HighlightsRepositoryHighlightsTrayResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseImageVersions2]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryHighlightsTrayResponseImageVersions2MutableBuilder[Self <: HighlightsRepositoryHighlightsTrayResponseImageVersions2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidates(value: js.Array[HighlightsRepositoryHighlightsTrayResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidatesVarargs(value: HighlightsRepositoryHighlightsTrayResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
