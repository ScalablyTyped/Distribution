package typings.instagramPrivateApi.igtvChannelFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgtvChannelFeedResponseImageVersions2 extends StObject {
  
  var additional_candidates: IgtvChannelFeedResponseAdditionalCandidates
  
  var candidates: js.Array[IgtvChannelFeedResponseCandidatesItem]
}
object IgtvChannelFeedResponseImageVersions2 {
  
  inline def apply(
    additional_candidates: IgtvChannelFeedResponseAdditionalCandidates,
    candidates: js.Array[IgtvChannelFeedResponseCandidatesItem]
  ): IgtvChannelFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(additional_candidates = additional_candidates.asInstanceOf[js.Any], candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvChannelFeedResponseImageVersions2]
  }
  
  extension [Self <: IgtvChannelFeedResponseImageVersions2](x: Self) {
    
    inline def setAdditional_candidates(value: IgtvChannelFeedResponseAdditionalCandidates): Self = StObject.set(x, "additional_candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidates(value: js.Array[IgtvChannelFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesVarargs(value: IgtvChannelFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
