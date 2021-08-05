package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsMediaFeedResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[ReelsMediaFeedResponseCandidatesItem]
}
object ReelsMediaFeedResponseImageVersions2 {
  
  inline def apply(candidates: js.Array[ReelsMediaFeedResponseCandidatesItem]): ReelsMediaFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseImageVersions2]
  }
  
  extension [Self <: ReelsMediaFeedResponseImageVersions2](x: Self) {
    
    inline def setCandidates(value: js.Array[ReelsMediaFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesVarargs(value: ReelsMediaFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
