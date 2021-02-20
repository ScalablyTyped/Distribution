package typings.jose.mod

import typings.jose.joseStrings.RSA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JWKRSAKey
  extends KeyParameters
     with JSONWebKey
     with _ProduceKeyInput {
  
  var d: js.UndefOr[String] = js.native
  
  var dp: js.UndefOr[String] = js.native
  
  var dq: js.UndefOr[String] = js.native
  
  var e: String = js.native
  
  var kty: RSA = js.native
  
  var n: String = js.native
  
  var p: js.UndefOr[String] = js.native
  
  var q: js.UndefOr[String] = js.native
  
  var qi: js.UndefOr[String] = js.native
}
object JWKRSAKey {
  
  @scala.inline
  def apply(e: String, kty: RSA, n: String): JWKRSAKey = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWKRSAKey]
  }
  
  @scala.inline
  implicit class JWKRSAKeyMutableBuilder[Self <: JWKRSAKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    @scala.inline
    def setDp(value: String): Self = StObject.set(x, "dp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpUndefined: Self = StObject.set(x, "dp", js.undefined)
    
    @scala.inline
    def setDq(value: String): Self = StObject.set(x, "dq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDqUndefined: Self = StObject.set(x, "dq", js.undefined)
    
    @scala.inline
    def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKty(value: RSA): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setQi(value: String): Self = StObject.set(x, "qi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQiUndefined: Self = StObject.set(x, "qi", js.undefined)
  }
}
