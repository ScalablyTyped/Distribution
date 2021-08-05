package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReelMediaViewerFeedResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[ListReelMediaViewerFeedResponseCandidatesItem]
}
object ListReelMediaViewerFeedResponseImageVersions2 {
  
  inline def apply(candidates: js.Array[ListReelMediaViewerFeedResponseCandidatesItem]): ListReelMediaViewerFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseImageVersions2]
  }
  
  extension [Self <: ListReelMediaViewerFeedResponseImageVersions2](x: Self) {
    
    inline def setCandidates(value: js.Array[ListReelMediaViewerFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesVarargs(value: ListReelMediaViewerFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
