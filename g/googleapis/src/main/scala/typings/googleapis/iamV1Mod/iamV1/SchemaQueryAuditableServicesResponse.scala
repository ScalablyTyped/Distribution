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
  
  @scala.inline
  def apply(): SchemaQueryAuditableServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryAuditableServicesResponse]
  }
  
  @scala.inline
  implicit class SchemaQueryAuditableServicesResponseMutableBuilder[Self <: SchemaQueryAuditableServicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServices(value: js.Array[SchemaAuditableService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: SchemaAuditableService*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
