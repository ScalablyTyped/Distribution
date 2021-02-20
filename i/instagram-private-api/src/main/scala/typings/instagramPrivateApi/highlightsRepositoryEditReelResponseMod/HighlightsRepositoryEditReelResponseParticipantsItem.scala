package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightsRepositoryEditReelResponseParticipantsItem extends StObject {
  
  var answer: Double = js.native
  
  var ts: Double = js.native
  
  var user: HighlightsRepositoryEditReelResponseUser = js.native
}
object HighlightsRepositoryEditReelResponseParticipantsItem {
  
  @scala.inline
  def apply(answer: Double, ts: Double, user: HighlightsRepositoryEditReelResponseUser): HighlightsRepositoryEditReelResponseParticipantsItem = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseParticipantsItem]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryEditReelResponseParticipantsItemMutableBuilder[Self <: HighlightsRepositoryEditReelResponseParticipantsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnswer(value: Double): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: HighlightsRepositoryEditReelResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
