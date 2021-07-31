package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response message for Capabilities.GetCapabilities.
  */
trait SchemaBuildBazelRemoteExecutionV2ServerCapabilities extends StObject {
  
  /**
    * Capabilities of the remote cache system.
    */
  var cacheCapabilities: js.UndefOr[SchemaBuildBazelRemoteExecutionV2CacheCapabilities] = js.undefined
  
  /**
    * Earliest RE API version supported, including deprecated versions.
    */
  var deprecatedApiVersion: js.UndefOr[SchemaBuildBazelSemverSemVer] = js.undefined
  
  /**
    * Capabilities of the remote execution system.
    */
  var executionCapabilities: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities] = js.undefined
  
  /**
    * Latest RE API version supported.
    */
  var highApiVersion: js.UndefOr[SchemaBuildBazelSemverSemVer] = js.undefined
  
  /**
    * Earliest non-deprecated RE API version supported.
    */
  var lowApiVersion: js.UndefOr[SchemaBuildBazelSemverSemVer] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2ServerCapabilities {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2ServerCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ServerCapabilities]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ServerCapabilitiesMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2ServerCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheCapabilities(value: SchemaBuildBazelRemoteExecutionV2CacheCapabilities): Self = StObject.set(x, "cacheCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheCapabilitiesUndefined: Self = StObject.set(x, "cacheCapabilities", js.undefined)
    
    @scala.inline
    def setDeprecatedApiVersion(value: SchemaBuildBazelSemverSemVer): Self = StObject.set(x, "deprecatedApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedApiVersionUndefined: Self = StObject.set(x, "deprecatedApiVersion", js.undefined)
    
    @scala.inline
    def setExecutionCapabilities(value: SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities): Self = StObject.set(x, "executionCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionCapabilitiesUndefined: Self = StObject.set(x, "executionCapabilities", js.undefined)
    
    @scala.inline
    def setHighApiVersion(value: SchemaBuildBazelSemverSemVer): Self = StObject.set(x, "highApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighApiVersionUndefined: Self = StObject.set(x, "highApiVersion", js.undefined)
    
    @scala.inline
    def setLowApiVersion(value: SchemaBuildBazelSemverSemVer): Self = StObject.set(x, "lowApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowApiVersionUndefined: Self = StObject.set(x, "lowApiVersion", js.undefined)
  }
}
