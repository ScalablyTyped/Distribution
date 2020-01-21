package typings.linguiReact.withI18nMod

import typings.linguiCore.mod.I18n_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait withI18nProps extends js.Object {
  var i18n: I18n_
}

object withI18nProps {
  @scala.inline
  def apply(i18n: I18n_): withI18nProps = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[withI18nProps]
  }
}

