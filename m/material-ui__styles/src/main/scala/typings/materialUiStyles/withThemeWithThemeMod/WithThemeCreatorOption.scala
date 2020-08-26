package typings.materialUiStyles.withThemeWithThemeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithThemeCreatorOption[Theme] extends js.Object {
  var defaultTheme: js.UndefOr[Theme] = js.native
}

object WithThemeCreatorOption {
  @scala.inline
  def apply[Theme](): WithThemeCreatorOption[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithThemeCreatorOption[Theme]]
  }
  @scala.inline
  implicit class WithThemeCreatorOptionOps[Self <: WithThemeCreatorOption[_], Theme] (val x: Self with WithThemeCreatorOption[Theme]) extends AnyVal {
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
    def setDefaultTheme(value: Theme): Self = this.set("defaultTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTheme: Self = this.set("defaultTheme", js.undefined)
  }
  
}

