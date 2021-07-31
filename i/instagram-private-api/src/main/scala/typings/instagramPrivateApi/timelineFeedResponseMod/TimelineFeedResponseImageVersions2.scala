package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineFeedResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[TimelineFeedResponseCandidatesItem]
}
object TimelineFeedResponseImageVersions2 {
  
  @scala.inline
  def apply(candidates: js.Array[TimelineFeedResponseCandidatesItem]): TimelineFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseImageVersions2]
  }
  
  @scala.inline
  implicit class TimelineFeedResponseImageVersions2MutableBuilder[Self <: TimelineFeedResponseImageVersions2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidates(value: js.Array[TimelineFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidatesVarargs(value: TimelineFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
