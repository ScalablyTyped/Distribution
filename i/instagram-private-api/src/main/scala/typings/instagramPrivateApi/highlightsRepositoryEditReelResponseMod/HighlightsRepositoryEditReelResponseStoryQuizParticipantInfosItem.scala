package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightsRepositoryEditReelResponseStoryQuizParticipantInfosItem extends StObject {
  
  var max_id: Null = js.native
  
  var more_available: Boolean = js.native
  
  var participants: js.Array[HighlightsRepositoryEditReelResponseParticipantsItem] = js.native
  
  var quiz_id: String = js.native
}
object HighlightsRepositoryEditReelResponseStoryQuizParticipantInfosItem {
  
  @scala.inline
  def apply(
    max_id: Null,
    more_available: Boolean,
    participants: js.Array[HighlightsRepositoryEditReelResponseParticipantsItem],
    quiz_id: String
  ): HighlightsRepositoryEditReelResponseStoryQuizParticipantInfosItem = {
    val __obj = js.Dynamic.literal(max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], quiz_id = quiz_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseStoryQuizParticipantInfosItem]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryEditReelResponseStoryQuizParticipantInfosItemMutableBuilder[Self <: HighlightsRepositoryEditReelResponseStoryQuizParticipantInfosItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax_id(value: Null): Self = StObject.set(x, "max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipants(value: js.Array[HighlightsRepositoryEditReelResponseParticipantsItem]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantsVarargs(value: HighlightsRepositoryEditReelResponseParticipantsItem*): Self = StObject.set(x, "participants", js.Array(value :_*))
    
    @scala.inline
    def setQuiz_id(value: String): Self = StObject.set(x, "quiz_id", value.asInstanceOf[js.Any])
  }
}
