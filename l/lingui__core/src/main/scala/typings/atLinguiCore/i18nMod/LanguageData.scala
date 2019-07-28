package typings.atLinguiCore.i18nMod

import typings.atLinguiCore.atLinguiCoreStrings.cardinal
import typings.atLinguiCore.atLinguiCoreStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageData extends js.Object {
  var plurals: js.UndefOr[
    js.Function2[/* n */ Double, /* pluralType */ js.UndefOr[cardinal | ordinal], String]
  ] = js.undefined
}

object LanguageData {
  @scala.inline
  def apply(plurals: (/* n */ Double, /* pluralType */ js.UndefOr[cardinal | ordinal]) => String = null): LanguageData = {
    val __obj = js.Dynamic.literal()
    if (plurals != null) __obj.updateDynamic("plurals")(js.Any.fromFunction2(plurals))
    __obj.asInstanceOf[LanguageData]
  }
}

