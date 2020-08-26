package typings.ionic.nativeRunMod

import typings.ionic.definitionsMod.IConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckNativeRunDeps extends js.Object {
  val config: IConfig = js.native
}

object CheckNativeRunDeps {
  @scala.inline
  def apply(config: IConfig): CheckNativeRunDeps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckNativeRunDeps]
  }
  @scala.inline
  implicit class CheckNativeRunDepsOps[Self <: CheckNativeRunDeps] (val x: Self) extends AnyVal {
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
    def setConfig(value: IConfig): Self = this.set("config", value.asInstanceOf[js.Any])
  }
  
}

