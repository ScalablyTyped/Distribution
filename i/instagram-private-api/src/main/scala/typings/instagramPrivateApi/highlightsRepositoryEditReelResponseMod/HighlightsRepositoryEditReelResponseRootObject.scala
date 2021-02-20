package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightsRepositoryEditReelResponseRootObject extends StObject {
  
  var reel: HighlightsRepositoryEditReelResponseReel = js.native
  
  var status: String = js.native
}
object HighlightsRepositoryEditReelResponseRootObject {
  
  @scala.inline
  def apply(reel: HighlightsRepositoryEditReelResponseReel, status: String): HighlightsRepositoryEditReelResponseRootObject = {
    val __obj = js.Dynamic.literal(reel = reel.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseRootObject]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryEditReelResponseRootObjectMutableBuilder[Self <: HighlightsRepositoryEditReelResponseRootObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReel(value: HighlightsRepositoryEditReelResponseReel): Self = StObject.set(x, "reel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
