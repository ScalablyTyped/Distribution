package typings.matrixBotSdk.anon

import typings.matrixBotSdk.matrixBotSdkBooleans.`true`
import typings.matrixBotSdk.matrixBotSdkStrings.A256CTR
import typings.matrixBotSdk.matrixBotSdkStrings.oct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alg extends StObject {
  
  var alg: A256CTR
  
  var ext: `true`
  
  var k: String
  
  var key_ops: js.Array[String]
  
  var kty: oct
}
object Alg {
  
  inline def apply(k: String, key_ops: js.Array[String]): Alg = {
    val __obj = js.Dynamic.literal(alg = "A256CTR", ext = true, k = k.asInstanceOf[js.Any], key_ops = key_ops.asInstanceOf[js.Any], kty = "oct")
    __obj.asInstanceOf[Alg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alg] (val x: Self) extends AnyVal {
    
    inline def setAlg(value: A256CTR): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setExt(value: `true`): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setK(value: String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    inline def setKey_ops(value: js.Array[String]): Self = StObject.set(x, "key_ops", value.asInstanceOf[js.Any])
    
    inline def setKey_opsVarargs(value: String*): Self = StObject.set(x, "key_ops", js.Array(value*))
    
    inline def setKty(value: oct): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
  }
}
