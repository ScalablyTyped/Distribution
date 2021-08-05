package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Validation based on regular expressions.
  */
trait SchemaRegexValidation extends StObject {
  
  /**
    * Required. RE2 regular expressions used to validate the parameter&#39;s
    * value. The value must match the regex in its entirety (substring matches
    * are not sufficient).
    */
  var regexes: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaRegexValidation {
  
  inline def apply(): SchemaRegexValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegexValidation]
  }
  
  extension [Self <: SchemaRegexValidation](x: Self) {
    
    inline def setRegexes(value: js.Array[String]): Self = StObject.set(x, "regexes", value.asInstanceOf[js.Any])
    
    inline def setRegexesUndefined: Self = StObject.set(x, "regexes", js.undefined)
    
    inline def setRegexesVarargs(value: String*): Self = StObject.set(x, "regexes", js.Array(value :_*))
  }
}
