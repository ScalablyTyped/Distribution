package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatafeedStatusError extends StObject {
  
  /** The code of the error, e.g., "validation/invalid_value". */
  var code: js.UndefOr[String] = js.native
  
  /** The number of occurrences of the error in the feed. */
  var count: js.UndefOr[String] = js.native
  
  /** A list of example occurrences of the error, grouped by product. */
  var examples: js.UndefOr[js.Array[DatafeedStatusExample]] = js.native
  
  /** The error message, e.g., "Invalid price". */
  var message: js.UndefOr[String] = js.native
}
object DatafeedStatusError {
  
  @scala.inline
  def apply(): DatafeedStatusError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedStatusError]
  }
  
  @scala.inline
  implicit class DatafeedStatusErrorMutableBuilder[Self <: DatafeedStatusError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setExamples(value: js.Array[DatafeedStatusExample]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    @scala.inline
    def setExamplesVarargs(value: DatafeedStatusExample*): Self = StObject.set(x, "examples", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
