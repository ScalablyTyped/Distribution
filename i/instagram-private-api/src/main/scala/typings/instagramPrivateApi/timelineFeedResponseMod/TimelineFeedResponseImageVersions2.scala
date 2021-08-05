package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineFeedResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[TimelineFeedResponseCandidatesItem]
}
object TimelineFeedResponseImageVersions2 {
  
  inline def apply(candidates: js.Array[TimelineFeedResponseCandidatesItem]): TimelineFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseImageVersions2]
  }
  
  extension [Self <: TimelineFeedResponseImageVersions2](x: Self) {
    
    inline def setCandidates(value: js.Array[TimelineFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesVarargs(value: TimelineFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
