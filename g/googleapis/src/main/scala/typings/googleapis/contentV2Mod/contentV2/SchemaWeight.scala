package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaWeight extends StObject {
  
  /**
    * The weight unit.
    */
  var unit: js.UndefOr[String] = js.native
  
  /**
    * The weight represented as a number.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaWeight {
  
  @scala.inline
  def apply(): SchemaWeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWeight]
  }
  
  @scala.inline
  implicit class SchemaWeightMutableBuilder[Self <: SchemaWeight] (val x: Self) extends AnyVal {
    
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
