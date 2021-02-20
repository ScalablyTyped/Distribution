package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightsRepositoryEditReelResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[HighlightsRepositoryEditReelResponseCandidatesItem] = js.native
}
object HighlightsRepositoryEditReelResponseImageVersions2 {
  
  @scala.inline
  def apply(candidates: js.Array[HighlightsRepositoryEditReelResponseCandidatesItem]): HighlightsRepositoryEditReelResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseImageVersions2]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryEditReelResponseImageVersions2MutableBuilder[Self <: HighlightsRepositoryEditReelResponseImageVersions2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidates(value: js.Array[HighlightsRepositoryEditReelResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidatesVarargs(value: HighlightsRepositoryEditReelResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
