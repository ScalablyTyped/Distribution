package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubKeyObj extends StObject {
  
  var prvKeyObj: ECDSA
  
  var pubKeyObj: ECDSA
}
object PubKeyObj {
  
  inline def apply(prvKeyObj: ECDSA, pubKeyObj: ECDSA): PubKeyObj = {
    val __obj = js.Dynamic.literal(prvKeyObj = prvKeyObj.asInstanceOf[js.Any], pubKeyObj = pubKeyObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[PubKeyObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PubKeyObj] (val x: Self) extends AnyVal {
    
    inline def setPrvKeyObj(value: ECDSA): Self = StObject.set(x, "prvKeyObj", value.asInstanceOf[js.Any])
    
    inline def setPubKeyObj(value: ECDSA): Self = StObject.set(x, "pubKeyObj", value.asInstanceOf[js.Any])
  }
}
