package typings.atLinguiReact.withI18nMod

import typings.atLinguiCore.atLinguiCoreMod.I18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait withI18nProps extends js.Object {
  var i18n: I18n
}

object withI18nProps {
  @scala.inline
  def apply(i18n: I18n): withI18nProps = {
    val __obj = js.Dynamic.literal(i18n = i18n)
  
    __obj.asInstanceOf[withI18nProps]
  }
}

