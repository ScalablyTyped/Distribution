package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1TaskInfrastructureSpecVpcNetwork extends StObject {
  
  /**
    * Optional. The Cloud VPC network in which the job is run. By default, the Cloud VPC network named Default within the project is used.
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. List of network tags to apply to the job.
    */
  var networkTags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. The Cloud VPC sub-network in which the job is run.
    */
  var subNetwork: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1TaskInfrastructureSpecVpcNetwork {
  
  inline def apply(): SchemaGoogleCloudDataplexV1TaskInfrastructureSpecVpcNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1TaskInfrastructureSpecVpcNetwork]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1TaskInfrastructureSpecVpcNetwork](x: Self) {
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkTags(value: js.Array[String]): Self = StObject.set(x, "networkTags", value.asInstanceOf[js.Any])
    
    inline def setNetworkTagsNull: Self = StObject.set(x, "networkTags", null)
    
    inline def setNetworkTagsUndefined: Self = StObject.set(x, "networkTags", js.undefined)
    
    inline def setNetworkTagsVarargs(value: String*): Self = StObject.set(x, "networkTags", js.Array(value*))
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setSubNetwork(value: String): Self = StObject.set(x, "subNetwork", value.asInstanceOf[js.Any])
    
    inline def setSubNetworkNull: Self = StObject.set(x, "subNetwork", null)
    
    inline def setSubNetworkUndefined: Self = StObject.set(x, "subNetwork", js.undefined)
  }
}
