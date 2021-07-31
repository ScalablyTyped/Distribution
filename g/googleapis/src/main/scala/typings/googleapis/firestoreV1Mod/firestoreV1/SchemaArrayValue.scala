package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An array value.
  */
trait SchemaArrayValue extends StObject {
  
  /**
    * Values in the array.
    */
  var values: js.UndefOr[js.Array[SchemaValue]] = js.undefined
}
object SchemaArrayValue {
  
  @scala.inline
  def apply(): SchemaArrayValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArrayValue]
  }
  
  @scala.inline
  implicit class SchemaArrayValueMutableBuilder[Self <: SchemaArrayValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[SchemaValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: SchemaValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
