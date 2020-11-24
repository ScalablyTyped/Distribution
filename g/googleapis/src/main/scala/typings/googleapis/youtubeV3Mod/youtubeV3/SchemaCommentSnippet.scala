package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about a comment, such as its author and text.
  */
@js.native
trait SchemaCommentSnippet extends js.Object {
  
  /**
    * The id of the author&#39;s YouTube channel, if any.
    */
  var authorChannelId: js.UndefOr[js.Any] = js.native
  
  /**
    * Link to the author&#39;s YouTube channel, if any.
    */
  var authorChannelUrl: js.UndefOr[String] = js.native
  
  /**
    * The name of the user who posted the comment.
    */
  var authorDisplayName: js.UndefOr[String] = js.native
  
  /**
    * The URL for the avatar of the user who posted the comment.
    */
  var authorProfileImageUrl: js.UndefOr[String] = js.native
  
  /**
    * Whether the current viewer can rate this comment.
    */
  var canRate: js.UndefOr[Boolean] = js.native
  
  /**
    * The id of the corresponding YouTube channel. In case of a channel comment
    * this is the channel the comment refers to. In case of a video comment
    * it&#39;s the video&#39;s channel.
    */
  var channelId: js.UndefOr[String] = js.native
  
  /**
    * The total number of likes this comment has received.
    */
  var likeCount: js.UndefOr[Double] = js.native
  
  /**
    * The comment&#39;s moderation status. Will not be set if the comments were
    * requested through the id filter.
    */
  var moderationStatus: js.UndefOr[String] = js.native
  
  /**
    * The unique id of the parent comment, only set for replies.
    */
  var parentId: js.UndefOr[String] = js.native
  
  /**
    * The date and time when the comment was orignally published. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  
  /**
    * The comment&#39;s text. The format is either plain text or HTML dependent
    * on what has been requested. Even the plain text representation may differ
    * from the text originally posted in that it may replace video links with
    * video titles etc.
    */
  var textDisplay: js.UndefOr[String] = js.native
  
  /**
    * The comment&#39;s original raw text as initially posted or last updated.
    * The original text will only be returned if it is accessible to the
    * viewer, which is only guaranteed if the viewer is the comment&#39;s
    * author.
    */
  var textOriginal: js.UndefOr[String] = js.native
  
  /**
    * The date and time when was last updated . The value is specified in ISO
    * 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var updatedAt: js.UndefOr[String] = js.native
  
  /**
    * The ID of the video the comment refers to, if any.
    */
  var videoId: js.UndefOr[String] = js.native
  
  /**
    * The rating the viewer has given to this comment. For the time being this
    * will never return RATE_TYPE_DISLIKE and instead return RATE_TYPE_NONE.
    * This may change in the future.
    */
  var viewerRating: js.UndefOr[String] = js.native
}
object SchemaCommentSnippet {
  
  @scala.inline
  def apply(): SchemaCommentSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommentSnippet]
  }
  
  @scala.inline
  implicit class SchemaCommentSnippetOps[Self <: SchemaCommentSnippet] (val x: Self) extends AnyVal {
    
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
    def setAuthorChannelId(value: js.Any): Self = this.set("authorChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorChannelId: Self = this.set("authorChannelId", js.undefined)
    
    @scala.inline
    def setAuthorChannelUrl(value: String): Self = this.set("authorChannelUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorChannelUrl: Self = this.set("authorChannelUrl", js.undefined)
    
    @scala.inline
    def setAuthorDisplayName(value: String): Self = this.set("authorDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorDisplayName: Self = this.set("authorDisplayName", js.undefined)
    
    @scala.inline
    def setAuthorProfileImageUrl(value: String): Self = this.set("authorProfileImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorProfileImageUrl: Self = this.set("authorProfileImageUrl", js.undefined)
    
    @scala.inline
    def setCanRate(value: Boolean): Self = this.set("canRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanRate: Self = this.set("canRate", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    
    @scala.inline
    def setLikeCount(value: Double): Self = this.set("likeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLikeCount: Self = this.set("likeCount", js.undefined)
    
    @scala.inline
    def setModerationStatus(value: String): Self = this.set("moderationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModerationStatus: Self = this.set("moderationStatus", js.undefined)
    
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = this.set("publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedAt: Self = this.set("publishedAt", js.undefined)
    
    @scala.inline
    def setTextDisplay(value: String): Self = this.set("textDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDisplay: Self = this.set("textDisplay", js.undefined)
    
    @scala.inline
    def setTextOriginal(value: String): Self = this.set("textOriginal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextOriginal: Self = this.set("textOriginal", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: String): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedAt: Self = this.set("updatedAt", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
    
    @scala.inline
    def setViewerRating(value: String): Self = this.set("viewerRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewerRating: Self = this.set("viewerRating", js.undefined)
  }
}
