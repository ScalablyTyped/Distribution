package typings.instagramPrivateApi.tagFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFeedResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[TagFeedResponseCandidatesItem]
}
object TagFeedResponseImageVersions2 {
  
  @scala.inline
  def apply(candidates: js.Array[TagFeedResponseCandidatesItem]): TagFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseImageVersions2]
  }
  
  @scala.inline
  implicit class TagFeedResponseImageVersions2MutableBuilder[Self <: TagFeedResponseImageVersions2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidates(value: js.Array[TagFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidatesVarargs(value: TagFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
