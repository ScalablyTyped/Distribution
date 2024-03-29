package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightsRepositoryEditReelResponseParticipantsItem extends StObject {
  
  var answer: Double
  
  var ts: Double
  
  var user: HighlightsRepositoryEditReelResponseUser
}
object HighlightsRepositoryEditReelResponseParticipantsItem {
  
  inline def apply(answer: Double, ts: Double, user: HighlightsRepositoryEditReelResponseUser): HighlightsRepositoryEditReelResponseParticipantsItem = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseParticipantsItem]
  }
  
  extension [Self <: HighlightsRepositoryEditReelResponseParticipantsItem](x: Self) {
    
    inline def setAnswer(value: Double): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setUser(value: HighlightsRepositoryEditReelResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
