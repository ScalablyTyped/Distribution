package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Validation based on regular expressions.
  */
@js.native
trait SchemaRegexValidation extends StObject {
  
  /**
    * Required. RE2 regular expressions used to validate the parameter&#39;s
    * value. The value must match the regex in its entirety (substring matches
    * are not sufficient).
    */
  var regexes: js.UndefOr[js.Array[String]] = js.native
}
object SchemaRegexValidation {
  
  @scala.inline
  def apply(): SchemaRegexValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegexValidation]
  }
  
  @scala.inline
  implicit class SchemaRegexValidationMutableBuilder[Self <: SchemaRegexValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegexes(value: js.Array[String]): Self = StObject.set(x, "regexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexesUndefined: Self = StObject.set(x, "regexes", js.undefined)
    
    @scala.inline
    def setRegexesVarargs(value: String*): Self = StObject.set(x, "regexes", js.Array(value :_*))
  }
}
