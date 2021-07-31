package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Optional. The config settings for Compute Engine resources in an instance
  * group, such as a master or worker group.
  */
trait SchemaInstanceGroupConfig extends StObject {
  
  /**
    * Optional. The Compute Engine accelerator configuration for these
    * instances.Beta Feature: This feature is still under development. It may
    * be changed before final release.
    */
  var accelerators: js.UndefOr[js.Array[SchemaAcceleratorConfig]] = js.undefined
  
  /**
    * Optional. Disk option config settings.
    */
  var diskConfig: js.UndefOr[SchemaDiskConfig] = js.undefined
  
  /**
    * Optional. The Compute Engine image resource used for cluster instances.
    * It can be specified or may be inferred from SoftwareConfig.image_version.
    */
  var imageUri: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The list of instance names. Cloud Dataproc derives the names
    * from cluster_name, num_instances, and the instance group.
    */
  var instanceNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. Specifies that this instance group contains preemptible
    * instances.
    */
  var isPreemptible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. The Compute Engine machine type used for cluster instances.A
    * full URL, partial URI, or short name are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2
    * projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2
    * n1-standard-2Auto Zone Exception: If you are using the Cloud Dataproc
    * Auto Zone Placement feature, you must use the short name of the machine
    * type resource, for example, n1-standard-2.
    */
  var machineTypeUri: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The config for Compute Engine Instance Group Manager that
    * manages this group. This is only used for preemptible instance groups.
    */
  var managedGroupConfig: js.UndefOr[SchemaManagedGroupConfig] = js.undefined
  
  /**
    * Optional. The number of VM instances in the instance group. For master
    * instance groups, must be set to 1.
    */
  var numInstances: js.UndefOr[Double] = js.undefined
}
object SchemaInstanceGroupConfig {
  
  @scala.inline
  def apply(): SchemaInstanceGroupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupConfig]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupConfigMutableBuilder[Self <: SchemaInstanceGroupConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerators(value: js.Array[SchemaAcceleratorConfig]): Self = StObject.set(x, "accelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorsUndefined: Self = StObject.set(x, "accelerators", js.undefined)
    
    @scala.inline
    def setAcceleratorsVarargs(value: SchemaAcceleratorConfig*): Self = StObject.set(x, "accelerators", js.Array(value :_*))
    
    @scala.inline
    def setDiskConfig(value: SchemaDiskConfig): Self = StObject.set(x, "diskConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskConfigUndefined: Self = StObject.set(x, "diskConfig", js.undefined)
    
    @scala.inline
    def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
    
    @scala.inline
    def setInstanceNames(value: js.Array[String]): Self = StObject.set(x, "instanceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceNamesUndefined: Self = StObject.set(x, "instanceNames", js.undefined)
    
    @scala.inline
    def setInstanceNamesVarargs(value: String*): Self = StObject.set(x, "instanceNames", js.Array(value :_*))
    
    @scala.inline
    def setIsPreemptible(value: Boolean): Self = StObject.set(x, "isPreemptible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPreemptibleUndefined: Self = StObject.set(x, "isPreemptible", js.undefined)
    
    @scala.inline
    def setMachineTypeUri(value: String): Self = StObject.set(x, "machineTypeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUriUndefined: Self = StObject.set(x, "machineTypeUri", js.undefined)
    
    @scala.inline
    def setManagedGroupConfig(value: SchemaManagedGroupConfig): Self = StObject.set(x, "managedGroupConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedGroupConfigUndefined: Self = StObject.set(x, "managedGroupConfig", js.undefined)
    
    @scala.inline
    def setNumInstances(value: Double): Self = StObject.set(x, "numInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumInstancesUndefined: Self = StObject.set(x, "numInstances", js.undefined)
  }
}
