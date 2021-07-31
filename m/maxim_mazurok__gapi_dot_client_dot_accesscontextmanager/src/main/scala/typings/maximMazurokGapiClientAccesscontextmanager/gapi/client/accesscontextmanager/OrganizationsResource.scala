package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationsResource extends StObject {
  
  var gcpUserAccessBindings: GcpUserAccessBindingsResource
}
object OrganizationsResource {
  
  @scala.inline
  def apply(gcpUserAccessBindings: GcpUserAccessBindingsResource): OrganizationsResource = {
    val __obj = js.Dynamic.literal(gcpUserAccessBindings = gcpUserAccessBindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationsResource]
  }
  
  @scala.inline
  implicit class OrganizationsResourceMutableBuilder[Self <: OrganizationsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcpUserAccessBindings(value: GcpUserAccessBindingsResource): Self = StObject.set(x, "gcpUserAccessBindings", value.asInstanceOf[js.Any])
  }
}
