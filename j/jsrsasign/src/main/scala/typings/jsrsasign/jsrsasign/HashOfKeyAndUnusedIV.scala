package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashOfKeyAndUnusedIV extends StObject {
  
  var ivhex: String
  
  var keyhex: String
}
object HashOfKeyAndUnusedIV {
  
  inline def apply(ivhex: String, keyhex: String): HashOfKeyAndUnusedIV = {
    val __obj = js.Dynamic.literal(ivhex = ivhex.asInstanceOf[js.Any], keyhex = keyhex.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashOfKeyAndUnusedIV]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HashOfKeyAndUnusedIV] (val x: Self) extends AnyVal {
    
    inline def setIvhex(value: String): Self = StObject.set(x, "ivhex", value.asInstanceOf[js.Any])
    
    inline def setKeyhex(value: String): Self = StObject.set(x, "keyhex", value.asInstanceOf[js.Any])
  }
}
