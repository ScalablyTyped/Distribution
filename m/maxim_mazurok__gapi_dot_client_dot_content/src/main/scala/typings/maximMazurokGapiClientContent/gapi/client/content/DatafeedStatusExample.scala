package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatafeedStatusExample extends StObject {
  
  /** The ID of the example item. */
  var itemId: js.UndefOr[String] = js.native
  
  /** Line number in the data feed where the example is found. */
  var lineNumber: js.UndefOr[String] = js.native
  
  /** The problematic value. */
  var value: js.UndefOr[String] = js.native
}
object DatafeedStatusExample {
  
  @scala.inline
  def apply(): DatafeedStatusExample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedStatusExample]
  }
  
  @scala.inline
  implicit class DatafeedStatusExampleMutableBuilder[Self <: DatafeedStatusExample] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    @scala.inline
    def setLineNumber(value: String): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
