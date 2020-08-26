package typings.ionic.configBaseMod

import typings.ionic.definitionsMod.IProjectConfig
import typings.ionic.ionicBooleans.`false`
import typings.ionicCliFramework.mod.BaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectConfigContext
  extends BaseConfigContext
     with ConfigContext {
  var config: BaseConfig[IProjectConfig] = js.native
  var global: `false` = js.native
}

object ProjectConfigContext {
  @scala.inline
  def apply(config: BaseConfig[IProjectConfig], force: Boolean, global: `false`, json: Boolean, root: Boolean): ProjectConfigContext = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectConfigContext]
  }
  @scala.inline
  implicit class ProjectConfigContextOps[Self <: ProjectConfigContext] (val x: Self) extends AnyVal {
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
    def setConfig(value: BaseConfig[IProjectConfig]): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobal(value: `false`): Self = this.set("global", value.asInstanceOf[js.Any])
  }
  
}

