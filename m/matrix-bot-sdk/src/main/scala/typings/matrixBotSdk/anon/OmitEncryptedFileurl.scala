package typings.matrixBotSdk.anon

import typings.matrixBotSdk.matrixBotSdkStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<matrix-bot-sdk.matrix-bot-sdk/lib/models/events/MessageEvent.EncryptedFile, 'url'> */
trait OmitEncryptedFileurl extends StObject {
  
  var hashes: Sha256
  
  var iv: String
  
  var key: Alg
  
  var v: v2
}
object OmitEncryptedFileurl {
  
  inline def apply(hashes: Sha256, iv: String, key: Alg): OmitEncryptedFileurl = {
    val __obj = js.Dynamic.literal(hashes = hashes.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], v = "v2")
    __obj.asInstanceOf[OmitEncryptedFileurl]
  }
  
  extension [Self <: OmitEncryptedFileurl](x: Self) {
    
    inline def setHashes(value: Sha256): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
    
    inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Alg): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setV(value: v2): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
