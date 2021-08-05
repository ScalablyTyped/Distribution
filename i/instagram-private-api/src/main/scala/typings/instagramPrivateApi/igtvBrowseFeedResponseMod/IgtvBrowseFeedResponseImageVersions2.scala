package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgtvBrowseFeedResponseImageVersions2 extends StObject {
  
  var additional_candidates: IgtvBrowseFeedResponseAdditionalCandidates
  
  var candidates: js.Array[IgtvBrowseFeedResponseCandidatesItem]
}
object IgtvBrowseFeedResponseImageVersions2 {
  
  inline def apply(
    additional_candidates: IgtvBrowseFeedResponseAdditionalCandidates,
    candidates: js.Array[IgtvBrowseFeedResponseCandidatesItem]
  ): IgtvBrowseFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(additional_candidates = additional_candidates.asInstanceOf[js.Any], candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseImageVersions2]
  }
  
  extension [Self <: IgtvBrowseFeedResponseImageVersions2](x: Self) {
    
    inline def setAdditional_candidates(value: IgtvBrowseFeedResponseAdditionalCandidates): Self = StObject.set(x, "additional_candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidates(value: js.Array[IgtvBrowseFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesVarargs(value: IgtvBrowseFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
