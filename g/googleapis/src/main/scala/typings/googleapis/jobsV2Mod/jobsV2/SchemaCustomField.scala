package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource that represents the custom data not captured by the standard
  * fields.
  */
trait SchemaCustomField extends StObject {
  
  /**
    * Optional.  The values of the custom data.
    */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaCustomField {
  
  @scala.inline
  def apply(): SchemaCustomField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomField]
  }
  
  @scala.inline
  implicit class SchemaCustomFieldMutableBuilder[Self <: SchemaCustomField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
