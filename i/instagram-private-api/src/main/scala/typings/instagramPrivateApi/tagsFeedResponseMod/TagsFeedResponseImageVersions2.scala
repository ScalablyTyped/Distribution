package typings.instagramPrivateApi.tagsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsFeedResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[TagsFeedResponseCandidatesItem]
}
object TagsFeedResponseImageVersions2 {
  
  inline def apply(candidates: js.Array[TagsFeedResponseCandidatesItem]): TagsFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseImageVersions2]
  }
  
  extension [Self <: TagsFeedResponseImageVersions2](x: Self) {
    
    inline def setCandidates(value: js.Array[TagsFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesVarargs(value: TagsFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
