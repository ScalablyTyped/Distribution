package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaBuildBazelRemoteExecutionV2ServerCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ServerCapabilities]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ServerCapabilitiesOps[Self <: SchemaBuildBazelRemoteExecutionV2ServerCapabilities] (val x: Self) extends AnyVal {
    
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
    def setCacheCapabilities(value: SchemaBuildBazelRemoteExecutionV2CacheCapabilities): Self = this.set("cacheCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheCapabilities: Self = this.set("cacheCapabilities", js.undefined)
    
    @scala.inline
    def setDeprecatedApiVersion(value: SchemaBuildBazelSemverSemVer): Self = this.set("deprecatedApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecatedApiVersion: Self = this.set("deprecatedApiVersion", js.undefined)
    
    @scala.inline
    def setExecutionCapabilities(value: SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities): Self = this.set("executionCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionCapabilities: Self = this.set("executionCapabilities", js.undefined)
    
    @scala.inline
    def setHighApiVersion(value: SchemaBuildBazelSemverSemVer): Self = this.set("highApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighApiVersion: Self = this.set("highApiVersion", js.undefined)
    
    @scala.inline
    def setLowApiVersion(value: SchemaBuildBazelSemverSemVer): Self = this.set("lowApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowApiVersion: Self = this.set("lowApiVersion", js.undefined)
  }
}
