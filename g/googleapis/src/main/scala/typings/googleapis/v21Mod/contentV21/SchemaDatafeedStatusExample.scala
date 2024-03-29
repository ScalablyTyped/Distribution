package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatafeedStatusExample extends StObject {
  
  /**
    * The ID of the example item.
    */
  var itemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Line number in the data feed where the example is found.
    */
  var lineNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The problematic value.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaDatafeedStatusExample {
  
  inline def apply(): SchemaDatafeedStatusExample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedStatusExample]
  }
  
  extension [Self <: SchemaDatafeedStatusExample](x: Self) {
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdNull: Self = StObject.set(x, "itemId", null)
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setLineNumber(value: String): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberNull: Self = StObject.set(x, "lineNumber", null)
    
    inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
