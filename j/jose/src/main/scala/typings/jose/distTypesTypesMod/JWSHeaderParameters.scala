package typings.jose.distTypesTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JWSHeaderParameters
  extends StObject
     with JoseHeaderParameters
     with /** Any other JWS Header member. */
/* propName */ StringDictionary[Any] {
  
  /** JWS "alg" (Algorithm) Header Parameter. */
  var alg: js.UndefOr[String] = js.undefined
  
  /**
    * This JWS Extension Header Parameter modifies the JWS Payload representation and the JWS Signing
    * Input computation as per [RFC7797](https://www.rfc-editor.org/rfc/rfc7797).
    */
  var b64: js.UndefOr[Boolean] = js.undefined
  
  /** JWS "crit" (Critical) Header Parameter. */
  var crit: js.UndefOr[js.Array[String]] = js.undefined
}
object JWSHeaderParameters {
  
  inline def apply(): JWSHeaderParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JWSHeaderParameters]
  }
  
  extension [Self <: JWSHeaderParameters](x: Self) {
    
    inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
    
    inline def setB64(value: Boolean): Self = StObject.set(x, "b64", value.asInstanceOf[js.Any])
    
    inline def setB64Undefined: Self = StObject.set(x, "b64", js.undefined)
    
    inline def setCrit(value: js.Array[String]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
    
    inline def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
    
    inline def setCritVarargs(value: String*): Self = StObject.set(x, "crit", js.Array(value*))
  }
}
