package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Network describes the GCP network used to create workers in.
  */
trait SchemaNetwork extends StObject {
  
  /**
    * Network on which the workers are created. &quot;default&quot; network is
    * used if empty.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * Project id containing the defined network and subnetwork. For a peered
    * VPC, this will be the same as the project_id in which the workers are
    * created. For a shared VPC, this will be the project sharing the network
    * with the project_id project in which workers will be created. For custom
    * workers with no VPC, this will be the same as project_id.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Subnetwork on which the workers are created. &quot;default&quot;
    * subnetwork is used if empty.
    */
  var subnetwork: js.UndefOr[String] = js.undefined
}
object SchemaNetwork {
  
  inline def apply(): SchemaNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetwork]
  }
  
  extension [Self <: SchemaNetwork](x: Self) {
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
  }
}
