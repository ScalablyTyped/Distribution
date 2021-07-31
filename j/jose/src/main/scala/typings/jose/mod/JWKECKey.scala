package typings.jose.mod

import typings.jose.joseStrings.EC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JWKECKey
  extends StObject
     with KeyParameters
     with JSONWebKey
     with _ProduceKeyInput {
  
  var crv: ECCurve
  
  var d: js.UndefOr[String] = js.undefined
  
  var kty: EC
  
  var x: String
  
  var y: String
}
object JWKECKey {
  
  @scala.inline
  def apply(crv: ECCurve, x: String, y: String): JWKECKey = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = "EC", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWKECKey]
  }
  
  @scala.inline
  implicit class JWKECKeyMutableBuilder[Self <: JWKECKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrv(value: ECCurve): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    @scala.inline
    def setKty(value: EC): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
