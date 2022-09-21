package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupConfig extends StObject {
  
  /**
    * Optional. The Compute Engine accelerator configuration for these instances.
    */
  var accelerators: js.UndefOr[js.Array[SchemaAcceleratorConfig]] = js.undefined
  
  /**
    * Optional. Disk option config settings.
    */
  var diskConfig: js.UndefOr[SchemaDiskConfig] = js.undefined
  
  /**
    * Optional. The Compute Engine image resource used for cluster instances.The URI can represent an image or image family.Image examples: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/[image-id] projects/[project_id]/global/images/[image-id] image-idImage family examples. Dataproc will use the most recent image from the family: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/family/[custom-image-family-name] projects/[project_id]/global/images/family/[custom-image-family-name]If the URI is unspecified, it will be inferred from SoftwareConfig.image_version or the system default.
    */
  var imageUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The list of instance names. Dataproc derives the names from cluster_name, num_instances, and the instance group.
    */
  var instanceNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. List of references to Compute Engine instances.
    */
  var instanceReferences: js.UndefOr[js.Array[SchemaInstanceReference]] = js.undefined
  
  /**
    * Output only. Specifies that this instance group contains preemptible instances.
    */
  var isPreemptible: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The Compute Engine machine type used for cluster instances.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 n1-standard-2Auto Zone Exception: If you are using the Dataproc Auto Zone Placement (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example, n1-standard-2.
    */
  var machineTypeUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups.
    */
  var managedGroupConfig: js.UndefOr[SchemaManagedGroupConfig] = js.undefined
  
  /**
    * Specifies the minimum cpu platform for the Instance Group. See Dataproc -\> Minimum CPU Platform (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
    */
  var minCpuPlatform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The number of VM instances in the instance group. For HA cluster master_config groups, must be set to 3. For standard cluster master_config groups, must be set to 1.
    */
  var numInstances: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Specifies the preemptibility of the instance group.The default value for master and worker groups is NON_PREEMPTIBLE. This default cannot be changed.The default value for secondary instances is PREEMPTIBLE.
    */
  var preemptibility: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceGroupConfig {
  
  inline def apply(): SchemaInstanceGroupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupConfig]
  }
  
  extension [Self <: SchemaInstanceGroupConfig](x: Self) {
    
    inline def setAccelerators(value: js.Array[SchemaAcceleratorConfig]): Self = StObject.set(x, "accelerators", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorsUndefined: Self = StObject.set(x, "accelerators", js.undefined)
    
    inline def setAcceleratorsVarargs(value: SchemaAcceleratorConfig*): Self = StObject.set(x, "accelerators", js.Array(value*))
    
    inline def setDiskConfig(value: SchemaDiskConfig): Self = StObject.set(x, "diskConfig", value.asInstanceOf[js.Any])
    
    inline def setDiskConfigUndefined: Self = StObject.set(x, "diskConfig", js.undefined)
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriNull: Self = StObject.set(x, "imageUri", null)
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
    
    inline def setInstanceNames(value: js.Array[String]): Self = StObject.set(x, "instanceNames", value.asInstanceOf[js.Any])
    
    inline def setInstanceNamesNull: Self = StObject.set(x, "instanceNames", null)
    
    inline def setInstanceNamesUndefined: Self = StObject.set(x, "instanceNames", js.undefined)
    
    inline def setInstanceNamesVarargs(value: String*): Self = StObject.set(x, "instanceNames", js.Array(value*))
    
    inline def setInstanceReferences(value: js.Array[SchemaInstanceReference]): Self = StObject.set(x, "instanceReferences", value.asInstanceOf[js.Any])
    
    inline def setInstanceReferencesUndefined: Self = StObject.set(x, "instanceReferences", js.undefined)
    
    inline def setInstanceReferencesVarargs(value: SchemaInstanceReference*): Self = StObject.set(x, "instanceReferences", js.Array(value*))
    
    inline def setIsPreemptible(value: Boolean): Self = StObject.set(x, "isPreemptible", value.asInstanceOf[js.Any])
    
    inline def setIsPreemptibleNull: Self = StObject.set(x, "isPreemptible", null)
    
    inline def setIsPreemptibleUndefined: Self = StObject.set(x, "isPreemptible", js.undefined)
    
    inline def setMachineTypeUri(value: String): Self = StObject.set(x, "machineTypeUri", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeUriNull: Self = StObject.set(x, "machineTypeUri", null)
    
    inline def setMachineTypeUriUndefined: Self = StObject.set(x, "machineTypeUri", js.undefined)
    
    inline def setManagedGroupConfig(value: SchemaManagedGroupConfig): Self = StObject.set(x, "managedGroupConfig", value.asInstanceOf[js.Any])
    
    inline def setManagedGroupConfigUndefined: Self = StObject.set(x, "managedGroupConfig", js.undefined)
    
    inline def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    inline def setMinCpuPlatformNull: Self = StObject.set(x, "minCpuPlatform", null)
    
    inline def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
    
    inline def setNumInstances(value: Double): Self = StObject.set(x, "numInstances", value.asInstanceOf[js.Any])
    
    inline def setNumInstancesNull: Self = StObject.set(x, "numInstances", null)
    
    inline def setNumInstancesUndefined: Self = StObject.set(x, "numInstances", js.undefined)
    
    inline def setPreemptibility(value: String): Self = StObject.set(x, "preemptibility", value.asInstanceOf[js.Any])
    
    inline def setPreemptibilityNull: Self = StObject.set(x, "preemptibility", null)
    
    inline def setPreemptibilityUndefined: Self = StObject.set(x, "preemptibility", js.undefined)
  }
}
