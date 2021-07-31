package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsMediaFeedResponsePollSticker extends StObject {
  
  var finished: Boolean
  
  var id: String
  
  var is_shared_result: Boolean
  
  var poll_id: Double
  
  var promotion_tallies: Null
  
  var question: String
  
  var tallies: js.Array[ReelsMediaFeedResponseTalliesItem]
  
  var viewer_can_vote: Boolean
  
  var viewer_vote: js.UndefOr[Double] = js.undefined
}
object ReelsMediaFeedResponsePollSticker {
  
  @scala.inline
  def apply(
    finished: Boolean,
    id: String,
    is_shared_result: Boolean,
    poll_id: Double,
    promotion_tallies: Null,
    question: String,
    tallies: js.Array[ReelsMediaFeedResponseTalliesItem],
    viewer_can_vote: Boolean
  ): ReelsMediaFeedResponsePollSticker = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_shared_result = is_shared_result.asInstanceOf[js.Any], poll_id = poll_id.asInstanceOf[js.Any], promotion_tallies = promotion_tallies.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], tallies = tallies.asInstanceOf[js.Any], viewer_can_vote = viewer_can_vote.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponsePollSticker]
  }
  
  @scala.inline
  implicit class ReelsMediaFeedResponsePollStickerMutableBuilder[Self <: ReelsMediaFeedResponsePollSticker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_shared_result(value: Boolean): Self = StObject.set(x, "is_shared_result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoll_id(value: Double): Self = StObject.set(x, "poll_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotion_tallies(value: Null): Self = StObject.set(x, "promotion_tallies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTallies(value: js.Array[ReelsMediaFeedResponseTalliesItem]): Self = StObject.set(x, "tallies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTalliesVarargs(value: ReelsMediaFeedResponseTalliesItem*): Self = StObject.set(x, "tallies", js.Array(value :_*))
    
    @scala.inline
    def setViewer_can_vote(value: Boolean): Self = StObject.set(x, "viewer_can_vote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_vote(value: Double): Self = StObject.set(x, "viewer_vote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_voteUndefined: Self = StObject.set(x, "viewer_vote", js.undefined)
  }
}
