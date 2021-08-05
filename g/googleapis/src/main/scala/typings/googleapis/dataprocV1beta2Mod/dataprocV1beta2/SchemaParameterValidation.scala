package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for parameter validation.
  */
trait SchemaParameterValidation extends StObject {
  
  /**
    * Validation based on regular expressions.
    */
  var regex: js.UndefOr[SchemaRegexValidation] = js.undefined
  
  /**
    * Validation based on a list of allowed values.
    */
  var values: js.UndefOr[SchemaValueValidation] = js.undefined
}
object SchemaParameterValidation {
  
  inline def apply(): SchemaParameterValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParameterValidation]
  }
  
  extension [Self <: SchemaParameterValidation](x: Self) {
    
    inline def setRegex(value: SchemaRegexValidation): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    inline def setValues(value: SchemaValueValidation): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
