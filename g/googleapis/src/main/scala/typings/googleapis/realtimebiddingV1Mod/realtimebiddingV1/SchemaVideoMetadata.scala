package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoMetadata extends StObject {
  
  /**
    * The duration of the ad. Can be used to filter the response of the creatives.list method.
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Is this a valid VAST ad? Can be used to filter the response of the creatives.list method.
    */
  var isValidVast: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Is this a VPAID ad? Can be used to filter the response of the creatives.list method.
    */
  var isVpaid: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The list of all media files declared in the VAST. If there are multiple VASTs in a wrapper chain, this includes the media files from the deepest one in the chain.
    */
  var mediaFiles: js.UndefOr[js.Array[SchemaMediaFile]] = js.undefined
  
  /**
    * The minimum duration that the user has to watch before being able to skip this ad. If the field is not set, the ad is not skippable. If the field is set, the ad is skippable. Can be used to filter the response of the creatives.list method.
    */
  var skipOffset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum VAST version across all wrapped VAST documents. Can be used to filter the response of the creatives.list method.
    */
  var vastVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaVideoMetadata {
  
  inline def apply(): SchemaVideoMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoMetadata]
  }
  
  extension [Self <: SchemaVideoMetadata](x: Self) {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setIsValidVast(value: Boolean): Self = StObject.set(x, "isValidVast", value.asInstanceOf[js.Any])
    
    inline def setIsValidVastNull: Self = StObject.set(x, "isValidVast", null)
    
    inline def setIsValidVastUndefined: Self = StObject.set(x, "isValidVast", js.undefined)
    
    inline def setIsVpaid(value: Boolean): Self = StObject.set(x, "isVpaid", value.asInstanceOf[js.Any])
    
    inline def setIsVpaidNull: Self = StObject.set(x, "isVpaid", null)
    
    inline def setIsVpaidUndefined: Self = StObject.set(x, "isVpaid", js.undefined)
    
    inline def setMediaFiles(value: js.Array[SchemaMediaFile]): Self = StObject.set(x, "mediaFiles", value.asInstanceOf[js.Any])
    
    inline def setMediaFilesUndefined: Self = StObject.set(x, "mediaFiles", js.undefined)
    
    inline def setMediaFilesVarargs(value: SchemaMediaFile*): Self = StObject.set(x, "mediaFiles", js.Array(value*))
    
    inline def setSkipOffset(value: String): Self = StObject.set(x, "skipOffset", value.asInstanceOf[js.Any])
    
    inline def setSkipOffsetNull: Self = StObject.set(x, "skipOffset", null)
    
    inline def setSkipOffsetUndefined: Self = StObject.set(x, "skipOffset", js.undefined)
    
    inline def setVastVersion(value: String): Self = StObject.set(x, "vastVersion", value.asInstanceOf[js.Any])
    
    inline def setVastVersionNull: Self = StObject.set(x, "vastVersion", null)
    
    inline def setVastVersionUndefined: Self = StObject.set(x, "vastVersion", js.undefined)
  }
}
