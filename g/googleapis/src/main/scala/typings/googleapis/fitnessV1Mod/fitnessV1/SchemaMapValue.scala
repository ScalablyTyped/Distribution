package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holder object for the value of an entry in a map field of a data point.  A
  * map value supports a subset of the formats that the regular Value supports.
  */
trait SchemaMapValue extends StObject {
  
  /**
    * Floating point value.
    */
  var fpVal: js.UndefOr[Double] = js.undefined
}
object SchemaMapValue {
  
  @scala.inline
  def apply(): SchemaMapValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMapValue]
  }
  
  @scala.inline
  implicit class SchemaMapValueMutableBuilder[Self <: SchemaMapValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFpVal(value: Double): Self = StObject.set(x, "fpVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFpValUndefined: Self = StObject.set(x, "fpVal", js.undefined)
  }
}
