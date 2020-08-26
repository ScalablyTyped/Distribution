package typings.linguiCore.i18nMod

import typings.linguiCore.linguiCoreStrings.cardinal
import typings.linguiCore.linguiCoreStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageData extends js.Object {
  var plurals: js.UndefOr[
    js.Function2[/* n */ Double, /* pluralType */ js.UndefOr[cardinal | ordinal], String]
  ] = js.native
}

object LanguageData {
  @scala.inline
  def apply(): LanguageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageData]
  }
  @scala.inline
  implicit class LanguageDataOps[Self <: LanguageData] (val x: Self) extends AnyVal {
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
    def setPlurals(value: (/* n */ Double, /* pluralType */ js.UndefOr[cardinal | ordinal]) => String): Self = this.set("plurals", js.Any.fromFunction2(value))
    @scala.inline
    def deletePlurals: Self = this.set("plurals", js.undefined)
  }
  
}

