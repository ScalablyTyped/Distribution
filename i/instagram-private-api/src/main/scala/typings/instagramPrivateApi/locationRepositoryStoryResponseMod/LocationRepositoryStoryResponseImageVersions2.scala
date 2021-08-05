package typings.instagramPrivateApi.locationRepositoryStoryResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationRepositoryStoryResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[LocationRepositoryStoryResponseCandidatesItem]
}
object LocationRepositoryStoryResponseImageVersions2 {
  
  inline def apply(candidates: js.Array[LocationRepositoryStoryResponseCandidatesItem]): LocationRepositoryStoryResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRepositoryStoryResponseImageVersions2]
  }
  
  extension [Self <: LocationRepositoryStoryResponseImageVersions2](x: Self) {
    
    inline def setCandidates(value: js.Array[LocationRepositoryStoryResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesVarargs(value: LocationRepositoryStoryResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
