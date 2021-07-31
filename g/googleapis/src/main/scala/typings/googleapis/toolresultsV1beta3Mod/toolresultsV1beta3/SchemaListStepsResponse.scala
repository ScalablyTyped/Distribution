package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for StepService.List.
  */
trait SchemaListStepsResponse extends StObject {
  
  /**
    * A continuation token to resume the query at the next item.  If set,
    * indicates that there are more steps to read, by calling list again with
    * this value in the page_token field.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Steps.
    */
  var steps: js.UndefOr[js.Array[SchemaStep]] = js.undefined
}
object SchemaListStepsResponse {
  
  @scala.inline
  def apply(): SchemaListStepsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListStepsResponse]
  }
  
  @scala.inline
  implicit class SchemaListStepsResponseMutableBuilder[Self <: SchemaListStepsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSteps(value: js.Array[SchemaStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: SchemaStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
