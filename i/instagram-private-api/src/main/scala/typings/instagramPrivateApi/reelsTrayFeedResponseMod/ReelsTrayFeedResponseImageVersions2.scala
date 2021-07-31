package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsTrayFeedResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[ReelsTrayFeedResponseCandidatesItem]
}
object ReelsTrayFeedResponseImageVersions2 {
  
  @scala.inline
  def apply(candidates: js.Array[ReelsTrayFeedResponseCandidatesItem]): ReelsTrayFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseImageVersions2]
  }
  
  @scala.inline
  implicit class ReelsTrayFeedResponseImageVersions2MutableBuilder[Self <: ReelsTrayFeedResponseImageVersions2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidates(value: js.Array[ReelsTrayFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidatesVarargs(value: ReelsTrayFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
