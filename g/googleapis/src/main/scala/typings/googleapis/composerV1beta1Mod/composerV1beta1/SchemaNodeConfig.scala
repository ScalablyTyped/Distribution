package typings.googleapis.composerV1beta1Mod.composerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration information for the Kubernetes Engine nodes running the
  * Apache Airflow software.
  */
trait SchemaNodeConfig extends StObject {
  
  /**
    * Optional. The disk size in GB used for node VMs. Minimum size is 20GB. If
    * unspecified, defaults to 100GB. Cannot be updated.
    */
  var diskSizeGb: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. The IPAllocationPolicy fields for the GKE cluster.
    */
  var ipAllocationPolicy: js.UndefOr[SchemaIPAllocationPolicy] = js.undefined
  
  /**
    * Optional. The Compute Engine [zone](/compute/docs/regions-zones) in which
    * to deploy the VMs used to run the Apache Airflow software, specified as a
    * [relative resource
    * name](/apis/design/resource_names#relative_resource_name). For example:
    * &quot;projects/{projectId}/zones/{zoneId}&quot;.  This `location` must
    * belong to the enclosing environment&#39;s project and location. If both
    * this field and `nodeConfig.machineType` are specified,
    * `nodeConfig.machineType` must belong to this `location`; if both are
    * unspecified, the service will pick a zone in the Compute Engine region
    * corresponding to the Cloud Composer location, and propagate that choice
    * to both fields. If only one field (`location` or
    * `nodeConfig.machineType`) is specified, the location information from the
    * specified field will be propagated to the unspecified field.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The Compute Engine [machine type](/compute/docs/machine-types)
    * used for cluster instances, specified as a [relative resource
    * name](/apis/design/resource_names#relative_resource_name). For example:
    * &quot;projects/{projectId}/zones/{zoneId}/machineTypes/{machineTypeId}&quot;.
    * The `machineType` must belong to the enclosing environment&#39;s project
    * and location. If both this field and `nodeConfig.location` are specified,
    * this `machineType` must belong to the `nodeConfig.location`; if both are
    * unspecified, the service will pick a zone in the Compute Engine region
    * corresponding to the Cloud Composer location, and propagate that choice
    * to both fields. If exactly one of this field and `nodeConfig.location` is
    * specified, the location information from the specified field will be
    * propagated to the unspecified field.  If this field is unspecified, the
    * `machineTypeId` defaults to &quot;n1-standard-1&quot;.
    */
  var machineType: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The Compute Engine network to be used for machine
    * communications, specified as a [relative resource
    * name](/apis/design/resource_names#relative_resource_name). For example:
    * &quot;projects/{projectId}/global/networks/{networkId}&quot;.  If
    * unspecified, the default network in the environment&#39;s project is
    * used. If a [Custom Subnet
    * Network](/vpc/docs/vpc#vpc_networks_and_subnets) is provided,
    * `nodeConfig.subnetwork` must also be provided. For [Shared
    * VPC](/vpc/docs/shared-vpc) subnetwork requirements, see
    * `nodeConfig.subnetwork`.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The set of Google API scopes to be made available on all node
    * VMs. If `oauth_scopes` is empty, defaults to
    * [&quot;https://www.googleapis.com/auth/cloud-platform&quot;]. Cannot be
    * updated.
    */
  var oauthScopes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The Google Cloud Platform Service Account to be used by the
    * node VMs. If a service account is not specified, the &quot;default&quot;
    * Compute Engine service account is used. Cannot be updated.
    */
  var serviceAccount: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The Compute Engine subnetwork to be used for machine
    * communications, specified as a [relative resource
    * name](/apis/design/resource_names#relative_resource_name). For example:
    * &quot;projects/{projectId}/regions/{regionId}/subnetworks/{subnetworkId}&quot;
    * If a subnetwork is provided, `nodeConfig.network` must also be provided,
    * and the subnetwork must belong to the enclosing environment&#39;s project
    * and location.
    */
  var subnetwork: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The list of instance tags applied to all node VMs. Tags are
    * used to identify valid sources or targets for network firewalls. Each tag
    * within the list must comply with
    * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Cannot be updated.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaNodeConfig {
  
  inline def apply(): SchemaNodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeConfig]
  }
  
  extension [Self <: SchemaNodeConfig](x: Self) {
    
    inline def setDiskSizeGb(value: Double): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setIpAllocationPolicy(value: SchemaIPAllocationPolicy): Self = StObject.set(x, "ipAllocationPolicy", value.asInstanceOf[js.Any])
    
    inline def setIpAllocationPolicyUndefined: Self = StObject.set(x, "ipAllocationPolicy", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setOauthScopes(value: js.Array[String]): Self = StObject.set(x, "oauthScopes", value.asInstanceOf[js.Any])
    
    inline def setOauthScopesUndefined: Self = StObject.set(x, "oauthScopes", js.undefined)
    
    inline def setOauthScopesVarargs(value: String*): Self = StObject.set(x, "oauthScopes", js.Array(value :_*))
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
