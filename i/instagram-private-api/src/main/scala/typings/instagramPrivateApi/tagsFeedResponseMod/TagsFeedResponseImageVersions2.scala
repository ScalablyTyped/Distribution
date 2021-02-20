package typings.instagramPrivateApi.tagsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagsFeedResponseImageVersions2 extends StObject {
  
  var candidates: js.Array[TagsFeedResponseCandidatesItem] = js.native
}
object TagsFeedResponseImageVersions2 {
  
  @scala.inline
  def apply(candidates: js.Array[TagsFeedResponseCandidatesItem]): TagsFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseImageVersions2]
  }
  
  @scala.inline
  implicit class TagsFeedResponseImageVersions2MutableBuilder[Self <: TagsFeedResponseImageVersions2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidates(value: js.Array[TagsFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidatesVarargs(value: TagsFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
