package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsTrayFeedResponseRootObject extends js.Object {
  
  var broadcasts: js.Array[ReelsTrayFeedResponseBroadcastsItem] = js.native
  
  var face_filter_nux_version: Double = js.native
  
  var has_new_nux_story: Boolean = js.native
  
  var status: String = js.native
  
  var sticker_version: Double = js.native
  
  var stories_viewer_gestures_nux_eligible: Boolean = js.native
  
  var story_ranking_token: String = js.native
  
  var tray: js.Array[ReelsTrayFeedResponseTrayItem] = js.native
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
  implicit class ReelsTrayFeedResponseRootObjectOps[Self <: ReelsTrayFeedResponseRootObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBroadcastsVarargs(value: ReelsTrayFeedResponseBroadcastsItem*): Self = this.set("broadcasts", js.Array(value :_*))
    
    @scala.inline
    def setBroadcasts(value: js.Array[ReelsTrayFeedResponseBroadcastsItem]): Self = this.set("broadcasts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFace_filter_nux_version(value: Double): Self = this.set("face_filter_nux_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_new_nux_story(value: Boolean): Self = this.set("has_new_nux_story", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSticker_version(value: Double): Self = this.set("sticker_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStories_viewer_gestures_nux_eligible(value: Boolean): Self = this.set("stories_viewer_gestures_nux_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_ranking_token(value: String): Self = this.set("story_ranking_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrayVarargs(value: ReelsTrayFeedResponseTrayItem*): Self = this.set("tray", js.Array(value :_*))
    
    @scala.inline
    def setTray(value: js.Array[ReelsTrayFeedResponseTrayItem]): Self = this.set("tray", value.asInstanceOf[js.Any])
  }
}
