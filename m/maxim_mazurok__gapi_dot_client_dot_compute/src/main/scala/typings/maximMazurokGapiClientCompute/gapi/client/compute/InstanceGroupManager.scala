package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupManager extends js.Object {
  
  /** The autohealing policy for this managed instance group. You can specify only one value. */
  var autoHealingPolicies: js.UndefOr[js.Array[InstanceGroupManagerAutoHealingPolicy]] = js.native
  
  /**
    * The base instance name to use for instances in this group. The value must be 1-58 characters long. Instances are named by appending a hyphen and a random four-character string to
    * the base instance name. The base instance name must comply with RFC1035.
    */
  var baseInstanceName: js.UndefOr[String] = js.native
  
  /** [Output Only] The creation timestamp for this managed instance group in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** [Output Only] The list of instance actions and the number of instances in this managed instance group that are scheduled for each of those actions. */
  var currentActions: js.UndefOr[InstanceGroupManagerActionsSummary] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /** Policy specifying the intended distribution of managed instances across zones in a regional managed instance group. */
  var distributionPolicy: js.UndefOr[DistributionPolicy] = js.native
  
  /**
    * Fingerprint of this resource. This field may be used in optimistic locking. It will be ignored when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in
    * order to update the InstanceGroupManager, otherwise the request will fail with error 412 conditionNotMet.
    *
    * To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /** [Output Only] A unique identifier for this resource type. The server generates this identifier. */
  var id: js.UndefOr[String] = js.native
  
  /** [Output Only] The URL of the Instance Group resource. */
  var instanceGroup: js.UndefOr[String] = js.native
  
  /**
    * The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The
    * templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group's updatePolicy.type to PROACTIVE.
    */
  var instanceTemplate: js.UndefOr[String] = js.native
  
  /** [Output Only] The resource type, which is always compute#instanceGroupManager for managed instance groups. */
  var kind: js.UndefOr[String] = js.native
  
  /** The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035. */
  var name: js.UndefOr[String] = js.native
  
  /** Named ports configured for the Instance Groups complementary to this Instance Group Manager. */
  var namedPorts: js.UndefOr[js.Array[NamedPort]] = js.native
  
  /** [Output Only] The URL of the region where the managed instance group resides (for regional resources). */
  var region: js.UndefOr[String] = js.native
  
  /** [Output Only] The URL for this managed instance group. The server defines this URL. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** Stateful configuration for this Instanced Group Manager */
  var statefulPolicy: js.UndefOr[StatefulPolicy] = js.native
  
  /** [Output Only] The status of this managed instance group. */
  var status: js.UndefOr[InstanceGroupManagerStatus] = js.native
  
  /**
    * The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance
    * group.
    */
  var targetPools: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The target number of running instances for this managed instance group. You can reduce this number by using the instanceGroupManager deleteInstances or abandonInstances methods.
    * Resizing the group also changes this number.
    */
  var targetSize: js.UndefOr[Double] = js.native
  
  /** The update policy for this managed instance group. */
  var updatePolicy: js.UndefOr[InstanceGroupManagerUpdatePolicy] = js.native
  
  /**
    * Specifies the instance templates used by this managed instance group to create instances.
    *
    * Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read
    * more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more
    * information, read about canary updates.
    */
  var versions: js.UndefOr[js.Array[InstanceGroupManagerVersion]] = js.native
  
  /** [Output Only] The URL of a zone where the managed instance group is located (for zonal resources). */
  var zone: js.UndefOr[String] = js.native
}
object InstanceGroupManager {
  
  @scala.inline
  def apply(): InstanceGroupManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManager]
  }
  
  @scala.inline
  implicit class InstanceGroupManagerOps[Self <: InstanceGroupManager] (val x: Self) extends AnyVal {
    
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
    def setAutoHealingPoliciesVarargs(value: InstanceGroupManagerAutoHealingPolicy*): Self = this.set("autoHealingPolicies", js.Array(value :_*))
    
    @scala.inline
    def setAutoHealingPolicies(value: js.Array[InstanceGroupManagerAutoHealingPolicy]): Self = this.set("autoHealingPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHealingPolicies: Self = this.set("autoHealingPolicies", js.undefined)
    
    @scala.inline
    def setBaseInstanceName(value: String): Self = this.set("baseInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseInstanceName: Self = this.set("baseInstanceName", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setCurrentActions(value: InstanceGroupManagerActionsSummary): Self = this.set("currentActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentActions: Self = this.set("currentActions", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDistributionPolicy(value: DistributionPolicy): Self = this.set("distributionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributionPolicy: Self = this.set("distributionPolicy", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInstanceGroup(value: String): Self = this.set("instanceGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceGroup: Self = this.set("instanceGroup", js.undefined)
    
    @scala.inline
    def setInstanceTemplate(value: String): Self = this.set("instanceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTemplate: Self = this.set("instanceTemplate", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamedPortsVarargs(value: NamedPort*): Self = this.set("namedPorts", js.Array(value :_*))
    
    @scala.inline
    def setNamedPorts(value: js.Array[NamedPort]): Self = this.set("namedPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedPorts: Self = this.set("namedPorts", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setStatefulPolicy(value: StatefulPolicy): Self = this.set("statefulPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatefulPolicy: Self = this.set("statefulPolicy", js.undefined)
    
    @scala.inline
    def setStatus(value: InstanceGroupManagerStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTargetPoolsVarargs(value: String*): Self = this.set("targetPools", js.Array(value :_*))
    
    @scala.inline
    def setTargetPools(value: js.Array[String]): Self = this.set("targetPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetPools: Self = this.set("targetPools", js.undefined)
    
    @scala.inline
    def setTargetSize(value: Double): Self = this.set("targetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetSize: Self = this.set("targetSize", js.undefined)
    
    @scala.inline
    def setUpdatePolicy(value: InstanceGroupManagerUpdatePolicy): Self = this.set("updatePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatePolicy: Self = this.set("updatePolicy", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: InstanceGroupManagerVersion*): Self = this.set("versions", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: js.Array[InstanceGroupManagerVersion]): Self = this.set("versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
