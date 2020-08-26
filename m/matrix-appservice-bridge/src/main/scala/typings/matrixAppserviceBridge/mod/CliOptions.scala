package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CliOptions extends js.Object {
  var bridgeConfig: js.UndefOr[BridgeConfig] = js.native
  var enableLocalpart: js.UndefOr[Boolean] = js.native
  var enableRegistration: js.UndefOr[Boolean] = js.native
  var port: js.UndefOr[Double] = js.native
  var registrationPath: js.UndefOr[String] = js.native
  def generateRegistration(reg: js.Any, callback: js.Function1[/* r */ js.Any, Unit]): Unit = js.native
  def run(port: Double, config: js.Any): Unit = js.native
}

object CliOptions {
  @scala.inline
  def apply(
    generateRegistration: (js.Any, js.Function1[/* r */ js.Any, Unit]) => Unit,
    run: (Double, js.Any) => Unit
  ): CliOptions = {
    val __obj = js.Dynamic.literal(generateRegistration = js.Any.fromFunction2(generateRegistration), run = js.Any.fromFunction2(run))
    __obj.asInstanceOf[CliOptions]
  }
  @scala.inline
  implicit class CliOptionsOps[Self <: CliOptions] (val x: Self) extends AnyVal {
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
    def setGenerateRegistration(value: (js.Any, js.Function1[/* r */ js.Any, Unit]) => Unit): Self = this.set("generateRegistration", js.Any.fromFunction2(value))
    @scala.inline
    def setRun(value: (Double, js.Any) => Unit): Self = this.set("run", js.Any.fromFunction2(value))
    @scala.inline
    def setBridgeConfig(value: BridgeConfig): Self = this.set("bridgeConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBridgeConfig: Self = this.set("bridgeConfig", js.undefined)
    @scala.inline
    def setEnableLocalpart(value: Boolean): Self = this.set("enableLocalpart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLocalpart: Self = this.set("enableLocalpart", js.undefined)
    @scala.inline
    def setEnableRegistration(value: Boolean): Self = this.set("enableRegistration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRegistration: Self = this.set("enableRegistration", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setRegistrationPath(value: String): Self = this.set("registrationPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistrationPath: Self = this.set("registrationPath", js.undefined)
  }
  
}

