package typings.googleapis.serviceconsumermanagementV1beta1Mod.serviceconsumermanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSystemParameterRule extends StObject {
  
  /**
    * Define parameters. Multiple names may be defined for a parameter. For a given method call, only one of them should be used. If multiple names are used the behavior is implementation-dependent. If none of the specified names are present the behavior is parameter-dependent.
    */
  var parameters: js.UndefOr[js.Array[SchemaSystemParameter]] = js.undefined
  
  /**
    * Selects the methods to which this rule applies. Use '*' to indicate all methods in all APIs. Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String | Null] = js.undefined
}
object SchemaSystemParameterRule {
  
  inline def apply(): SchemaSystemParameterRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSystemParameterRule]
  }
  
  extension [Self <: SchemaSystemParameterRule](x: Self) {
    
    inline def setParameters(value: js.Array[SchemaSystemParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: SchemaSystemParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorNull: Self = StObject.set(x, "selector", null)
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
