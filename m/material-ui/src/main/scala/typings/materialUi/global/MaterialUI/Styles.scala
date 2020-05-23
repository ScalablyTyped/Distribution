package typings.materialUi.global.MaterialUI

import typings.materialUi.MaterialUI.Styles.MuiTheme
import typings.materialUi.MaterialUI.Styles.MuiThemeProviderProps
import typings.materialUi.MaterialUI.Styles.RawTheme
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__MaterialUI.Styles")
@js.native
object Styles extends js.Object {
  @js.native
  class MuiThemeProvider ()
    extends Component[MuiThemeProviderProps, js.Object, js.Any]
  
  var Colors: typings.materialUi.MaterialUI.Styles.Colors = js.native
  var Spacing: typings.materialUi.MaterialUI.Styles.Spacing = js.native
  var ThemePalette: typings.materialUi.MaterialUI.Styles.ThemePalette = js.native
  var Transitions: typings.materialUi.MaterialUI.Styles.Transitions = js.native
  var Typography: typings.materialUi.MaterialUI.Styles.Typography = js.native
  var darkBaseTheme: RawTheme = js.native
  var lightBaseTheme: RawTheme = js.native
  var zIndex: typings.materialUi.MaterialUI.Styles.zIndex = js.native
  def getMuiTheme(muiTheme: MuiTheme*): MuiTheme = js.native
  def muiThemeable(): js.Function1[
    /* component */ (ComponentClass[typings.materialUi.anon.MuiTheme, ComponentState]) | StatelessComponent[typings.materialUi.anon.MuiTheme], 
    (ComponentClass[typings.materialUi.anon.MuiTheme, ComponentState]) | StatelessComponent[typings.materialUi.anon.MuiTheme]
  ] = js.native
}

