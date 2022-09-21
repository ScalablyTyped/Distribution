package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVersionSource extends StObject {
  
  /**
    * The field to extract from the MSH segment. For example, "3.1" or "18[1].1".
    */
  var mshField: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value to match with the field. For example, "My Application Name" or "2.3".
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaVersionSource {
  
  inline def apply(): SchemaVersionSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersionSource]
  }
  
  extension [Self <: SchemaVersionSource](x: Self) {
    
    inline def setMshField(value: String): Self = StObject.set(x, "mshField", value.asInstanceOf[js.Any])
    
    inline def setMshFieldNull: Self = StObject.set(x, "mshField", null)
    
    inline def setMshFieldUndefined: Self = StObject.set(x, "mshField", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
