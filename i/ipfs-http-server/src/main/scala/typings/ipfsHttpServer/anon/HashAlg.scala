package typings.ipfsHttpServer.anon

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashAlg extends StObject {
  
  var data: Buffer
  
  var hashAlg: Any
}
object HashAlg {
  
  inline def apply(data: Buffer, hashAlg: Any): HashAlg = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashAlg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HashAlg] (val x: Self) extends AnyVal {
    
    inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHashAlg(value: Any): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
  }
}
