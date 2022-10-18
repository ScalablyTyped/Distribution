package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterMetadata extends StObject {
  
  /** Optional. Additional metadata for describing this parameter. */
  var customMetadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Required. The help text to display for the parameter. */
  var helpText: js.UndefOr[String] = js.undefined
  
  /** Optional. Whether the parameter is optional. Defaults to false. */
  var isOptional: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The label to display for the parameter. */
  var label: js.UndefOr[String] = js.undefined
  
  /** Required. The name of the parameter. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Optional. The type of the parameter. Used for selecting input picker. */
  var paramType: js.UndefOr[String] = js.undefined
  
  /** Optional. Regexes that the parameter must match. */
  var regexes: js.UndefOr[js.Array[String]] = js.undefined
}
object ParameterMetadata {
  
  inline def apply(): ParameterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterMetadata]
  }
  
  extension [Self <: ParameterMetadata](x: Self) {
    
    inline def setCustomMetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "customMetadata", value.asInstanceOf[js.Any])
    
    inline def setCustomMetadataUndefined: Self = StObject.set(x, "customMetadata", js.undefined)
    
    inline def setHelpText(value: String): Self = StObject.set(x, "helpText", value.asInstanceOf[js.Any])
    
    inline def setHelpTextUndefined: Self = StObject.set(x, "helpText", js.undefined)
    
    inline def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    inline def setIsOptionalUndefined: Self = StObject.set(x, "isOptional", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParamType(value: String): Self = StObject.set(x, "paramType", value.asInstanceOf[js.Any])
    
    inline def setParamTypeUndefined: Self = StObject.set(x, "paramType", js.undefined)
    
    inline def setRegexes(value: js.Array[String]): Self = StObject.set(x, "regexes", value.asInstanceOf[js.Any])
    
    inline def setRegexesUndefined: Self = StObject.set(x, "regexes", js.undefined)
    
    inline def setRegexesVarargs(value: String*): Self = StObject.set(x, "regexes", js.Array(value*))
  }
}
