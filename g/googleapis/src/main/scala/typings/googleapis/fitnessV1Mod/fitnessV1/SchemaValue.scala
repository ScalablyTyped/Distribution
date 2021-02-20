package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holder object for the value of a single field in a data point.  A field
  * value has a particular format and is only ever set to one of an integer or
  * a floating point value. LINT.IfChange
  */
@js.native
trait SchemaValue extends StObject {
  
  /**
    * Floating point value. When this is set, other values must not be set.
    */
  var fpVal: js.UndefOr[Double] = js.native
  
  /**
    * Integer value. When this is set, other values must not be set.
    */
  var intVal: js.UndefOr[Double] = js.native
  
  /**
    * Map value. The valid key space and units for the corresponding value of
    * each entry should be documented as part of the data type definition. Keys
    * should be kept small whenever possible. Data streams with large keys and
    * high data frequency may be down sampled.
    */
  var mapVal: js.UndefOr[js.Array[SchemaValueMapValEntry]] = js.native
  
  /**
    * String value. When this is set, other values must not be set. Strings
    * should be kept small whenever possible. Data streams with large string
    * values and high data frequency may be down sampled.
    */
  var stringVal: js.UndefOr[String] = js.native
}
object SchemaValue {
  
  @scala.inline
  def apply(): SchemaValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValue]
  }
  
  @scala.inline
  implicit class SchemaValueMutableBuilder[Self <: SchemaValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFpVal(value: Double): Self = StObject.set(x, "fpVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFpValUndefined: Self = StObject.set(x, "fpVal", js.undefined)
    
    @scala.inline
    def setIntVal(value: Double): Self = StObject.set(x, "intVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntValUndefined: Self = StObject.set(x, "intVal", js.undefined)
    
    @scala.inline
    def setMapVal(value: js.Array[SchemaValueMapValEntry]): Self = StObject.set(x, "mapVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapValUndefined: Self = StObject.set(x, "mapVal", js.undefined)
    
    @scala.inline
    def setMapValVarargs(value: SchemaValueMapValEntry*): Self = StObject.set(x, "mapVal", js.Array(value :_*))
    
    @scala.inline
    def setStringVal(value: String): Self = StObject.set(x, "stringVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValUndefined: Self = StObject.set(x, "stringVal", js.undefined)
  }
}
