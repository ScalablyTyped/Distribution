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
  def apply(cpuInfo: SchemaCPUInfo = null, memoryInfo: SchemaMemoryInfo = null): SchemaPerfEnvironment = {
    val __obj = js.Dynamic.literal()
    if (cpuInfo != null) __obj.updateDynamic("cpuInfo")(cpuInfo.asInstanceOf[js.Any])
    if (memoryInfo != null) __obj.updateDynamic("memoryInfo")(memoryInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPerfEnvironment]
  }
}

