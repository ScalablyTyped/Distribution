package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseImageVersions2 extends StObject {
  
  var additional_candidates: js.UndefOr[TopicalExploreFeedResponseAdditionalCandidates] = js.undefined
  
  var candidates: js.Array[TopicalExploreFeedResponseCandidatesItem]
}
object TopicalExploreFeedResponseImageVersions2 {
  
  inline def apply(candidates: js.Array[TopicalExploreFeedResponseCandidatesItem]): TopicalExploreFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseImageVersions2]
  }
  
  extension [Self <: TopicalExploreFeedResponseImageVersions2](x: Self) {
    
    inline def setAdditional_candidates(value: TopicalExploreFeedResponseAdditionalCandidates): Self = StObject.set(x, "additional_candidates", value.asInstanceOf[js.Any])
    
    inline def setAdditional_candidatesUndefined: Self = StObject.set(x, "additional_candidates", js.undefined)
    
    inline def setCandidates(value: js.Array[TopicalExploreFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesVarargs(value: TopicalExploreFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
