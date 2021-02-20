package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains error status for each import failure.
  */
@js.native
trait SchemaImportError extends StObject {
  
  /**
    * Resource name.
    */
  var resource: js.UndefOr[String] = js.native
  
  /**
    * Error status associated with resource.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}
object SchemaImportError {
  
  @scala.inline
  def apply(): SchemaImportError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportError]
  }
  
  @scala.inline
  implicit class SchemaImportErrorMutableBuilder[Self <: SchemaImportError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
