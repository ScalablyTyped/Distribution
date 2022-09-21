package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCdnSettings extends StObject {
  
  /**
    * The format of the video stream that you are sending to Youtube.
    */
  var format: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The frame rate of the inbound video data.
    */
  var frameRate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ingestionInfo object contains information that YouTube provides that you need to transmit your RTMP or HTTP stream to YouTube.
    */
  var ingestionInfo: js.UndefOr[SchemaIngestionInfo] = js.undefined
  
  /**
    *  The method or protocol used to transmit the video stream.
    */
  var ingestionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resolution of the inbound video data.
    */
  var resolution: js.UndefOr[String | Null] = js.undefined
}
object SchemaCdnSettings {
  
  inline def apply(): SchemaCdnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCdnSettings]
  }
  
  extension [Self <: SchemaCdnSettings](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFrameRate(value: String): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateNull: Self = StObject.set(x, "frameRate", null)
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    inline def setIngestionInfo(value: SchemaIngestionInfo): Self = StObject.set(x, "ingestionInfo", value.asInstanceOf[js.Any])
    
    inline def setIngestionInfoUndefined: Self = StObject.set(x, "ingestionInfo", js.undefined)
    
    inline def setIngestionType(value: String): Self = StObject.set(x, "ingestionType", value.asInstanceOf[js.Any])
    
    inline def setIngestionTypeNull: Self = StObject.set(x, "ingestionType", null)
    
    inline def setIngestionTypeUndefined: Self = StObject.set(x, "ingestionType", js.undefined)
    
    inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionNull: Self = StObject.set(x, "resolution", null)
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
  }
}
