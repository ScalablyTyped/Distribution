package typings.jose.mod

import typings.jose.joseStrings.OKP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JWKOKPKey
  extends KeyParameters
     with JSONWebKey
     with _ProduceKeyInput {
  
  var crv: OKPCurve = js.native
  
  var d: js.UndefOr[String] = js.native
  
  var kty: OKP = js.native
  
  var x: String = js.native
}
object JWKOKPKey {
  
  @scala.inline
  def apply(crv: OKPCurve, kty: OKP, x: String): JWKOKPKey = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWKOKPKey]
  }
  
  @scala.inline
  implicit class JWKOKPKeyMutableBuilder[Self <: JWKOKPKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrv(value: OKPCurve): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    @scala.inline
    def setKty(value: OKP): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
