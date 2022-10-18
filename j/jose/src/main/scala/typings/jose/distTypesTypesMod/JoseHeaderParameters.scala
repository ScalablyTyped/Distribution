package typings.jose.distTypesTypesMod

import typings.jose.anon.PickJWKktycrvxyen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoseHeaderParameters extends StObject {
  
  /** "cty" (Content Type) Header Parameter. */
  var cty: js.UndefOr[String] = js.undefined
  
  /** "jku" (JWK Set URL) Header Parameter. */
  var jku: js.UndefOr[String] = js.undefined
  
  /** "jwk" (JSON Web Key) Header Parameter. */
  var jwk: js.UndefOr[PickJWKktycrvxyen] = js.undefined
  
  /** "kid" (Key ID) Header Parameter. */
  var kid: js.UndefOr[String] = js.undefined
  
  /** "typ" (Type) Header Parameter. */
  var typ: js.UndefOr[String] = js.undefined
  
  /** "x5c" (X.509 Certificate Chain) Header Parameter. */
  var x5c: js.UndefOr[js.Array[String]] = js.undefined
  
  /** "x5t" (X.509 Certificate SHA-1 Thumbprint) Header Parameter. */
  var x5t: js.UndefOr[String] = js.undefined
  
  /** "x5u" (X.509 URL) Header Parameter. */
  var x5u: js.UndefOr[String] = js.undefined
}
object JoseHeaderParameters {
  
  inline def apply(): JoseHeaderParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JoseHeaderParameters]
  }
  
  extension [Self <: JoseHeaderParameters](x: Self) {
    
    inline def setCty(value: String): Self = StObject.set(x, "cty", value.asInstanceOf[js.Any])
    
    inline def setCtyUndefined: Self = StObject.set(x, "cty", js.undefined)
    
    inline def setJku(value: String): Self = StObject.set(x, "jku", value.asInstanceOf[js.Any])
    
    inline def setJkuUndefined: Self = StObject.set(x, "jku", js.undefined)
    
    inline def setJwk(value: PickJWKktycrvxyen): Self = StObject.set(x, "jwk", value.asInstanceOf[js.Any])
    
    inline def setJwkUndefined: Self = StObject.set(x, "jwk", js.undefined)
    
    inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
    
    inline def setTyp(value: String): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
    
    inline def setTypUndefined: Self = StObject.set(x, "typ", js.undefined)
    
    inline def setX5c(value: js.Array[String]): Self = StObject.set(x, "x5c", value.asInstanceOf[js.Any])
    
    inline def setX5cUndefined: Self = StObject.set(x, "x5c", js.undefined)
    
    inline def setX5cVarargs(value: String*): Self = StObject.set(x, "x5c", js.Array(value*))
    
    inline def setX5t(value: String): Self = StObject.set(x, "x5t", value.asInstanceOf[js.Any])
    
    inline def setX5tUndefined: Self = StObject.set(x, "x5t", js.undefined)
    
    inline def setX5u(value: String): Self = StObject.set(x, "x5u", value.asInstanceOf[js.Any])
    
    inline def setX5uUndefined: Self = StObject.set(x, "x5u", js.undefined)
  }
}
