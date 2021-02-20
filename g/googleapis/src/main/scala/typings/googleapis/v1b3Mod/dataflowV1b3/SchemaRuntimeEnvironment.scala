package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The environment values to set at runtime.
  */
@js.native
trait SchemaRuntimeEnvironment extends StObject {
  
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
  implicit class SchemaRuntimeEnvironmentMutableBuilder[Self <: SchemaRuntimeEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalExperiments(value: js.Array[String]): Self = StObject.set(x, "additionalExperiments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalExperimentsUndefined: Self = StObject.set(x, "additionalExperiments", js.undefined)
    
    @scala.inline
    def setAdditionalExperimentsVarargs(value: String*): Self = StObject.set(x, "additionalExperiments", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalUserLabels(value: StringDictionary[String]): Self = StObject.set(x, "additionalUserLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalUserLabelsUndefined: Self = StObject.set(x, "additionalUserLabels", js.undefined)
    
    @scala.inline
    def setBypassTempDirValidation(value: Boolean): Self = StObject.set(x, "bypassTempDirValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassTempDirValidationUndefined: Self = StObject.set(x, "bypassTempDirValidation", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    @scala.inline
    def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setNumWorkers(value: Double): Self = StObject.set(x, "numWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumWorkersUndefined: Self = StObject.set(x, "numWorkers", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    @scala.inline
    def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    @scala.inline
    def setTempLocation(value: String): Self = StObject.set(x, "tempLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempLocationUndefined: Self = StObject.set(x, "tempLocation", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
