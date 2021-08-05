package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of object values.
  */
trait SchemaObjectValues extends StObject {
  
  var values: js.UndefOr[js.Array[SchemaStructuredDataObject]] = js.undefined
}
object SchemaObjectValues {
  
  inline def apply(): SchemaObjectValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectValues]
  }
  
  extension [Self <: SchemaObjectValues](x: Self) {
    
    inline def setValues(value: js.Array[SchemaStructuredDataObject]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: SchemaStructuredDataObject*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
