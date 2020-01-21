package typings.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional. The config settings for Compute Engine resources in an instance
  * group, such as a master or worker group.
  */
@js.native
trait SchemaInstanceGroupConfig extends js.Object {
  /**
    * Optional. The Compute Engine accelerator configuration for these
    * instances.Beta Feature: This feature is still under development. It may
    * be changed before final release.
    */
  var accelerators: js.UndefOr[js.Array[SchemaAcceleratorConfig]] = js.native
  /**
    * Optional. Disk option config settings.
    */
  var diskConfig: js.UndefOr[SchemaDiskConfig] = js.native
  /**
    * Optional. The Compute Engine image resource used for cluster instances.
    * It can be specified or may be inferred from SoftwareConfig.image_version.
    */
  var imageUri: js.UndefOr[String] = js.native
  /**
    * Output only. The list of instance names. Cloud Dataproc derives the names
    * from cluster_name, num_instances, and the instance group.
    */
  var instanceNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. Specifies that this instance group contains preemptible
    * instances.
    */
  var isPreemptible: js.UndefOr[Boolean] = js.native
  /**
    * Optional. The Compute Engine machine type used for cluster instances.A
    * full URL, partial URI, or short name are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2
    * projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2
    * n1-standard-2Auto Zone Exception: If you are using the Cloud Dataproc
    * Auto Zone Placement feature, you must use the short name of the machine
    * type resource, for example, n1-standard-2.
    */
  var machineTypeUri: js.UndefOr[String] = js.native
  /**
    * Output only. The config for Compute Engine Instance Group Manager that
    * manages this group. This is only used for preemptible instance groups.
    */
  var managedGroupConfig: js.UndefOr[SchemaManagedGroupConfig] = js.native
  /**
    * Optional. The number of VM instances in the instance group. For master
    * instance groups, must be set to 1.
    */
  var numInstances: js.UndefOr[Double] = js.native
}

object SchemaInstanceGroupConfig {
  @scala.inline
  def apply(
    accelerators: js.Array[SchemaAcceleratorConfig] = null,
    diskConfig: SchemaDiskConfig = null,
    imageUri: String = null,
    instanceNames: js.Array[String] = null,
    isPreemptible: js.UndefOr[Boolean] = js.undefined,
    machineTypeUri: String = null,
    managedGroupConfig: SchemaManagedGroupConfig = null,
    numInstances: Int | Double = null
  ): SchemaInstanceGroupConfig = {
    val __obj = js.Dynamic.literal()
    if (accelerators != null) __obj.updateDynamic("accelerators")(accelerators.asInstanceOf[js.Any])
    if (diskConfig != null) __obj.updateDynamic("diskConfig")(diskConfig.asInstanceOf[js.Any])
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri.asInstanceOf[js.Any])
    if (instanceNames != null) __obj.updateDynamic("instanceNames")(instanceNames.asInstanceOf[js.Any])
    if (!js.isUndefined(isPreemptible)) __obj.updateDynamic("isPreemptible")(isPreemptible.asInstanceOf[js.Any])
    if (machineTypeUri != null) __obj.updateDynamic("machineTypeUri")(machineTypeUri.asInstanceOf[js.Any])
    if (managedGroupConfig != null) __obj.updateDynamic("managedGroupConfig")(managedGroupConfig.asInstanceOf[js.Any])
    if (numInstances != null) __obj.updateDynamic("numInstances")(numInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceGroupConfig]
  }
}

