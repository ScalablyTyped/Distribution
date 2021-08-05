package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProjectsEnableXpnResourceRequest extends StObject {
  
  /**
    * Service resource (a.k.a service project) ID.
    */
  var xpnResource: js.UndefOr[SchemaXpnResourceId] = js.undefined
}
object SchemaProjectsEnableXpnResourceRequest {
  
  inline def apply(): SchemaProjectsEnableXpnResourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectsEnableXpnResourceRequest]
  }
  
  extension [Self <: SchemaProjectsEnableXpnResourceRequest](x: Self) {
    
    inline def setXpnResource(value: SchemaXpnResourceId): Self = StObject.set(x, "xpnResource", value.asInstanceOf[js.Any])
    
    inline def setXpnResourceUndefined: Self = StObject.set(x, "xpnResource", js.undefined)
  }
}
