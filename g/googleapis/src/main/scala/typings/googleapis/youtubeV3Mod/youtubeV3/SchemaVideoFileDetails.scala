package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoFileDetails extends StObject {
  
  /**
    * A list of audio streams contained in the uploaded video file. Each item in the list contains detailed metadata about an audio stream.
    */
  var audioStreams: js.UndefOr[js.Array[SchemaVideoFileDetailsAudioStream]] = js.undefined
  
  /**
    * The uploaded video file's combined (video and audio) bitrate in bits per second.
    */
  var bitrateBps: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The uploaded video file's container format.
    */
  var container: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date and time when the uploaded video file was created. The value is specified in ISO 8601 format. Currently, the following ISO 8601 formats are supported: - Date only: YYYY-MM-DD - Naive time: YYYY-MM-DDTHH:MM:SS - Time with timezone: YYYY-MM-DDTHH:MM:SS+HH:MM
    */
  var creationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The length of the uploaded video in milliseconds.
    */
  var durationMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The uploaded file's name. This field is present whether a video file or another type of file was uploaded.
    */
  var fileName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The uploaded file's size in bytes. This field is present whether a video file or another type of file was uploaded.
    */
  var fileSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The uploaded file's type as detected by YouTube's video processing engine. Currently, YouTube only processes video files, but this field is present whether a video file or another type of file was uploaded.
    */
  var fileType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of video streams contained in the uploaded video file. Each item in the list contains detailed metadata about a video stream.
    */
  var videoStreams: js.UndefOr[js.Array[SchemaVideoFileDetailsVideoStream]] = js.undefined
}
object SchemaVideoFileDetails {
  
  inline def apply(): SchemaVideoFileDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoFileDetails]
  }
  
  extension [Self <: SchemaVideoFileDetails](x: Self) {
    
    inline def setAudioStreams(value: js.Array[SchemaVideoFileDetailsAudioStream]): Self = StObject.set(x, "audioStreams", value.asInstanceOf[js.Any])
    
    inline def setAudioStreamsUndefined: Self = StObject.set(x, "audioStreams", js.undefined)
    
    inline def setAudioStreamsVarargs(value: SchemaVideoFileDetailsAudioStream*): Self = StObject.set(x, "audioStreams", js.Array(value*))
    
    inline def setBitrateBps(value: String): Self = StObject.set(x, "bitrateBps", value.asInstanceOf[js.Any])
    
    inline def setBitrateBpsNull: Self = StObject.set(x, "bitrateBps", null)
    
    inline def setBitrateBpsUndefined: Self = StObject.set(x, "bitrateBps", js.undefined)
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeNull: Self = StObject.set(x, "creationTime", null)
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDurationMs(value: String): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    inline def setDurationMsNull: Self = StObject.set(x, "durationMs", null)
    
    inline def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFileSize(value: String): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeNull: Self = StObject.set(x, "fileSize", null)
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeNull: Self = StObject.set(x, "fileType", null)
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    inline def setVideoStreams(value: js.Array[SchemaVideoFileDetailsVideoStream]): Self = StObject.set(x, "videoStreams", value.asInstanceOf[js.Any])
    
    inline def setVideoStreamsUndefined: Self = StObject.set(x, "videoStreams", js.undefined)
    
    inline def setVideoStreamsVarargs(value: SchemaVideoFileDetailsVideoStream*): Self = StObject.set(x, "videoStreams", js.Array(value*))
  }
}
