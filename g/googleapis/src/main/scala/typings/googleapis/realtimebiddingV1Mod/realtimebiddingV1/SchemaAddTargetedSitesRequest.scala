package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddTargetedSitesRequest extends StObject {
  
  /**
    * A list of site URLs to target in the pretargeting configuration. These values will be added to the list of targeted URLs in PretargetingConfig.webTargeting.values.
    */
  var sites: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The targeting mode that should be applied to the list of site URLs. If there are existing targeted sites, must be equal to the existing PretargetingConfig.webTargeting.targetingMode or a 400 bad request error will be returned.
    */
  var targetingMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaAddTargetedSitesRequest {
  
  inline def apply(): SchemaAddTargetedSitesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddTargetedSitesRequest]
  }
  
  extension [Self <: SchemaAddTargetedSitesRequest](x: Self) {
    
    inline def setSites(value: js.Array[String]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
    
    inline def setSitesNull: Self = StObject.set(x, "sites", null)
    
    inline def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
    
    inline def setSitesVarargs(value: String*): Self = StObject.set(x, "sites", js.Array(value*))
    
    inline def setTargetingMode(value: String): Self = StObject.set(x, "targetingMode", value.asInstanceOf[js.Any])
    
    inline def setTargetingModeNull: Self = StObject.set(x, "targetingMode", null)
    
    inline def setTargetingModeUndefined: Self = StObject.set(x, "targetingMode", js.undefined)
  }
}
