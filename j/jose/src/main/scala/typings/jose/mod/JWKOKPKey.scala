package typings.jose.mod

import typings.jose.joseStrings.OKP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JWKOKPKey
  extends StObject
     with KeyParameters
     with JSONWebKey
     with _ProduceKeyInput {
  
  var crv: OKPCurve
  
  var d: js.UndefOr[String] = js.undefined
  
  var kty: OKP
  
  var x: String
}
object JWKOKPKey {
  
  @scala.inline
  def apply(crv: OKPCurve, x: String): JWKOKPKey = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = "OKP", x = x.asInstanceOf[js.Any])
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
