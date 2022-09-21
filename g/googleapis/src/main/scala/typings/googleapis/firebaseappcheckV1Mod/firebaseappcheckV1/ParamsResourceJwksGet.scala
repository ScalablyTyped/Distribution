package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceJwksGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource name to the public JWK set. Must always be exactly the string `jwks`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceJwksGet {
  
  inline def apply(): ParamsResourceJwksGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJwksGet]
  }
  
  extension [Self <: ParamsResourceJwksGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
