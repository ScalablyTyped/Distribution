package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the server/instance capabilities for updating the action cache.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities extends StObject {
  
  var updateEnabled: js.UndefOr[Boolean] = js.native
}
object SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilitiesMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdateEnabled(value: Boolean): Self = StObject.set(x, "updateEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateEnabledUndefined: Self = StObject.set(x, "updateEnabled", js.undefined)
  }
}
