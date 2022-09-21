package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAllowedKeyType extends StObject {
  
  /**
    * Represents an allowed Elliptic Curve key type.
    */
  var ellipticCurve: js.UndefOr[SchemaEcKeyType] = js.undefined
  
  /**
    * Represents an allowed RSA key type.
    */
  var rsa: js.UndefOr[SchemaRsaKeyType] = js.undefined
}
object SchemaAllowedKeyType {
  
  inline def apply(): SchemaAllowedKeyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllowedKeyType]
  }
  
  extension [Self <: SchemaAllowedKeyType](x: Self) {
    
    inline def setEllipticCurve(value: SchemaEcKeyType): Self = StObject.set(x, "ellipticCurve", value.asInstanceOf[js.Any])
    
    inline def setEllipticCurveUndefined: Self = StObject.set(x, "ellipticCurve", js.undefined)
    
    inline def setRsa(value: SchemaRsaKeyType): Self = StObject.set(x, "rsa", value.asInstanceOf[js.Any])
    
    inline def setRsaUndefined: Self = StObject.set(x, "rsa", js.undefined)
  }
}
