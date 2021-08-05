package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsDisableXpnResourceRequest extends StObject {
  
  /** Service resource (a.k.a service project) ID. */
  var xpnResource: js.UndefOr[XpnResourceId] = js.undefined
}
object ProjectsDisableXpnResourceRequest {
  
  inline def apply(): ProjectsDisableXpnResourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectsDisableXpnResourceRequest]
  }
  
  extension [Self <: ProjectsDisableXpnResourceRequest](x: Self) {
    
    inline def setXpnResource(value: XpnResourceId): Self = StObject.set(x, "xpnResource", value.asInstanceOf[js.Any])
    
    inline def setXpnResourceUndefined: Self = StObject.set(x, "xpnResource", js.undefined)
  }
}
