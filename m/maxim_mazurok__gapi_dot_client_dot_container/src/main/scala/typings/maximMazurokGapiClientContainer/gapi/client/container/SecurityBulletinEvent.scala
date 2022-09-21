package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityBulletinEvent extends StObject {
  
  /** The GKE minor versions affected by this vulnerability. */
  var affectedSupportedMinors: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A brief description of the bulletin. See the bulletin pointed to by the bulletin_uri field for an expanded description. */
  var briefDescription: js.UndefOr[String] = js.undefined
  
  /** The ID of the bulletin corresponding to the vulnerability. */
  var bulletinId: js.UndefOr[String] = js.undefined
  
  /** The URI link to the bulletin on the website for more information. */
  var bulletinUri: js.UndefOr[String] = js.undefined
  
  /** The CVEs associated with this bulletin. */
  var cveIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** If this field is specified, it means there are manual steps that the user must take to make their clusters safe. */
  var manualStepsRequired: js.UndefOr[Boolean] = js.undefined
  
  /** The GKE versions where this vulnerability is patched. */
  var patchedVersions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The resource type (node/control plane) that has the vulnerability. Multiple notifications (1 notification per resource type) will be sent for a vulnerability that affects > 1
    * resource type.
    */
  var resourceTypeAffected: js.UndefOr[String] = js.undefined
  
  /** The severity of this bulletin as it relates to GKE. */
  var severity: js.UndefOr[String] = js.undefined
  
  /**
    * This represents a version selected from the patched_versions field that the cluster receiving this notification should most likely want to upgrade to based on its current version.
    * Note that if this notification is being received by a given cluster, it means that this version is currently available as an upgrade target in that cluster's location.
    */
  var suggestedUpgradeTarget: js.UndefOr[String] = js.undefined
}
object SecurityBulletinEvent {
  
  inline def apply(): SecurityBulletinEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityBulletinEvent]
  }
  
  extension [Self <: SecurityBulletinEvent](x: Self) {
    
    inline def setAffectedSupportedMinors(value: js.Array[String]): Self = StObject.set(x, "affectedSupportedMinors", value.asInstanceOf[js.Any])
    
    inline def setAffectedSupportedMinorsUndefined: Self = StObject.set(x, "affectedSupportedMinors", js.undefined)
    
    inline def setAffectedSupportedMinorsVarargs(value: String*): Self = StObject.set(x, "affectedSupportedMinors", js.Array(value*))
    
    inline def setBriefDescription(value: String): Self = StObject.set(x, "briefDescription", value.asInstanceOf[js.Any])
    
    inline def setBriefDescriptionUndefined: Self = StObject.set(x, "briefDescription", js.undefined)
    
    inline def setBulletinId(value: String): Self = StObject.set(x, "bulletinId", value.asInstanceOf[js.Any])
    
    inline def setBulletinIdUndefined: Self = StObject.set(x, "bulletinId", js.undefined)
    
    inline def setBulletinUri(value: String): Self = StObject.set(x, "bulletinUri", value.asInstanceOf[js.Any])
    
    inline def setBulletinUriUndefined: Self = StObject.set(x, "bulletinUri", js.undefined)
    
    inline def setCveIds(value: js.Array[String]): Self = StObject.set(x, "cveIds", value.asInstanceOf[js.Any])
    
    inline def setCveIdsUndefined: Self = StObject.set(x, "cveIds", js.undefined)
    
    inline def setCveIdsVarargs(value: String*): Self = StObject.set(x, "cveIds", js.Array(value*))
    
    inline def setManualStepsRequired(value: Boolean): Self = StObject.set(x, "manualStepsRequired", value.asInstanceOf[js.Any])
    
    inline def setManualStepsRequiredUndefined: Self = StObject.set(x, "manualStepsRequired", js.undefined)
    
    inline def setPatchedVersions(value: js.Array[String]): Self = StObject.set(x, "patchedVersions", value.asInstanceOf[js.Any])
    
    inline def setPatchedVersionsUndefined: Self = StObject.set(x, "patchedVersions", js.undefined)
    
    inline def setPatchedVersionsVarargs(value: String*): Self = StObject.set(x, "patchedVersions", js.Array(value*))
    
    inline def setResourceTypeAffected(value: String): Self = StObject.set(x, "resourceTypeAffected", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeAffectedUndefined: Self = StObject.set(x, "resourceTypeAffected", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSuggestedUpgradeTarget(value: String): Self = StObject.set(x, "suggestedUpgradeTarget", value.asInstanceOf[js.Any])
    
    inline def setSuggestedUpgradeTargetUndefined: Self = StObject.set(x, "suggestedUpgradeTarget", js.undefined)
  }
}
