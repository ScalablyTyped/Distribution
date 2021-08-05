package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for a specific parameter.
  */
trait SchemaParameterMetadata extends StObject {
  
  /**
    * Required. The help text to display for the parameter.
    */
  var helpText: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Whether the parameter is optional. Defaults to false.
    */
  var isOptional: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The label to display for the parameter.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the parameter.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Regexes that the parameter must match.
    */
  var regexes: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaParameterMetadata {
  
  inline def apply(): SchemaParameterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParameterMetadata]
  }
  
  extension [Self <: SchemaParameterMetadata](x: Self) {
    
    inline def setHelpText(value: String): Self = StObject.set(x, "helpText", value.asInstanceOf[js.Any])
    
    inline def setHelpTextUndefined: Self = StObject.set(x, "helpText", js.undefined)
    
    inline def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    inline def setIsOptionalUndefined: Self = StObject.set(x, "isOptional", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRegexes(value: js.Array[String]): Self = StObject.set(x, "regexes", value.asInstanceOf[js.Any])
    
    inline def setRegexesUndefined: Self = StObject.set(x, "regexes", js.undefined)
    
    inline def setRegexesVarargs(value: String*): Self = StObject.set(x, "regexes", js.Array(value :_*))
  }
}
