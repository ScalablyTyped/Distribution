package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemoveTargetedSitesRequest extends StObject {
  
  /**
    * A list of site URLs to stop targeting in the pretargeting configuration. These values will be removed from the list of targeted URLs in PretargetingConfig.webTargeting.values.
    */
  var sites: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRemoveTargetedSitesRequest {
  
  inline def apply(): SchemaRemoveTargetedSitesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveTargetedSitesRequest]
  }
  
  extension [Self <: SchemaRemoveTargetedSitesRequest](x: Self) {
    
    inline def setSites(value: js.Array[String]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
    
    inline def setSitesNull: Self = StObject.set(x, "sites", null)
    
    inline def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
    
    inline def setSitesVarargs(value: String*): Self = StObject.set(x, "sites", js.Array(value*))
  }
}
