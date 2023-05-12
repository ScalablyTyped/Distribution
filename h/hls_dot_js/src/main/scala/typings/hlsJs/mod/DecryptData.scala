package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecryptData extends StObject {
  
  var encrypted: Boolean
  
  var isCommonEncryption: Boolean
  
  var iv: js.typedarray.Uint8Array | Null
  
  var key: js.typedarray.Uint8Array | Null
  
  var keyFormat: String
  
  var keyFormatVersions: js.Array[Double]
  
  var keyId: js.typedarray.Uint8Array | Null
  
  var method: String
  
  var pssh: js.typedarray.Uint8Array | Null
  
  var uri: String
}
object DecryptData {
  
  inline def apply(
    encrypted: Boolean,
    isCommonEncryption: Boolean,
    keyFormat: String,
    keyFormatVersions: js.Array[Double],
    method: String,
    uri: String
  ): DecryptData = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], isCommonEncryption = isCommonEncryption.asInstanceOf[js.Any], keyFormat = keyFormat.asInstanceOf[js.Any], keyFormatVersions = keyFormatVersions.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], iv = null, key = null, keyId = null, pssh = null)
    __obj.asInstanceOf[DecryptData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecryptData] (val x: Self) extends AnyVal {
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setIsCommonEncryption(value: Boolean): Self = StObject.set(x, "isCommonEncryption", value.asInstanceOf[js.Any])
    
    inline def setIv(value: js.typedarray.Uint8Array): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setIvNull: Self = StObject.set(x, "iv", null)
    
    inline def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyFormat(value: String): Self = StObject.set(x, "keyFormat", value.asInstanceOf[js.Any])
    
    inline def setKeyFormatVersions(value: js.Array[Double]): Self = StObject.set(x, "keyFormatVersions", value.asInstanceOf[js.Any])
    
    inline def setKeyFormatVersionsVarargs(value: Double*): Self = StObject.set(x, "keyFormatVersions", js.Array(value*))
    
    inline def setKeyId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdNull: Self = StObject.set(x, "keyId", null)
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPssh(value: js.typedarray.Uint8Array): Self = StObject.set(x, "pssh", value.asInstanceOf[js.Any])
    
    inline def setPsshNull: Self = StObject.set(x, "pssh", null)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
