package typings.instagramPrivateApi.locationFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationFeedResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[LocationFeedResponseCandidatesItem]
}
object LocationFeedResponseImageVersions2 {
  
  inline def apply(candidates: js.Array[LocationFeedResponseCandidatesItem]): LocationFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseImageVersions2]
  }
  
  extension [Self <: LocationFeedResponseImageVersions2](x: Self) {
    
    inline def setCandidates(value: js.Array[LocationFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesVarargs(value: LocationFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
