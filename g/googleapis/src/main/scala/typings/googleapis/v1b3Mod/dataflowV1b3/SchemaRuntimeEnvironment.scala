package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The environment values to set at runtime.
  */
@js.native
trait SchemaRuntimeEnvironment extends js.Object {
  /**
    * Additional experiment flags for the job.
    */
  var additionalExperiments: js.UndefOr[js.Array[String]] = js.native
  /**
    * Additional user labels attached to the job.
    */
  var additionalUserLabels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Whether to bypass the safety checks for the job&#39;s temporary
    * directory. Use with caution.
    */
  var bypassTempDirValidation: js.UndefOr[Boolean] = js.native
  /**
    * The machine type to use for the job. Defaults to the value from the
    * template if not specified.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * The maximum number of Google Compute Engine instances to be made
    * available to your pipeline during execution, from 1 to 1000.
    */
  var maxWorkers: js.UndefOr[Double] = js.native
  /**
    * Network to which VMs will be assigned.  If empty or unspecified, the
    * service will use the network &quot;default&quot;.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * The initial number of Google Compute Engine instnaces for the job.
    */
  var numWorkers: js.UndefOr[Double] = js.native
  /**
    * The email address of the service account to run the job as.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  /**
    * Subnetwork to which VMs will be assigned, if desired.  Expected to be of
    * the form &quot;regions/REGION/subnetworks/SUBNETWORK&quot;.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * The Cloud Storage path to use for temporary files. Must be a valid Cloud
    * Storage URL, beginning with `gs://`.
    */
  var tempLocation: js.UndefOr[String] = js.native
  /**
    * The Compute Engine [availability
    * zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones)
    * for launching worker instances to run your pipeline.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaRuntimeEnvironment {
  @scala.inline
  def apply(): SchemaRuntimeEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRuntimeEnvironment]
  }
  @scala.inline
  implicit class SchemaRuntimeEnvironmentOps[Self <: SchemaRuntimeEnvironment] (val x: Self) extends AnyVal {
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
    def setAdditionalExperimentsVarargs(value: String*): Self = this.set("additionalExperiments", js.Array(value :_*))
    @scala.inline
    def setAdditionalExperiments(value: js.Array[String]): Self = this.set("additionalExperiments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalExperiments: Self = this.set("additionalExperiments", js.undefined)
    @scala.inline
    def setAdditionalUserLabels(value: StringDictionary[String]): Self = this.set("additionalUserLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalUserLabels: Self = this.set("additionalUserLabels", js.undefined)
    @scala.inline
    def setBypassTempDirValidation(value: Boolean): Self = this.set("bypassTempDirValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBypassTempDirValidation: Self = this.set("bypassTempDirValidation", js.undefined)
    @scala.inline
    def setMachineType(value: String): Self = this.set("machineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMachineType: Self = this.set("machineType", js.undefined)
    @scala.inline
    def setMaxWorkers(value: Double): Self = this.set("maxWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWorkers: Self = this.set("maxWorkers", js.undefined)
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setNumWorkers(value: Double): Self = this.set("numWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumWorkers: Self = this.set("numWorkers", js.undefined)
    @scala.inline
    def setServiceAccountEmail(value: String): Self = this.set("serviceAccountEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAccountEmail: Self = this.set("serviceAccountEmail", js.undefined)
    @scala.inline
    def setSubnetwork(value: String): Self = this.set("subnetwork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetwork: Self = this.set("subnetwork", js.undefined)
    @scala.inline
    def setTempLocation(value: String): Self = this.set("tempLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTempLocation: Self = this.set("tempLocation", js.undefined)
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
  
}

