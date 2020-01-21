package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The system resources for the pipeline run.  At least one zone or region
  * must be specified or the pipeline run will fail.
  */
@js.native
trait SchemaResources extends js.Object {
  /**
    * The project ID to allocate resources in.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The list of regions allowed for VM allocation. If set, the `zones` field
    * must not be set.
    */
  var regions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The virtual machine specification.
    */
  var virtualMachine: js.UndefOr[SchemaVirtualMachine] = js.native
  /**
    * The list of zones allowed for VM allocation. If set, the `regions` field
    * must not be set.
    */
  var zones: js.UndefOr[js.Array[String]] = js.native
}

object SchemaResources {
  @scala.inline
  def apply(
    projectId: String = null,
    regions: js.Array[String] = null,
    virtualMachine: SchemaVirtualMachine = null,
    zones: js.Array[String] = null
  ): SchemaResources = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    if (virtualMachine != null) __obj.updateDynamic("virtualMachine")(virtualMachine.asInstanceOf[js.Any])
    if (zones != null) __obj.updateDynamic("zones")(zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResources]
  }
}

