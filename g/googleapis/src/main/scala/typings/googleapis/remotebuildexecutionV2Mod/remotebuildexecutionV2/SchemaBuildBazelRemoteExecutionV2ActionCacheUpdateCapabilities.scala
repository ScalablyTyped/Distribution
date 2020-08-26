package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the server/instance capabilities for updating the action cache.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities extends js.Object {
  var updateEnabled: js.UndefOr[Boolean] = js.native
}

object SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilitiesOps[Self <: SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUpdateEnabled(value: Boolean): Self = this.set("updateEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateEnabled: Self = this.set("updateEnabled", js.undefined)
  }
  
}

