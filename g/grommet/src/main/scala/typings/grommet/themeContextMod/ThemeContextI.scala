package typings.grommet.themeContextMod

import typings.grommet.anon.ValueThemeValue
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeContextI extends Context[ThemeValue] {
  var Extend: FC[ValueThemeValue] = js.native
}

object ThemeContextI {
  @scala.inline
  def apply(Consumer: Consumer[ThemeValue], Extend: FC[ValueThemeValue], Provider: Provider[ThemeValue]): ThemeContextI = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Extend = Extend.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeContextI]
  }
  @scala.inline
  implicit class ThemeContextIOps[Self <: ThemeContextI] (val x: Self) extends AnyVal {
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
    def setExtend(value: FC[ValueThemeValue]): Self = this.set("Extend", value.asInstanceOf[js.Any])
  }
  
}

