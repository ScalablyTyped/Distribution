package typings.jestAxe.mod

import typings.axeCore.mod.RunOptions
import typings.axeCore.mod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JestAxeConfigureOptions extends RunOptions {
  var globalOptions: js.UndefOr[Spec] = js.native
}

object JestAxeConfigureOptions {
  @scala.inline
  def apply(): JestAxeConfigureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JestAxeConfigureOptions]
  }
  @scala.inline
  implicit class JestAxeConfigureOptionsOps[Self <: JestAxeConfigureOptions] (val x: Self) extends AnyVal {
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
    def setGlobalOptions(value: Spec): Self = this.set("globalOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalOptions: Self = this.set("globalOptions", js.undefined)
  }
  
}

