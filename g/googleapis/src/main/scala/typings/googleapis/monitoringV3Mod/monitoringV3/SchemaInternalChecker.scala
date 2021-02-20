package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An internal checker allows uptime checks to run on private/internal GCP
  * resources.
  */
@js.native
trait SchemaInternalChecker extends StObject {
  
  /**
    * The checker&#39;s human-readable name. The display name should be unique
    * within a Stackdriver Workspace in order to make it easier to identify;
    * however, uniqueness is not enforced.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The GCP zone the uptime check should egress from. Only respected for
    * internal uptime checks, where internal_network is specified.
    */
  var gcpZone: js.UndefOr[String] = js.native
  
  /**
    * A unique resource name for this InternalChecker. The format
    * is:projects/[PROJECT_ID]/internalCheckers/[INTERNAL_CHECKER_ID].PROJECT_ID
    * is the stackdriver workspace project for the uptime check config
    * associated with the internal checker.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The GCP VPC network (https://cloud.google.com/vpc/docs/vpc) where the
    * internal resource lives (ex: &quot;default&quot;).
    */
  var network: js.UndefOr[String] = js.native
  
  /**
    * The GCP project_id where the internal checker lives. Not necessary the
    * same as the workspace project.
    */
  var peerProjectId: js.UndefOr[String] = js.native
  
  /**
    * The current operational state of the internal checker.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaInternalChecker {
  
  @scala.inline
  def apply(): SchemaInternalChecker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInternalChecker]
  }
  
  @scala.inline
  implicit class SchemaInternalCheckerMutableBuilder[Self <: SchemaInternalChecker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setGcpZone(value: String): Self = StObject.set(x, "gcpZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcpZoneUndefined: Self = StObject.set(x, "gcpZone", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setPeerProjectId(value: String): Self = StObject.set(x, "peerProjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerProjectIdUndefined: Self = StObject.set(x, "peerProjectId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
