package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for PresentationsService.BatchUpdatePresentation.
  */
@js.native
trait SchemaBatchUpdatePresentationRequest extends StObject {
  
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
  implicit class SchemaBatchUpdatePresentationRequestMutableBuilder[Self <: SchemaBatchUpdatePresentationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequests(value: js.Array[SchemaRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: SchemaRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
    
    @scala.inline
    def setWriteControl(value: SchemaWriteControl): Self = StObject.set(x, "writeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteControlUndefined: Self = StObject.set(x, "writeControl", js.undefined)
  }
}
