package typings.googleapis.networkconnectivityV1Mod.networkconnectivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLinkedRouterApplianceInstances extends StObject {
  
  /**
    * The list of router appliance instances.
    */
  var instances: js.UndefOr[js.Array[SchemaRouterApplianceInstance]] = js.undefined
  
  /**
    * A value that controls whether site-to-site data transfer is enabled for these resources. Data transfer is available only in [supported locations](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/locations).
    */
  var siteToSiteDataTransfer: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaLinkedRouterApplianceInstances {
  
  inline def apply(): SchemaLinkedRouterApplianceInstances = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinkedRouterApplianceInstances]
  }
  
  extension [Self <: SchemaLinkedRouterApplianceInstances](x: Self) {
    
    inline def setInstances(value: js.Array[SchemaRouterApplianceInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: SchemaRouterApplianceInstance*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setSiteToSiteDataTransfer(value: Boolean): Self = StObject.set(x, "siteToSiteDataTransfer", value.asInstanceOf[js.Any])
    
    inline def setSiteToSiteDataTransferNull: Self = StObject.set(x, "siteToSiteDataTransfer", null)
    
    inline def setSiteToSiteDataTransferUndefined: Self = StObject.set(x, "siteToSiteDataTransfer", js.undefined)
  }
}
