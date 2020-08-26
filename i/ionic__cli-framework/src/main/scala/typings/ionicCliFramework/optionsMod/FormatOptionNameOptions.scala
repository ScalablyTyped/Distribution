package typings.ionicCliFramework.optionsMod

import typings.ionicCliFramework.colorsMod.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatOptionNameOptions extends js.Object {
  val colors: js.UndefOr[Colors] = js.native
  val showAliases: js.UndefOr[Boolean] = js.native
  val showValueSpec: js.UndefOr[Boolean] = js.native
}

object FormatOptionNameOptions {
  @scala.inline
  def apply(): FormatOptionNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatOptionNameOptions]
  }
  @scala.inline
  implicit class FormatOptionNameOptionsOps[Self <: FormatOptionNameOptions] (val x: Self) extends AnyVal {
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
    def setColors(value: Colors): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setShowAliases(value: Boolean): Self = this.set("showAliases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAliases: Self = this.set("showAliases", js.undefined)
    @scala.inline
    def setShowValueSpec(value: Boolean): Self = this.set("showValueSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowValueSpec: Self = this.set("showValueSpec", js.undefined)
  }
  
}

