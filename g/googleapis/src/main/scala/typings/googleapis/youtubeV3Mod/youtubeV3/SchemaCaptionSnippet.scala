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
  def apply(
    audioTrackType: String = null,
    failureReason: String = null,
    isAutoSynced: js.UndefOr[Boolean] = js.undefined,
    isCC: js.UndefOr[Boolean] = js.undefined,
    isDraft: js.UndefOr[Boolean] = js.undefined,
    isEasyReader: js.UndefOr[Boolean] = js.undefined,
    isLarge: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    lastUpdated: String = null,
    name: String = null,
    status: String = null,
    trackKind: String = null,
    videoId: String = null
  ): SchemaCaptionSnippet = {
    val __obj = js.Dynamic.literal()
    if (audioTrackType != null) __obj.updateDynamic("audioTrackType")(audioTrackType.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (!js.isUndefined(isAutoSynced)) __obj.updateDynamic("isAutoSynced")(isAutoSynced.asInstanceOf[js.Any])
    if (!js.isUndefined(isCC)) __obj.updateDynamic("isCC")(isCC.asInstanceOf[js.Any])
    if (!js.isUndefined(isDraft)) __obj.updateDynamic("isDraft")(isDraft.asInstanceOf[js.Any])
    if (!js.isUndefined(isEasyReader)) __obj.updateDynamic("isEasyReader")(isEasyReader.asInstanceOf[js.Any])
    if (!js.isUndefined(isLarge)) __obj.updateDynamic("isLarge")(isLarge.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lastUpdated != null) __obj.updateDynamic("lastUpdated")(lastUpdated.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (trackKind != null) __obj.updateDynamic("trackKind")(trackKind.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCaptionSnippet]
  }
}

