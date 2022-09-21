package typings.googleapis.gkehubV1alpha2Mod.gkehubV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKubernetesResource extends StObject {
  
  /**
    * Output only. The Kubernetes resources for installing the GKE Connect agent. This field is only populated in the Membership returned from a successful long-running operation from CreateMembership or UpdateMembership. It is not populated during normal GetMembership or ListMemberships requests. To get the resource manifest after the initial registration, the caller should make a UpdateMembership call with an empty field mask.
    */
  var connectResources: js.UndefOr[js.Array[SchemaResourceManifest]] = js.undefined
  
  /**
    * Input only. The YAML representation of the Membership CR. This field is ignored for GKE clusters where Hub can read the CR directly. Callers should provide the CR that is currently present in the cluster during Create or Update, or leave this field empty if none exists. The CR manifest is used to validate the cluster has not been registered with another Membership.
    */
  var membershipCrManifest: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Additional Kubernetes resources that need to be applied to the cluster after Membership creation, and after every update. This field is only populated in the Membership returned from a successful long-running operation from CreateMembership or UpdateMembership. It is not populated during normal GetMembership or ListMemberships requests. To get the resource manifest after the initial registration, the caller should make a UpdateMembership call with an empty field mask.
    */
  var membershipResources: js.UndefOr[js.Array[SchemaResourceManifest]] = js.undefined
  
  /**
    * Optional. Options for Kubernetes resource generation.
    */
  var resourceOptions: js.UndefOr[SchemaResourceOptions] = js.undefined
}
object SchemaKubernetesResource {
  
  inline def apply(): SchemaKubernetesResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKubernetesResource]
  }
  
  extension [Self <: SchemaKubernetesResource](x: Self) {
    
    inline def setConnectResources(value: js.Array[SchemaResourceManifest]): Self = StObject.set(x, "connectResources", value.asInstanceOf[js.Any])
    
    inline def setConnectResourcesUndefined: Self = StObject.set(x, "connectResources", js.undefined)
    
    inline def setConnectResourcesVarargs(value: SchemaResourceManifest*): Self = StObject.set(x, "connectResources", js.Array(value*))
    
    inline def setMembershipCrManifest(value: String): Self = StObject.set(x, "membershipCrManifest", value.asInstanceOf[js.Any])
    
    inline def setMembershipCrManifestNull: Self = StObject.set(x, "membershipCrManifest", null)
    
    inline def setMembershipCrManifestUndefined: Self = StObject.set(x, "membershipCrManifest", js.undefined)
    
    inline def setMembershipResources(value: js.Array[SchemaResourceManifest]): Self = StObject.set(x, "membershipResources", value.asInstanceOf[js.Any])
    
    inline def setMembershipResourcesUndefined: Self = StObject.set(x, "membershipResources", js.undefined)
    
    inline def setMembershipResourcesVarargs(value: SchemaResourceManifest*): Self = StObject.set(x, "membershipResources", js.Array(value*))
    
    inline def setResourceOptions(value: SchemaResourceOptions): Self = StObject.set(x, "resourceOptions", value.asInstanceOf[js.Any])
    
    inline def setResourceOptionsUndefined: Self = StObject.set(x, "resourceOptions", js.undefined)
  }
}
