package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for StepService.List.
  */
@js.native
trait SchemaListStepsResponse extends js.Object {
  
  /**
    * A continuation token to resume the query at the next item.  If set,
    * indicates that there are more steps to read, by calling list again with
    * this value in the page_token field.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Steps.
    */
  var steps: js.UndefOr[js.Array[SchemaStep]] = js.native
}
object SchemaListStepsResponse {
  
  @scala.inline
  def apply(): SchemaListStepsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListStepsResponse]
  }
  
  @scala.inline
  implicit class SchemaListStepsResponseOps[Self <: SchemaListStepsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: SchemaStep*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[SchemaStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
  }
}
