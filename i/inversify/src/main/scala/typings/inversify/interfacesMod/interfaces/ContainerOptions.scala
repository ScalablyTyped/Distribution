package typings.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerOptions extends js.Object {
  var autoBindInjectable: js.UndefOr[Boolean] = js.native
  var defaultScope: js.UndefOr[BindingScope] = js.native
  var skipBaseClassChecks: js.UndefOr[Boolean] = js.native
}

object ContainerOptions {
  @scala.inline
  def apply(): ContainerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerOptions]
  }
  @scala.inline
  implicit class ContainerOptionsOps[Self <: ContainerOptions] (val x: Self) extends AnyVal {
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
    def setAutoBindInjectable(value: Boolean): Self = this.set("autoBindInjectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoBindInjectable: Self = this.set("autoBindInjectable", js.undefined)
    @scala.inline
    def setDefaultScope(value: BindingScope): Self = this.set("defaultScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultScope: Self = this.set("defaultScope", js.undefined)
    @scala.inline
    def setSkipBaseClassChecks(value: Boolean): Self = this.set("skipBaseClassChecks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipBaseClassChecks: Self = this.set("skipBaseClassChecks", js.undefined)
  }
  
}

