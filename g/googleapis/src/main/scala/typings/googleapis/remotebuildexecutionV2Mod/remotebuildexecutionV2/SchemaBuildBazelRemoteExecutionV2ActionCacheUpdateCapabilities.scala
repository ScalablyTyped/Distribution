package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities extends StObject {
  
  var updateEnabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities](x: Self) {
    
    inline def setUpdateEnabled(value: Boolean): Self = StObject.set(x, "updateEnabled", value.asInstanceOf[js.Any])
    
    inline def setUpdateEnabledNull: Self = StObject.set(x, "updateEnabled", null)
    
    inline def setUpdateEnabledUndefined: Self = StObject.set(x, "updateEnabled", js.undefined)
  }
}
