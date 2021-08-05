package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsTrayFeedResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[ReelsTrayFeedResponseCandidatesItem]
}
object ReelsTrayFeedResponseImageVersions2 {
  
  inline def apply(candidates: js.Array[ReelsTrayFeedResponseCandidatesItem]): ReelsTrayFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseImageVersions2]
  }
  
  extension [Self <: ReelsTrayFeedResponseImageVersions2](x: Self) {
    
    inline def setCandidates(value: js.Array[ReelsTrayFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesVarargs(value: ReelsTrayFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
