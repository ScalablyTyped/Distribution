package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMpegCommonEncryption extends StObject {
  
  /**
    * Required. 128 bit Key ID represented as lowercase hexadecimal digits for use with common encryption.
    */
  var keyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Specify the encryption scheme. Supported encryption schemes: - 'cenc' - 'cbcs'
    */
  var scheme: js.UndefOr[String | Null] = js.undefined
}
object SchemaMpegCommonEncryption {
  
  inline def apply(): SchemaMpegCommonEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMpegCommonEncryption]
  }
  
  extension [Self <: SchemaMpegCommonEncryption](x: Self) {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdNull: Self = StObject.set(x, "keyId", null)
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeNull: Self = StObject.set(x, "scheme", null)
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
