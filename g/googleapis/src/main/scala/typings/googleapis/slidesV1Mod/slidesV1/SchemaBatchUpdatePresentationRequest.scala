package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for PresentationsService.BatchUpdatePresentation.
  */
@js.native
trait SchemaBatchUpdatePresentationRequest extends js.Object {
  
  /**
    * A list of updates to apply to the presentation.
    */
  var requests: js.UndefOr[js.Array[SchemaRequest]] = js.native
  
  /**
    * Provides control over how write requests are executed.
    */
  var writeControl: js.UndefOr[SchemaWriteControl] = js.native
}
object SchemaBatchUpdatePresentationRequest {
  
  @scala.inline
  def apply(): SchemaBatchUpdatePresentationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdatePresentationRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchUpdatePresentationRequestOps[Self <: SchemaBatchUpdatePresentationRequest] (val x: Self) extends AnyVal {
    
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
    def setRequestsVarargs(value: SchemaRequest*): Self = this.set("requests", js.Array(value :_*))
    
    @scala.inline
    def setRequests(value: js.Array[SchemaRequest]): Self = this.set("requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
    
    @scala.inline
    def setWriteControl(value: SchemaWriteControl): Self = this.set("writeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteControl: Self = this.set("writeControl", js.undefined)
  }
}
