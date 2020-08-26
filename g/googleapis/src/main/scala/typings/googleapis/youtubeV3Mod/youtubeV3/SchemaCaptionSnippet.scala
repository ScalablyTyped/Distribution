package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a caption track, such as its language and name.
  */
@js.native
trait SchemaCaptionSnippet extends js.Object {
  /**
    * The type of audio track associated with the caption track.
    */
  var audioTrackType: js.UndefOr[String] = js.native
  /**
    * The reason that YouTube failed to process the caption track. This
    * property is only present if the state property&#39;s value is failed.
    */
  var failureReason: js.UndefOr[String] = js.native
  /**
    * Indicates whether YouTube synchronized the caption track to the audio
    * track in the video. The value will be true if a sync was explicitly
    * requested when the caption track was uploaded. For example, when calling
    * the captions.insert or captions.update methods, you can set the sync
    * parameter to true to instruct YouTube to sync the uploaded track to the
    * video. If the value is false, YouTube uses the time codes in the uploaded
    * caption track to determine when to display captions.
    */
  var isAutoSynced: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the track contains closed captions for the deaf and
    * hard of hearing. The default value is false.
    */
  var isCC: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the caption track is a draft. If the value is true,
    * then the track is not publicly visible. The default value is false.
    */
  var isDraft: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether caption track is formatted for &quot;easy reader,&quot;
    * meaning it is at a third-grade level for language learners. The default
    * value is false.
    */
  var isEasyReader: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the caption track uses large text for the
    * vision-impaired. The default value is false.
    */
  var isLarge: js.UndefOr[Boolean] = js.native
  /**
    * The language of the caption track. The property value is a BCP-47
    * language tag.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The date and time when the caption track was last updated. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var lastUpdated: js.UndefOr[String] = js.native
  /**
    * The name of the caption track. The name is intended to be visible to the
    * user as an option during playback.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The caption track&#39;s status.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The caption track&#39;s type.
    */
  var trackKind: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the video associated with
    * the caption track.
    */
  var videoId: js.UndefOr[String] = js.native
}

object SchemaCaptionSnippet {
  @scala.inline
  def apply(): SchemaCaptionSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCaptionSnippet]
  }
  @scala.inline
  implicit class SchemaCaptionSnippetOps[Self <: SchemaCaptionSnippet] (val x: Self) extends AnyVal {
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
    def setAudioTrackType(value: String): Self = this.set("audioTrackType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioTrackType: Self = this.set("audioTrackType", js.undefined)
    @scala.inline
    def setFailureReason(value: String): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    @scala.inline
    def setIsAutoSynced(value: Boolean): Self = this.set("isAutoSynced", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAutoSynced: Self = this.set("isAutoSynced", js.undefined)
    @scala.inline
    def setIsCC(value: Boolean): Self = this.set("isCC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCC: Self = this.set("isCC", js.undefined)
    @scala.inline
    def setIsDraft(value: Boolean): Self = this.set("isDraft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDraft: Self = this.set("isDraft", js.undefined)
    @scala.inline
    def setIsEasyReader(value: Boolean): Self = this.set("isEasyReader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEasyReader: Self = this.set("isEasyReader", js.undefined)
    @scala.inline
    def setIsLarge(value: Boolean): Self = this.set("isLarge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLarge: Self = this.set("isLarge", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLastUpdated(value: String): Self = this.set("lastUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdated: Self = this.set("lastUpdated", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTrackKind(value: String): Self = this.set("trackKind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackKind: Self = this.set("trackKind", js.undefined)
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
  }
  
}

