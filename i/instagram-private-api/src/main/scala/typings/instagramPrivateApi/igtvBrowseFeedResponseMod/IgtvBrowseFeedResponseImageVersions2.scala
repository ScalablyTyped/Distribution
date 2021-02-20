package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgtvBrowseFeedResponseImageVersions2 extends StObject {
  
  var additional_candidates: IgtvBrowseFeedResponseAdditionalCandidates = js.native
  
  var candidates: js.Array[IgtvBrowseFeedResponseCandidatesItem] = js.native
}
object IgtvBrowseFeedResponseImageVersions2 {
  
  @scala.inline
  def apply(
    additional_candidates: IgtvBrowseFeedResponseAdditionalCandidates,
    candidates: js.Array[IgtvBrowseFeedResponseCandidatesItem]
  ): IgtvBrowseFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(additional_candidates = additional_candidates.asInstanceOf[js.Any], candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseImageVersions2]
  }
  
  @scala.inline
  implicit class IgtvBrowseFeedResponseImageVersions2MutableBuilder[Self <: IgtvBrowseFeedResponseImageVersions2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditional_candidates(value: IgtvBrowseFeedResponseAdditionalCandidates): Self = StObject.set(x, "additional_candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidates(value: js.Array[IgtvBrowseFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidatesVarargs(value: IgtvBrowseFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
