package typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Category extends StObject {
  
  /** The type of product the SKU refers to. Example: "Compute", "Storage", "Network", "ApplicationServices" etc. */
  var resourceFamily: js.UndefOr[String] = js.undefined
  
  /** A group classification for related SKUs. Example: "RAM", "GPU", "Prediction", "Ops", "GoogleEgress" etc. */
  var resourceGroup: js.UndefOr[String] = js.undefined
  
  /** The display name of the service this SKU belongs to. */
  var serviceDisplayName: js.UndefOr[String] = js.undefined
  
  /** Represents how the SKU is consumed. Example: "OnDemand", "Preemptible", "Commit1Mo", "Commit1Yr" etc. */
  var usageType: js.UndefOr[String] = js.undefined
}
object Category {
  
  inline def apply(): Category = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Category]
  }
  
  extension [Self <: Category](x: Self) {
    
    inline def setResourceFamily(value: String): Self = StObject.set(x, "resourceFamily", value.asInstanceOf[js.Any])
    
    inline def setResourceFamilyUndefined: Self = StObject.set(x, "resourceFamily", js.undefined)
    
    inline def setResourceGroup(value: String): Self = StObject.set(x, "resourceGroup", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupUndefined: Self = StObject.set(x, "resourceGroup", js.undefined)
    
    inline def setServiceDisplayName(value: String): Self = StObject.set(x, "serviceDisplayName", value.asInstanceOf[js.Any])
    
    inline def setServiceDisplayNameUndefined: Self = StObject.set(x, "serviceDisplayName", js.undefined)
    
    inline def setUsageType(value: String): Self = StObject.set(x, "usageType", value.asInstanceOf[js.Any])
    
    inline def setUsageTypeUndefined: Self = StObject.set(x, "usageType", js.undefined)
  }
}
