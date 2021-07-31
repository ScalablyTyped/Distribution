package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for BatchUpdateDocument.
  */
trait SchemaBatchUpdateDocumentRequest extends StObject {
  
  /**
    * A list of updates to apply to the document.
    */
  var requests: js.UndefOr[js.Array[SchemaRequest]] = js.undefined
  
  /**
    * Provides control over how write requests are executed.
    */
  var writeControl: js.UndefOr[SchemaWriteControl] = js.undefined
}
object SchemaBatchUpdateDocumentRequest {
  
  @scala.inline
  def apply(): SchemaBatchUpdateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateDocumentRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchUpdateDocumentRequestMutableBuilder[Self <: SchemaBatchUpdateDocumentRequest] (val x: Self) extends AnyVal {
    
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
