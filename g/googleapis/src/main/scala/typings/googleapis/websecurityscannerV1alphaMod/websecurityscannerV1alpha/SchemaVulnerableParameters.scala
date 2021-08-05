package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about vulnerable request parameters.
  */
trait SchemaVulnerableParameters extends StObject {
  
  /**
    * The vulnerable parameter names.
    */
  var parameterNames: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaVulnerableParameters {
  
  inline def apply(): SchemaVulnerableParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVulnerableParameters]
  }
  
  extension [Self <: SchemaVulnerableParameters](x: Self) {
    
    inline def setParameterNames(value: js.Array[String]): Self = StObject.set(x, "parameterNames", value.asInstanceOf[js.Any])
    
    inline def setParameterNamesUndefined: Self = StObject.set(x, "parameterNames", js.undefined)
    
    inline def setParameterNamesVarargs(value: String*): Self = StObject.set(x, "parameterNames", js.Array(value :_*))
  }
}
