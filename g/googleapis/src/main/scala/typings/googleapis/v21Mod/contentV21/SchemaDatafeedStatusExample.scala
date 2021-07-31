package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An example occurrence for a particular error.
  */
trait SchemaDatafeedStatusExample extends StObject {
  
  /**
    * The ID of the example item.
    */
  var itemId: js.UndefOr[String] = js.undefined
  
  /**
    * Line number in the data feed where the example is found.
    */
  var lineNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The problematic value.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaDatafeedStatusExample {
  
  @scala.inline
  def apply(): SchemaDatafeedStatusExample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedStatusExample]
  }
  
  @scala.inline
  implicit class SchemaDatafeedStatusExampleMutableBuilder[Self <: SchemaDatafeedStatusExample] (val x: Self) extends AnyVal {
    
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
