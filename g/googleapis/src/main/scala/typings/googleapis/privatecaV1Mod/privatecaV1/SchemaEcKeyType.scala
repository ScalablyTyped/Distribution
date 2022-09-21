package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEcKeyType extends StObject {
  
  /**
    * Optional. A signature algorithm that must be used. If this is omitted, any EC-based signature algorithm will be allowed.
    */
  var signatureAlgorithm: js.UndefOr[String | Null] = js.undefined
}
object SchemaEcKeyType {
  
  inline def apply(): SchemaEcKeyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEcKeyType]
  }
  
  extension [Self <: SchemaEcKeyType](x: Self) {
    
    inline def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmNull: Self = StObject.set(x, "signatureAlgorithm", null)
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
  }
}
