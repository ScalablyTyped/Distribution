package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightsRepositoryEditReelResponseFbUserTags extends StObject {
  
  var in: js.Array[js.Any]
}
object HighlightsRepositoryEditReelResponseFbUserTags {
  
  @scala.inline
  def apply(in: js.Array[js.Any]): HighlightsRepositoryEditReelResponseFbUserTags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseFbUserTags]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryEditReelResponseFbUserTagsMutableBuilder[Self <: HighlightsRepositoryEditReelResponseFbUserTags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIn(value: js.Array[js.Any]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInVarargs(value: js.Any*): Self = StObject.set(x, "in", js.Array(value :_*))
  }
}
