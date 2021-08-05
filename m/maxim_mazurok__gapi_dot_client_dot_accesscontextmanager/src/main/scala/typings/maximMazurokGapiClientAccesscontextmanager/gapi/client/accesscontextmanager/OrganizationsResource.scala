package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationsResource extends StObject {
  
  var gcpUserAccessBindings: GcpUserAccessBindingsResource
}
object OrganizationsResource {
  
  inline def apply(gcpUserAccessBindings: GcpUserAccessBindingsResource): OrganizationsResource = {
    val __obj = js.Dynamic.literal(gcpUserAccessBindings = gcpUserAccessBindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationsResource]
  }
  
  extension [Self <: OrganizationsResource](x: Self) {
    
    inline def setGcpUserAccessBindings(value: GcpUserAccessBindingsResource): Self = StObject.set(x, "gcpUserAccessBindings", value.asInstanceOf[js.Any])
  }
}
