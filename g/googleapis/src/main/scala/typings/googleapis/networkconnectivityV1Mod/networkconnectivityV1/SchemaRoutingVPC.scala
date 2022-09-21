package typings.googleapis.networkconnectivityV1Mod.networkconnectivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRoutingVPC extends StObject {
  
  /**
    * Output only. If true, indicates that this VPC network is currently associated with spokes that use the data transfer feature (spokes where the site_to_site_data_transfer field is set to true). If you create new spokes that use data transfer, they must be associated with this VPC network. At most, one VPC network will have this field set to true.
    */
  var requiredForNewSiteToSiteDataTransferSpokes: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The URI of the VPC network.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaRoutingVPC {
  
  inline def apply(): SchemaRoutingVPC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoutingVPC]
  }
  
  extension [Self <: SchemaRoutingVPC](x: Self) {
    
    inline def setRequiredForNewSiteToSiteDataTransferSpokes(value: Boolean): Self = StObject.set(x, "requiredForNewSiteToSiteDataTransferSpokes", value.asInstanceOf[js.Any])
    
    inline def setRequiredForNewSiteToSiteDataTransferSpokesNull: Self = StObject.set(x, "requiredForNewSiteToSiteDataTransferSpokes", null)
    
    inline def setRequiredForNewSiteToSiteDataTransferSpokesUndefined: Self = StObject.set(x, "requiredForNewSiteToSiteDataTransferSpokes", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
