package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RSAPrivateKey extends StObject {
  
  var co: String = js.native
  
  var d: String = js.native
  
  var dp: String = js.native
  
  var dq: String = js.native
  
  var e: String = js.native
  
  var n: String = js.native
  
  var p: String = js.native
  
  var q: String = js.native
}
object RSAPrivateKey {
  
  @scala.inline
  def apply(co: String, d: String, dp: String, dq: String, e: String, n: String, p: String, q: String): RSAPrivateKey = {
    val __obj = js.Dynamic.literal(co = co.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], dp = dp.asInstanceOf[js.Any], dq = dq.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAPrivateKey]
  }
  
  @scala.inline
  implicit class RSAPrivateKeyMutableBuilder[Self <: RSAPrivateKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCo(value: String): Self = StObject.set(x, "co", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDp(value: String): Self = StObject.set(x, "dp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDq(value: String): Self = StObject.set(x, "dq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
  }
}
