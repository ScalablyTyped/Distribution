package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aud extends StObject {
  
  var alg: js.UndefOr[js.Array[String]] = js.undefined
  
  var aud: js.UndefOr[js.Array[String]] = js.undefined
  
  var gracePeriod: js.UndefOr[Double] = js.undefined
  
  var iss: js.UndefOr[js.Array[String]] = js.undefined
  
  var jti: js.UndefOr[String] = js.undefined
  
  var sub: js.UndefOr[js.Array[String]] = js.undefined
  
  var verifyAt: js.UndefOr[String | Double] = js.undefined
}
object Aud {
  
  inline def apply(): Aud = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aud]
  }
  
  extension [Self <: Aud](x: Self) {
    
    inline def setAlg(value: js.Array[String]): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
    
    inline def setAlgVarargs(value: String*): Self = StObject.set(x, "alg", js.Array(value*))
    
    inline def setAud(value: js.Array[String]): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
    
    inline def setAudUndefined: Self = StObject.set(x, "aud", js.undefined)
    
    inline def setAudVarargs(value: String*): Self = StObject.set(x, "aud", js.Array(value*))
    
    inline def setGracePeriod(value: Double): Self = StObject.set(x, "gracePeriod", value.asInstanceOf[js.Any])
    
    inline def setGracePeriodUndefined: Self = StObject.set(x, "gracePeriod", js.undefined)
    
    inline def setIss(value: js.Array[String]): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
    
    inline def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
    
    inline def setIssVarargs(value: String*): Self = StObject.set(x, "iss", js.Array(value*))
    
    inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
    
    inline def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
    
    inline def setSub(value: js.Array[String]): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
    
    inline def setSubVarargs(value: String*): Self = StObject.set(x, "sub", js.Array(value*))
    
    inline def setVerifyAt(value: String | Double): Self = StObject.set(x, "verifyAt", value.asInstanceOf[js.Any])
    
    inline def setVerifyAtUndefined: Self = StObject.set(x, "verifyAt", js.undefined)
  }
}
