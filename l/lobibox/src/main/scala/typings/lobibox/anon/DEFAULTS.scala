package typings.lobibox.anon

import typings.lobibox.LobiboxModule.MessageBoxesDefault
import typings.lobibox.LobiboxModule.MessageBoxesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DEFAULTS extends js.Object {
  var DEFAULTS: MessageBoxesDefault = js.native
  var OPTIONS: MessageBoxesOptions = js.native
}

object DEFAULTS {
  @scala.inline
  def apply(DEFAULTS: MessageBoxesDefault, OPTIONS: MessageBoxesOptions): DEFAULTS = {
    val __obj = js.Dynamic.literal(DEFAULTS = DEFAULTS.asInstanceOf[js.Any], OPTIONS = OPTIONS.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEFAULTS]
  }
  @scala.inline
  implicit class DEFAULTSOps[Self <: DEFAULTS] (val x: Self) extends AnyVal {
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
    def setDEFAULTS(value: MessageBoxesDefault): Self = this.set("DEFAULTS", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPTIONS(value: MessageBoxesOptions): Self = this.set("OPTIONS", value.asInstanceOf[js.Any])
  }
  
}

