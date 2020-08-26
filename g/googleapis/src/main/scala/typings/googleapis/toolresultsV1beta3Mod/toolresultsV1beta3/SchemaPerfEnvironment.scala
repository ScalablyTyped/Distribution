package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates performance environment info
  */
@js.native
trait SchemaPerfEnvironment extends js.Object {
  /**
    * CPU related environment info
    */
  var cpuInfo: js.UndefOr[SchemaCPUInfo] = js.native
  /**
    * Memory related environment info
    */
  var memoryInfo: js.UndefOr[SchemaMemoryInfo] = js.native
}

object SchemaPerfEnvironment {
  @scala.inline
  def apply(): SchemaPerfEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerfEnvironment]
  }
  @scala.inline
  implicit class SchemaPerfEnvironmentOps[Self <: SchemaPerfEnvironment] (val x: Self) extends AnyVal {
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
    def setCpuInfo(value: SchemaCPUInfo): Self = this.set("cpuInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuInfo: Self = this.set("cpuInfo", js.undefined)
    @scala.inline
    def setMemoryInfo(value: SchemaMemoryInfo): Self = this.set("memoryInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemoryInfo: Self = this.set("memoryInfo", js.undefined)
  }
  
}

