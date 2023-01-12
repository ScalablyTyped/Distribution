package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatafeedStatusExample extends StObject {
  
  /** The ID of the example item. */
  var itemId: js.UndefOr[String] = js.undefined
  
  /** Line number in the data feed where the example is found. */
  var lineNumber: js.UndefOr[String] = js.undefined
  
  /** The problematic value. */
  var value: js.UndefOr[String] = js.undefined
}
object DatafeedStatusExample {
  
  inline def apply(): DatafeedStatusExample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedStatusExample]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatafeedStatusExample] (val x: Self) extends AnyVal {
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setLineNumber(value: String): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
