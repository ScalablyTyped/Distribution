package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A video resource represents a YouTube video.
  */
@js.native
trait SchemaVideo extends js.Object {
  
  /**
    * Age restriction details related to a video. This data can only be
    * retrieved by the video owner.
    */
  var ageGating: js.UndefOr[SchemaVideoAgeGating] = js.native
  
  /**
    * The contentDetails object contains information about the video content,
    * including the length of the video and its aspect ratio.
    */
  var contentDetails: js.UndefOr[SchemaVideoContentDetails] = js.native
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The fileDetails object encapsulates information about the video file that
    * was uploaded to YouTube, including the file&#39;s resolution, duration,
    * audio and video codecs, stream bitrates, and more. This data can only be
    * retrieved by the video owner.
    */
  var fileDetails: js.UndefOr[SchemaVideoFileDetails] = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify the video.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#video&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The liveStreamingDetails object contains metadata about a live video
    * broadcast. The object will only be present in a video resource if the
    * video is an upcoming, live, or completed live broadcast.
    */
  var liveStreamingDetails: js.UndefOr[SchemaVideoLiveStreamingDetails] = js.native
  
  /**
    * List with all localizations.
    */
  var localizations: js.UndefOr[StringDictionary[SchemaVideoLocalization]] = js.native
  
  /**
    * The monetizationDetails object encapsulates information about the
    * monetization status of the video.
    */
  var monetizationDetails: js.UndefOr[SchemaVideoMonetizationDetails] = js.native
  
  /**
    * The player object contains information that you would use to play the
    * video in an embedded player.
    */
  var player: js.UndefOr[SchemaVideoPlayer] = js.native
  
  /**
    * The processingDetails object encapsulates information about YouTube&#39;s
    * progress in processing the uploaded video file. The properties in the
    * object identify the current processing status and an estimate of the time
    * remaining until YouTube finishes processing the video. This part also
    * indicates whether different types of data or content, such as file
    * details or thumbnail images, are available for the video.  The
    * processingProgress object is designed to be polled so that the video
    * uploaded can track the progress that YouTube has made in processing the
    * uploaded video file. This data can only be retrieved by the video owner.
    */
  var processingDetails: js.UndefOr[SchemaVideoProcessingDetails] = js.native
  
  /**
    * The projectDetails object contains information about the project specific
    * video metadata.
    */
  var projectDetails: js.UndefOr[SchemaVideoProjectDetails] = js.native
  
  /**
    * The recordingDetails object encapsulates information about the location,
    * date and address where the video was recorded.
    */
  var recordingDetails: js.UndefOr[SchemaVideoRecordingDetails] = js.native
  
  /**
    * The snippet object contains basic details about the video, such as its
    * title, description, and category.
    */
  var snippet: js.UndefOr[SchemaVideoSnippet] = js.native
  
  /**
    * The statistics object contains statistics about the video.
    */
  var statistics: js.UndefOr[SchemaVideoStatistics] = js.native
  
  /**
    * The status object contains information about the video&#39;s uploading,
    * processing, and privacy statuses.
    */
  var status: js.UndefOr[SchemaVideoStatus] = js.native
  
  /**
    * The suggestions object encapsulates suggestions that identify
    * opportunities to improve the video quality or the metadata for the
    * uploaded video. This data can only be retrieved by the video owner.
    */
  var suggestions: js.UndefOr[SchemaVideoSuggestions] = js.native
  
  /**
    * The topicDetails object encapsulates information about Freebase topics
    * associated with the video.
    */
  var topicDetails: js.UndefOr[SchemaVideoTopicDetails] = js.native
}
object SchemaVideo {
  
  @scala.inline
  def apply(): SchemaVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideo]
  }
  
  @scala.inline
  implicit class SchemaVideoOps[Self <: SchemaVideo] (val x: Self) extends AnyVal {
    
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
    def setAgeGating(value: SchemaVideoAgeGating): Self = this.set("ageGating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgeGating: Self = this.set("ageGating", js.undefined)
    
    @scala.inline
    def setContentDetails(value: SchemaVideoContentDetails): Self = this.set("contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDetails: Self = this.set("contentDetails", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setFileDetails(value: SchemaVideoFileDetails): Self = this.set("fileDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileDetails: Self = this.set("fileDetails", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLiveStreamingDetails(value: SchemaVideoLiveStreamingDetails): Self = this.set("liveStreamingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiveStreamingDetails: Self = this.set("liveStreamingDetails", js.undefined)
    
    @scala.inline
    def setLocalizations(value: StringDictionary[SchemaVideoLocalization]): Self = this.set("localizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalizations: Self = this.set("localizations", js.undefined)
    
    @scala.inline
    def setMonetizationDetails(value: SchemaVideoMonetizationDetails): Self = this.set("monetizationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonetizationDetails: Self = this.set("monetizationDetails", js.undefined)
    
    @scala.inline
    def setPlayer(value: SchemaVideoPlayer): Self = this.set("player", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayer: Self = this.set("player", js.undefined)
    
    @scala.inline
    def setProcessingDetails(value: SchemaVideoProcessingDetails): Self = this.set("processingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingDetails: Self = this.set("processingDetails", js.undefined)
    
    @scala.inline
    def setProjectDetails(value: SchemaVideoProjectDetails): Self = this.set("projectDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectDetails: Self = this.set("projectDetails", js.undefined)
    
    @scala.inline
    def setRecordingDetails(value: SchemaVideoRecordingDetails): Self = this.set("recordingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordingDetails: Self = this.set("recordingDetails", js.undefined)
    
    @scala.inline
    def setSnippet(value: SchemaVideoSnippet): Self = this.set("snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    
    @scala.inline
    def setStatistics(value: SchemaVideoStatistics): Self = this.set("statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaVideoStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSuggestions(value: SchemaVideoSuggestions): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
    
    @scala.inline
    def setTopicDetails(value: SchemaVideoTopicDetails): Self = this.set("topicDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicDetails: Self = this.set("topicDetails", js.undefined)
  }
}
