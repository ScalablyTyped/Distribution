package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReelMediaViewerFeedResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[ListReelMediaViewerFeedResponseCandidatesItem] = js.native
}
object ListReelMediaViewerFeedResponseImageVersions2 {
  
  @scala.inline
  def apply(candidates: js.Array[ListReelMediaViewerFeedResponseCandidatesItem]): ListReelMediaViewerFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseImageVersions2]
  }
  
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseImageVersions2MutableBuilder[Self <: ListReelMediaViewerFeedResponseImageVersions2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidates(value: js.Array[ListReelMediaViewerFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidatesVarargs(value: ListReelMediaViewerFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
