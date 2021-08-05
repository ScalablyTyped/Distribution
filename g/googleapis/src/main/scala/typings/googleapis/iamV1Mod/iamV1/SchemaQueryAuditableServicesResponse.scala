package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response containing a list of auditable services for a resource.
  */
trait SchemaQueryAuditableServicesResponse extends StObject {
  
  /**
    * The auditable services for a resource.
    */
  var services: js.UndefOr[js.Array[SchemaAuditableService]] = js.undefined
}
object SchemaQueryAuditableServicesResponse {
  
  inline def apply(): SchemaQueryAuditableServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryAuditableServicesResponse]
  }
  
  extension [Self <: SchemaQueryAuditableServicesResponse](x: Self) {
    
    inline def setServices(value: js.Array[SchemaAuditableService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: SchemaAuditableService*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
