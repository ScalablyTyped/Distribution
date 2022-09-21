package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrivateClusterMasterGlobalAccessConfig extends StObject {
  
  /**
    * Whenever master is accessible globally or not.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaPrivateClusterMasterGlobalAccessConfig {
  
  inline def apply(): SchemaPrivateClusterMasterGlobalAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateClusterMasterGlobalAccessConfig]
  }
  
  extension [Self <: SchemaPrivateClusterMasterGlobalAccessConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
