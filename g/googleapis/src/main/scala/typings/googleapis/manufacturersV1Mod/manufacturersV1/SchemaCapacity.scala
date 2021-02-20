package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The capacity of a product. For more information, see
  * https://support.google.com/manufacturers/answer/6124116#capacity.
  */
@js.native
trait SchemaCapacity extends StObject {
  
  /**
    * The unit of the capacity, i.e., MB, GB, or TB.
    */
  var unit: js.UndefOr[String] = js.native
  
  /**
    * The numeric value of the capacity.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaCapacity {
  
  @scala.inline
  def apply(): SchemaCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCapacity]
  }
  
  @scala.inline
  implicit class SchemaCapacityMutableBuilder[Self <: SchemaCapacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
