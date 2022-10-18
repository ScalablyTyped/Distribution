package typings.jose.distTypesTypesMod

import typings.jose.joseBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JWTHeaderParameters
  extends StObject
     with CompactJWSHeaderParameters {
  
  @JSName("b64")
  var b64_JWTHeaderParameters: js.UndefOr[`true`] = js.undefined
}
object JWTHeaderParameters {
  
  inline def apply(alg: String): JWTHeaderParameters = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWTHeaderParameters]
  }
  
  extension [Self <: JWTHeaderParameters](x: Self) {
    
    inline def setB64(value: `true`): Self = StObject.set(x, "b64", value.asInstanceOf[js.Any])
    
    inline def setB64Undefined: Self = StObject.set(x, "b64", js.undefined)
  }
}
