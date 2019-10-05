package typings.materialDashUi

import typings.materialDashUi.__MaterialUI.Styles.Colors
import typings.materialDashUi.__MaterialUI.Styles.RawTheme
import typings.materialDashUi.__MaterialUI.Styles.Spacing
import typings.materialDashUi.__MaterialUI.Styles.Transitions
import typings.materialDashUi.__MaterialUI.Styles.Typography
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-ui/styles", JSImport.Namespace)
@js.native
object stylesMod extends js.Object {
  @js.native
  class MuiThemeProvider ()
    extends typings.materialDashUi.__MaterialUI.Styles.MuiThemeProvider
  
  var DarkRawTheme: RawTheme = js.native
  var LightRawTheme: RawTheme = js.native
  var colors: Colors = js.native
  var darkBaseTheme: RawTheme = js.native
  var lightBaseTheme: RawTheme = js.native
  var spacing: Spacing = js.native
  var transitions: Transitions = js.native
  var typography: Typography = js.native
  var zIndex: typings.materialDashUi.__MaterialUI.Styles.zIndex = js.native
  def getMuiTheme(muiTheme: typings.materialDashUi.__MaterialUI.Styles.MuiTheme*): typings.materialDashUi.__MaterialUI.Styles.MuiTheme = js.native
  type MuiTheme = typings.materialDashUi.__MaterialUI.Styles.MuiTheme
}

