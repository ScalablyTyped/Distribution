package typings.materialUi

import typings.materialUi.MaterialUI.Styles.Colors
import typings.materialUi.MaterialUI.Styles.MuiThemeProviderProps
import typings.materialUi.MaterialUI.Styles.RawTheme
import typings.materialUi.MaterialUI.Styles.Spacing
import typings.materialUi.MaterialUI.Styles.Transitions
import typings.materialUi.MaterialUI.Styles.Typography
import typings.materialUi.MaterialUI.Styles.zIndex
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesMod {
  
  @JSImport("material-ui/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("material-ui/styles", "DarkRawTheme")
  @js.native
  def DarkRawTheme: RawTheme = js.native
  @scala.inline
  def DarkRawTheme_=(x: RawTheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DarkRawTheme")(x.asInstanceOf[js.Any])
  
  @JSImport("material-ui/styles", "LightRawTheme")
  @js.native
  def LightRawTheme: RawTheme = js.native
  @scala.inline
  def LightRawTheme_=(x: RawTheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LightRawTheme")(x.asInstanceOf[js.Any])
  
  @JSImport("material-ui/styles", "MuiThemeProvider")
  @js.native
  class MuiThemeProvider ()
    extends Component[MuiThemeProviderProps, js.Object, js.Any]
  
  @JSImport("material-ui/styles", "colors")
  @js.native
  def colors: Colors = js.native
  @scala.inline
  def colors_=(x: Colors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
  
  @JSImport("material-ui/styles", "darkBaseTheme")
  @js.native
  def darkBaseTheme: RawTheme = js.native
  @scala.inline
  def darkBaseTheme_=(x: RawTheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkBaseTheme")(x.asInstanceOf[js.Any])
  
  @JSImport("material-ui/styles", "getMuiTheme")
  @js.native
  def getMuiTheme(muiTheme: typings.materialUi.MaterialUI.Styles.MuiTheme*): typings.materialUi.MaterialUI.Styles.MuiTheme = js.native
  
  @JSImport("material-ui/styles", "lightBaseTheme")
  @js.native
  def lightBaseTheme: RawTheme = js.native
  @scala.inline
  def lightBaseTheme_=(x: RawTheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightBaseTheme")(x.asInstanceOf[js.Any])
  
  @JSImport("material-ui/styles", "spacing")
  @js.native
  def spacing: Spacing = js.native
  @scala.inline
  def spacing_=(x: Spacing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spacing")(x.asInstanceOf[js.Any])
  
  @JSImport("material-ui/styles", "transitions")
  @js.native
  def transitions: Transitions = js.native
  @scala.inline
  def transitions_=(x: Transitions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitions")(x.asInstanceOf[js.Any])
  
  @JSImport("material-ui/styles", "typography")
  @js.native
  def typography: Typography = js.native
  @scala.inline
  def typography_=(x: Typography): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typography")(x.asInstanceOf[js.Any])
  
  @JSImport("material-ui/styles", "zIndex")
  @js.native
  def zIndex: typings.materialUi.MaterialUI.Styles.zIndex = js.native
  @scala.inline
  def zIndex_=(x: zIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(x.asInstanceOf[js.Any])
  
  type MuiTheme = typings.materialUi.MaterialUI.Styles.MuiTheme
}
