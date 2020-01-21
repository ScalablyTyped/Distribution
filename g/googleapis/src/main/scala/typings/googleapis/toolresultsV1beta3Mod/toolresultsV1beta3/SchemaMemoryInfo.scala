package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMemoryInfo extends js.Object {
  /**
    * Maximum memory that can be allocated to the process in KiB
    */
  var memoryCapInKibibyte: js.UndefOr[String] = js.native
  /**
    * Total memory available on the device in KiB
    */
  var memoryTotalInKibibyte: js.UndefOr[String] = js.native
}

object SchemaMemoryInfo {
  @scala.inline
  def apply(memoryCapInKibibyte: String = null, memoryTotalInKibibyte: String = null): SchemaMemoryInfo = {
    val __obj = js.Dynamic.literal()
    if (memoryCapInKibibyte != null) __obj.updateDynamic("memoryCapInKibibyte")(memoryCapInKibibyte.asInstanceOf[js.Any])
    if (memoryTotalInKibibyte != null) __obj.updateDynamic("memoryTotalInKibibyte")(memoryTotalInKibibyte.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMemoryInfo]
  }
}

