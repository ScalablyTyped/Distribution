package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCPUInfo extends js.Object {
  /**
    * description of the device processor ie &#39;1.8 GHz hexa core 64-bit
    * ARMv8-A&#39;
    */
  var cpuProcessor: js.UndefOr[String] = js.native
  /**
    * the CPU clock speed in GHz
    */
  var cpuSpeedInGhz: js.UndefOr[Double] = js.native
  /**
    * the number of CPU cores
    */
  var numberOfCores: js.UndefOr[Double] = js.native
}

object SchemaCPUInfo {
  @scala.inline
  def apply(): SchemaCPUInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCPUInfo]
  }
  @scala.inline
  implicit class SchemaCPUInfoOps[Self <: SchemaCPUInfo] (val x: Self) extends AnyVal {
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
    def setCpuProcessor(value: String): Self = this.set("cpuProcessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuProcessor: Self = this.set("cpuProcessor", js.undefined)
    @scala.inline
    def setCpuSpeedInGhz(value: Double): Self = this.set("cpuSpeedInGhz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuSpeedInGhz: Self = this.set("cpuSpeedInGhz", js.undefined)
    @scala.inline
    def setNumberOfCores(value: Double): Self = this.set("numberOfCores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfCores: Self = this.set("numberOfCores", js.undefined)
  }
  
}

