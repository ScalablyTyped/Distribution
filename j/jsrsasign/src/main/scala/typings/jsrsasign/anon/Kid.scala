package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.JwkObject
import typings.jsrsasign.jsrsasignStrings.RSA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kid
  extends StObject
     with JwkObject {
  
  var e: String
  
  var kid: js.UndefOr[String] = js.undefined
  
  var kty: RSA
  
  var n: String
  
  var x5c: js.UndefOr[js.Array[String]] = js.undefined
  
  var x5t: js.UndefOr[String] = js.undefined
  
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.undefined
}
object Kid {
  
  inline def apply(e: String, n: String): Kid = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], kty = "RSA", n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Kid] (val x: Self) extends AnyVal {
    
    inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
    
    inline def setKty(value: RSA): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setX5c(value: js.Array[String]): Self = StObject.set(x, "x5c", value.asInstanceOf[js.Any])
    
    inline def setX5cUndefined: Self = StObject.set(x, "x5c", js.undefined)
    
    inline def setX5cVarargs(value: String*): Self = StObject.set(x, "x5c", js.Array(value*))
    
    inline def setX5t(value: String): Self = StObject.set(x, "x5t", value.asInstanceOf[js.Any])
    
    inline def setX5tNumbersignS256(value: String): Self = StObject.set(x, "x5t#S256", value.asInstanceOf[js.Any])
    
    inline def setX5tNumbersignS256Undefined: Self = StObject.set(x, "x5t#S256", js.undefined)
    
    inline def setX5tUndefined: Self = StObject.set(x, "x5t", js.undefined)
  }
}
