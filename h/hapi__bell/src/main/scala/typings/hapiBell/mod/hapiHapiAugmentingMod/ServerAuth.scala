package typings.hapiBell.mod.hapiHapiAugmentingMod

import typings.hapiBell.hapiBellStrings.bell
import typings.hapiBell.mod.BellOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerAuth extends js.Object {
  @JSName("strategy")
  def strategy_bell(name: String, scheme: bell, options: BellOptions): Unit = js.native
}

object ServerAuth {
  @scala.inline
  def apply(strategy: (String, bell, BellOptions) => Unit): ServerAuth = {
    val __obj = js.Dynamic.literal(strategy = js.Any.fromFunction3(strategy))
    __obj.asInstanceOf[ServerAuth]
  }
  @scala.inline
  implicit class ServerAuthOps[Self <: ServerAuth] (val x: Self) extends AnyVal {
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
    def setStrategy(value: (String, bell, BellOptions) => Unit): Self = this.set("strategy", js.Any.fromFunction3(value))
  }
  
}

