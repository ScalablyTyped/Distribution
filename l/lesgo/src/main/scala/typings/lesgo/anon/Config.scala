package typings.lesgo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config[TDecoded /* <: js.Object | String */] extends StObject {
  
  var config: Iss[TDecoded]
  
  var validate: CustomClaims
}
object Config {
  
  inline def apply[TDecoded /* <: js.Object | String */](config: Iss[TDecoded], validate: CustomClaims): Config[TDecoded] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config[TDecoded]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Config[?], TDecoded /* <: js.Object | String */] (val x: Self & Config[TDecoded]) extends AnyVal {
    
    inline def setConfig(value: Iss[TDecoded]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: CustomClaims): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
