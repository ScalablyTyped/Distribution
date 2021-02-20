package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Validation based on a list of allowed values.
  */
@js.native
trait SchemaValueValidation extends StObject {
  
  /**
    * Required. List of allowed values for the parameter.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object SchemaValueValidation {
  
  @scala.inline
  def apply(): SchemaValueValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValueValidation]
  }
  
  @scala.inline
  implicit class SchemaValueValidationMutableBuilder[Self <: SchemaValueValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
