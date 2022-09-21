package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.RSAKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrvKeyObj extends StObject {
  
  var prvKeyObj: RSAKey | ECDSA
  
  var pubKeyObj: RSAKey | ECDSA
}
object PrvKeyObj {
  
  inline def apply(prvKeyObj: RSAKey | ECDSA, pubKeyObj: RSAKey | ECDSA): PrvKeyObj = {
    val __obj = js.Dynamic.literal(prvKeyObj = prvKeyObj.asInstanceOf[js.Any], pubKeyObj = pubKeyObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrvKeyObj]
  }
  
  extension [Self <: PrvKeyObj](x: Self) {
    
    inline def setPrvKeyObj(value: RSAKey | ECDSA): Self = StObject.set(x, "prvKeyObj", value.asInstanceOf[js.Any])
    
    inline def setPubKeyObj(value: RSAKey | ECDSA): Self = StObject.set(x, "pubKeyObj", value.asInstanceOf[js.Any])
  }
}
