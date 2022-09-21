package typings.googleapis.v1p1beta1Mod.cloudassetV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIdentityAccesscontextmanagerV1BasicLevel extends StObject {
  
  /**
    * How the `conditions` list should be combined to determine if a request is granted this `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. Default behavior is AND.
    */
  var combiningFunction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. A list of requirements for the `AccessLevel` to be granted.
    */
  var conditions: js.UndefOr[js.Array[SchemaGoogleIdentityAccesscontextmanagerV1Condition]] = js.undefined
}
object SchemaGoogleIdentityAccesscontextmanagerV1BasicLevel {
  
  inline def apply(): SchemaGoogleIdentityAccesscontextmanagerV1BasicLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIdentityAccesscontextmanagerV1BasicLevel]
  }
  
  extension [Self <: SchemaGoogleIdentityAccesscontextmanagerV1BasicLevel](x: Self) {
    
    inline def setCombiningFunction(value: String): Self = StObject.set(x, "combiningFunction", value.asInstanceOf[js.Any])
    
    inline def setCombiningFunctionNull: Self = StObject.set(x, "combiningFunction", null)
    
    inline def setCombiningFunctionUndefined: Self = StObject.set(x, "combiningFunction", js.undefined)
    
    inline def setConditions(value: js.Array[SchemaGoogleIdentityAccesscontextmanagerV1Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaGoogleIdentityAccesscontextmanagerV1Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
  }
}
