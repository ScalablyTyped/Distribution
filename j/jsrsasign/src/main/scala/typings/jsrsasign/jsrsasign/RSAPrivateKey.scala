package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RSAPrivateKey extends StObject {
  
  var co: String
  
  var d: String
  
  var dp: String
  
  var dq: String
  
  var e: String
  
  var n: String
  
  var p: String
  
  var q: String
}
object RSAPrivateKey {
  
  inline def apply(co: String, d: String, dp: String, dq: String, e: String, n: String, p: String, q: String): RSAPrivateKey = {
    val __obj = js.Dynamic.literal(co = co.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], dp = dp.asInstanceOf[js.Any], dq = dq.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAPrivateKey]
  }
  
  extension [Self <: RSAPrivateKey](x: Self) {
    
    inline def setCo(value: String): Self = StObject.set(x, "co", value.asInstanceOf[js.Any])
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDp(value: String): Self = StObject.set(x, "dp", value.asInstanceOf[js.Any])
    
    inline def setDq(value: String): Self = StObject.set(x, "dq", value.asInstanceOf[js.Any])
    
    inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
  }
}
