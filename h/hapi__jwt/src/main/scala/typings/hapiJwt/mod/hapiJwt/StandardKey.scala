package typings.hapiJwt.mod.hapiJwt

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardKey
  extends StObject
     with Key {
  
  /**
    * Array of accepted algorithms
    */
  var algorithms: js.UndefOr[js.Array[SupportedAlgorithm]] = js.undefined
  
  /**
    * String or binary data that is used for shared secret.
    */
  var key: String | Buffer
  
  /**
    * String representing the key ID header.
    */
  var kid: js.UndefOr[String] = js.undefined
}
object StandardKey {
  
  inline def apply(key: String | Buffer): StandardKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardKey]
  }
  
  extension [Self <: StandardKey](x: Self) {
    
    inline def setAlgorithms(value: js.Array[SupportedAlgorithm]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
    
    inline def setAlgorithmsVarargs(value: SupportedAlgorithm*): Self = StObject.set(x, "algorithms", js.Array(value*))
    
    inline def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
  }
}
