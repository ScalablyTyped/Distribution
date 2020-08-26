package typings.i18next.mod

import typings.i18next.i18nextStrings.`3rdParty`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThirdPartyModule extends Module {
  @JSName("type")
  var type_ThirdPartyModule: `3rdParty` = js.native
  def init(i18next: i18n): Unit = js.native
}

object ThirdPartyModule {
  @scala.inline
  def apply(init: i18n => Unit, `type`: `3rdParty`): ThirdPartyModule = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThirdPartyModule]
  }
  @scala.inline
  implicit class ThirdPartyModuleOps[Self <: ThirdPartyModule] (val x: Self) extends AnyVal {
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
    def setInit(value: i18n => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def setType(value: `3rdParty`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

