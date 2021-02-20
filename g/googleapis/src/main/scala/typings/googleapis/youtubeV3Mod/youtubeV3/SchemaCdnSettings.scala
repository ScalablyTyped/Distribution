package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Brief description of the live stream cdn settings.
  */
@js.native
trait SchemaCdnSettings extends StObject {
  
  /**
    * The format of the video stream that you are sending to Youtube.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * The frame rate of the inbound video data.
    */
  var frameRate: js.UndefOr[String] = js.native
  
  /**
    * The ingestionInfo object contains information that YouTube provides that
    * you need to transmit your RTMP or HTTP stream to YouTube.
    */
  var ingestionInfo: js.UndefOr[SchemaIngestionInfo] = js.native
  
  /**
    * The method or protocol used to transmit the video stream.
    */
  var ingestionType: js.UndefOr[String] = js.native
  
  /**
    * The resolution of the inbound video data.
    */
  var resolution: js.UndefOr[String] = js.native
}
object SchemaCdnSettings {
  
  @scala.inline
  def apply(): SchemaCdnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCdnSettings]
  }
  
  @scala.inline
  implicit class SchemaCdnSettingsMutableBuilder[Self <: SchemaCdnSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFrameRate(value: String): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    @scala.inline
    def setIngestionInfo(value: SchemaIngestionInfo): Self = StObject.set(x, "ingestionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestionInfoUndefined: Self = StObject.set(x, "ingestionInfo", js.undefined)
    
    @scala.inline
    def setIngestionType(value: String): Self = StObject.set(x, "ingestionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestionTypeUndefined: Self = StObject.set(x, "ingestionType", js.undefined)
    
    @scala.inline
    def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
  }
}
