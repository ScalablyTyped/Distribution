package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEncryption extends StObject {
  
  /**
    * Configuration for AES-128 encryption.
    */
  var aes128: js.UndefOr[SchemaAes128Encryption] = js.undefined
  
  /**
    * Required. 128 bit Initialization Vector (IV) represented as lowercase hexadecimal digits.
    */
  var iv: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. 128 bit encryption key represented as lowercase hexadecimal digits.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration for MPEG Common Encryption (MPEG-CENC).
    */
  var mpegCenc: js.UndefOr[SchemaMpegCommonEncryption] = js.undefined
  
  /**
    * Configuration for SAMPLE-AES encryption.
    */
  var sampleAes: js.UndefOr[SchemaSampleAesEncryption] = js.undefined
}
object SchemaEncryption {
  
  inline def apply(): SchemaEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryption]
  }
  
  extension [Self <: SchemaEncryption](x: Self) {
    
    inline def setAes128(value: SchemaAes128Encryption): Self = StObject.set(x, "aes128", value.asInstanceOf[js.Any])
    
    inline def setAes128Undefined: Self = StObject.set(x, "aes128", js.undefined)
    
    inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setIvNull: Self = StObject.set(x, "iv", null)
    
    inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMpegCenc(value: SchemaMpegCommonEncryption): Self = StObject.set(x, "mpegCenc", value.asInstanceOf[js.Any])
    
    inline def setMpegCencUndefined: Self = StObject.set(x, "mpegCenc", js.undefined)
    
    inline def setSampleAes(value: SchemaSampleAesEncryption): Self = StObject.set(x, "sampleAes", value.asInstanceOf[js.Any])
    
    inline def setSampleAesUndefined: Self = StObject.set(x, "sampleAes", js.undefined)
  }
}
