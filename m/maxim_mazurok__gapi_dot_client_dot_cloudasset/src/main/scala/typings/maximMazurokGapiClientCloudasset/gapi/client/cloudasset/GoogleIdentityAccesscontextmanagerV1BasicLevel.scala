package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleIdentityAccesscontextmanagerV1BasicLevel extends StObject {
  
  /**
    * How the `conditions` list should be combined to determine if a request is granted this `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the
    * `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. Default behavior is AND.
    */
  var combiningFunction: js.UndefOr[String] = js.undefined
  
  /** Required. A list of requirements for the `AccessLevel` to be granted. */
  var conditions: js.UndefOr[js.Array[GoogleIdentityAccesscontextmanagerV1Condition]] = js.undefined
}
object GoogleIdentityAccesscontextmanagerV1BasicLevel {
  
  inline def apply(): GoogleIdentityAccesscontextmanagerV1BasicLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIdentityAccesscontextmanagerV1BasicLevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleIdentityAccesscontextmanagerV1BasicLevel] (val x: Self) extends AnyVal {
    
    inline def setCombiningFunction(value: String): Self = StObject.set(x, "combiningFunction", value.asInstanceOf[js.Any])
    
    inline def setCombiningFunctionUndefined: Self = StObject.set(x, "combiningFunction", js.undefined)
    
    inline def setConditions(value: js.Array[GoogleIdentityAccesscontextmanagerV1Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: GoogleIdentityAccesscontextmanagerV1Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
  }
}
