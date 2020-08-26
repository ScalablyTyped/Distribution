package typings.javascriptTimeAgo.styleMod

import typings.javascriptTimeAgo.gradationMod.Gradation
import typings.javascriptTimeAgo.gradationMod.Unit
import typings.javascriptTimeAgo.localeMod.Locale
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatStyle extends js.Object {
  var custom: js.UndefOr[CustomFormatter] = js.native
  var flavour: js.UndefOr[js.Array[Flavour]] = js.native
  var format: js.UndefOr[js.Function2[/* date */ Date | Double, /* locale */ Locale, String]] = js.native
  var gradation: js.UndefOr[js.Array[Gradation]] = js.native
  var units: js.UndefOr[Unit] = js.native
}

object FormatStyle {
  @scala.inline
  def apply(): FormatStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatStyle]
  }
  @scala.inline
  implicit class FormatStyleOps[Self <: FormatStyle] (val x: Self) extends AnyVal {
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
    def setCustom(value: /* options */ CustomFormatterOptions => js.UndefOr[String]): Self = this.set("custom", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setFlavourVarargs(value: Flavour*): Self = this.set("flavour", js.Array(value :_*))
    @scala.inline
    def setFlavour(value: js.Array[Flavour]): Self = this.set("flavour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlavour: Self = this.set("flavour", js.undefined)
    @scala.inline
    def setFormat(value: (/* date */ Date | Double, /* locale */ Locale) => String): Self = this.set("format", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setGradationVarargs(value: Gradation*): Self = this.set("gradation", js.Array(value :_*))
    @scala.inline
    def setGradation(value: js.Array[Gradation]): Self = this.set("gradation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradation: Self = this.set("gradation", js.undefined)
    @scala.inline
    def setUnits(value: Unit): Self = this.set("units", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
  }
  
}

