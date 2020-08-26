package typings.keystonejsKeystone.anon

import typings.keystonejsKeystone.mod.BaseAuthStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config[ListNames /* <: String */] extends js.Object {
  var config: js.UndefOr[js.Any] = js.native
  var list: ListNames = js.native
  var `type`: BaseAuthStrategy = js.native
}

object Config {
  @scala.inline
  def apply[/* <: java.lang.String */ ListNames](list: ListNames, `type`: BaseAuthStrategy): Config[ListNames] = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config[ListNames]]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config[_], /* <: java.lang.String */ ListNames] (val x: Self with Config[ListNames]) extends AnyVal {
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
    def setList(value: ListNames): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: BaseAuthStrategy): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
  }
  
}

