package typings.materialUi.global.MaterialUI

import typings.materialUi.MaterialUI.Styles.Colors
import typings.materialUi.MaterialUI.Styles.MuiTheme
import typings.materialUi.MaterialUI.Styles.MuiThemeProviderProps
import typings.materialUi.MaterialUI.Styles.RawTheme
import typings.materialUi.MaterialUI.Styles.Spacing
import typings.materialUi.MaterialUI.Styles.ThemePalette
import typings.materialUi.MaterialUI.Styles.Transitions
import typings.materialUi.MaterialUI.Styles.Typography
import typings.materialUi.MaterialUI.Styles.zIndex
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Styles {
  
  @JSGlobal("__MaterialUI.Styles")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("__MaterialUI.Styles.Colors")
  @js.native
  def Colors: typings.materialUi.MaterialUI.Styles.Colors = js.native
  inline def Colors_=(x: Colors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Colors")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__MaterialUI.Styles.MuiThemeProvider")
  @js.native
  open class MuiThemeProvider ()
    extends Component[MuiThemeProviderProps, js.Object, Any]
  
  @JSGlobal("__MaterialUI.Styles.Spacing")
  @js.native
  def Spacing: typings.materialUi.MaterialUI.Styles.Spacing = js.native
  inline def Spacing_=(x: Spacing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Spacing")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__MaterialUI.Styles.ThemePalette")
  @js.native
  def ThemePalette: typings.materialUi.MaterialUI.Styles.ThemePalette = js.native
  inline def ThemePalette_=(x: ThemePalette): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThemePalette")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__MaterialUI.Styles.Transitions")
  @js.native
  def Transitions: typings.materialUi.MaterialUI.Styles.Transitions = js.native
  inline def Transitions_=(x: Transitions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transitions")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__MaterialUI.Styles.Typography")
  @js.native
  def Typography: typings.materialUi.MaterialUI.Styles.Typography = js.native
  inline def Typography_=(x: Typography): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Typography")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__MaterialUI.Styles.darkBaseTheme")
  @js.native
  def darkBaseTheme: RawTheme = js.native
  inline def darkBaseTheme_=(x: RawTheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkBaseTheme")(x.asInstanceOf[js.Any])
  
  inline def getMuiTheme(muiTheme: MuiTheme*): MuiTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("getMuiTheme")(muiTheme.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MuiTheme]
  
  @JSGlobal("__MaterialUI.Styles.lightBaseTheme")
  @js.native
  def lightBaseTheme: RawTheme = js.native
  inline def lightBaseTheme_=(x: RawTheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightBaseTheme")(x.asInstanceOf[js.Any])
  
  inline def muiThemeable(): js.Function1[
    /* component */ (ComponentClass[typings.materialUi.anon.MuiTheme, ComponentState]) | FunctionComponent[typings.materialUi.anon.MuiTheme], 
    (ComponentClass[typings.materialUi.anon.MuiTheme, ComponentState]) | FunctionComponent[typings.materialUi.anon.MuiTheme]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("muiThemeable")().asInstanceOf[js.Function1[
    /* component */ (ComponentClass[typings.materialUi.anon.MuiTheme, ComponentState]) | FunctionComponent[typings.materialUi.anon.MuiTheme], 
    (ComponentClass[typings.materialUi.anon.MuiTheme, ComponentState]) | FunctionComponent[typings.materialUi.anon.MuiTheme]
  ]]
  
  @JSGlobal("__MaterialUI.Styles.zIndex")
  @js.native
  def zIndex: typings.materialUi.MaterialUI.Styles.zIndex = js.native
  inline def zIndex_=(x: zIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(x.asInstanceOf[js.Any])
}
