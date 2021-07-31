package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error occurring in the feed, like &quot;invalid price&quot;.
  */
trait SchemaDatafeedStatusError extends StObject {
  
  /**
    * The code of the error, e.g., &quot;validation/invalid_value&quot;.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * The number of occurrences of the error in the feed.
    */
  var count: js.UndefOr[String] = js.undefined
  
  /**
    * A list of example occurrences of the error, grouped by product.
    */
  var examples: js.UndefOr[js.Array[SchemaDatafeedStatusExample]] = js.undefined
  
  /**
    * The error message, e.g., &quot;Invalid price&quot;.
    */
  var message: js.UndefOr[String] = js.undefined
}
object SchemaDatafeedStatusError {
  
  @scala.inline
  def apply(): SchemaDatafeedStatusError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedStatusError]
  }
  
  @scala.inline
  implicit class SchemaDatafeedStatusErrorMutableBuilder[Self <: SchemaDatafeedStatusError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setExamples(value: js.Array[SchemaDatafeedStatusExample]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    @scala.inline
    def setExamplesVarargs(value: SchemaDatafeedStatusExample*): Self = StObject.set(x, "examples", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
