package typings.instagramPrivateApi.locationRepositoryStoryResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationRepositoryStoryResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[LocationRepositoryStoryResponseCandidatesItem]
}
object LocationRepositoryStoryResponseImageVersions2 {
  
  @scala.inline
  def apply(candidates: js.Array[LocationRepositoryStoryResponseCandidatesItem]): LocationRepositoryStoryResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRepositoryStoryResponseImageVersions2]
  }
  
  @scala.inline
  implicit class LocationRepositoryStoryResponseImageVersions2MutableBuilder[Self <: LocationRepositoryStoryResponseImageVersions2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidates(value: js.Array[LocationRepositoryStoryResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidatesVarargs(value: LocationRepositoryStoryResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
