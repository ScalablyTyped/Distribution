package typings.materialUiStyles.anon

import typings.materialUiStyles.withStylesWithStylesMod.ClassKeyInferable
import typings.materialUiStyles.withStylesWithStylesMod.ThemeOfStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme[StylesType /* <: ClassKeyInferable[_, _] */] extends js.Object {
  var theme: ThemeOfStyles[StylesType] = js.native
}

object Theme {
  @scala.inline
  def apply[/* <: typings.materialUiStyles.withStylesWithStylesMod.ClassKeyInferable[_, _] */ StylesType](theme: ThemeOfStyles[StylesType]): Theme[StylesType] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme[StylesType]]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme[_], /* <: typings.materialUiStyles.withStylesWithStylesMod.ClassKeyInferable[_, _] */ StylesType] (val x: Self with Theme[StylesType]) extends AnyVal {
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
    def setTheme(value: ThemeOfStyles[StylesType]): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
  
}

