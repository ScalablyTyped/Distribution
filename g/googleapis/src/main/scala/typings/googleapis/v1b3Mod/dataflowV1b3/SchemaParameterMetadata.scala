package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaParameterMetadata extends StObject {
  
  /**
    * Optional. Additional metadata for describing this parameter.
    */
  var customMetadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Required. The help text to display for the parameter.
    */
  var helpText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Whether the parameter is optional. Defaults to false.
    */
  var isOptional: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The label to display for the parameter.
    */
  var label: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The name of the parameter.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The type of the parameter. Used for selecting input picker.
    */
  var paramType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Regexes that the parameter must match.
    */
  var regexes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaParameterMetadata {
  
  inline def apply(): SchemaParameterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParameterMetadata]
  }
  
  extension [Self <: SchemaParameterMetadata](x: Self) {
    
    inline def setCustomMetadata(value: StringDictionary[String]): Self = StObject.set(x, "customMetadata", value.asInstanceOf[js.Any])
    
    inline def setCustomMetadataNull: Self = StObject.set(x, "customMetadata", null)
    
    inline def setCustomMetadataUndefined: Self = StObject.set(x, "customMetadata", js.undefined)
    
    inline def setHelpText(value: String): Self = StObject.set(x, "helpText", value.asInstanceOf[js.Any])
    
    inline def setHelpTextNull: Self = StObject.set(x, "helpText", null)
    
    inline def setHelpTextUndefined: Self = StObject.set(x, "helpText", js.undefined)
    
    inline def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    inline def setIsOptionalNull: Self = StObject.set(x, "isOptional", null)
    
    inline def setIsOptionalUndefined: Self = StObject.set(x, "isOptional", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParamType(value: String): Self = StObject.set(x, "paramType", value.asInstanceOf[js.Any])
    
    inline def setParamTypeNull: Self = StObject.set(x, "paramType", null)
    
    inline def setParamTypeUndefined: Self = StObject.set(x, "paramType", js.undefined)
    
    inline def setRegexes(value: js.Array[String]): Self = StObject.set(x, "regexes", value.asInstanceOf[js.Any])
    
    inline def setRegexesNull: Self = StObject.set(x, "regexes", null)
    
    inline def setRegexesUndefined: Self = StObject.set(x, "regexes", js.undefined)
    
    inline def setRegexesVarargs(value: String*): Self = StObject.set(x, "regexes", js.Array(value*))
  }
}
