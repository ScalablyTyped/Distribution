package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomAttribute extends StObject {
  
  /**
    * The name of the attribute. Underscores will be replaced by spaces upon
    * insertion.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the attribute.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Free-form unit of the attribute. Unit can only be used for values of type
    * int, float, or price.
    */
  var unit: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the attribute.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaCustomAttribute {
  
  @scala.inline
  def apply(): SchemaCustomAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAttribute]
  }
  
  @scala.inline
  implicit class SchemaCustomAttributeMutableBuilder[Self <: SchemaCustomAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
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
