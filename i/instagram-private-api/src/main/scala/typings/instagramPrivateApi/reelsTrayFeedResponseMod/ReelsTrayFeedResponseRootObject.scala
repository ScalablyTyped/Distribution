package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsTrayFeedResponseRootObject extends StObject {
  
  var broadcasts: js.Array[ReelsTrayFeedResponseBroadcastsItem]
  
  var face_filter_nux_version: Double
  
  var has_new_nux_story: Boolean
  
  var status: String
  
  var sticker_version: Double
  
  var stories_viewer_gestures_nux_eligible: Boolean
  
  var story_ranking_token: String
  
  var tray: js.Array[ReelsTrayFeedResponseTrayItem]
}
object ReelsTrayFeedResponseRootObject {
  
  @scala.inline
  def apply(
    broadcasts: js.Array[ReelsTrayFeedResponseBroadcastsItem],
    face_filter_nux_version: Double,
    has_new_nux_story: Boolean,
    status: String,
    sticker_version: Double,
    stories_viewer_gestures_nux_eligible: Boolean,
    story_ranking_token: String,
    tray: js.Array[ReelsTrayFeedResponseTrayItem]
  ): ReelsTrayFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(broadcasts = broadcasts.asInstanceOf[js.Any], face_filter_nux_version = face_filter_nux_version.asInstanceOf[js.Any], has_new_nux_story = has_new_nux_story.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sticker_version = sticker_version.asInstanceOf[js.Any], stories_viewer_gestures_nux_eligible = stories_viewer_gestures_nux_eligible.asInstanceOf[js.Any], story_ranking_token = story_ranking_token.asInstanceOf[js.Any], tray = tray.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseRootObject]
  }
  
  @scala.inline
  implicit class ReelsTrayFeedResponseRootObjectMutableBuilder[Self <: ReelsTrayFeedResponseRootObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBroadcasts(value: js.Array[ReelsTrayFeedResponseBroadcastsItem]): Self = StObject.set(x, "broadcasts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadcastsVarargs(value: ReelsTrayFeedResponseBroadcastsItem*): Self = StObject.set(x, "broadcasts", js.Array(value :_*))
    
    @scala.inline
    def setFace_filter_nux_version(value: Double): Self = StObject.set(x, "face_filter_nux_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_new_nux_story(value: Boolean): Self = StObject.set(x, "has_new_nux_story", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSticker_version(value: Double): Self = StObject.set(x, "sticker_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStories_viewer_gestures_nux_eligible(value: Boolean): Self = StObject.set(x, "stories_viewer_gestures_nux_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_ranking_token(value: String): Self = StObject.set(x, "story_ranking_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTray(value: js.Array[ReelsTrayFeedResponseTrayItem]): Self = StObject.set(x, "tray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrayVarargs(value: ReelsTrayFeedResponseTrayItem*): Self = StObject.set(x, "tray", js.Array(value :_*))
  }
}
