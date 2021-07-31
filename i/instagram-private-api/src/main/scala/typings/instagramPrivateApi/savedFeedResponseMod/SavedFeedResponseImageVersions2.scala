package typings.instagramPrivateApi.savedFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedFeedResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[SavedFeedResponseCandidatesItem]
}
object SavedFeedResponseImageVersions2 {
  
  @scala.inline
  def apply(candidates: js.Array[SavedFeedResponseCandidatesItem]): SavedFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseImageVersions2]
  }
  
  @scala.inline
  implicit class SavedFeedResponseImageVersions2MutableBuilder[Self <: SavedFeedResponseImageVersions2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidates(value: js.Array[SavedFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidatesVarargs(value: SavedFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
