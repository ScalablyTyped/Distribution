package typings.materialUi

import typings.materialUi.MaterialUI.Styles.MuiTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesGetMuiThemeMod {
  
  @JSImport("material-ui/styles/getMuiTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(muiTheme: MuiTheme*): MuiTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(muiTheme.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MuiTheme]
  
  inline def getMuiTheme(muiTheme: MuiTheme*): MuiTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("getMuiTheme")(muiTheme.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MuiTheme]
}
