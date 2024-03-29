package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomAttribute extends StObject {
  
  /**
    * The name of the attribute. Underscores will be replaced by spaces upon insertion.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the attribute. Acceptable values are: - "`boolean`" - "`datetimerange`" - "`float`" - "`group`" - "`int`" - "`price`" - "`text`" - "`time`" - "`url`"
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Free-form unit of the attribute. Unit can only be used for values of type int, float, or price.
    */
  var unit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the attribute.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomAttribute {
  
  inline def apply(): SchemaCustomAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAttribute]
  }
  
  extension [Self <: SchemaCustomAttribute](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitNull: Self = StObject.set(x, "unit", null)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
