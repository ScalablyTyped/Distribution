package typings.googleapis.gkehubV1Mod.gkehubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEdgeCluster extends StObject {
  
  /**
    * Immutable. Self-link of the GCP resource for the Edge Cluster. For example: //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
    */
  var resourceLink: js.UndefOr[String | Null] = js.undefined
}
object SchemaEdgeCluster {
  
  inline def apply(): SchemaEdgeCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEdgeCluster]
  }
  
  extension [Self <: SchemaEdgeCluster](x: Self) {
    
    inline def setResourceLink(value: String): Self = StObject.set(x, "resourceLink", value.asInstanceOf[js.Any])
    
    inline def setResourceLinkNull: Self = StObject.set(x, "resourceLink", null)
    
    inline def setResourceLinkUndefined: Self = StObject.set(x, "resourceLink", js.undefined)
  }
}
