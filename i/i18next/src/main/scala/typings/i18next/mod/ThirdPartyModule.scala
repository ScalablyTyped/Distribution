package typings.i18next.mod

import typings.i18next.i18nextStrings.`3rdParty`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThirdPartyModule extends Module {
  @JSName("type")
  var type_ThirdPartyModule: `3rdParty`
  def init(i18next: i18n): Unit
}

object ThirdPartyModule {
  @scala.inline
  def apply(init: i18n => Unit, `type`: `3rdParty`): ThirdPartyModule = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThirdPartyModule]
  }
}

