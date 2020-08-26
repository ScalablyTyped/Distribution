package typings.lodashDecorators.sharedMod

import typings.lodashDecorators.factoryMod.DecoratorConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicateOptions extends js.Object {
  var args: js.Array[_] = js.native
  var config: DecoratorConfig = js.native
  var instance: js.UndefOr[js.Object] = js.native
  var target: js.Any = js.native
  var value: js.Any = js.native
}

object ApplicateOptions {
  @scala.inline
  def apply(args: js.Array[_], config: DecoratorConfig, target: js.Any, value: js.Any): ApplicateOptions = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicateOptions]
  }
  @scala.inline
  implicit class ApplicateOptionsOps[Self <: ApplicateOptions] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: DecoratorConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstance(value: js.Object): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
  }
  
}

