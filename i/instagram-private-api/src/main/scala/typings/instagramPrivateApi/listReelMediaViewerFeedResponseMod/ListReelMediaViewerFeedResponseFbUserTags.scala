package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReelMediaViewerFeedResponseFbUserTags extends StObject {
  
  var in: js.Array[_] = js.native
}
object ListReelMediaViewerFeedResponseFbUserTags {
  
  @scala.inline
  def apply(in: js.Array[_]): ListReelMediaViewerFeedResponseFbUserTags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseFbUserTags]
  }
  
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseFbUserTagsMutableBuilder[Self <: ListReelMediaViewerFeedResponseFbUserTags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIn(value: js.Array[_]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInVarargs(value: js.Any*): Self = StObject.set(x, "in", js.Array(value :_*))
  }
}
