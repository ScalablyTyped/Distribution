package typings.googleapis.gkehubV1Mod.gkehubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateConnectManifestResponse extends StObject {
  
  /**
    * The ordered list of Kubernetes resources that need to be applied to the cluster for GKE Connect agent installation/upgrade.
    */
  var manifest: js.UndefOr[js.Array[SchemaConnectAgentResource]] = js.undefined
}
object SchemaGenerateConnectManifestResponse {
  
  inline def apply(): SchemaGenerateConnectManifestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateConnectManifestResponse]
  }
  
  extension [Self <: SchemaGenerateConnectManifestResponse](x: Self) {
    
    inline def setManifest(value: js.Array[SchemaConnectAgentResource]): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setManifestVarargs(value: SchemaConnectAgentResource*): Self = StObject.set(x, "manifest", js.Array(value*))
  }
}
