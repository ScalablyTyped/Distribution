package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsMediaFeedResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[ReelsMediaFeedResponseCandidatesItem]
}
object ReelsMediaFeedResponseImageVersions2 {
  
  @scala.inline
  def apply(candidates: js.Array[ReelsMediaFeedResponseCandidatesItem]): ReelsMediaFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseImageVersions2]
  }
  
  @scala.inline
  implicit class ReelsMediaFeedResponseImageVersions2MutableBuilder[Self <: ReelsMediaFeedResponseImageVersions2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidates(value: js.Array[ReelsMediaFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidatesVarargs(value: ReelsMediaFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
