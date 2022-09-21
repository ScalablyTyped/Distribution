package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFieldTransform extends StObject {
  
  /**
    * Append the given elements in order if they are not already present in the current field value. If the field is not an array, or if the field does not yet exist, it is first set to the empty array. Equivalent numbers of different types (e.g. 3L and 3.0) are considered equal when checking if a value is missing. NaN is equal to NaN, and Null is equal to Null. If the input contains multiple equivalent values, only the first will be considered. The corresponding transform_result will be the null value.
    */
  var appendMissingElements: js.UndefOr[SchemaArrayValue] = js.undefined
  
  /**
    * The path of the field. See Document.fields for the field path syntax reference.
    */
  var fieldPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Adds the given value to the field's current value. This must be an integer or a double value. If the field is not an integer or double, or if the field does not yet exist, the transformation will set the field to the given value. If either of the given value or the current field value are doubles, both values will be interpreted as doubles. Double arithmetic and representation of double values follow IEEE 754 semantics. If there is positive/negative integer overflow, the field is resolved to the largest magnitude positive/negative integer.
    */
  var increment: js.UndefOr[SchemaValue] = js.undefined
  
  /**
    * Sets the field to the maximum of its current value and the given value. This must be an integer or a double value. If the field is not an integer or double, or if the field does not yet exist, the transformation will set the field to the given value. If a maximum operation is applied where the field and the input value are of mixed types (that is - one is an integer and one is a double) the field takes on the type of the larger operand. If the operands are equivalent (e.g. 3 and 3.0), the field does not change. 0, 0.0, and -0.0 are all zero. The maximum of a zero stored value and zero input value is always the stored value. The maximum of any numeric value x and NaN is NaN.
    */
  var maximum: js.UndefOr[SchemaValue] = js.undefined
  
  /**
    * Sets the field to the minimum of its current value and the given value. This must be an integer or a double value. If the field is not an integer or double, or if the field does not yet exist, the transformation will set the field to the input value. If a minimum operation is applied where the field and the input value are of mixed types (that is - one is an integer and one is a double) the field takes on the type of the smaller operand. If the operands are equivalent (e.g. 3 and 3.0), the field does not change. 0, 0.0, and -0.0 are all zero. The minimum of a zero stored value and zero input value is always the stored value. The minimum of any numeric value x and NaN is NaN.
    */
  var minimum: js.UndefOr[SchemaValue] = js.undefined
  
  /**
    * Remove all of the given elements from the array in the field. If the field is not an array, or if the field does not yet exist, it is set to the empty array. Equivalent numbers of the different types (e.g. 3L and 3.0) are considered equal when deciding whether an element should be removed. NaN is equal to NaN, and Null is equal to Null. This will remove all equivalent values if there are duplicates. The corresponding transform_result will be the null value.
    */
  var removeAllFromArray: js.UndefOr[SchemaArrayValue] = js.undefined
  
  /**
    * Sets the field to the given server value.
    */
  var setToServerValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaFieldTransform {
  
  inline def apply(): SchemaFieldTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldTransform]
  }
  
  extension [Self <: SchemaFieldTransform](x: Self) {
    
    inline def setAppendMissingElements(value: SchemaArrayValue): Self = StObject.set(x, "appendMissingElements", value.asInstanceOf[js.Any])
    
    inline def setAppendMissingElementsUndefined: Self = StObject.set(x, "appendMissingElements", js.undefined)
    
    inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    inline def setFieldPathNull: Self = StObject.set(x, "fieldPath", null)
    
    inline def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
    
    inline def setIncrement(value: SchemaValue): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
    
    inline def setMaximum(value: SchemaValue): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: SchemaValue): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setRemoveAllFromArray(value: SchemaArrayValue): Self = StObject.set(x, "removeAllFromArray", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllFromArrayUndefined: Self = StObject.set(x, "removeAllFromArray", js.undefined)
    
    inline def setSetToServerValue(value: String): Self = StObject.set(x, "setToServerValue", value.asInstanceOf[js.Any])
    
    inline def setSetToServerValueNull: Self = StObject.set(x, "setToServerValue", null)
    
    inline def setSetToServerValueUndefined: Self = StObject.set(x, "setToServerValue", js.undefined)
  }
}
