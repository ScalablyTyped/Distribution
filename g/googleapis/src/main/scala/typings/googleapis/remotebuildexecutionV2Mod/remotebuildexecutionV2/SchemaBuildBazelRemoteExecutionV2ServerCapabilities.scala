package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message for Capabilities.GetCapabilities.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2ServerCapabilities extends js.Object {
  /**
    * Capabilities of the remote cache system.
    */
  var cacheCapabilities: js.UndefOr[SchemaBuildBazelRemoteExecutionV2CacheCapabilities] = js.native
  /**
    * Earliest RE API version supported, including deprecated versions.
    */
  var deprecatedApiVersion: js.UndefOr[SchemaBuildBazelSemverSemVer] = js.native
  /**
    * Capabilities of the remote execution system.
    */
  var executionCapabilities: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities] = js.native
  /**
    * Latest RE API version supported.
    */
  var highApiVersion: js.UndefOr[SchemaBuildBazelSemverSemVer] = js.native
  /**
    * Earliest non-deprecated RE API version supported.
    */
  var lowApiVersion: js.UndefOr[SchemaBuildBazelSemverSemVer] = js.native
}

object SchemaBuildBazelRemoteExecutionV2ServerCapabilities {
  @scala.inline
  def apply(
    cacheCapabilities: SchemaBuildBazelRemoteExecutionV2CacheCapabilities = null,
    deprecatedApiVersion: SchemaBuildBazelSemverSemVer = null,
    executionCapabilities: SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities = null,
    highApiVersion: SchemaBuildBazelSemverSemVer = null,
    lowApiVersion: SchemaBuildBazelSemverSemVer = null
  ): SchemaBuildBazelRemoteExecutionV2ServerCapabilities = {
    val __obj = js.Dynamic.literal()
    if (cacheCapabilities != null) __obj.updateDynamic("cacheCapabilities")(cacheCapabilities.asInstanceOf[js.Any])
    if (deprecatedApiVersion != null) __obj.updateDynamic("deprecatedApiVersion")(deprecatedApiVersion.asInstanceOf[js.Any])
    if (executionCapabilities != null) __obj.updateDynamic("executionCapabilities")(executionCapabilities.asInstanceOf[js.Any])
    if (highApiVersion != null) __obj.updateDynamic("highApiVersion")(highApiVersion.asInstanceOf[js.Any])
    if (lowApiVersion != null) __obj.updateDynamic("lowApiVersion")(lowApiVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ServerCapabilities]
  }
}

