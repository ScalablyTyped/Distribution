package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies suggestions on how to improve video content, including encoding
  * hints, tag suggestions, and editor suggestions.
  */
@js.native
trait SchemaVideoSuggestions extends js.Object {
  /**
    * A list of video editing operations that might improve the video quality
    * or playback experience of the uploaded video.
    */
  var editorSuggestions: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of errors that will prevent YouTube from successfully processing
    * the uploaded video video. These errors indicate that, regardless of the
    * video&#39;s current processing status, eventually, that status will
    * almost certainly be failed.
    */
  var processingErrors: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of suggestions that may improve YouTube&#39;s ability to process
    * the video.
    */
  var processingHints: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of reasons why YouTube may have difficulty transcoding the
    * uploaded video or that might result in an erroneous transcoding. These
    * warnings are generated before YouTube actually processes the uploaded
    * video file. In addition, they identify issues that are unlikely to cause
    * the video processing to fail but that might cause problems such as sync
    * issues, video artifacts, or a missing audio track.
    */
  var processingWarnings: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of keyword tags that could be added to the video&#39;s metadata to
    * increase the likelihood that users will locate your video when searching
    * or browsing on YouTube.
    */
  var tagSuggestions: js.UndefOr[js.Array[SchemaVideoSuggestionsTagSuggestion]] = js.native
}

object SchemaVideoSuggestions {
  @scala.inline
  def apply(
    editorSuggestions: js.Array[String] = null,
    processingErrors: js.Array[String] = null,
    processingHints: js.Array[String] = null,
    processingWarnings: js.Array[String] = null,
    tagSuggestions: js.Array[SchemaVideoSuggestionsTagSuggestion] = null
  ): SchemaVideoSuggestions = {
    val __obj = js.Dynamic.literal()
    if (editorSuggestions != null) __obj.updateDynamic("editorSuggestions")(editorSuggestions.asInstanceOf[js.Any])
    if (processingErrors != null) __obj.updateDynamic("processingErrors")(processingErrors.asInstanceOf[js.Any])
    if (processingHints != null) __obj.updateDynamic("processingHints")(processingHints.asInstanceOf[js.Any])
    if (processingWarnings != null) __obj.updateDynamic("processingWarnings")(processingWarnings.asInstanceOf[js.Any])
    if (tagSuggestions != null) __obj.updateDynamic("tagSuggestions")(tagSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVideoSuggestions]
  }
}

