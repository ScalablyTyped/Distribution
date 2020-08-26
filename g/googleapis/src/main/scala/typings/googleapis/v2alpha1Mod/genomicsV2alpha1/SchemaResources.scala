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
  def apply(): SchemaResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResources]
  }
  @scala.inline
  implicit class SchemaResourcesOps[Self <: SchemaResources] (val x: Self) extends AnyVal {
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
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setRegionsVarargs(value: String*): Self = this.set("regions", js.Array(value :_*))
    @scala.inline
    def setRegions(value: js.Array[String]): Self = this.set("regions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
    @scala.inline
    def setVirtualMachine(value: SchemaVirtualMachine): Self = this.set("virtualMachine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualMachine: Self = this.set("virtualMachine", js.undefined)
    @scala.inline
    def setZonesVarargs(value: String*): Self = this.set("zones", js.Array(value :_*))
    @scala.inline
    def setZones(value: js.Array[String]): Self = this.set("zones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZones: Self = this.set("zones", js.undefined)
  }
  
}

