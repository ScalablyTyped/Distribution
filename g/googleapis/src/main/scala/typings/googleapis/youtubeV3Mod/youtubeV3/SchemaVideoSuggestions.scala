package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaVideoSuggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoSuggestions]
  }
  
  @scala.inline
  implicit class SchemaVideoSuggestionsOps[Self <: SchemaVideoSuggestions] (val x: Self) extends AnyVal {
    
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
    def setEditorSuggestionsVarargs(value: String*): Self = this.set("editorSuggestions", js.Array(value :_*))
    
    @scala.inline
    def setEditorSuggestions(value: js.Array[String]): Self = this.set("editorSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorSuggestions: Self = this.set("editorSuggestions", js.undefined)
    
    @scala.inline
    def setProcessingErrorsVarargs(value: String*): Self = this.set("processingErrors", js.Array(value :_*))
    
    @scala.inline
    def setProcessingErrors(value: js.Array[String]): Self = this.set("processingErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingErrors: Self = this.set("processingErrors", js.undefined)
    
    @scala.inline
    def setProcessingHintsVarargs(value: String*): Self = this.set("processingHints", js.Array(value :_*))
    
    @scala.inline
    def setProcessingHints(value: js.Array[String]): Self = this.set("processingHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingHints: Self = this.set("processingHints", js.undefined)
    
    @scala.inline
    def setProcessingWarningsVarargs(value: String*): Self = this.set("processingWarnings", js.Array(value :_*))
    
    @scala.inline
    def setProcessingWarnings(value: js.Array[String]): Self = this.set("processingWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingWarnings: Self = this.set("processingWarnings", js.undefined)
    
    @scala.inline
    def setTagSuggestionsVarargs(value: SchemaVideoSuggestionsTagSuggestion*): Self = this.set("tagSuggestions", js.Array(value :_*))
    
    @scala.inline
    def setTagSuggestions(value: js.Array[SchemaVideoSuggestionsTagSuggestion]): Self = this.set("tagSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSuggestions: Self = this.set("tagSuggestions", js.undefined)
  }
}
