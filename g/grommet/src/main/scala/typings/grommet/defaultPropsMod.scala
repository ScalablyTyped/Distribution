package typings.grommet

import typings.grommet.themesBaseMod.ThemeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultPropsMod {
  
  @JSImport("grommet/default-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extendDefaultTheme(theme: ThemeType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendDefaultTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
