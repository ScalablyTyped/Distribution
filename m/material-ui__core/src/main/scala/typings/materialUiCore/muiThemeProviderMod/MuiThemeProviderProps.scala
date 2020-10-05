package typings.materialUiCore.muiThemeProviderMod

import typings.materialUiCore.createMuiThemeMod.Theme
import typings.materialUiCore.withStylesMod.StylesCreator
import typings.react.mod.ReactNode
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MuiThemeProviderProps extends js.Object {
  var children: ReactNode = js.native
  var disableStylesGeneration: js.UndefOr[Boolean] = js.native
  var sheetsManager: js.UndefOr[Map[StylesCreator, Map[Theme, SheetManagerTheme]]] = js.native
  var theme: Theme | (js.Function1[/* outer */ Theme | Null, Theme]) = js.native
}

object MuiThemeProviderProps {
  @scala.inline
  def apply(theme: Theme | (js.Function1[/* outer */ Theme | Null, Theme])): MuiThemeProviderProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuiThemeProviderProps]
  }
  @scala.inline
  implicit class MuiThemeProviderPropsOps[Self <: MuiThemeProviderProps] (val x: Self) extends AnyVal {
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
    def setThemeFunction1(value: /* outer */ Theme | Null => Theme): Self = this.set("theme", js.Any.fromFunction1(value))
    @scala.inline
    def setTheme(value: Theme | (js.Function1[/* outer */ Theme | Null, Theme])): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisableStylesGeneration(value: Boolean): Self = this.set("disableStylesGeneration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableStylesGeneration: Self = this.set("disableStylesGeneration", js.undefined)
    @scala.inline
    def setSheetsManager(value: Map[StylesCreator, Map[Theme, SheetManagerTheme]]): Self = this.set("sheetsManager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetsManager: Self = this.set("sheetsManager", js.undefined)
  }
  
}

