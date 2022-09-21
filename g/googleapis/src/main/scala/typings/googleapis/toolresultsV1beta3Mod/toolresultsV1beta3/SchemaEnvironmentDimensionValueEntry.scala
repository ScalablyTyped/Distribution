package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnvironmentDimensionValueEntry extends StObject {
  
  var key: js.UndefOr[String | Null] = js.undefined
  
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaEnvironmentDimensionValueEntry {
  
  inline def apply(): SchemaEnvironmentDimensionValueEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironmentDimensionValueEntry]
  }
  
  extension [Self <: SchemaEnvironmentDimensionValueEntry](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
