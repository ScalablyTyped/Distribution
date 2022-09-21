package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.JwkObject
import typings.jsrsasign.jsrsasignStrings.EC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kty
  extends StObject
     with JwkObject {
  
  var crv: String
  
  var kid: js.UndefOr[String] = js.undefined
  
  var kty: EC
  
  var x: String
  
  var x5c: js.UndefOr[js.Array[String]] = js.undefined
  
  var x5t: js.UndefOr[String] = js.undefined
  
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.undefined
  
  var y: String
}
object Kty {
  
  inline def apply(crv: String, x: String, y: String): Kty = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = "EC", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kty]
  }
  
  extension [Self <: Kty](x: Self) {
    
    inline def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
    
    inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
    
    inline def setKty(value: EC): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX5c(value: js.Array[String]): Self = StObject.set(x, "x5c", value.asInstanceOf[js.Any])
    
    inline def setX5cUndefined: Self = StObject.set(x, "x5c", js.undefined)
    
    inline def setX5cVarargs(value: String*): Self = StObject.set(x, "x5c", js.Array(value*))
    
    inline def setX5t(value: String): Self = StObject.set(x, "x5t", value.asInstanceOf[js.Any])
    
    inline def setX5tNumbersignS256(value: String): Self = StObject.set(x, "x5t#S256", value.asInstanceOf[js.Any])
    
    inline def setX5tNumbersignS256Undefined: Self = StObject.set(x, "x5t#S256", js.undefined)
    
    inline def setX5tUndefined: Self = StObject.set(x, "x5t", js.undefined)
    
    inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
