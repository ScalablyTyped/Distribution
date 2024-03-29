package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGkeBackupAgentConfig extends StObject {
  
  /**
    * Whether the Backup for GKE agent is enabled for this cluster.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGkeBackupAgentConfig {
  
  inline def apply(): SchemaGkeBackupAgentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGkeBackupAgentConfig]
  }
  
  extension [Self <: SchemaGkeBackupAgentConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
