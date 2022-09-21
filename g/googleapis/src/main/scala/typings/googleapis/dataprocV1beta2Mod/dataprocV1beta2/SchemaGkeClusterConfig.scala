package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGkeClusterConfig extends StObject {
  
  /**
    * Optional. A target for the deployment.
    */
  var namespacedGkeDeploymentTarget: js.UndefOr[SchemaNamespacedGkeDeploymentTarget] = js.undefined
}
object SchemaGkeClusterConfig {
  
  inline def apply(): SchemaGkeClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGkeClusterConfig]
  }
  
  extension [Self <: SchemaGkeClusterConfig](x: Self) {
    
    inline def setNamespacedGkeDeploymentTarget(value: SchemaNamespacedGkeDeploymentTarget): Self = StObject.set(x, "namespacedGkeDeploymentTarget", value.asInstanceOf[js.Any])
    
    inline def setNamespacedGkeDeploymentTargetUndefined: Self = StObject.set(x, "namespacedGkeDeploymentTarget", js.undefined)
  }
}
