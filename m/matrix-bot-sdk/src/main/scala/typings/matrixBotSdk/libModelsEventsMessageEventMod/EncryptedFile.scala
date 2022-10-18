package typings.matrixBotSdk.libModelsEventsMessageEventMod

import typings.matrixBotSdk.anon.Alg
import typings.matrixBotSdk.anon.Sha256
import typings.matrixBotSdk.matrixBotSdkStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedFile extends StObject {
  
  var hashes: Sha256
  
  var iv: String
  
  var key: Alg
  
  var url: String
  
  var v: v2
}
object EncryptedFile {
  
  inline def apply(hashes: Sha256, iv: String, key: Alg, url: String): EncryptedFile = {
    val __obj = js.Dynamic.literal(hashes = hashes.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], v = "v2")
    __obj.asInstanceOf[EncryptedFile]
  }
  
  extension [Self <: EncryptedFile](x: Self) {
    
    inline def setHashes(value: Sha256): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
    
    inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Alg): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setV(value: v2): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
