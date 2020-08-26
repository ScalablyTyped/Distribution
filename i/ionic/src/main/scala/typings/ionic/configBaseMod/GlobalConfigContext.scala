package typings.ionic.configBaseMod

import typings.ionic.definitionsMod.IConfig
import typings.ionic.ionicBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalConfigContext
  extends BaseConfigContext
     with ConfigContext {
  var config: IConfig = js.native
  var global: `true` = js.native
}

object GlobalConfigContext {
  @scala.inline
  def apply(config: IConfig, force: Boolean, global: `true`, json: Boolean, root: Boolean): GlobalConfigContext = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalConfigContext]
  }
  @scala.inline
  implicit class GlobalConfigContextOps[Self <: GlobalConfigContext] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setGlobal(value: `true`): Self = this.set("global", value.asInstanceOf[js.Any])
  }
  
}

