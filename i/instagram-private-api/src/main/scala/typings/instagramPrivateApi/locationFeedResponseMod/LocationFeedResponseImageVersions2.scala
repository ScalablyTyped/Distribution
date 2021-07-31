package typings.instagramPrivateApi.locationFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationFeedResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[LocationFeedResponseCandidatesItem]
}
object LocationFeedResponseImageVersions2 {
  
  @scala.inline
  def apply(candidates: js.Array[LocationFeedResponseCandidatesItem]): LocationFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseImageVersions2]
  }
  
  @scala.inline
  implicit class LocationFeedResponseImageVersions2MutableBuilder[Self <: LocationFeedResponseImageVersions2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidates(value: js.Array[LocationFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidatesVarargs(value: LocationFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
