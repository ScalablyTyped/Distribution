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
  def apply(): SchemaMemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMemoryInfo]
  }
  @scala.inline
  implicit class SchemaMemoryInfoOps[Self <: SchemaMemoryInfo] (val x: Self) extends AnyVal {
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
    def setMemoryCapInKibibyte(value: String): Self = this.set("memoryCapInKibibyte", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemoryCapInKibibyte: Self = this.set("memoryCapInKibibyte", js.undefined)
    @scala.inline
    def setMemoryTotalInKibibyte(value: String): Self = this.set("memoryTotalInKibibyte", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemoryTotalInKibibyte: Self = this.set("memoryTotalInKibibyte", js.undefined)
  }
  
}

