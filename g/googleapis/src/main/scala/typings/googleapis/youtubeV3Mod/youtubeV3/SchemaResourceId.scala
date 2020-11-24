package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource id is a generic reference that points to another YouTube
  * resource.
  */
@js.native
trait SchemaResourceId extends js.Object {
  
  /**
    * The ID that YouTube uses to uniquely identify the referred resource, if
    * that resource is a channel. This property is only present if the
    * resourceId.kind value is youtube#channel.
    */
  var channelId: js.UndefOr[String] = js.native
  
  /**
    * The type of the API resource.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify the referred resource, if
    * that resource is a playlist. This property is only present if the
    * resourceId.kind value is youtube#playlist.
    */
  var playlistId: js.UndefOr[String] = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify the referred resource, if
    * that resource is a video. This property is only present if the
    * resourceId.kind value is youtube#video.
    */
  var videoId: js.UndefOr[String] = js.native
}
object SchemaResourceId {
  
  @scala.inline
  def apply(): SchemaResourceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceId]
  }
  
  @scala.inline
  implicit class SchemaResourceIdOps[Self <: SchemaResourceId] (val x: Self) extends AnyVal {
    
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
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPlaylistId(value: String): Self = this.set("playlistId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaylistId: Self = this.set("playlistId", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
  }
}
