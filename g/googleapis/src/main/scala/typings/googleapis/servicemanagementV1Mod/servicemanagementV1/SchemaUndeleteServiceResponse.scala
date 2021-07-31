package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for UndeleteService method.
  */
trait SchemaUndeleteServiceResponse extends StObject {
  
  /**
    * Revived service resource.
    */
  var service: js.UndefOr[SchemaManagedService] = js.undefined
}
object SchemaUndeleteServiceResponse {
  
  @scala.inline
  def apply(): SchemaUndeleteServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUndeleteServiceResponse]
  }
  
  @scala.inline
  implicit class SchemaUndeleteServiceResponseMutableBuilder[Self <: SchemaUndeleteServiceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService(value: SchemaManagedService): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
