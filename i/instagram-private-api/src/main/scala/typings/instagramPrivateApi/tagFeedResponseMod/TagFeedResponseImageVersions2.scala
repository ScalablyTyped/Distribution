package typings.instagramPrivateApi.tagFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFeedResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[TagFeedResponseCandidatesItem]
}
object TagFeedResponseImageVersions2 {
  
  inline def apply(candidates: js.Array[TagFeedResponseCandidatesItem]): TagFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseImageVersions2]
  }
  
  extension [Self <: TagFeedResponseImageVersions2](x: Self) {
    
    inline def setCandidates(value: js.Array[TagFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesVarargs(value: TagFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
