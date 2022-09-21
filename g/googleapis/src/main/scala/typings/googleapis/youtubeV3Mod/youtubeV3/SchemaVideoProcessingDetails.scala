package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoProcessingDetails extends StObject {
  
  /**
    * This value indicates whether video editing suggestions, which might improve video quality or the playback experience, are available for the video. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
    */
  var editorSuggestionsAvailability: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This value indicates whether file details are available for the uploaded video. You can retrieve a video's file details by requesting the fileDetails part in your videos.list() request.
    */
  var fileDetailsAvailability: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reason that YouTube failed to process the video. This property will only have a value if the processingStatus property's value is failed.
    */
  var processingFailureReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This value indicates whether the video processing engine has generated suggestions that might improve YouTube's ability to process the the video, warnings that explain video processing problems, or errors that cause video processing problems. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
    */
  var processingIssuesAvailability: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The processingProgress object contains information about the progress YouTube has made in processing the video. The values are really only relevant if the video's processing status is processing.
    */
  var processingProgress: js.UndefOr[SchemaVideoProcessingDetailsProcessingProgress] = js.undefined
  
  /**
    * The video's processing status. This value indicates whether YouTube was able to process the video or if the video is still being processed.
    */
  var processingStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This value indicates whether keyword (tag) suggestions are available for the video. Tags can be added to a video's metadata to make it easier for other users to find the video. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
    */
  var tagSuggestionsAvailability: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This value indicates whether thumbnail images have been generated for the video.
    */
  var thumbnailsAvailability: js.UndefOr[String | Null] = js.undefined
}
object SchemaVideoProcessingDetails {
  
  inline def apply(): SchemaVideoProcessingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoProcessingDetails]
  }
  
  extension [Self <: SchemaVideoProcessingDetails](x: Self) {
    
    inline def setEditorSuggestionsAvailability(value: String): Self = StObject.set(x, "editorSuggestionsAvailability", value.asInstanceOf[js.Any])
    
    inline def setEditorSuggestionsAvailabilityNull: Self = StObject.set(x, "editorSuggestionsAvailability", null)
    
    inline def setEditorSuggestionsAvailabilityUndefined: Self = StObject.set(x, "editorSuggestionsAvailability", js.undefined)
    
    inline def setFileDetailsAvailability(value: String): Self = StObject.set(x, "fileDetailsAvailability", value.asInstanceOf[js.Any])
    
    inline def setFileDetailsAvailabilityNull: Self = StObject.set(x, "fileDetailsAvailability", null)
    
    inline def setFileDetailsAvailabilityUndefined: Self = StObject.set(x, "fileDetailsAvailability", js.undefined)
    
    inline def setProcessingFailureReason(value: String): Self = StObject.set(x, "processingFailureReason", value.asInstanceOf[js.Any])
    
    inline def setProcessingFailureReasonNull: Self = StObject.set(x, "processingFailureReason", null)
    
    inline def setProcessingFailureReasonUndefined: Self = StObject.set(x, "processingFailureReason", js.undefined)
    
    inline def setProcessingIssuesAvailability(value: String): Self = StObject.set(x, "processingIssuesAvailability", value.asInstanceOf[js.Any])
    
    inline def setProcessingIssuesAvailabilityNull: Self = StObject.set(x, "processingIssuesAvailability", null)
    
    inline def setProcessingIssuesAvailabilityUndefined: Self = StObject.set(x, "processingIssuesAvailability", js.undefined)
    
    inline def setProcessingProgress(value: SchemaVideoProcessingDetailsProcessingProgress): Self = StObject.set(x, "processingProgress", value.asInstanceOf[js.Any])
    
    inline def setProcessingProgressUndefined: Self = StObject.set(x, "processingProgress", js.undefined)
    
    inline def setProcessingStatus(value: String): Self = StObject.set(x, "processingStatus", value.asInstanceOf[js.Any])
    
    inline def setProcessingStatusNull: Self = StObject.set(x, "processingStatus", null)
    
    inline def setProcessingStatusUndefined: Self = StObject.set(x, "processingStatus", js.undefined)
    
    inline def setTagSuggestionsAvailability(value: String): Self = StObject.set(x, "tagSuggestionsAvailability", value.asInstanceOf[js.Any])
    
    inline def setTagSuggestionsAvailabilityNull: Self = StObject.set(x, "tagSuggestionsAvailability", null)
    
    inline def setTagSuggestionsAvailabilityUndefined: Self = StObject.set(x, "tagSuggestionsAvailability", js.undefined)
    
    inline def setThumbnailsAvailability(value: String): Self = StObject.set(x, "thumbnailsAvailability", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsAvailabilityNull: Self = StObject.set(x, "thumbnailsAvailability", null)
    
    inline def setThumbnailsAvailabilityUndefined: Self = StObject.set(x, "thumbnailsAvailability", js.undefined)
  }
}
