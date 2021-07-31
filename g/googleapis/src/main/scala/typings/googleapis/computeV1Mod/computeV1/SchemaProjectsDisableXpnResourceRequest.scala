package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProjectsDisableXpnResourceRequest extends StObject {
  
  /**
    * Service resource (a.k.a service project) ID.
    */
  var xpnResource: js.UndefOr[SchemaXpnResourceId] = js.undefined
}
object SchemaProjectsDisableXpnResourceRequest {
  
  @scala.inline
  def apply(): SchemaProjectsDisableXpnResourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectsDisableXpnResourceRequest]
  }
  
  @scala.inline
  implicit class SchemaProjectsDisableXpnResourceRequestMutableBuilder[Self <: SchemaProjectsDisableXpnResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXpnResource(value: SchemaXpnResourceId): Self = StObject.set(x, "xpnResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpnResourceUndefined: Self = StObject.set(x, "xpnResource", js.undefined)
  }
}
