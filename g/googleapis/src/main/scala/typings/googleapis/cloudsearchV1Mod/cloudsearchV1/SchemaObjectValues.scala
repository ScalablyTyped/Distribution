package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of object values.
  */
@js.native
trait SchemaObjectValues extends StObject {
  
  var values: js.UndefOr[js.Array[SchemaStructuredDataObject]] = js.native
}
object SchemaObjectValues {
  
  @scala.inline
  def apply(): SchemaObjectValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectValues]
  }
  
  @scala.inline
  implicit class SchemaObjectValuesMutableBuilder[Self <: SchemaObjectValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[SchemaStructuredDataObject]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: SchemaStructuredDataObject*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
