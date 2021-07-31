package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes processing status and progress and availability of some other
  * Video resource parts.
  */
trait SchemaVideoProcessingDetails extends StObject {
  
  /**
    * This value indicates whether video editing suggestions, which might
    * improve video quality or the playback experience, are available for the
    * video. You can retrieve these suggestions by requesting the suggestions
    * part in your videos.list() request.
    */
  var editorSuggestionsAvailability: js.UndefOr[String] = js.undefined
  
  /**
    * This value indicates whether file details are available for the uploaded
    * video. You can retrieve a video&#39;s file details by requesting the
    * fileDetails part in your videos.list() request.
    */
  var fileDetailsAvailability: js.UndefOr[String] = js.undefined
  
  /**
    * The reason that YouTube failed to process the video. This property will
    * only have a value if the processingStatus property&#39;s value is failed.
    */
  var processingFailureReason: js.UndefOr[String] = js.undefined
  
  /**
    * This value indicates whether the video processing engine has generated
    * suggestions that might improve YouTube&#39;s ability to process the the
    * video, warnings that explain video processing problems, or errors that
    * cause video processing problems. You can retrieve these suggestions by
    * requesting the suggestions part in your videos.list() request.
    */
  var processingIssuesAvailability: js.UndefOr[String] = js.undefined
  
  /**
    * The processingProgress object contains information about the progress
    * YouTube has made in processing the video. The values are really only
    * relevant if the video&#39;s processing status is processing.
    */
  var processingProgress: js.UndefOr[SchemaVideoProcessingDetailsProcessingProgress] = js.undefined
  
  /**
    * The video&#39;s processing status. This value indicates whether YouTube
    * was able to process the video or if the video is still being processed.
    */
  var processingStatus: js.UndefOr[String] = js.undefined
  
  /**
    * This value indicates whether keyword (tag) suggestions are available for
    * the video. Tags can be added to a video&#39;s metadata to make it easier
    * for other users to find the video. You can retrieve these suggestions by
    * requesting the suggestions part in your videos.list() request.
    */
  var tagSuggestionsAvailability: js.UndefOr[String] = js.undefined
  
  /**
    * This value indicates whether thumbnail images have been generated for the
    * video.
    */
  var thumbnailsAvailability: js.UndefOr[String] = js.undefined
}
object SchemaVideoProcessingDetails {
  
  @scala.inline
  def apply(): SchemaVideoProcessingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoProcessingDetails]
  }
  
  @scala.inline
  implicit class SchemaVideoProcessingDetailsMutableBuilder[Self <: SchemaVideoProcessingDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditorSuggestionsAvailability(value: String): Self = StObject.set(x, "editorSuggestionsAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorSuggestionsAvailabilityUndefined: Self = StObject.set(x, "editorSuggestionsAvailability", js.undefined)
    
    @scala.inline
    def setFileDetailsAvailability(value: String): Self = StObject.set(x, "fileDetailsAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileDetailsAvailabilityUndefined: Self = StObject.set(x, "fileDetailsAvailability", js.undefined)
    
    @scala.inline
    def setProcessingFailureReason(value: String): Self = StObject.set(x, "processingFailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingFailureReasonUndefined: Self = StObject.set(x, "processingFailureReason", js.undefined)
    
    @scala.inline
    def setProcessingIssuesAvailability(value: String): Self = StObject.set(x, "processingIssuesAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingIssuesAvailabilityUndefined: Self = StObject.set(x, "processingIssuesAvailability", js.undefined)
    
    @scala.inline
    def setProcessingProgress(value: SchemaVideoProcessingDetailsProcessingProgress): Self = StObject.set(x, "processingProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingProgressUndefined: Self = StObject.set(x, "processingProgress", js.undefined)
    
    @scala.inline
    def setProcessingStatus(value: String): Self = StObject.set(x, "processingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingStatusUndefined: Self = StObject.set(x, "processingStatus", js.undefined)
    
    @scala.inline
    def setTagSuggestionsAvailability(value: String): Self = StObject.set(x, "tagSuggestionsAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSuggestionsAvailabilityUndefined: Self = StObject.set(x, "tagSuggestionsAvailability", js.undefined)
    
    @scala.inline
    def setThumbnailsAvailability(value: String): Self = StObject.set(x, "thumbnailsAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailsAvailabilityUndefined: Self = StObject.set(x, "thumbnailsAvailability", js.undefined)
  }
}
