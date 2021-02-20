package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes information necessary for ingesting an RTMP or an HTTP stream.
  */
@js.native
trait SchemaIngestionInfo extends StObject {
  
  /**
    * The backup ingestion URL that you should use to stream video to YouTube.
    * You have the option of simultaneously streaming the content that you are
    * sending to the ingestionAddress to this URL.
    */
  var backupIngestionAddress: js.UndefOr[String] = js.native
  
  /**
    * The primary ingestion URL that you should use to stream video to YouTube.
    * You must stream video to this URL.  Depending on which application or
    * tool you use to encode your video stream, you may need to enter the
    * stream URL and stream name separately or you may need to concatenate them
    * in the following format:  STREAM_URL/STREAM_NAME
    */
  var ingestionAddress: js.UndefOr[String] = js.native
  
  /**
    * The HTTP or RTMP stream name that YouTube assigns to the video stream.
    */
  var streamName: js.UndefOr[String] = js.native
}
object SchemaIngestionInfo {
  
  @scala.inline
  def apply(): SchemaIngestionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIngestionInfo]
  }
  
  @scala.inline
  implicit class SchemaIngestionInfoMutableBuilder[Self <: SchemaIngestionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupIngestionAddress(value: String): Self = StObject.set(x, "backupIngestionAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupIngestionAddressUndefined: Self = StObject.set(x, "backupIngestionAddress", js.undefined)
    
    @scala.inline
    def setIngestionAddress(value: String): Self = StObject.set(x, "ingestionAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestionAddressUndefined: Self = StObject.set(x, "ingestionAddress", js.undefined)
    
    @scala.inline
    def setStreamName(value: String): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNameUndefined: Self = StObject.set(x, "streamName", js.undefined)
  }
}
