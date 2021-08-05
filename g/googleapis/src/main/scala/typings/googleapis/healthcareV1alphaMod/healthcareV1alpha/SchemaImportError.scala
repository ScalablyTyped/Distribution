package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains error status for each import failure.
  */
trait SchemaImportError extends StObject {
  
  /**
    * Resource name.
    */
  var resource: js.UndefOr[String] = js.undefined
  
  /**
    * Error status associated with resource.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
}
object SchemaImportError {
  
  inline def apply(): SchemaImportError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportError]
  }
  
  extension [Self <: SchemaImportError](x: Self) {
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
