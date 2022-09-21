package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApplianceCluster extends StObject {
  
  /**
    * Immutable. Self-link of the GCP resource for the Appliance Cluster. For example: //transferappliance.googleapis.com/projects/my-project/locations/us-west1-a/appliances/my-appliance
    */
  var resourceLink: js.UndefOr[String | Null] = js.undefined
}
object SchemaApplianceCluster {
  
  inline def apply(): SchemaApplianceCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplianceCluster]
  }
  
  extension [Self <: SchemaApplianceCluster](x: Self) {
    
    inline def setResourceLink(value: String): Self = StObject.set(x, "resourceLink", value.asInstanceOf[js.Any])
    
    inline def setResourceLinkNull: Self = StObject.set(x, "resourceLink", null)
    
    inline def setResourceLinkUndefined: Self = StObject.set(x, "resourceLink", js.undefined)
  }
}
