package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsEnableXpnResourceRequest extends StObject {
  
  /** Service resource (a.k.a service project) ID. */
  var xpnResource: js.UndefOr[XpnResourceId] = js.undefined
}
object ProjectsEnableXpnResourceRequest {
  
  @scala.inline
  def apply(): ProjectsEnableXpnResourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectsEnableXpnResourceRequest]
  }
  
  @scala.inline
  implicit class ProjectsEnableXpnResourceRequestMutableBuilder[Self <: ProjectsEnableXpnResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXpnResource(value: XpnResourceId): Self = StObject.set(x, "xpnResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpnResourceUndefined: Self = StObject.set(x, "xpnResource", js.undefined)
  }
}
