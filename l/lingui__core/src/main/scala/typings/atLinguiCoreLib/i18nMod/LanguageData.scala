package typings
package atLinguiCoreLib.i18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageData extends js.Object {
  var plurals: js.UndefOr[
    js.Function2[
      /* n */ scala.Double, 
      /* pluralType */ js.UndefOr[
        atLinguiCoreLib.atLinguiCoreLibStrings.cardinal | atLinguiCoreLib.atLinguiCoreLibStrings.ordinal
      ], 
      java.lang.String
    ]
  ] = js.undefined
}

object LanguageData {
  @scala.inline
  def apply(
    plurals: (/* n */ scala.Double, /* pluralType */ js.UndefOr[
      atLinguiCoreLib.atLinguiCoreLibStrings.cardinal | atLinguiCoreLib.atLinguiCoreLibStrings.ordinal
    ]) => java.lang.String = null
  ): LanguageData = {
    val __obj = js.Dynamic.literal()
    if (plurals != null) __obj.updateDynamic("plurals")(js.Any.fromFunction2(plurals))
    __obj.asInstanceOf[LanguageData]
  }
}

